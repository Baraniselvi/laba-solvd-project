package com.solvd.laba.homeworkassigment;

public class MergeSort {

    public static void merge(int[] num, int left, int mid, int right) {

        int s1 = mid - left + 1;
        //finding size of subaarray
        int s2 = right - mid;

        int[] ltemp = new int[s1];
        int[] rtemp = new int[s2];
        //creating temporary array ltemp and rtemp

        for (int i = 0; i < s1; i++)
            ltemp[i] = num[left + i];
        for (int j = 0; j < s2; j++)
            rtemp[j] = num[mid + 1 + j];
        int i = 0;
        int j = 0;
        int k = left;
        while (i < s1 && j < s2) {

            if (ltemp[i] <= rtemp[j]) {
                num[k] = ltemp[i];
                i++;
            } else {
                num[k] = rtemp[j];
                j++;
            }
            k++;
        }
        while (i < s1) {

            num[k] = ltemp[i];
            i++;
            k++;
        }
        while (j < s2) {
            num[k] = rtemp[j];
            j++;
            k++;
        }

    }


    public void msort(int[] num, int left, int right) {


        if (left < right) {
            int mid = (left + right) / 2;
            msort(num, left, mid);
            msort(num, mid + 1, right);
            merge(num, left, mid, right);

        }
    }


    public static void printarr(int[] num) {


        int n = num.length;
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }


    }

    public static void main(String[] args) {


        if (args.length == 0) {

            System.out.println("No input");
            return;
        }


        int[] num = new int[args.length];


        {


            for (int i = 0; i < args.length; i++) {
                num[i] = Integer.parseInt(args[i]);

            }
            System.out.println("Before mergesort");
            printarr(num);
            System.out.println("After sorting");
            MergeSort obj = new MergeSort();
            obj.msort(num, 0, num.length-1);
            printarr(num);


        }
    }

}
