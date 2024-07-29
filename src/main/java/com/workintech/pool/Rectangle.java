package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
       if(width < 0) {
           this.width = 0;
       }
       else {
           this.width = width;
       }

       if(length < 0) {
           this.length = 0;
       }
       else {
           this.length = length;
       }
    }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        public double getArea() {
            return width * length;
        }
    }








//com.workintech.pool paketi altında Rectangle isimli bir sınıf yazınız. Sınıf'ın iki tane sınıf değişkeni olmalı. width ve length İki değişkeninde tipini ne seçmeliyiz?

//width değişkeni de height değişkenide 0 dan küçük set edilirse direkt olarak 0'a set edilmeliler.
//
//Rectangle sınıfının 3 methodu olmalı getWidth width alanını dönmeli.
//
//getLength methodu length fieldini dönmeli
//
//getArea methodu (width*length) i dönmeli.
//
