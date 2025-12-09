
public class Student {
    private String name;
    private int age;
    private int Gpa;
    public Student(String name, int age, int Gpa) {
        this.name = name;
        this.age = age;
        this.Gpa = Gpa;
    }
    public Student(){
        name= "mark";
        age = 20;
        Gpa = 23;
    }

    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getGpa() {
        return Gpa;
    }
    public int setGpa(int Gpa) {
        this.Gpa = Gpa;
        return Gpa;
    }

    public int getAge() {
        return age;
    }
    public int setAge(int age) {
        this.age = age;
        return age;
    }
    public void StudentInfo(){
        boolean isPass = getGpa() >= 50;
        System.out.println("name: " + name + ", age: " + age + ", Gpa: " + Gpa + ", Pass: " + isPass);
    }

}
