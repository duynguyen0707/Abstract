package entities;

import java.util.Scanner;

public class KinhDoanh extends HoDien {
    private String type;
    private int soLuongDienThapDiem;
    private int soLuongDienCaoDiem;
    private int soLuongDienBinhThuong;

    @Override
    public int giaDien() {
        int giaDien = 0;
        if (this.type.equals("caoap")) {
            giaDien = (int) ((this.soLuongDienBinhThuong * 2442 + this.soLuongDienThapDiem * 1361 + this.soLuongDienCaoDiem * 4251) * this.vat);
        } else if (this.type.equals("trungap")) {
            giaDien = (int) ((this.soLuongDienBinhThuong * 2629 + this.soLuongDienThapDiem * 1547 + this.soLuongDienCaoDiem * 4400) * this.vat);
        } else if (this.type.equals("thapap")) {
            giaDien = (int) ((this.soLuongDienBinhThuong * 2666 + this.soLuongDienThapDiem * 1622 + this.soLuongDienCaoDiem * 4587) * this.vat);
        } else System.out.println("Thông tin ko hợp lệ");
        return giaDien;
    }

    @Override
    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kinh doanh theo mô hình nào\n Cao Áp: 1 Trung Áp: 2 Thấp Áp: 3");
        int n = sc.nextInt();
        if (n == 1) {
            this.type = "caoap";
        } else if (n == 2) {
            this.type = "trungap";
        } else if (n == 3) {
            this.type = "thapap";
        } else System.out.println("Thông tin ko hợp lệ");
        System.out.println("Nhập số lượng điện tiêu thụ trong tháng");
        int soLuongDienTieuThu = sc.nextInt();
        this.soDienTieuThu = soLuongDienTieuThu;
        System.out.println("Nhập số lượng điện tiêu thụ trong giờ thấp điểm");
        int soLuongDienThapDiem = sc.nextInt();
        this.soLuongDienThapDiem = soLuongDienThapDiem;
        System.out.println("Nhập số lượng điện tiêu thụ trong giờ cao điểm");
        int soLuongDienCaoDiem = sc.nextInt();
        this.soLuongDienCaoDiem = soLuongDienCaoDiem;
        this.soLuongDienBinhThuong = soLuongDienTieuThu - (soLuongDienThapDiem + soLuongDienCaoDiem);

    }
}
