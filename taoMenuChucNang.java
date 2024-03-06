package session2;

import java.util.Scanner;

public class taoMenuChucNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập số cần kiểm tra:");
                    int num = scanner.nextInt();
                    if (num % 2 == 0) {
                        System.out.println(num + " là số chẵn.");
                    } else {
                        System.out.println(num + " là số lẻ.");
                    }
                    break;
                case 2:
                    System.out.println("Nhập số cần kiểm tra:");
                    int primeNum = scanner.nextInt();
                    if (isPrime(primeNum)) {
                        System.out.println(primeNum + " là số nguyên tố.");
                    } else {
                        System.out.println(primeNum + " không phải là số nguyên tố.");
                    }
                    break;
                case 3:
                    System.out.println("Nhập số cần kiểm tra:");
                    int divisibleNum = scanner.nextInt();
                    if (divisibleNum % 3 == 0) {
                        System.out.println(divisibleNum + " chia hết cho 3.");
                    } else {
                        System.out.println(divisibleNum + " không chia hết cho 3.");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
