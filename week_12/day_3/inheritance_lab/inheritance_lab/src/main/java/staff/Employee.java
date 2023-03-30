package staff;

public class Employee {

    private String name;

    private String ni;

    private double salary;

    public Employee(String name, String ni, double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(){
        setSalary(this.salary + 100);
    }

    public double payBonus(){
        return this.salary*0.01;
    }
}
