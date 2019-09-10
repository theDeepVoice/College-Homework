package first_homework;

import java.util.Scanner;

public class mysin {

	
	public static void main(String[] args) {

		double demo=1.0, x, sum=0;
		int  sign=1;
		
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		
		while(1.0/demo > 1e-10) {
			sum = sum + sign* Math.pow(x, 2)*x/demo;
			
			sign = -sign;
			demo = demo*(demo+1)*(demo+2);
			x = x * Math.pow(x, 2.0);
				
		}
		
		System.out.println("sin(" + x + ")的值为：" + sum);
		System.out.println("sin(" + x + ")的值为：" + Math.sin(1));
		
		
	}

}
