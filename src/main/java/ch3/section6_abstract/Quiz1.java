package ch3.section6_abstract;

interface Printable {
    public void print();
}

abstract class Animal {
    protected String name;
    protected int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract public void makeSound();
}

class Dog extends Animal implements Printable {
    private String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public void print() {
        System.out.println("Dog\nname : " + getName() + ", age : " + getAge() + ", breed : " + getBreed());
    }

    public String getBreed() {
        return breed;
    }

    public void fetch() {
        System.out.println("fetch()\n");
    }
}

class Cat extends Animal implements Printable {
    private String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public void print() {
        System.out.println("Cat\nname : " + getName() + ", age : " + getAge() + ", color : " + getColor());
    }

    public void climb() {
        System.out.println("climb()\n");
    }

}

class Document implements Printable {
    private String title;
    private String content;

    Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void print() {
        System.out.println("title : " + getTitle() + ", content : " + getContent());
    }
}

public class Quiz1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", 10, "허스키");
        dog.print();
        dog.makeSound();
        dog.fetch();

        Cat cat = new Cat("Cat", 5, "white");
        cat.print();
        cat.makeSound();
        cat.climb();

        Document document = new Document("Animal", "Document");
        document.print();
    }
}
