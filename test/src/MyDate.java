import java.util.Scanner;

public class MyDate {
    int date;
    int mouth;
    int year;

    static void nhapData(int date, int mouth, int year){
        System.out.println("Date " + date + " mouth " + mouth + " year " + year);
    }

    public static void main(String[] args){
        nhapData(30, 01, 2001);
    }
}

