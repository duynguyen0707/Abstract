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

    }
}
