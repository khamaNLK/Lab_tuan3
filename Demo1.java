package Lab_tuan3;

public class Demo1 {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.input();

        HocSinh hs2 = new HocSinh(101, "Nguyen Van A", 8.0f);
        HocSinh hs3 = new HocSinh(hs2);

        hs1.output();
        hs2.output();
        hs3.output();

        hs3.setHoten("Tran Thi B");
        hs3.output();

        HocSinh max = hs1;
        if (hs2.getDtb() > max.getDtb()) max = hs2;
        if (hs3.getDtb() > max.getDtb()) max = hs3;

        System.out.println("Hoc sinh co DTB cao nhat: " + max.getHoten() + ", DTB: " + max.getDtb());
    }
}