package com.jimmy.sort;

import java.util.Arrays;

/**
 * ����������������Թ�Ҫ����дһ��O(n)ʱ�临�Ӷȵ������㷨����ǧ��Ҫ����˵���ⲻ���ܣ���Ȼǰ����ڱȽϵ������������O(nlogn)��
 * ����ȷʵҲ������ʱ�临�Ӷȵ�����
 * ��ֻ������ǰ�����������Ǵ��������Ҫ����һ���ķ�Χ�����������Ҽ���������Ҫ�Ƚ϶�ĸ����ռ䡣�����˼���ǣ��ô����������Ϊ����������±�
 * ��ͳ��ÿ�����ֵĸ�����Ȼ������������ɵõ��������С�
 * 
 * @author wuzhenyu
 *
 */
public class CountSort {
    public static void countSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        int max = max(arr);

        int[] count = new int[max + 1];
        Arrays.fill(count, 0);

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }

    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > max)
                max = ele;
        }

        return max;
    }
}
