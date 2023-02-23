package java_test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int leng = sc.nextInt();
			String N = sc.next();
			String [] ArrN = N.split("");
			for(int i = 0; i < leng; i++) {
				Integer.parseInt(ArrN);
			}
			
			String sum = "";
			for(int i = 0; i < leng; i++) {
				sum += ArrN[i];
			}
			System.out.println(sum);
		}
	
	}

