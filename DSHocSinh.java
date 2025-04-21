package Lab_tuan3;


import java.util.*;

public class DSHocSinh {
    private HocSinh[] ds;
    private int soluong;

    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        soluong = sc.nextInt();
        ds = new HocSinh[soluong];
        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ":");
            ds[i] = new HocSinh();
            ds[i].input();
        }
    }

    public void xuatDS() {
        System.out.println("\nDanh sach hoc sinh:");
        for (int i = 0; i < soluong; i++) {
            ds[i].output();
        }
    }

    public void sapXep() {
        Arrays.sort(ds, (a, b) -> Float.compare(b.getDtb(), a.getDtb()));
    }
}
