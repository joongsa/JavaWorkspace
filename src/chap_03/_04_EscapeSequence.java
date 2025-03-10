package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        System.out.println("자바");
        System.out.println("너무");
        System.out.println("귀찮");

        System.out.println("자바\n너무\n귀찮");

        System.out.println("해물파전\t9000원\n김치전\t8000원");

        System.out.println("C:\\Program Files\\Java");

        char c = 'A';
        c = '\'';

        System.out.println(c);
    }
}
