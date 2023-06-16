package com.example.banking;


public class model {
    String date;
    String narration;
    String credit;
    String debit;
    String balance;

    public model(String date,String narration,String credit,String debit,String balance){
        this.date = date;
        this.narration = narration;
        this.credit=credit;
        this.debit=debit;
        this.balance = balance;
    }

    public String getDate(){
        return date;
    }
    public String getNarration(){
        return narration;
    }
    public String getCredit(){
        return credit;
    }
    public String getDebit(){
        return debit;
    }
    public String getBalance(){
        return balance;
    }
}
