package ch3.section5_inherited.test3.sub;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(this.name.equals(name))) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    protected void info() {
        System.out.println("이름 : " + this.getName() + "\n나이: " + this.getAge());
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        User user = new User("kim", 20);
        user.info();
        user.setAge(30);
        user.setName("hong");
        user.info();
    }
}
