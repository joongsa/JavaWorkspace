package chap_06;

import java.sql.SQLOutput;

public class _03_Return {
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-1234";
        return phoneNumber;
    }



    public static void main(String[] args) {
//        String contactNumber = getPhoneNumber();
//        System.out.println(contactNumber);
        System.out.println(getPhoneNumber());
    }
}
