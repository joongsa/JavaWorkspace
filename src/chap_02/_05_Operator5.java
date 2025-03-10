package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //결과 = (조건) ? (참의 경우 결과) : (거짓의 경우 결과)

        int x = 5;
        int y = 3;
        int max = ( x > y) ? x : y ;
        System.out.println(max);




        boolean b = (x == y) ? true : false ;
        System.out.println(b);

        boolean c = (x != y) ? true : false ;
        System.out.println(b);


    }
}
