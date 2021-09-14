package entities;

import java.util.Scanner;

public class SinhHoat extends HoDien {
    private String Type;

    @Override
    public int giaDien() {
        int giaDien=0;


        if(this.Type.equals("si")){
            final int giaBac1 = 1403;
            final int giaBac2 =1459;
            final int giaBac3 =1590;
            final int giaBac4 =1971;
            final int giaBac5 =2231;
            final int giaBac6 =2323;
            if(this.soDienTieuThu<0){
                System.out.println("Thông tin không hợp lệ");
            }
            if(this.soDienTieuThu<=50){
                giaDien = (int) ((this.soDienTieuThu*giaBac1)*this.vat);

            }
            if (this.soDienTieuThu>50 && this.soDienTieuThu<=100){
                giaDien = (int) ((int)(50*giaBac1 + (this.soDienTieuThu-50)*giaBac2)*this.vat);
            }
            if (this.soDienTieuThu>100 && this.soDienTieuThu<=150 ){
                giaDien = (int) ((int)((50*giaBac1 + 50*giaBac2 + (this.soDienTieuThu-100)*giaBac3)*this.vat));
            }
            if (this.soDienTieuThu>150 && this.soDienTieuThu<=200 ){
                giaDien = (int) ((int)((50*giaBac1 + 50*giaBac2 + 50*giaBac3+(this.soDienTieuThu-150)*giaBac4)*this.vat));
            }
            if (this.soDienTieuThu>200 && this.soDienTieuThu<=250 ){
                giaDien = (int) ((int)(50*giaBac1 + 50*giaBac2 + 50*giaBac3+50*giaBac4+(this.soDienTieuThu-200)*giaBac5*this.vat));
            }
            if (this.soDienTieuThu>250 ){
                giaDien = (int) ((int)((50*giaBac1 + 50*giaBac2 + 50*giaBac3+50*giaBac4+50*giaBac5+(this.soDienTieuThu-250)*giaBac6)*this.vat));
            }
        }
        else if (this.Type.equals("le")){
            final int giaBac1 = 1678;
            final int giaBac2 =1734;
            final int giaBac3 =2014;
            final int giaBac4 =2536;
            final int giaBac5 =2834;
            final int giaBac6 =2927;
            if(this.soDienTieuThu<0){
                System.out.println("Thông tin không hợp lệ");
            }
            if(this.soDienTieuThu<=50){
                giaDien = (int) ((this.soDienTieuThu*giaBac1)*this.vat);

            }
            if (this.soDienTieuThu>50 && this.soDienTieuThu<=100){
                giaDien = (int) ((int)(50*giaBac1 + (this.soDienTieuThu-50)*giaBac2)*this.vat);
            }
            if (this.soDienTieuThu>100 && this.soDienTieuThu<=150 ){
                giaDien = (int) ((int)((50*giaBac1 + 50*giaBac2 + (this.soDienTieuThu-100)*giaBac3)*this.vat));
            }
            if (this.soDienTieuThu>150 && this.soDienTieuThu<=200 ){
                giaDien = (int) ((int)((50*giaBac1 + 50*giaBac2 + 50*giaBac3+(this.soDienTieuThu-150)*giaBac4)*this.vat));
            }
            if (this.soDienTieuThu>200 && this.soDienTieuThu<=250 ){
                giaDien = (int) ((int)(50*giaBac1 + 50*giaBac2 + 50*giaBac3+50*giaBac4+(this.soDienTieuThu-200)*giaBac5*this.vat));
            }
            if (this.soDienTieuThu>250 ){
                giaDien = (int) ((int)((50*giaBac1 + 50*giaBac2 + 50*giaBac3+50*giaBac4+50*giaBac5+(this.soDienTieuThu-250)*giaBac6)*this.vat));
            }
        }
        else return 0;
        return giaDien;

    }

    public SinhHoat() {

    }

    public SinhHoat(String type) {
        this.Type = type;
    }

    public SinhHoat(int soDienTieuThu, String type) {
        super(soDienTieuThu);
        this.Type = type;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Điện sinh hoạt giá sỉ hay giá buôn? Buôn: 1 Lẻ: 2 \n");
        int n = sc.nextInt();
        if (n==1){
            this.Type="si";
        }
        if (n==2){
            this.Type ="le";
        }
        System.out.println("Nhập số lượng điện tiêu thụ: ");
        int dienTieuThu = sc.nextInt();
        this.soDienTieuThu = dienTieuThu;
           }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SinhHoat{");
        sb.append("soDienTieuThu=").append(soDienTieuThu);
        sb.append(", vat=").append(vat);
        sb.append(", Type='").append(Type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
