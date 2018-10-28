package basicLevel1045;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 
		Scanner input = new Scanner(new BufferedInputStream(System.in));
		
		int a = input.nextInt();
		int[] a1 = new int[a];
		int[] b1 = new int[a];
		for(int i = 0; i < a; i ++){
			
			a1[i] = input.nextInt();
			b1[i] = a1[i];
			
		}
		input.close();
		List<Integer> output = new ArrayList<>();
//		StringBuilder output = new StringBuilder();
		int num = 0;
		//暴力解决
//		for(int i = 0; i < a;  i++){
//			boolean ispivot = true;
//			//主元右侧
//			for(int j = i + 1; j < a; j ++){
//				if(a1[i] > a1[j]){
//					ispivot = false;
//					break;
//				}
//			}
//			//主元左侧
//			if(ispivot){
//				for(int j = i; j >= 0; j --){
//					if(a1[i] < a1[j]){
//						ispivot = false;
//						break;
//					}
//				}
//				
//			}
//			
//			if(ispivot){
//				num++;
//				if(i == 0){
//					output.append(a1[i]);
//				}
//				else
//					output.append(" " + a1[i]);
//			}
//			
//		}
		//快排的方式解决
		Arrays.sort(b1);
		int max = 0;
		for(int i = 0; i < a;  i++){
			
			if (a1[i]>max) 
				 max = a1[i];
			if(a1[i] == b1[i]&&max == b1[i]){
				output.add(a1[i]);
			}
		}
		
		System.out.println(output.size());
		System.out.print(output.get(0));
		for (int i = 1; i < output.size(); i++) {
			System.out.print(" " + output.get(i));
		}
	}

}
