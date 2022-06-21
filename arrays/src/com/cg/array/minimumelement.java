package com.cg.array;

import java.util.Scanner;

public class minimumelement {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = in.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the elements in array");
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("the minimum value "+min(arr));
		
		
	}
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
				
			}
		}
		return min;

}}
