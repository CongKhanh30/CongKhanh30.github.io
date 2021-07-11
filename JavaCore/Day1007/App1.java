import java.util.ArrayList;
import java.util.Collections;

public class App1 {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);
        numbers.add(8);
        numbers.add(8);
        numbers.add(2);
        numbers.add(1);

        System.out.println("Danh sách ban đầu: ");
        numbers.forEach(num -> System.out.println("\t " + num));

        System.out.println("Danh sách những số chia hết cho 2:");
        numbers.stream().filter(number -> number % 2 == 0)
        .limit(2).forEach(number -> System.out.println(number));

        System.out.println("\nChia het cho 5:");
        numbers.stream().filter(num -> num % 5 == 0).forEach(num -> System.out.printf("%d, ", num));

        System.out.println("\nLon hon 5:");
        numbers.stream().filter(num -> num > 5).forEach(num -> System.out.printf("%d, ", num));
        
        long count = numbers.stream()
        .filter(num -> num % 2 == 0).count();
        System.out.println("Có " + count + " phần tử chia hết cho 2");
    }
}
