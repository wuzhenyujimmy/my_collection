package com.jimmy.sort;

/**
 * 插入排序不是通过交换位置而是通过比较找到合适的位置插入元素来达到排序的目的的。相信大家都有过打扑克牌的经历，特别是牌数较大的。在分牌时可能要整理自己的牌，
 * 牌多的时候怎么整理呢？就是拿到一张牌，找到一个合适的位置插入。这个原理其实和插入排序是一样的
 * 
 * @author wuzhenyu
 *
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        for (int i = 1; i < arr.length; i++) { // 假设第一个数位置时正确的；要往后移，必须要假设第一个。

            int j = i;
            int target = arr[i]; // 待插入的

            // 后移
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            // 插入
            arr[j] = target;
        }

    }
}
