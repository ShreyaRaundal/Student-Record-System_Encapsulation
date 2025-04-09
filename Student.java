public class Student {

    // step 1-private class attribute
    private String name;
    private int rollNo;
    private int age;
    private double grade;
    private String  college;

    // step 2-Constaructor
    public Student(String name,int rollNo,int age,double grade,String college){
        this.name=name;
        this.rollNo = rollNo;
        this.age=age;
        this.grade=grade;
        this.college=college;
    }
    // step 3-Getter (to access private data)
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public int getAge(){
        return age;
    }
    public double getGrade(){
        return grade;
    }

    public String getCollege(){
        return college;
    }

    // step4-setters(to update private data)
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    //step 5- Display Method
    public void display(){
        System.out.println("Name : "+ name);
        System.out.println("RollNo : "+ rollNo);
        System.out.println("Age : "+age);
        System.out.println("Grade : "+ grade);
        System.out.println("College : "+college);
        System.out.println("--------------------------------");

    }
    
}
