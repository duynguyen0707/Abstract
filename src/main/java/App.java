import entities.HoDien;
import entities.KinhDoanh;
import entities.SinhHoat;

import java.util.Scanner;

public class App {
    public static void main (String [] args){

Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng đơn vị: ");
        int n = sc.nextInt();
        HoDien [] listHoDien = new HoDien[n];
        for (int i = 0; i < listHoDien.length; i++) {
            System.out.println("Điện sinh hoạt hay Kinh Doanh? Sinh Hoạt: 1, Kinh Doanh:2");
            int type = sc.nextInt();
            if(type==1){
                HoDien sh = new SinhHoat();
                System.out.println("Nhập thông tin cho đơn vị thứ " + (i+1));
                sh.inPut();
                listHoDien[i]=sh;
            }
            else if(type==2){
                HoDien sh = new KinhDoanh();
                System.out.println("Nhập thông tin cho đơn vị thứ" + (i+1));
                sh.inPut();
                listHoDien[i]=sh;
            }
        }
        for (int i = 0; i < listHoDien.length; i++) {
            System.out.println(listHoDien[i]);
            System.out.println("Số tiền điện tiêu thụ là: " + listHoDien[i].giaDien());

        }



//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số lượng đơn vị có trong danh sách: ");
//        int n = sc.nextInt();
//        HoDien [] listHoDien = new HoDien[n];
//        for (int i = 0; i < listHoDien.length; i++) {
//            System.out.println("Điện sinh hoạt hay kinh doanh? Sinh Hoạt: 1, Kinh Doanh:2");
//            int type = sc.nextInt();
//
//            if(type==1){
//                HoDien sh = new SinhHoat();
//                sh.inPut();
//                listHoDien[i]=sh;
//            }
//        }




        // Số đơn vị cần nhập
        // Chọn nhập SH or KD
        //Nếu là SH thì sẽ chọn Lẻ hay sỉe





        // gia sh LE : 1000 -> 3000 bac thang -cd
        // gia sh SI : 900 -> 2700 bac thang cd

        // KD thap: 1000 cd
        // KD vau : 1500 cd
        // KD cao:  2000 cd


        // cach 1 - t: dang
        // cach 2  - duy: pendign - sẽ giai thk


        // class HoDien - so_dien, vat, nhập số điện chô nay
        // class SH extend HoDien -> type: SI OR LE - (input)
        // class KD: ext   HOdian: -> thapdiem, cao diem, binh thuong  - (input)




        // mô tả: chôn sh chắc ko gì để nói, nhâp số điện sử dụng
        // chọn kd -> thì cũng nhập số đinẹ sử dụng xong, nó sẽ bảo nhập số điện cao điêm, thấp điểm, còn bình thường trừ ra ( cái này validate xíu )

        // rồi xong, call di




    }
}
