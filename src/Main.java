import rikkei.Animals;
import ra.Student;

public class Main {
    public static void main(String[] args) {
        // tạo 1 ô nhớ lưu trữ giá trị của biến a là 5
        int a = 5;
        // Sao chép gia trị của biến a gán cho ô nhớ lưu trữ giá trị của biến b
        // b = 5;
        int b = a;
        // khi mình thay đổi gia trị của b, biến  a không thay đổi
        System.out.println("a = " +a);
        b=10;
        System.out.println("a = " +a);


        // Tham chiếu
        // Cấp phát 1 vùng nhớ tham chiếu
        Student student1 = new Student(18,"Hùng");
        // gán giá trị vùng nhớ tham chiếu của biến student1
        Student student2 = student1;
        Student student3 = student1;
        // trước khi thay đổi
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        // thay dổi 1 biến
//        student2.sex = "Nam";
        // sau khi thay đổi
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println(new Student(19,"Khánh").national);
        System.out.println(Student.national);
        Student.displayNational();

    Animals ani =new Animals(4,"black","Thú ăn thịt");

    }
    Animals a = new Animals();
    Animals.SubAnimals  subAnimals = a.new SubAnimals();
}