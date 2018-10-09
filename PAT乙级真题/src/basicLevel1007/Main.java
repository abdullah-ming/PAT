package basicLevel1007;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		input.close();
		int k,j,num = 0;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		for(int i = 2; i <= a;i ++){
			k = (int)Math.sqrt(i);
			for(j = 2; j <= k; j++){
				
				if(i%j == 0){
					break;
				}
			}
			if(j > k){
				prime.add(i);
			}
		}
		for(int i = 0; i < prime.size() - 1;i ++){
			if(prime.get(i+1) - prime.get(i) == 2){
				num++;
			}
		}
		System.out.print(num);
	}
}
