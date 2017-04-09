package com.jimmy.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {
    public static void bucketSort(int[] arr) {
        if (arr == null && arr.length == 0)
            return;

        int bucketNums = 10; // ����Ĭ��Ϊ10���涨������[0,100)
        List<List<Integer>> buckets = new ArrayList<List<Integer>>(); // Ͱ������

        for (int i = 0; i < 10; i++) {
            buckets.add(new LinkedList<Integer>()); // ������ȽϺ���
        }

        // ����Ͱ
        for (int i = 0; i < arr.length; i++) {
            buckets.get(f(arr[i])).add(arr[i]);
        }

        // ��ÿ��Ͱ��������
        for (int i = 0; i < buckets.size(); i++) {
            if (!buckets.get(i).isEmpty()) {
                Collections.sort(buckets.get(i)); // ��ÿ��Ͱ���п���
            }
        }

        // ��ԭ�ź��������
        int k = 0;
        for (List<Integer> bucket : buckets) {
            for (int ele : bucket) {
                arr[k++] = ele;
            }
        }
    }

    /**
     * ӳ�亯��
     * 
     * @param x
     * @return
     */
    public static int f(int x) {
        return x / 10;
    }
}
