package KeThua.Bai2;

public class Main {
    public static void main(String[] args) {
        Sach S = new Sach();
        TapChi TC = new TapChi();

        System.out.println("Nhap sach: ");
        S.nhap();

        System.out.println("Nhap Tap chi: ");
        TC.nhap();

        S.xuat();
        TC.xuat();
    }
}
