package chap_08;

import chap_07.BlackBox;
import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
        //b1.resolution = "FHD"; // default 다른패키지
        //b1.price = 200000; // private
//        b1.setPrice(2555);
//        System.out.println(b1.getPrice());
        //b1.color = "블랙"; // protected 자식에서만

        BlackBox b2;
    }

}
