package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        int rank = 4;
        if(rank==1){
            System.out.println("전장");

        }else if(rank == 2){
            System.out.println("반액");

        }else if(rank == 3){
            System.out.println("1/3");
        }else{
            System.out.println("장학금X");
        }
        System.out.println(("조회완"));

        /// //////////
        rank = 2;
        switch(rank) {
            case 1 :
                System.out.println("전액");
                break;
            case 2:
                //System.out.println("2액");
                //break;
            case 3:
                System.out.println("3액");
                break;
            default:
                System.out.println("아님");

        }
        System.out.println("완료");

    }
}
