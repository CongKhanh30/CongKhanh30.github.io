import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("01", "A50", "New", 2000000, 15, 5));
        list.add(new Product("02", "S21", "New", 4500000, 30, 7));
        list.add(new Product("03", "Note20 Ultra", "New", 20000000, 10, 2));
        list.add(new Product("04", "Note10+", "Old", 1000000, 20, 3));
        list.add(new Product("05", "A72","New", 6000000, 20, 10));
        show(list);

        Collections.sort(list, new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2) {
            
                return o1.getProductName().compareTo(o2.getProductName());
                
            }
        });
        System.out.println("Danh sach sap xep theo ten");
        show(list);

        Collections.sort(list, new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2) {
            
                return o1.getAmountSales()-(o2.getAmountSales());
                
            }
        });
        System.out.println("Danh sach sap xep theo so luong ban duoc");
        show(list);

        System.out.println("Danh sach san pham co gia tren 1.000.000:");
        list.stream().filter(Product -> Product.getUnitPrice() > 1000000)
        .forEach(Product -> System.out.println(Product));        
    }
       
    
   

    public static void show(ArrayList<Product> list){
        list.forEach(productName -> System.out.println(productName));
    }
}



