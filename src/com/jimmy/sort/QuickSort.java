package com.jimmy.sort;

/**
 * ��������һ�����־;��úܸ߶ˣ���ʵ��Ӧ�õ��п�������ȷʵҲ�Ǳ�����õ������㷨������������Ȼ�߶ˣ�����ʵ��˼��������ð������
 * ð��������ͨ������Ԫ�صıȽϺͽ�������С��ð�ݵ���ˣ������������ǱȽϺͽ���С���ʹ���������һ��������С��ð�ݵ�����ͬʱҲ�Ѵ�����������
 * 
 * Refer: http://www.cnblogs.com/wxisme/p/5243631.html
 * 
 * @author wuzhenyu
 *
 */
public class QuickSort {
    // һ�λ���
    public static int partition(int[] arr, int left, int right) {
        int pivotKey = arr[left];
        int pivotPointer = left;

        while (left < right) {
            while (left < right && arr[right] >= pivotKey)
                right--;
            while (left < right && arr[left] <= pivotKey)
                left++;
            swap(arr, left, right); // �Ѵ�Ľ������ұߣ���С�Ľ�������ߡ�
        }
        swap(arr, pivotPointer, left); // ����pivot�������м�
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
