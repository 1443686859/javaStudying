package domain;

public class Person {
    private String name;
    private String d;
    public Person(){}
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

    private  int age;
    public String a;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println("eat....");
//        return "eat...";
    }
    public void eat(String food){
        System.out.println("eat...."+food);
//        return "eat...";
    }
    public String toString(){
        return this.name+this.age;
    }
}
