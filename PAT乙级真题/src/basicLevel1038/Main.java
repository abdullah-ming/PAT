package basicLevel1038;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
//
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(new BufferedInputStream(System.in));
		
		int[] score = new int [101];
		
		int a = input.nextInt();
		int[] a1 = new int[a];
		for(int i = 0; i < a; i ++){
			a1[i] = input.nextInt();
		}
		
		for (int i = 0; i < a; i++) {
			int temp = a1[i];
			score[temp]++;
		}
		int k = input.nextInt();
		for (int i = 0; i < k-1; i++) {
			int temp = input.nextInt();
			System.out.print(score[temp] + " ");
		}
		int tmep = input.nextInt();
		System.out.print(score[tmep]);
		input.close();

//		int b = input.nextInt();
//		int[] b1 = new int[b];
//		int[] b2 = new int[b];
//		for(int i = 0; i < b; i ++){
//			b1[i] = input.nextInt();
//			b2[0] = 0;
//		}
//		input.close();
//		
//		for(int i = 0; i < b; i ++){
//			for(int j = 0; j < a; j++){
//				if(b1[i] == a1[j]){
//					b2[i]++;
//				}
//			}
//
//			if(i == b-1){
//				System.out.print(b2[i]);
//			}
//			else
//				System.out.print(b2[i] + " ");
//		}
//		
		
	}

}
