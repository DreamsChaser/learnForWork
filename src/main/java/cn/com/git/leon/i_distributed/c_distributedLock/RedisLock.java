package cn.com.git.leon.i_distributed.c_distributedLock;

/**
 * @author sirius
 * @since 2019/4/26
 */
public class RedisLock {

    Redis redis;

    public boolean tryLock(String method,Long timeOut){
        long value = System.currentTimeMillis()+timeOut;
        //1、method作为key 超时时间作为value
        if (redis.setnx(method, String.valueOf(value)) == 1){
            //成功表示获得锁,处理业务逻辑
            return true;
        }
        long oldExpireTime = Long.parseLong(redis.get(method));
        if (Long.valueOf(redis.get(method)) < System.currentTimeMillis()){
            //说明方法超时
            long newExpireTime = System.currentTimeMillis() + timeOut;
            if(String.valueOf(oldExpireTime).equals(redis.getSet(method, String.valueOf(newExpireTime)))){
                return true;
            }
        }
        return false;
    }
}
