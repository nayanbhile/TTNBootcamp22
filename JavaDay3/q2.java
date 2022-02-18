import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class Employee implements Comparable<Employee>
{
    Double age;
    Double salary;
    String name;

    public Double getAge() {
        return age;
    }
    public void setAge(Double age) {
        this.age = age;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Employee o) 
    {
        return this.name.compareTo(o.getName());
    }
    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("\n\nName: "+this.name);
        sb.append("\nAge: "+this.age);
        sb.append("\nSalary: "+this.salary);
        return sb.toString();
    }
    
}


public class q2 {
    public static void main(String gg[]) throws IOException
    {
        int numberOfEmployees,i;
        ArrayList<Employee> employees=new ArrayList<>();
        System.out.print("Enter number of employees: ");
        //Scanner sc=new Scanner(System.in);
        //numberOfEmployees= sc.nextInt();

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        numberOfEmployees=Integer.valueOf(br.readLine());
        i=0;
        while(i<numberOfEmployees)
        {
            System.out.println("********Enter Employee Details********");
            Employee employee=new Employee();
            System.out.print("Name: ");
            employee.setName(br.readLine());
            System.out.print("Age: ");
            employee.setAge(Double.valueOf(br.readLine()));
            System.out.print("Salary: ");
            employee.setSalary(Double.valueOf(br.readLine()));
            employees.add(employee);
            i++;
        }

        Collections.sort(employees);
        System.out.println(employees);

    }

}
