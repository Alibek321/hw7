package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.Superattakt(300);
        warrior.Fastrun(10);
        warrior.drow();
        System.out.println(warrior.drow3D());
        System.out.println(".......................");


        Magical magical = new Magical();
        magical.Superattakt(300);
        magical.Fastrun(10);
        magical.drow();
        System.out.println(".........................");


        Mental mental=new Mental();
        mental.Superattakt(300);
        mental.Fastrun(10);
        mental.drow();
        System.out.println("..........................");







    }
}
