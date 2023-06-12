import ra.Student;

public class SubStudent extends Student {
    public SubStudent(int age, String name) {

        super(age, name);
    }
    public void demo(){
        Student s = new Student(22, "Xuân");
        s.setName("hùng");
    }

//    public static void main(String[] args) {
//        Student s3 = new Student(22,"Xuân");
//        super.name=23;
//    }

}
