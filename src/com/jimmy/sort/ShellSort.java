package com.jimmy.sort;

public class ShellSort {
    /**
     * ϣ�������һ�˲���
     * 
     * @param arr
     *            ��������
     * @param d
     *            ����
     */
    public static void shellInsert(int[] arr, int d) {
        for (int i = d; i < arr.length; i++) {
            int j = i - d;
            int temp = arr[i]; // ��¼Ҫ���������
            while (j >= 0 && arr[j] > temp) { // �Ӻ���ǰ���ҵ�����С������λ��
                arr[j + d] = arr[j]; // ���Ų��
                j -= d;
            }

            if (j != i - d) // ���ڱ���С����
                arr[j + d] = temp;

        }
    }

    public static void shellSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int d = arr.length / 2;
        while (d >= 1) {
            shellInsert(arr, d);
            d /= 2;
        }
    }
}
