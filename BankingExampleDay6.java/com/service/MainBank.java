package com.wipro.service;

import java.util.Scanner;

import com.wipro.entity.CustomerDetails;
import com.wipro.model.BankIntrest;

public class MainBank {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		CustomerDetails obj=new CustomerDetails();
		//3 Arrays 
		String cusName[]=new String[5];
		int accNum[]=new int[5];
		double[] balance=new double[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter customer Name : ");
			cusName[i]=sc.next();
			System.out.println("Enter account Number : ");
			accNum[i]=sc.nextInt();
			System.out.println("Enter the balance : ");
			balance[i]=sc.nextDouble();
			}
		
		obj.setCusName(cusName);
		obj.setAccNum(accNum);
		obj.setBalance(balance);
		
		BankIntrest ob=new BankIntrest();
		ob.findIntrestOfCustomers(obj);
		sc.close();
		
	}
}
