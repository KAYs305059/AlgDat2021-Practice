package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {2,4,6,12,32,21,0,14,32,1,8};
        System.out.println(highestNr(a));
    }


    public static int highestNr(int[] arr) {
        int m = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[m]) m = i;
        }
        return arr[m];
    }
}
