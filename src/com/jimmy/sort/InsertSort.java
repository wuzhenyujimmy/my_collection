package com.jimmy.sort;

/**
 * ����������ͨ������λ�ö���ͨ���Ƚ��ҵ����ʵ�λ�ò���Ԫ�����ﵽ�����Ŀ�ĵġ����Ŵ�Ҷ��й����˿��Ƶľ������ر��������ϴ�ġ��ڷ���ʱ����Ҫ�����Լ����ƣ�
 * �ƶ��ʱ����ô�����أ������õ�һ���ƣ��ҵ�һ�����ʵ�λ�ò��롣���ԭ����ʵ�Ͳ���������һ����
 * 
 * @author wuzhenyu
 *
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        for (int i = 1; i < arr.length; i++) { // �����һ����λ��ʱ��ȷ�ģ�Ҫ�����ƣ�����Ҫ�����һ����

            int j = i;
            int target = arr[i]; // �������

            // ����
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            // ����
            arr[j] = target;
        }

    }
}
