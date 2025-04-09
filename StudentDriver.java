public class StudentDriver {
    public static void main(String[] args) {

        // create a student object using a constructor
        Student s1 = new Student("Shreya Raundal", 101, 21, 88.5, "MIT-WPU");
        Student s2 = new Student("Aarav Mehta", 102, 20, 91.2, "COEP");
        Student s3 = new Student("Ishika Kulkarni", 103, 22, 85.0, "VIT Pune");

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

