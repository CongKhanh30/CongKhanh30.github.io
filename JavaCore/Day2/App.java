public class App {
    public static void main(String[] args) {
      System.out.println("Chào các bạn lớp Java 4");
      Math math = new Math();
      //Math là tên của class. Tên của Class luôn bắt đầu bằng chữ Hoa
      //math là tên của object
      System.out.println(math.isOdd(4));
  
      float weight = 70f;
      float height = 1.71f;
      System.out.println("Chỉ số BMI của Khanh " + math.calculateBMI(height, weight));
  
      float diameter = 3.0f;
      System.out.println("Chu vi của hình tròn có đường kính " 
      + diameter + " = " 
      + math.circlePerimeter(diameter));
  
      float x = 5.0f;
      float y = 3.0f;
      float z = 2.0f;
      if (math.isTriangle(x, y, z)) {
        System.out.println("x : " + x + ", y : " + y + ", z : " + z + " tạo thành một tam giác");
      } else {
        System.out.println("x : " + x + ", y : " + y + ", z : " + z + " không tạo thành một tam giác");
      }
  
      System.out.println("Số nhỏ nhất trong x: " + x 
      + ", y: " + y 
      + ", z: " + z 
      + " là " + math.smallestIn3Numbers(x, y, z));
  
      int[] intArray = new int[]{1, 2, 3};
      System.out.println("Tổng của một mảng " + math.sum(intArray));
    
      int[] intAverArray = new int[]{1, 2, 3, 4};
      System.out.println("Trung bình cộng của một mảng " + math.average(intAverArray));
                                       
      int[] intReverseArray = new int[]{1, 2, 3, 4};
      System.out.print("Mảng đảo chiều là: ");
      System.out.println(math.reverseArray(intReverseArray));
    
      int[] intCountOddNumber = new int[]{1, 2, 3, 4 ,5};
      System.out.println("Số số lẻ trong mảng là: " + math.countOddNumber(intCountOddNumber));
    
      int[] intOddNumberArray = new int[]{1, 2, 3, 4};
      System.out.print("Các số lẻ trong mảng là: ");
      System.out.println(math.oddNumberArray(intOddNumberArray));
      
      System.out.println("Đánh giá: " + math.bmiRating(height,weight));
      
    }


  }