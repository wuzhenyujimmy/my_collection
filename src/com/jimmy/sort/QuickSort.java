package com.jimmy.sort;

/**
 * 快速排序一听名字就觉得很高端，在实际应用当中快速排序确实也是表现最好的排序算法。快速排序虽然高端，但其实其思想是来自冒泡排序，
 * 冒泡排序是通过相邻元素的比较和交换把最小的冒泡到最顶端，而快速排序是比较和交换小数和大数，这样一来不仅把小数冒泡到上面同时也把大数沉到下面
 * 
 * Refer: http://www.cnblogs.com/wxisme/p/5243631.html
 * 
 * @author wuzhenyu
 *
 */
public class QuickSort {
    // 一次划分
    public static int partition(int[] arr, int left, int right) {
        int pivotKey = arr[left];
        int pivotPointer = left;

        while (left < right) {
            while (left < right && arr[right] >= pivotKey)
                right--;
            while (left < right && arr[left] <= pivotKey)
                left++;
            swap(arr, left, right); // 把大的交换到右边，把小的交换到左边。
        }
        swap(arr, pivotPointer, left); // 最后把pivot交换到中间
        return left;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int pivotPos = partition(arr, left, right);
        quickSort(arr, left, pivotPos - 1);
        quickSort(arr, pivotPos + 1, right);
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        quickSort(arr, 0, arr.length - 1);
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
