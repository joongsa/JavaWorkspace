package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님 배송시작 " + hour + "시 방문");
        System.out.println(name + "님 배송완료");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";

        System.out.println(name + "님 평균점수는 " + score + "점");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = false;
        System.out.println("시험 합겨할까? " + pass);

        double d = 3.14123412341234;
        float f = 3.145678576858F;

        System.out.println(d);
        System.out.println(f);

        long l = 100000000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);



    }
}
