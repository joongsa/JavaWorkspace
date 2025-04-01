package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        //BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox객체 생성
        //  bbox 객체는 Blackbox 클래스의 인스턴스


        BlackBox b1 = new BlackBox();
        b1.color = "블랙";

        System.out.println(b1.color);

        BlackBox b2 = new BlackBox();

        b2.color = "하양";

        System.out.println(b2.color);
    }
}
