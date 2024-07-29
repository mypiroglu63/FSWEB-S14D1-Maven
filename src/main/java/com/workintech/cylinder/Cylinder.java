package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double heigth;

    public Cylinder(double radius, double heigth) {
        super(radius);
        if (heigth < 0) {
            this.heigth = 0;
        } else {
            this.heigth = heigth;
        }
    }

    public double getHeight() {
        return heigth;
    }

    public double getVolume() {
        return heigth * getArea();
    }
}



//Cylinder sınıfının bir tane sınıf değişkeni olmalı ve adı height olmalı. height değişkeninin tipi ne olmalı ?
//
//Cylinder sınıfının bir tane constructor methodu olmalı ve 2 parametre almalı. height parametresi 0'dan küçükse, height 0'a eşitlenmeli.
//
//Cylinder sınıfının getHeight isimli bir metodu olmalı ve height değerini return etmeli.
//
//Cylinder sınıfının getVolume isimli bir metodu olmalı hacmi hesaplamalı. Hacmi hesaplamak için getArea ile height değişkenini çarpmalı.