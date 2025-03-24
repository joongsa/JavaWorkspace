package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        String[] seatA = {"A1","A2","A3"};
        String[] seatB = {"B1","B2","B3"};
        String[] seatC = {"C2","C2","C3"};

        String[][] seats = new String[][]{
            {"A1","A2","A3"},
            {"B1","B2","B3"},
            {"C2","C2","C3"}
        };

        System.out.println("seats = " + seats[1][1]);

        String[][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2"},
                {"C2","C2","C3","C4","C5"}
        };

        System.out.println(seats2[2][5]);




    }
}
