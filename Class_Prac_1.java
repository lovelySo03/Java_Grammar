// Class Practice

class Handbag {
    // 브랜드 이름
    String brandName;
    // 가격
    int price;
    // 가방 이름
    String bagName;
    // 손잡이 여부
    boolean hasHandle;

    public Handbag(){
        brandName = "";
        price = 0;
        bagName = "";
        hasHandle = false;
    }
}

public class Class_Prac_1 {
    public static void main(String[] args) {
        // 빈 파라미터의 생성자를 사용하여 객체 생성
        // 생성자는 무조건, 클래스와 이름이 똑같아야 한다.
        Handbag myBag = new Handbag();

        // 객체의 속성 값 설정
        myBag.brandName = "Pink";
        myBag.price = 2000;
        myBag.bagName = "Marmont";
        myBag.hasHandle = true;

        System.out.println("Brand: " + myBag.brandName);
    }
}
