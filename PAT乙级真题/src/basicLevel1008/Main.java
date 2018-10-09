package basicLevel1008;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int b = input.nextInt();
		
		
		
		int[] array = new int[a];
		
		for(int i = 0;i < array.length;i ++){
			array[i] = input.nextInt();
		}
		
		input.close();
		for(int i = 0;i < b;i ++){
			int exc = array[array.length-1];
			for(int j = array.length-1; j > 0; j--){
				array[j] = array[j-1];
			}
			array[0] = exc;
		}
		
		System.out.print(array[0]);
		
		for(int i = 1; i < array.length;i++){
			System.out.print(" " + array[i]);
		}
	}

}
