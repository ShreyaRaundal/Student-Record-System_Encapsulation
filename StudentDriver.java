public class StudentDriver {
    public static void main(String[] args) {

        // create a student object using a constructor
        Student s1=new Student("Shreya Raundal", 41, 21, 99.5, "MIT-WPU");
        Student s2=new Student("Tanishka Shind", 42, 22, 92.5, "COEP");
        Student s3=new Student("Shree Kulkarni", 43, 19, 86.5, "VIP Pune");

        // Dissplay student deatail
        s1.display();
        s2.display();
        s3.display();

        // Update the student's grade using setter
        s3.setGrade(90);

        // Recheck deatails
        System.out.println("Updated Grade for"+s3.getName()+":"+s3.getGrade());
    }
}

