package chap_07;

public class BlackBox {

    //인스턴스변수
    String mname;
    String resoulution;
    String color;
    int price;

    int serialNuber;//시리얼ㅁ번호
    static int counter = 0; //시리얼번호를 생성해주는 역할: 처음엔 0 -> +1씩

    //클래스변수
    static boolean canAutoReport = false;

   // //생성자 start
    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNuber = ++counter;
        System.out.println("새로운시리얼넘버" + this.serialNuber);

    }

    BlackBox(String mname, String resoulution, String color, int price) {
        this();  //기본생성자 호출

        System.out.println("사용자정의생성자 호출");
        this.mname = mname;
        this.resoulution = resoulution;
        this.color = color;
        this.price = price;


    }

   // //생성자  end

    //메소드
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

    //메소드오버로딩
    void record() {
        record(true, true, 5);
    }


    //클래스메소드
    static void callCenter() {
        System.out.println("6400-1234");

        canAutoReport = false;
    }

    //this
    public void appendMname(String mname) {
        this.mname += mname;
//        mname += s;
    }
}
