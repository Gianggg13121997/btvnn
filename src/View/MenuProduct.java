package View;

import Manager.ProductManager;
import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuProduct {
    ProductManager productmanager = new ProductManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {

        int choice;
        do {
            System.out.println("=======Menu Product========\n1.Thêm mới sản phẩm :\n2.Sửa sản phẩm:\n3 Xoá sản phẩm :\n4: Hiển thị tất cả :\n0 : thoát :");
            System.out.println("Nhập lựa chọn :");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 4 :
                    showAll();
                    break;
                case 3 :
                    showMenuRemove();
                    break;

            }
        } while (choice != 0);


    }

    public void showMenuAdd() {
        System.out.println("Đây là menu mới :");
        System.out.println("Nhập Id :");
        int id = inputInt.nextInt();
        System.out.println("Nhập tên :");
        String name = inputString.nextLine();
        System.out.println("Nhập giá :");
        int price = inputInt.nextInt();
        Product product = new Product(id, name, price);
        productmanager.add(product);
        System.out.println("====thêm thành công !=====");


    }
    public void showAll(){
        System.out.println("danh sách sản phẩm là : ");
        ArrayList<Product> list = productmanager.findAll();
        for (Product product : list) {
            System.out.println(product);
        }
    }
    public void showMenuRemove(){
        System.out.println("xoá sản phẩm :");
        System.out.println("Nhập ID sản phẩm cần xoá :");
        int id = inputInt.nextInt();
        productmanager.remove(id);
        System.out.println("xoá thành công !");

    }

}