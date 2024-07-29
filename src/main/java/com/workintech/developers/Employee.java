package com.workintech.developers;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee starts to working");
    }


}



//com.workintech.developers paketi altında Employee isimli bir sınıf oluşturunuz. İçerisinde id, name, salary sınıf değişkenleri olmalı.
//Employee sınıfının bir adet constructor ve her değişkeni için getter & setter metodları olmalı. Constructor içerisinde 3 değişkende set edilebilmeli.
//Employee sınıfının içerisinde bir adet work isimli bir metod olmalı ve Employee starts to working şeklinde bir mesaj basmalı.
//Employee sınıfı ile parent child ilişkisi olan 4 sınıf daha yazmalısınız. HRManager, JuniorDeveloper, MidDeveloper, SeniorDeveloper
//Her child sınıf parent sınıfında var olan 3 parametreyi set edebildiği bir constructor metoduna sahip olmalı.(Gerekirse başka constructorlarda eklenebilir.)
//Tüm sınıflarda work metodu Override edilmeli. Her bir sınıf için o sınıfa özgü bir mesaj basılmalı ve çalışanın maaşı güncellenmeli.
//HRManager sınıfında 3 adet instance variable tanımlanmalı. JuniorDeveloper, MidDeveloper, SeniorDeveloper lar için birer array.
//HRManager addEmployee isimli bir metoda sahip olmalı. Bu metod için gerekli Overload edilmiş hallerini tanımlamalısınız.
//Bu metodun amacı JuniorDeveloper gelirse ilgili developeri juniorDevelopers dizisine eklemeli.
//MidDeveloper gelirse ilgili developeri midDevelopers dizisine eklemeli.
//SeniorDeveloper gelirse ilgili developeri seniorDevelopers dizisine eklemeli.
//Bu eklemeler yapılırken ilgili dizide index alanı dolu mu diye bakılmalı. Doluysa içerdeki veri ezilmemeli. Bir uyarı verilmeli. Aynı zamanda indexin hiç var olmadığı durum da göz önünde bulundurulmalı.
//Uygulamayı Test Etmek