package com.workintech.developers;

public class HRManager extends Employee {
   private JuniorDeveloper[] juniorDevelopers;
   private MidDeveloper[] midDevelopers;
   private SeniorDeveloper[] seniorDevelopers;

   // Constructor
   public HRManager(int id, String name, double salary, int juniorSize, int midSize, int seniorSize) {
      super(id, name, salary);
      this.juniorDevelopers = new JuniorDeveloper[juniorSize];
      this.midDevelopers = new MidDeveloper[midSize];
      this.seniorDevelopers = new SeniorDeveloper[seniorSize];
   }

   @Override
   public void work() {
      System.out.println("HR Manager is managing the employees and updating salaries.");
      setSalary(getSalary() * 1.10); // Maaşı %10 artır
   }

   // Overloaded addEmployee metotları
   public void addEmployee(JuniorDeveloper dev) {
      addEmployeeToArray(juniorDevelopers, dev);
   }

   public void addEmployee(MidDeveloper dev) {
      addEmployeeToArray(midDevelopers, dev);
   }

   public void addEmployee(SeniorDeveloper dev) {
      addEmployeeToArray(seniorDevelopers, dev);
   }

   // Genel ekleme metodu
   private <T> void addEmployeeToArray(T[] array, T dev) {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == null) {
            array[i] = dev;
            System.out.println(dev.getClass().getSimpleName() + " added to the array.");
            return;
         }
      }
      System.out.println("No space available to add " + dev.getClass().getSimpleName());
   }
}
