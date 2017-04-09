package com.jimmy.sort;

/**
 * ѡ�������˼����ʵ��ð�������е����ƣ�������һ����������С��Ԫ�طŵ���ǰ�档���ǹ��̲�ͬ��ð��������ͨ�����ڵıȽϺͽ�������ѡ��������ͨ���������ѡ��.
 * 
 * @author wuzhenyu
 *
 */
public class SelectSort {
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int minIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) { // ֻ��Ҫ�Ƚ�n-1��
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) { // ��i+1��ʼ�Ƚϣ���ΪminIndexĬ��Ϊi�ˣ�i��û��Ҫ���ˡ�
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) { // ���minIndex��Ϊi��˵���ҵ��˸�С��ֵ������֮��
                swap(arr, i, minIndex);
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
