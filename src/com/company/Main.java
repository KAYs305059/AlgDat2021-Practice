package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        System.out.println(highestNr(a));
        System.out.println(lowestNr(a));
    }


    public static int highestNr(int[] arr) {
        int m = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[m]) m = i;
        }
        return m;
    }

    public static int lowestNr(int[] arr) {
        //Initialiser med første element
        int m = 0;

        //Loop over alle resterende elemeneter og sjekk om
        // vi finner et mindre tall.
        for(int i = 1; i < arr.length; i++) {

            //Sjekker om verdien er mindre enn det vi har sett tidligere.
            if(arr[i] < arr[m]) m = i;
        }

        //Returner index til minste verdi.
        return m;
    }
}
