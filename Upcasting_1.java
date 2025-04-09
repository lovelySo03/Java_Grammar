// 부모 클래스
class Animal {
    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

// 자식 클래스
class Dog extends Animal {
    public void bark() {
        System.out.println("멍멍!");
    }

    @Override
    public void sound() {
        System.out.println("개가 소리를 냅니다.");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        // 업캐스팅: Dog 객체를 Animal 타입으로 참조
        Animal animal = new Dog();

        // 부모 클래스의 메서드만 사용 가능
        animal.sound();  // 출력: 개가 소리를 냅니다.

        // animal.bark(); // 오류! Animal 타입에는 bark()가 없음
    }
}


/*
업캐스팅은, 결국 부모가 자식의 클래스를 사용하게 될 때를 말하는 것이다. 
그런데, 이때 부모 안에 있는 변수만 사용이 가능하다. 

다시말해 Dog 클래스는 Animal 클래스를 상속받는다.
Dog 객체를 Animal 타입의 참조 변수인 animal로 다루는 것이 업캐스팅이다.

업캐스팅 후에는 오버라이딩된 sound() 메서드는 자식 클래스의 것이 호출됩니다.
하지만 bark()처럼 자식 클래스에만 있는 메서드는 사용할 수 없습니다.
*/
