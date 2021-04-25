package com.company;

public class Demo {
    public static void main(String[] args) {

      /*  UncleOne uncleOne=new UncleOne();
        uncleOne.faHongbao();
        UncleTow uncleTow=new UncleTow();
        uncleTow.faHongbao();*/

        //多态
        Uncle uncle1 = new UncleOne();
        //用父类的类名接受子类创建的对象，只能调用父类中出现过的方法
        uncle1.faHongbao();
        //uncle1,chouyan(); 不能调用

        UncleOne u1 = (UncleOne) uncle1; //向下转型
        u1.fangHongbao();
        u1.chouyan();

        Uncle uncle2 = new UncleTow(); //向上转型
        uncle2.faHongbao();
    }
}
