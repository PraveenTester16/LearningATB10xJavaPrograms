package com_pravi_functions_basics;

public class Bank_Account {

    Long account_No = 13456789l;
    String Ac_Name = "Praveen";
    Integer Ac_Bal = 10000;

    public void CheckBal(){
        System.out.println("Balance is :" + Ac_Bal);
    }

    public void Check_Account_No(){
        System.out.println("Account no is :" + account_No);
    }

    public void Check_Ac_name(){
        System.out.println("Name is :" + Ac_Name);
    }

    public static void main(String[] args) {
Bank_Account myAcc = new Bank_Account();
        System.out.println("Please find the account details below :");
myAcc.CheckBal();
myAcc.Check_Account_No();
myAcc.Check_Ac_name();

    }
}
