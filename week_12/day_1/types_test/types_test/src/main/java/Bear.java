public class Bear {

    private String name;
    private int age;
    private double weight;
    private char sex;

    public Bear(String name, int age, double weight, char sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean readyToHibernate() {
        if (this.weight >=80.00) {
            return true;
        }
            return false;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
