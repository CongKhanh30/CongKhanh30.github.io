import java.util.Arrays;
import java.util.Scanner;

public class BTVNbinarySearch {

    public static int binarySearchWhile(int[] arr, int key) {
        int left = 0, right = arr.length - 1, m = 0;

        if (key == arr[left]) {
            return left;
        }

        if (key == arr[right]) {
            return right;
        }

        while (left <= right) {
            m = (left + right) / 2;
            if (key > arr[m]) {
                left = m + 1;
            } else {
                right = m - 1;
            }

            if (key == arr[m]) {
                return m;
            }
        }
        return -1;
    }

    public static int binarySearchWhile(String[] arr, String key) {
        int left = 0, right = arr.length - 1, m = 0;

        if (key.equals(arr[left])) {
            return left;
        }

        if (key.equals(arr[right])) {
            return right;
        }

        while (left <= right) {
            m = (left + right) / 2;
            if (key.compareTo(arr[m]) > 0) {
                left = m + 1;
            } else {
                right = m - 1;
            }

            if (key.equals(arr[m])) {
                return m;
            }
        }
        return -1;
    }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] stt = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        String[] name = new String[] { "Bùi Giáng Sơn", "Lê Văn Phú", "Dương Văn Thắng", "Nguyễn Công Khanh",
                "Nguyễn Quang Tùng", "Chử Văn Long", "Lê Văn Tốt", "Nguyễn Thành Trung", "Hoàng Trọng Khoa",
                "Nguyễn Minh An", "Nguyễn Việt Anh" };

        System.out.println("Nhập stt in ra tên");
        System.out.print("Nhập stt cần tìm: ");

        int n = scanner.nextInt();
        int v = binarySearchWhile(stt, n);

        if (v == -1) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.println("Tên cần tìm: " + name[v]);
        }

        System.out.println("\nNhập tên in stt");
        System.out.println("stt: " + stt[binarySearchWhile(name, "Nguyễn Công Khanh")]);

        System.out.println("\nArrays name: "+name[Arrays.binarySearch(stt, 4)]);
    }
}
