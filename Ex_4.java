// Mirel Shagarov 323106211, Gerard Levinov 323109926

import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		
		double num1, num2, num3, num4, num5;
		double avg, min, max;
		
	
		Scanner input = new Scanner (System.in);	
		
		System.out.println("Enter 5 real numbers:");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		num4 = input.nextDouble();
		num5 = input.nextDouble();
		avg = ((num1+num2+num3+num4+num5)/5); // avg is caculated by the avg formula
		if ((num1<num2) && (num1<num3) && (num1<num4) && (num1<num5)) // the program checks each number to see if it the smallest one 
			min = num1;
			else if ((num2<num1) && (num2<num3) && (num2<num4) && (num2<num5))   
				min = num2;
			else if ((num3<num1) && (num3<num2) && (num3<num4) && (num3<num5))
				min = num3;
			else if ((num4<num1) && (num4<num3) && (num4<num3) && (num4<num5))
				min = num4;
			else if ((num5<num1) && (num5<num3) && (num5<num4) && (num2<num5))
				min = num5;
			else
				min = num1;
		
		if ((num1>num2) && (num1>num3) && (num1>num4) && (num1>num5)) //the program checks each number to see if it the smallest one 
			max = num1;
			else if ((num2>num1) && (num2>num3) && (num2>num4) && (num2>num5))
				max = num2;
			else if ((num3>num1) && (num3>num2) && (num3>num4) && (num3>num5))
				max = num3;
			else if ((num4>num1) && (num4>num2) && (num4>num3) && (num4>num5))
				max = num4;
			else if ((num5>num1) && (num5>num2) && (num5>num3) && (num5>num4))
				max = num5;
			else 
				max = num1;
		
		System.out.printf("Average = %.2f " + '\n' , avg); // prints the average 2 number after the dot
		System.out.printf("Min = %.2f " + '\n' , min); // prints the smallest number 2 number after the dot
		System.out.printf("Max = %.2f " + '\n', max); // prints the largest number with 2 number after the dot
		 
		input.close();

	  	}


}
