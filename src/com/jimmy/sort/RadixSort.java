package com.jimmy.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RadixSort {
    public static void radixSort(int[] arr) {
        if (arr == null && arr.length == 0)
            return;

        int maxBit = getMaxBit(arr);

        for (int i = 1; i <= maxBit; i++) {

            List<List<Integer>> buf = distribute(arr, i); // ����
            collecte(arr, buf); // �ռ�
        }

    }

    /**
     * ����
     * 
     * @param arr
     *            ����������
     * @param iBit
     *            Ҫ����ڼ�λ
     * @return
     */
    public static List<List<Integer>> distribute(int[] arr, int iBit) {
        List<List<Integer>> buf = new ArrayList<List<Integer>>();
        for (int j = 0; j < 10; j++) {
            buf.add(new LinkedList<Integer>());
        }
        for (int i = 0; i < arr.length; i++) {
            buf.get(getNBit(arr[i], iBit)).add(arr[i]);
        }
        return buf;
    }

    /**
     * �ռ�
     * 
     * @param arr
     *            �ѷ���������ռ���arr��
     * @param buf
     */
    public static void collecte(int[] arr, List<List<Integer>> buf) {
        int k = 0;
        for (List<Integer> bucket : buf) {
            for (int ele : bucket) {
                arr[k++] = ele;
            }
        }

    }

    /**
     * ��ȡ���λ��
     * 
     * @param x
     * @return
     */
    public static int getMaxBit(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            int len = (ele + "").length();
            if (len > max)
                max = len;
        }
        return max;
    }

    /**
     * ��ȡx�ĵ�nλ�����û����Ϊ0.
     * 
     * @param x
     * @param n
     * @return
     */
    public static int getNBit(int x, int n) {

        String sx = x + "";
        if (sx.length() < n)
            return 0;
        else
            return sx.charAt(sx.length() - n) - '0';
    }
}
