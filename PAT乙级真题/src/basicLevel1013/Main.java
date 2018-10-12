package basicLevel1013;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int b = input.nextInt();
		
		int argu = 1;
		int times = 0;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		while(argu >= 1){

			if(isPrime(argu)){
				times++;
				if(times>=a && times <= b){
					prime.add(argu);

				}
			if(times > b)
				break;
			}
			
			argu++;
		}
		
		for(int i = 0; i < prime.size()-1;i ++){
			if((i+1) % 10 != 0 || i == 0)
				System.out.print(prime.get(i) + " ");
			else
				System.out.println(prime.get(i));
		}
		System.out.print(prime.get(prime.size()-1));
	}
	
	public static boolean isPrime(int num){
		if(num == 1)
			return false;
		if(num % 2 == 0 && num != 2)
			return false;
		for(int i = 3; i <=Math.sqrt(num); i+=2){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}
	

}
