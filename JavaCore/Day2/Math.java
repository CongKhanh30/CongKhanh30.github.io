public class Math {
  public boolean isOdd(int x) {//int x là tham số truyền vào, method parameter
    return x % 2 != 0;
  }

  public boolean isEven(int x) {
    return x % 2 == 0;
  }

  public float calculateBMI(float height, float weight) {
    return weight / (height * height);
  }

  public float circlePerimeter(float diameter) {
    return diameter * 3.14f;  
  }

  public boolean isTriangle(float x, float y, float z) {
    return ((x + y > z) && (y + z > x) && (x + z > y));
    
    
    /* cách này hơi dài dòng
    if ((x + y > z) && (y + z > x) && (x + z > y)) {
      return true;
    } else {
      return false;
    }*/
  }

  public float smallestIn2Numbers(float x, float y){
    /*
    if (x < y) {
      return x;
    } else {
      return y;
    }*/
    //Ternary operation
    return (x < y) ? x : y;
  }

  public float smallestIn3Numbers(float x, float y, float z) {
    //return smallestIn2Numbers(smallestIn2Numbers(x, y), z);
  
    float min = x;
    if(min > y && y < z){
      min = y;
    } else if (min > z){
      min = z;
    }
    return min;
  }


  //Lời giải của Minh An
  public float sum(int[] numbers) {
    float sum = 0f;
    for(int i = 0; i < numbers.length; i++) {
        sum = sum + numbers[i];
        
    }
    return sum;
  }
  public float average(int[] numbers) {
    float sum = 0f;
    int count = 0;
    for(int i = 0; i < numbers.length; i++) {
        sum = sum + numbers[i];
        count++;
    }
    return sum/count;
  }

  public int[] reverseArray(int[] numbers) {
    for(int i = numbers.length-1; i >= 0; i-- ){
      System.out.print(numbers[i]+ " ");
    }

    return null;
  }

  public int countOddNumber(int[] numbers) {
    int count = 0;
    for(int i=0; i<numbers.length; i++){
      if(numbers[i] % 2 != 0){
        count++;
      }
    }
    return count;
  }

  public int[] oddNumberArray(int[] numbers) {
    for(int i=0; i<numbers.length; i++){
      if(numbers[i] % 2 != 0){
        System.out.print(numbers[i]+ " ");
      }
    }
    return null;
  }

  public String bmiRating(float height, float weight) {
    String danhGia = "";
    float calBMI = weight/(height* height);
    if(calBMI<18.5){
      danhGia = "Nhẹ cân";
    }else if(calBMI>18.5 && calBMI<24.9){
      danhGia = "Bình thường";
    }else if(calBMI>25.0 && calBMI<29.9){
      danhGia = "Quá cân";
    }else if(calBMI>30.0){
      danhGia = "Rất nguy hiểm";
    }
    return danhGia;
  }
}
