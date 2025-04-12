// Upcasting_1.java
class Animal2 {
    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog2 extends Animal2 {
    public void bark() {
        System.out.println("멍멍!");
    }

    @Override
    public void sound() {
        System.out.println("개가 소리를 냅니다.");
    }
}

public class Upcasting_1 {
    public static void main(String[] args) {
        Animal2 animal = new Dog2();
        animal.sound();
    }
}
