package com.company;

public class Mental extends Hero implements Emoji{

    @Override
    public void Superattakt(int var) {
        System.out.println("Mental "+var+"damage");

    }

    @Override
    public void Fastrun(int bab) {
        System.out.println("бежит со скоростью "+bab+"km/h");

    }

    @Override
    public void drow() {
        System.out.println("\uD83E\uDD13"+" "+"IQ"+" "+"\uD83D\uDCDA");

    }

    @Override
    public String drow3D() {
        return "";
    }
}
