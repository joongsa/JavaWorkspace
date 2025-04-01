package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.mname=  "까망이";
        System.out.println(b1.mname);

        BlackBox b2 = new BlackBox();
        b2.mname=  "하양이";
        System.out.println(b2.mname);

        //특정범위 초과시 자동신고기능 개발
        System.out.println("---개발 전---");
        System.out.println(b1.mname + " 자동신고기능 : " + b1.canAutoReport);
        System.out.println(b2.mname + " 자동신고기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 자동신고기능 : " + BlackBox.canAutoReport); //권장

        //기능개발
        BlackBox.canAutoReport = true;
        System.out.println("---개발 후---");
        System.out.println(b1.mname + " 자동신고기능 : " + b1.canAutoReport);
        System.out.println(b2.mname + " 자동신고기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 자동신고기능 : " + BlackBox.canAutoReport);//권장
    }
}
