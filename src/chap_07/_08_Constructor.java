package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1  = new BlackBox();
        b1.mname = "까망이";
        b1.color = "블랙";
        b1.price = 10000;
        b1.resoulution = "FHD";
        System.out.println(b1.mname);
        System.out.println(b1.serialNuber);

        System.out.println("--------------------");

        BlackBox b2 = new BlackBox("하양이","UDH","화이트",30000);
        System.out.println(b2.mname);
        System.out.println(b2.serialNuber);
    }
}
