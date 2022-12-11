package com.example.Arrays;

import java.util.Scanner;

public class Main {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            String[] c= new String[N];
            for(int i=0;i<N;i++){
                c[i]=sc.next();
            }
            // for(int j=0;j<N;j++){
            // 	System.out.print(c[j] +" ");
            // }

            // l=a
            // r=g

            int count = 0;
            for(int i=0;i<N;i++){
                for(int j=1;j<N;j++){
                    if(c[i].equals("a") && c[j].equals("g")){

                        count = count + 1;
                    }
                }
            }
            System.out.println(count);

        }
}