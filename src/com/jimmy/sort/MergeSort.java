package com.jimmy.sort;

/**
 * �鲢��������һ�ֲ�ͬ�����򷽷�����Ϊ�鲢����ʹ���˵ݹ���ε�˼�룬������������Ƚ����ס������˼���ǣ��ȵݹ黮�������⣬Ȼ��ϲ����
 * 
 * @author wuzhenyu
 *
 */
public class MergeSort {
    public static void mergeSort(int[] arr) {
        mSort(arr, 0, arr.length - 1);
    }

    /**
     * �ݹ����
     * 
     * @param arr
     *            ��������
     * @param left
     *            ��ָ��
     * @param right
     *            ��ָ��
     */
    public static void mSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = (left + right) / 2;

        mSort(arr, left, mid); // �ݹ��������
        mSort(arr, mid + 1, right); // �ݹ������ұ�
        merge(arr, left, mid, right); // �ϲ�
    }

    /**
     * �ϲ�������������
     * 
     * @param arr
     *            ���ϲ�����
     * @param left
     *            ��ָ��
     * @param mid
     *            �м�ָ��
     * @param right
     *            ��ָ��
     */
    public static void merge(int[] arr, int left, int mid, int right) {
        // [left, mid] [mid+1, right]
        int[] temp = new int[right - left + 1]; // �м�����

        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }

    }
}
