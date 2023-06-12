package ra;

import java.util.Date;

public class Student {
    boolean sex;
   public int age;
   protected String name;
   private Date date;
   public static String national ="Việt Nam";
   static {
       national= "VietNamese";
   }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : "+name +" | Age : "+ age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getNational() {
        return national;
    }

    public static void setNational(String national) {
        Student.national = national;
    }

    public static void displayNational(){
       getNational();
       national="VietNam";
        System.out.println(national);
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
