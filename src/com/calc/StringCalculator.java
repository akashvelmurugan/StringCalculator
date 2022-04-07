package com.calc;

import java.util.Scanner;

public class StringCalculator {
		static int function(int a , int b, char c) {
			int calc = 0;
			switch (c) {
			case '+':
				calc = a+b;
				break;
			case '-':
				calc = a-b;

				break;
			case '*':
				calc = a*b;
				break;
			case '/':
				calc = a/b;
				break;
			default:
				break;
			}
			return calc;
		}
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter The Input : ");
			String input = scanner.next();	

			String string = "";
			int sum = 0;
			int answer = 0;
			char  operator = '+';
			String temp = "";


			for (int i = 0; i < input.length(); i++) {

				if(input.charAt(i)!= '+' && input.charAt(i)!= '-' && input.charAt(i)!= '*' && input.charAt(i)!= '/') {
					string = string+input.charAt(i);
					temp = temp+string;
					int parseInt = Integer.parseInt(temp);
					sum = parseInt;
					}
				if(input.charAt(i)=='+' || input.charAt(i)=='-' || input.charAt(i)=='*' || input.charAt(i)=='/' || input.length()==i+1) {

					int ans = function(answer, sum, operator);
					sum = 0;
					string = "";	
					temp = "";
					answer = ans;
					if(input.charAt(i)=='+') {
						operator = '+';
					}else if(input.charAt(i)=='-') {
						operator = '-';
					}else if(input.charAt(i)=='*') {
						operator = '*';
					}else if(input.charAt(i)=='/') {
						operator = '/';
					}
				}
				temp = "";
			}

			System.out.println(answer);
		}
	}

