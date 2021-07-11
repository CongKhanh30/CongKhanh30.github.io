import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("01", "Oppo Reno5 8GB-128GB", 2000000, 10, 7, "OPPO", Category.PHONE));
        list.add(new Product("02", "Oppo Reno4 Pro", 11490000, 25, 10, "OPPO", Category.PHONE));
        list.add(new Product("03", "Samsung Galaxy Z Flip", 20990000, 10, 3, "Samsung", Category.PHONE));
        list.add(new Product("04", "Oppo A92", 5990000, 30, 15, "OPPO", Category.PHONE));
        list.add(new Product("05", "Xiaomi Redmi 9 4GB-64GB", 3190000 , 30, 25, "Xiaomi", Category.PHONE));
        list.add(new Product("06", "Asus Zenbook UX325EA-EG079T", 20790000 , 10, 6, "Asus", Category.LAPTOP));
        list.add(new Product("07", "Dell G3 15 i5 10300H", 21840000 , 15, 4, "Dell", Category.LAPTOP));
        list.add(new Product("08", "Dell Inspiron N7501 i7 10750H", 28970000 , 10, 1, "Dell", Category.LAPTOP));
        list.add(new Product("09", "iPhone 12 Pro Max 128GB", 30990000 , 30, 15, "iPhone", Category.APPLE));
        list.add(new Product("10", "MacBook Air 13 2020 M1 16GB/256GB", 33990000 , 20, 5, "MacBook", Category.APPLE));
        list.add(new Product("11", "Loa bluetooth Compact 2", 290000, 20, 15, "Xiaomi", Category.ACCESSORIES));
        list.add(new Product("12", "Loa bluetooth i.value BT116", 490000, 15, 5, "i.value", Category.ACCESSORIES));
        


    }
    public static void Bai1(ArrayList <Product> list, Category manufacturer) {
        System.out.println("Danh mục " + manufacturer + ":");
        list.stream().filter(i -> i.getCategory() == manufacturer).forEach(i -> System.out.println(i));
        System.out.println();
    }

    // public static void Bai2(ArrayList<Product> list, String description) {
    //     System.out.println("Danh mục " + description + ":");
    //     list.stream().filter(i -> i.getDescription().equals(description)).forEach(i -> System.out.println(i));
    //     System.out.println();
    // }

    // public static void Bai3(ArrayList<Product> list, Category manufacturer, String mucGia) {
    //     System.out.println("Danh mục " + manufacturer + ", " + mucGia + ":");
    //     switch (mucGia) {
    //         case "Dưới 2 triệu": {
    //             list.stream().filter(i -> (i.getCategory() == manufacturer) && (i.getUnitPrice() < 2000000))
    //                     .forEach(i -> System.out.println(i));
    //             break;
    //         }
    //         case "Từ 2 - 4 triệu": {
    //             list.stream().filter(
    //                     i -> (i.getCategory() == manufacturer) && (i.getUnitPrice() <= 4000000 && i.getUnitPrice() >= 2000000))
    //                     .forEach(i -> System.out.println(i));
    //             break;
    //         }
    //         case "Từ 4 - 7 triệu": {
    //             list.stream().filter(
    //                     i -> (i.getCategory() == manufacturer) && (i.getUnitPrice() <= 7000000 && i.getUnitPrice() >= 4000000))
    //                     .forEach(i -> System.out.println(i));
    //             break;
    //         }
    //         case "Từ 7 - 13 triệu": {
    //             list.stream().filter(
    //                     i -> (i.getCategory() == manufacturer) && (i.getUnitPrice() <= 13000000 && i.getUnitPrice() >= 7000000))
    //                     .forEach(i -> System.out.println(i));
    //             break;
    //         }
    //         case "Trên 13 triệu": {
    //             list.stream().filter(i -> (i.getCategory() == manufacturer) && (i.getUnitPrice() > 13000000))
    //                     .forEach(i -> System.out.println(i));
    //             break;
    //         }
    //         default: {
    //             System.out.println("Sorry");
    //         }
    //     }
    //     System.out.println();
    // }

    // public static void Bai4(ArrayList<Product> list, String str) {
    //     list.stream().filter(i -> (i.getProductName().equals(str))).forEach(i -> System.out.println(i));

    // }
    
}
