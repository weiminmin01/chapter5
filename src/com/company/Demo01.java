package com.company;

public class Demo01 {
    public static void main(String[] args) {
        Uncle uncle1=new UncleOne();
        if(uncle1 instanceof UncleTow){
            UncleTow u2= (UncleTow) uncle1;
            u2.faHongbao();
        }
        if(uncle1 instanceof UncleOne){
            UncleOne u1= (UncleOne)  uncle1;
            u1.faHongbao();
            u1.chouyan();
        }
    }
}
