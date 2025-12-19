package own.akhmet;

public class Human {

    String name;
    int age;
    String sex;

    public Human(String name, int age, String sex) { //Конструктор для класса Human, позволяет проициниализировать поля класса. Пишется с таким же названием как у класса, с большой буквы.
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

}
