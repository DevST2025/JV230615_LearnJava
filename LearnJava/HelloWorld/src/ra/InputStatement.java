package ra;

import java.util.Scanner;

public class InputStatement {
    public static void main(String[] args) {
        //nhập tên sv và in ra màn hình console
        //B1: Nhập tên sv
        //1.1 Khởi tạo đối tượng Scanner của package java.util
        Scanner scanner = new Scanner(System.in);
        //1.2 Thông báo nhập
        System.out.println("Nhập vào tên SV");
        //1.3 Lấy dữ liệu gán vào biến
        String studentName = scanner.nextLine();
        //Nhập vào mã SV - String và in ra màn hình
        System.out.println("Nhập vào mã SV");
        String studenId = scanner.nextLine();
        //Nhập vào điểm trung bình SV - float
        System.out.println("Nhập vào điểm trung bình");
        float avgMark = scanner.nextFloat();
        //Bước 2: In thông tim tên sv ra màn hình
        System.out.println("Tên sv là: " +studentName);
        System.out.println("Mã sv là: " +studenId);
        System.out.println("Điểm trung bình sv là: " +avgMark);


    }
}
