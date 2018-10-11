package basicLevel1011;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0;i < num; i++ ){
			BigInteger a ,b ,c ;
			a = input.nextBigInteger();
			b = input.nextBigInteger();
			c = input.nextBigInteger();
			if(a.add(b).compareTo(c) > 0){
				arr[i] = 1;
			}
			else
				arr[i] = 0;
		}
		for(int i = 0;i < num; i++ ){
			if(arr[i] == 1)
				System.out.println("Case #" + (i+1) + ": true");
			if(arr[i] == 0)
				System.out.println("Case #" + (i+1) + ": false");
		}
	}

}
