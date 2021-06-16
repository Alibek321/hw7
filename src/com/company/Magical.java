package com.company;

public class Magical extends Hero implements Emoji {

    @Override
    public void Superattakt(int var) {
        System.out.println("Magical "+var+"damage");

    }

    @Override
    public void Fastrun(int bab) {
        System.out.println("бежит со скоростью "+bab+"km/h");

    }

    @Override
    public void drow() {
        System.out.println("\uD83D\uDD25"+" "+"✨"+" "+"\uD83D\uDCA7");

    }

    @Override
    public String drow3D() {
        return "";
    }
}
