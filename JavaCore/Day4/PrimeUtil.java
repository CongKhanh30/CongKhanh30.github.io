public class PrimeUtil {
    public boolean isPrimeA(long number){
        for (long i=2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean isPrimeC(long number) {
        long sqrtOfNumber = (long) Math.sqrt((double)number); //căn bậc 2 của number
        for (int i = 2; i <= sqrtOfNumber; i++) {
          if (number % i == 0) {
            return false;
          }
        }
        return true;
      }

    //n là số lượng số nguyên tố cần phải trả về
    public long[] createArrayPrimeNumbersB(int n) {
        long[] result = new long[n];
        int count = 0;
        int numberToCheck = 2;
        while (count < n) {
          boolean isPrime = true;
          for (int i = 0; i < count; i++) {
            if (numberToCheck % result[i] == 0) {
              isPrime = false;
              break; // không phải số nguyên tố
            }
          }
          if (isPrime) {
            result[count] = numberToCheck;
            count++;
          }
          
          numberToCheck++;
        }
    
        return result;
      }
      public long[] createArrayPrimeNumbersB(int n) {
        long[] result = new long[n];
        int count = 0;
        int numberToCheck = 2;
        while (count < n) {
          boolean isPrime = true;
          for (int i = 0; i < count; i++) {
            if (numberToCheck % result[i] == 0) {
              isPrime = false;
              break; // không phải số nguyên tố
            }
          }
          if (isPrime) {
            result[count] = numberToCheck;
            count++;
          }
          
          numberToCheck++;
        }
    
        return result;
      }

}
