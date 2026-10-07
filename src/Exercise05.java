package exercise05;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập phân số thứ nhất (a/b)
        System.out.println("Nhập phân số thứ nhất:");
        System.out.print("Nhập tử số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập mẫu số b: ");
        int b = scanner.nextInt();

        // Nhập phân số thứ hai (c/d)
        System.out.println("Nhập phân số thứ hai:");
        System.out.print("Nhập tử số c: ");
        int c = scanner.nextInt();
        System.out.print("Nhập mẫu số d: ");
        int d = scanner.nextInt();

        // Tính tổng hai phân số theo công thức: (a*d + b*c) / (b*d)
        int tuSo = (a * d) + (b * c);
        int mauSo = b * d;

        // In kết quả ra màn hình dưới dạng phân số (a/b)
        System.out.printf("Kết quả: %d/%d\n", tuSo, mauSo);

        // Đóng scanner
        scanner.close();
    }
}