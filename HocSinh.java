package Lab_tuan3;

import java.util.Scanner;

public class HocSinh {
    private int maso;
    private String hoten;
    private float dtb;

    // Getters and Setters
    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    // Constructors
    public HocSinh() {
        this.maso = 0;
        this.hoten = "";
        this.dtb = 0.0f;
    }

    public HocSinh(int maso, String hoten, float dtb) {
        this.maso = maso;
        this.hoten = hoten;
        this.dtb = dtb;
    }

    public HocSinh(HocSinh other) {
        this.maso = other.maso;
        this.hoten = other.hoten;
        this.dtb = other.dtb;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        maso = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        dtb = sc.nextFloat();
    }

    public void output() {
        System.out.println("Ma so: " + maso + ", Ho ten: " + hoten + ", Diem trung binh: " + dtb);
    }

    public void rank() {
        if (dtb < 5)
            System.out.println("Xep loai: Yeu");
        else if (dtb < 7)
            System.out.println("Xep loai: Trung binh");
        else if (dtb < 8.5)
            System.out.println("Xep loai: Kha");
        else
            System.out.println("Xep loai: Gioi");
    }
}
