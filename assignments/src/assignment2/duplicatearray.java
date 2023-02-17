package assignment2;

import java.util.Scanner;

public class duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number of element you want to enter in an array");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] a1 = new int[i];
		System.out.println(a1.length);
		System.out.println("enter the numbers");
		for (int i1 = 0; i1 <a1.length; i1++) {
			a1[i1] = sc.nextInt();
		}
		
		System.out.println("checking the numbers");
		for (int i2=0;i2<a1.length;i2++) 
		{
			boolean flag = true;
			for (int j=i2+1;j<a1.length;j++) 
			{
				if (a1[i2]==a1[j]) 
				{
					flag=false;
					break; 
				}
			}
			if(flag==false)
			{
				System.out.println("d"+a1[i2]);
			}
			
		}

	}

}
