package session2;

import java.util.Scanner;

public class veHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("4. In hình tam giác cân");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("ĐỘ rộng");
                    int width = sc.nextInt();
                    System.out.println("Độ cao");
                    int height = sc.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào chiều dài của tam giác:");
                    int length = sc.nextInt();

                    for (int i = 1; i <= length; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                case 3:
                    System.out.println("Nhập vào chiều dài của tam giác:");
                    int length1 = sc.nextInt();

                    for (int i = length1; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                default:
                    break;

                case 4:
                    System.out.println("Nhập vào chiều dài của tam giác:");
                    int length2 = sc.nextInt();

                    for (int i = 1; i <= length2; i++) {

                        for (int j = length2 - i; j > 0; j--) {
                            System.out.print(" ");
                        }

                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
            }
        }
    }
}
