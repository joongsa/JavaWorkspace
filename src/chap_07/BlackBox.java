package chap_07;

public class BlackBox {

    //인스턴스변수
    String mname;
    String resoulution;
    String color;
    int price;

    //클래스변수
    static boolean canAutoReport = false;

    void autoReport() {
        if (canAutoReport) {
            System.out.println("자동으로신고");
        } else {
            System.out.println(("기능미지원"));
        }
    }

    void insertMemoryCard(int capa) {
        System.out.println("메모리카드삽입");
        System.out.println("용랑은 " + capa);
    }


    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화시작");
        if (showDateTime) {
            System.out.println("영상에 날짜표시");
        }
        if (showSpeed) {
            System.out.println("영상에 속도표시");
        }
        System.out.println("영상은 " + min + "분 단위로 기록");
    }

    void record() {
        record(true, true, 5);
    }

    //클래스변수
    static void callCenter() {
        System.out.println("6400-1234");

        canAutoReport = false;
    }


    public void appendMname(String s) {
        mname += s;
    }
}
