public class EmployeeDriver {
    public static void main(String[] args){
        
        Employee e1=new Employee(1, "Shreya Raundal","Developer",180000);
        Employee e2=new Employee(2," Ravi Deshmuk", "Manager", 50000);

        e1.display();
        e2.display();
        
        // Trying to set invalid salary
        e1.setSalary(-5000);

    }
}
