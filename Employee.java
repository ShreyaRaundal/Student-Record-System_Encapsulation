public class Employee {
    private int empId;
    private String name;
    private String position;
    private double salary;

    // constructor
    public Employee(int empId, String name,String position,double salary){
        this.empId=empId;
        this.name=name;
        this.position=position;
        this.salary=salary;
    }

    // getter
    public int getEmpId(){return empId;}
    public String getName(){ return name;}
    public String getpoString(){ return position;}
    public double getBasicSalary(){ return salary;}

    // setter
    public void setSalary(double salary){
        if(salary>=0){
            this.salary=salary;
        }else{
            System.out.println("Salary cannot bE negative");
        }
    }
    public double calculateSalary(){
        double hra=0.10*salary;
        double da=0.05*salary;
        return salary+hra+da;
    }
    public void display(){
        System.out.println("empID: " + empId + ", Name: " + name + ", Position: " + position +
                ", Basic Salary: " + salary + ", Net Salary: ₹" + calculateSalary());
    }
}
