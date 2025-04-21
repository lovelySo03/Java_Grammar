// Class Practice

class Myhandbag {
    String brandName;
    int price;
    String bagName;
    boolean hasHandle;
}

public class Class_Prac_1 {
    public static void main(String[] args) {
        Myhandbag myBag = new Myhandbag();
        myBag.brandName = "Pink";
        myBag.price = 2000;
        myBag.bagName = "Marmont";
        myBag.hasHandle = true;

        System.out.println("Brand: " + myBag.brandName);
    }
}
