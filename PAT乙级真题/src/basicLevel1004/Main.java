package basicLevel1004;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		Map<Integer,List<String>> scoreMap = new HashMap<>();
		
		int n = input.nextInt();
		int i = n;
		int[] intArr = new int[i];
		input.nextLine();
		String str[] = new String[n];
		
		for(int j = 0;j < n;j++){
			str[j] = input.nextLine();
		}
		
		for(String strin:str){
			String[] strArray = strin.split(" ");
			List<String> strArr = new ArrayList<>();
			strArr.add(strArray[0]);
			strArr.add(strArray[1]);
			scoreMap.put(Integer.valueOf(strArray[2]),strArr);
			intArr[--i] = Integer.valueOf(strArray[2]);	
		}
		Arrays.sort(intArr);
		
		System.out.println(scoreMap.get(intArr[n-1]).get(0)+" "+scoreMap.get(intArr[n-1]).get(1));
		System.out.println(scoreMap.get(intArr[0]).get(0)+" "+scoreMap.get(intArr[0]).get(1));
	}

}
