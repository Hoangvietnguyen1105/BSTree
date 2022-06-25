/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author panda
 */
public class Test {
    public static void main(String[] args) {
        
        
        MyBST a = new MyBST();
//        Scanner in = new Scanner(System.in);
//        System.out.println("nhap so phan tu muon them");
//        int b = in.nextInt();    
//        int[] c = new int[b];
//        for(int i = 0; i < b; i++){
//            c[i]=in.nextInt();
//        }
//        for (int i = 0; i < b ; i++){
//            a.mRoot = a.insert(a.mRoot, c[i]);
//        }

    
        a.mRoot = a.insert(a.mRoot, 5);
        a.mRoot = a.insert(a.mRoot, 8);
        a.mRoot = a.insert(a.mRoot, 1);
        a.mRoot = a.insert(a.mRoot, 0);
        a.mRoot = a.insert(a.mRoot, 3);
        a.mRoot = a.insert(a.mRoot, 7);
        a.mRoot = a.insert(a.mRoot, 2);
        a.mRoot = a.insert(a.mRoot, 4);
        Scanner in = new Scanner(System.in);
//        int gh = in.nextInt();
//        if(a.searchBST(a.mRoot,gh) != null){
//            System.out.println("co");
//        }
//        else{
//            System.out.println("no");
//        }
        
      System.out.print(a.searchBST(a.mRoot,72));
//        String pIn ="";
//        pIn = a.InOder(a.mRoot, pIn);
////        System.out.print(p);
//        String[] bIn = null;
//        bIn = pIn.split(" ");
//        String[] cIn = new String[10];
//        int jIn =7;
//        for (int iIn = bIn.length-1; iIn >= bIn.length-8;iIn--){
//            cIn[jIn]=bIn[iIn];
//            jIn--;
//            }
//          for(int iIn = 0; iIn < 8 ;iIn++){
//                System.out.println(cIn[iIn]);
//            }
//    
}

        }
  