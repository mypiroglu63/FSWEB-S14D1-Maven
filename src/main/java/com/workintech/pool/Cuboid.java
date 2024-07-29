package com.workintech.pool;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double heigth, double length, double width) {
        super(length, width);
        if(heigth < 0) {
            this.height = 0;
        }
        else {
            this.height = heigth;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return height * getArea();
    }

}



//com.workintech.pool paketi altında Cuboid isimli bir sınıf daha yazmalısınız. Cuboid sınıfı ile Rectangle sınıfı arasında bir ilişki olmalı.
//
//Cuboid sınıfının tek bir sınıf değişkeni var ve adı height. Tipini belirlemek senin görevin. height 0'dan küçükse direkt 0 atanmalı.
//
//Cuboid sınıfının tek bir constructor methodu olmalı ve 3 parametre almalı. width, length ve height.
//
//Cuboid sınıfının iki tane methodu olmalı. getHeight height değerini dönmeli. getVolume volume değerinin hesaplamalı ve dönmeli. Volume alan ile yükseklik değerinin çarpımıdır.