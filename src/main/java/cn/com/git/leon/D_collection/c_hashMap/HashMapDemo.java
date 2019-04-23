package cn.com.git.leon.D_collection.c_hashMap;

import java.util.HashMap;

/**
 * @author sirius
 * @since 2019/3/18
 */
public class HashMapDemo {

    /**
     * if (oldTab != null) {
     for (int j = 0; j < oldCap; ++j) {
     Node<K,V> e;
     //先赋值给e 再把旧数组上的值清空
     if ((e = oldTab[j]) != null) {
     oldTab[j] = null;
     //链表下一节点为null则重新计算位置index(hash&(newCap-1))
     if (e.next == null)
     newTab[e.hash & (newCap - 1)] = e;
     else if (e instanceof TreeNode)
     ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
     else { // preserve order

     Node<K,V> loHead = null, loTail = null;
     Node<K,V> hiHead = null, hiTail = null;
     Node<K,V> next;
     do {
     next = e.next;
     //判断多出来的一位hash值是1还是0（1则位置变0则位置不变）
     if ((e.hash & oldCap) == 0) {
     if (loTail == null)
     loHead = e;
     else
     loTail.next = e;
     loTail = e;
     }
     else {
     if (hiTail == null)
     hiHead = e;
     else
     hiTail.next = e;
     hiTail = e;
     }
     } while ((e = next) != null);
     if (loTail != null) {
     loTail.next = null;
     newTab[j] = loHead;
     }
     if (hiTail != null) {
     hiTail.next = null;
     newTab[j + oldCap] = hiHead;
     }
     }
     }
     }
     }
     */



    public static void main(String[] args) {

//        HashMap hashMap = new HashMap(2);
//        hashMap.put(3,3);
//        hashMap.put(5,5);
//        hashMap.put(7,7);
//        System.out.println(hashMap);
        HashMap hashMap = new HashMap();
        hashMap.put("天","天");
        hashMap.put("地","地");
        for (Object key : hashMap.keySet()){
            System.out.println(key);
        }

    }
}
