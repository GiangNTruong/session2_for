package session2;

import java.util.Scanner;

public class chuVivsdienTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("Menu");
            System.out.println("1.Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2.Tính chu vi và diện tích hình tam giác");
            System.out.println("3.Tính chu vi và diện tích hình hình tròn");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập chiều dài");
                    double cd= Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhap chiều rộng");
                    double cr = Double.parseDouble(scanner.nextLine());
                    double chuViHCN= 2*cd*cr;
                    double dienTichHCN = cd*cr;
                    System.out.println("Diện tích hình chữ nhật là : " +dienTichHCN);
                    System.out.println("Chu vi hình chữ nhật là : " +chuViHCN);
                    break;
                case 2:
                    System.out.println("Nhập độ dài cạnh a");
                    double a= Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập độ dài cạnh b");
                    double b= Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập độ dài cạnh c");
                    double c= Double.parseDouble(scanner.nextLine());
                    double chuViTamGiac = a+b+c;
                    double p = chuViTamGiac/2;
                    double dienTichTamGiac = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    System.out.println("Diện tích hình tam giác là : " +chuViTamGiac);
                    System.out.println("Chu vi hình tam giác là : " +dienTichTamGiac);
                    break;
                case 3:
                    System.out.println("Nhập vào bán kính hình tròn r");
                    double r = Double.parseDouble(scanner.nextLine());
                    double chuViHinhTron = 2*Math.PI*r;
                    double dienTichHinhTron = Math.PI*(r*r);
                    System.out.printf("Diện tích hình tròn là : %.2f \n" ,chuViHinhTron);
                    System.out.printf("Chu vi hình tròn là : %.2f \n" ,dienTichHinhTron);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }
        }
    }
}
