import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


// I have named the class name as "Employeee" but not "Employee" to avoid the ambiguity created due to Employee class in Question-2
class Employeee
{
    Integer age;
    String designation;
    String name;

    public Employeee(Integer age, String designation, String name) 
    {
        this.age = age;
        this.designation = designation;
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getDesignation() {
        return this.designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("\n\nName: "+this.name);
        sb.append("\nAge: "+this.age);
        sb.append("\nDesignation: "+this.designation);
        return sb.toString();
    }
}


public class q4 
{
    public static void main(String gg[]) throws IOException
    {
        HashMap<Employeee,Integer> employeesMap=new HashMap<>();
        int numberOfEmployees;
        Integer age;
        String name, designation;
        Integer salary;

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter number of employees: ");
        numberOfEmployees=Integer.valueOf(br.readLine());
        int i=0;
        while(i<numberOfEmployees)
        {
            System.out.println("\n------Enter employee details-------");
            System.out.print("Employee's Name: ");
            name=br.readLine();

            System.out.print("Employee's Age: ");
            age=Integer.valueOf(br.readLine());
            
            System.out.print("Employee's Designation: ");
            designation=br.readLine();
            
            System.out.print("Employee's Salary: ");
            salary=Integer.valueOf(br.readLine());
            
            employeesMap.put(new Employeee(age, designation, name), salary);
            System.out.println("*** Employee Added ***");
            i++;
        }

        System.out.println(employeesMap);
    }
    
}
