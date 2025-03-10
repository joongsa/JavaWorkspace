package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        int score = 95;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        float score_f = 95.5F;
        double score_d = 98.8;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        score = 93 + (int)98.9;
        System.out.println(score);

        score_d = (double) 93 + 98.8;
        System.out.println(score_d);

        double convertScoreDouble = score;
        //int -> long -> float -> double

        int convertScoreInt = (int) score_d;
        // double -> float -> long -> int

        String s1 = String.valueOf(93);

        s1 = Integer.toString(99);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

        int error = Integer.parseInt("자바");
        System.out.println(error);
    }

}
