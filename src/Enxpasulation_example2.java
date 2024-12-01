class Employee
{
    private String employee_id;
    private  double salary;

    public String getEmployee_id()
    {
        return employee_id;
    }

    public void setEmployee_id(String employee_id)
    {
        this.employee_id = employee_id;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}

public class Enxpasulation_example2
{
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        e1.setEmployee_id("E1234");
        e1.setSalary(10000.0);
        System.out.println("Emplyoee_id:"+e1.getEmployee_id());
        System.out.println("Salary:"+e1.getSalary());
    }
}
