package basicLevel1012;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int a = 0,a1 = 0,a2 = 0,a3 = 0,a5 = 0;
		int n4 = 0,argu = 1;
		double a4 = 0;
		boolean f1 = false,f2 = false,f3 = false,f4 = false,f5 = false;
		
		for(int i = 0;i < num; i ++){
			a = input.nextInt();
			switch(a%5){
			case 0:
				if(a%2==0) 
				{
					f1=true;
					a1+=a;
				}
				break;
			case 1:
				f2=true;
				a2+=argu*a;
				argu *= -1;
				break;
			case 2:
				f3=true;
				a3++;
				break;
			case 3:
				f4=true;
				n4++;
				a4+=a;
				break;
			case 4:
				f5=true;
				if (a>a5) a5=a;
				break;

			}
		}
		DecimalFormat df = new DecimalFormat("0.0");
		if(f1 == true){
			System.out.print(a1);
		}
		else
			System.out.print('N');
		if(f2 == true){
			System.out.print(" " + a2);
		}
		else
			System.out.print(" " + 'N');
		if(f3 == true){
			System.out.print(" " + a3);
		}
		else
			System.out.print(" " + 'N');
		if(f4 == true){
			String str = String.format("%.1f",(double)(a4/n4));
		    double c = Double.parseDouble(str);
			System.out.print(" " + c);
		}
		else
			System.out.print(" " + 'N');
		if(f5 == true){
			System.out.print(" " + a5);
		}
		else
			System.out.print(" " + 'N');
	}

}
