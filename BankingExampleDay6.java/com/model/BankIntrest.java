package com.wipro.model;

import com.wipro.entity.CustomerDetails;

public class BankIntrest {

    public void findIntrestOfCustomers(CustomerDetails obj) {

        float[][] accInterest = new float[5][12];
        double interest=2.5;

        for (int i=0;i<5;i++) {
            double currentBalance=obj.getBalance()[i];
            System.out.println("Customer "+(i+1)+" "+obj.getCusName()[i]);
            for (int j=0;j<12;j++) {
                double monthlyInterest=(currentBalance/100.0)*interest;
                currentBalance+=monthlyInterest;
                accInterest[i][j]=(float) currentBalance; 
                System.out.println("Month "+(j+1)+" :    Balance = "+accInterest[i][j]);
            }
        }
    }
}
