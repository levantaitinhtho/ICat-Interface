package managercat.manager.cat;

import java.util.Scanner;

public class UsingmanagerCat {
    public static void main(String[] args) {
        ManagerCat managerCat = new ManagerCat();
        int choose;
        do {
            showMenu();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Choose: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:
                   managerCat.input();
                    break;
                case 2:
                    managerCat.show();
                    break;
                case 3:
                    managerCat.sort();
                    break;
                case 4:
                    managerCat.search();
                    break;
                case 5:
                    System.out.println("GoodBye !! ~");
                    break;
                default:
                    System.err.println("Enter Again Choose");
            }

        }while (choose!=5);
    }
    static void showMenu(){
        System.out.println("1.Nhập thông tin vào n con mèoooo");
        System.out.println("2.Hiển thị");
        System.out.println("3.Sắp xếp danh sách theo màu lông");
        System.out.println("4.Tìm kiếm thông tin theo loại");
        System.out.println("5.Out ~~");
    }
}
