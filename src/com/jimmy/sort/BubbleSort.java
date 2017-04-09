package com.jimmy.sort;

// 

/**
 * ð��, ͨ��������Ԫ�صıȽϺͽ�������С������������ǰ�档�������������ˮ��������һ������˶�����
 * 
 * @author wuzhenyu
 *
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        BubbleSort.bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }

    }
}
