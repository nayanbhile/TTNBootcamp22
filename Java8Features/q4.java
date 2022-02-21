
// Create an Employee Class with instance variables (String) name, (Integer)age, 
// (String)city and get the instance of the Class using constructor reference  

@FunctionalInterface
interface interfaceQ4
{
    Employee doIt(String name, Integer age, String city);
}

class Employee
{
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city) 
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
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
        sb.append("\nName: "+this.name);
        sb.append("\nAge: "+this.age);
        sb.append("\nCity: "+this.city);
        return sb.toString();
    }

    
    
}

public class q4 {
    public static void main(String gg[])
    {
        interfaceQ4 tmp=Employee::new;
        Employee emp= tmp.doIt("Nayan Bhile", 22, "Ujjain");
        System.out.println(emp);
    }
    
}
