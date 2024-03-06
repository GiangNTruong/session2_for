package session2;

import java.util.Scanner;

public class baiCuoi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào giá trị a");
            double a =  Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập vào giá trị b");
            double b =  Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập vào giá trị c");
            double c =  Double.parseDouble(scanner.nextLine());
            double chuViTamGiac = a+b+c;
            double p = chuViTamGiac/2;
            double dienTichTamGiac = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            if (a >0 && b>0 & c>0 && a+b>c && a+c>b && b+c>a){
                System.out.printf("Chu vi tam giác : %f" ,chuViTamGiac);
                System.out.printf("Dien tich tam giac : %f " , dienTichTamGiac);
                return;
            }else {
                System.out.println("Lỗi Mời Nhập Lại");
            }
        }

    }
}
