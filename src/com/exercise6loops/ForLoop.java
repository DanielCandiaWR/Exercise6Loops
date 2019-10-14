package com.exercise6loops;

public class ForLoop {
	public static void main(String[] args) {
		//Constant declaration
		
		//Variable declaration
		
		//Object construction
		
		System.out.println("Create a series of 1-100 1 by 1");
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Create a series of 100-1 1 by 1");
		for(int i=100;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Create a series of 1-100 with increments of 2");
		for(int i=1;i<=100;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("\nDisplay odd numbers from 100 to 200");
		for(int i=100;i<200;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println("\nDisplay just the half of the sequence 100 to 200");
		for(int i=100;i<200;i++) {
			System.out.print(i+" ");
			if(i==150) {
				break;
			}
		}
	}
}
