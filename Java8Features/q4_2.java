import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*

Given a list of objects of following class:
           class Employee{
           String fullName;
           Long salary;
           String city;
           }

          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
          Note: Full name is concatenation of first name, middle name and last name with single space in between.  

*/

class Employeee
{
    String fullName;
    Long salary;
    String city;

    public Employeee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFirstName()
    {
        String[] tmp=this.fullName.split(" ");
        return tmp[0];
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Long getSalary() {
        return salary;
    }
    public void setSalary(Long salary) {
        this.salary = salary;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("\nName: "+this.fullName);
        sb.append("\nSalary: "+this.salary);
        sb.append("\nCity: "+this.city);
        return sb.toString();
    }
}

public class q4_2 {
    public static void main(String gg[])
    {
        List<Employeee> employees=new ArrayList<>();
        employees.add(new Employeee("Nayan Bhile",Long.valueOf(50000),"Ujjain"));
        employees.add(new Employeee("Sajal Jain",Long.valueOf(2500),"Delhi"));  // Required answer
        employees.add(new Employeee("Vibhor Joshi",Long.valueOf(25000),"Mumbai"));
        employees.add(new Employeee("Anisha Jain",Long.valueOf(13450),"Ujjain"));
        employees.add(new Employeee("Pragati Khare",Long.valueOf(5600),"Delhi"));
        employees.add(new Employeee("Sajal Kumar",Long.valueOf(2500),"Delhi"));  // Required answer
        employees.add(new Employeee("Damini Mandloi",Long.valueOf(5000),"Mumbai"));
        employees.add(new Employeee("Yash Wardhan Singh",Long.valueOf(3600),"Delhi"));  // Required answer
        employees.add(new Employeee("Sparsh Tiwari",Long.valueOf(34567),"Ujjain"));
        employees.add(new Employeee("Krati Singh Choudhary",Long.valueOf(12323),"Delhi"));
        employees.add(new Employeee("Shruti Aggarwal",Long.valueOf(1234),"Ujjain"));
        employees.add(new Employeee("Sejal Jain",Long.valueOf(500),"Mumbai"));
        employees.add(new Employeee("Komal Gupta",Long.valueOf(3400),"Delhi"));  // Required answer
        employees.add(new Employeee("Govind Kumar",Long.valueOf(12345),"Mumbai"));
        employees.add(new Employeee("Yash Solanki",Long.valueOf(3200),"Delhi"));  // Required answer

    //    for(Employeee emp: employees) System.out.println(emp.getFirstName()); 

       System.out.println(employees.stream()
                 .filter(e->e.getSalary()<Double.valueOf(5000))
                 .filter(e->e.getCity().equalsIgnoreCase("Delhi"))
                 .map(e->e.getFirstName()).distinct()
                 .collect(Collectors.toList())
                );
    }
}
