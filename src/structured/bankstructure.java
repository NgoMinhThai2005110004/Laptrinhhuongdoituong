package structured;

import java.util.Scanner;

public class bankstructure{
    static int soTK = 2005110004;
    static int soDu = 600000;
    public static void main(String[] args) {
        //data
        //operation
        // gui tien

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so tien gui: ");
        int soTien = input.nextInt();
        soDu += soTien;

        //thong tin tai khoan
        inThongTin();
        //rut tien

        System.out.print("Nhap so tien rut: ");
        soTien = input.nextInt();
        soDu -= soTien;

        //thong tin tai khoan
        inThongTin();
    }

    //ham in thong tin
    static void inThongTin(){
        System.out.println("Thong tin tai khoan");
        System.out.println("so tai khoan: "+soTK);
        System.out.println("so du: "+soDu);
    }
}