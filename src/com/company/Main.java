
package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        int count=0;
        int timesRunning=0;

        System.out.println("Enter the amount you want to roll the die: Only ints, and don't go too big!");
        Scanner kbinput = new Scanner(System.in);
        int control = kbinput.nextInt();

        for (int i=0; i<=control; i++){
            timesRunning++;
            boolean arr[] = new boolean [11];
            boolean yes;

            while(true){
                Random rand = new Random();
                int x = 2 + rand.nextInt(11);
                arr[x] = true;
                count++;

                yes = true;
                for(int p = 0; p<arr.length; p++){
                    if(arr[p]==false)
                        yes = false;

                    StringBuffer sb = new StringBuffer();
                    for (int j = 1; j < arr.length; j++) {
                        for (int k = 1; k <= j; k++) {
                            sb.append("x");
                        }
                        sb.append('\n');
                    }
                    String s = sb.toString();
                    System.out.println(s);
                }
                if (yes == true){
                    break;
                }
            }
        }




    }

}