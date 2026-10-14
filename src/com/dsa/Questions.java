package com.dsa;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
    // int a[]={10,20,30,40,50,};
    // for (int i : a) {
        
    //     System.out.println(i);
    // }

    Scanner sc=new Scanner(System.in);
    int a[]={10,20,30,40,50};
    for(int i=5; i>a.length-1; i--){
        System.err.println(a[i]);
    }


}
}