package com.company;

public class Warrior extends Hero implements Emoji{


    @Override
    public void Superattakt(int var) {
        System.out.println("Warrior " +var+"damage");
    }

    @Override
    public void Fastrun(int bab) {
        System.out.println("бежит со скоростью "+bab+"km/h");

    }

    @Override
    public void drow() {
        System.out.println("⚔"+" "+"\uD83D\uDEE1️"+" "+"\uD83D\uDCAA");

    }

    @Override
    public String drow3D() {
        return "";
    }
}

