package com.wipro.entity;

public class CustomerDetails {
	
	private String cusName[];
	private int accNum[];
	private double balance[];
	
		public String[] getCusName() {
			return cusName;
		}
		public void setCusName(String[] cusName) {
			this.cusName = cusName;
		}
		public int[] getAccNum() {
			return accNum;
		}
		public void setAccNum(int[] accNum) {
			this.accNum = accNum;
		}
		public double[] getBalance() {
			return balance;
		}
		public void setBalance(double[] balance) {
			this.balance = balance;
		}
}
