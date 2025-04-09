
/*
💡 다형성(Polymorphism)이란?
다형성은 "여러 가지 형태를 가질 수 있는 성질"을 의미한다.
자바에서 다형성이란, 하나의 객체가 여러 타입으로 동작할 수 있는 능력을 말한다.

즉, 부모 클래스 타입의 참조 변수로 자식 클래스의 객체를 다룰 수 있고,
오버라이딩(Overriding)을 통해 동일한 메서드 호출이 객체에 따라 다르게 동작할 수 있다.
*/

class Animal {
    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("개가 멍멍 짖습니다.");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("고양이가 야옹합니다.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog();  // 다형성
        Animal animal2 = new Cat();  // 다형성

        animal1.sound();  // 출력: 개가 멍멍 짖습니다.
        animal2.sound();  // 출력: 고양이가 야옹합니다.
    }
}


/*

부모 타입(Animal)으로 자식 객체(Dog, Cat)를 다룰 수 있다 → 업캐스팅 + 다형성

sound() 메서드를 자식들이 재정의했기 때문에, 자식에 맞는 기능이 호출된다.

다형성을 이용하면, 여러 객체를 하나의 인터페이스처럼 통일되게 처리할 수 있어서 유지보수가 편하다.

*/
