package cn.com.git.leon.I_distributed.c_distributedLock;

/**
 * @author sirius
 * @since 2019/4/26
 */
public interface Redis {

    Integer setnx(String key,String value);

    String getSet(String key,String value);

    String get(String key);

    Integer del(String key);
}
