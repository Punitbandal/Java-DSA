package JAVAOOPS2;

public class Inheritance {
    public static void main(String[] args) {
        samsung s10=new samsung();
        s10.os="Android";
        s10.playGames();

        iphone a1=new iphone();
        a1.playGames();
    }
}


class samsung extends MobliePhone{
    void playGames(){
        System.out.println("Samsung plays game.");
    }
}
class iphone extends MobliePhone
{

}
class MobliePhone{
    String os;
    int price;
    int dimen;
    boolean hasHeadPhoneJack;
    void playGames(){
        System.out.println("Mobile Phones plays game.");
    }

}