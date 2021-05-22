//Chich xuat ham tu thu vien cua java
import java.util.regex.*;
import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.sqrt;
public class Baitapvenha {
    //nhap du lieu qua cmt
    Scanner sc = new Scanner(System.in);
    public void Guest(){
        //Random dung de tao 1 so ngau nhien
        Random rand = new Random();
        int randsoN = rand.nextInt(100)+1;
        //vong lap vo han
        while(true){
            System.out.println("Nhập vào 1 số đi nào: ");
            int doanSo = sc.nextInt();
            if(doanSo<randsoN){
                System.out.println("Số quá nhỏ mời nhập lại");
            }else if(doanSo>randsoN){
                System.out.println("Số quá lớn mời nhập lại");
            }else{
                System.out.println("Bạn đã đoán đúng số: " + doanSo);
                break;
                //break dung de ket thuc mot dieu kien hoac vong lap
            }
        }
        sc.close();
    }
    public void bmiRating() {
        String loiKhuyen = "";
        while(true){
            System.out.print("Chiều cao của bạn: ");
            float height = sc.nextFloat();
            System.out.print("Cân nặng của bạn: ");
            float weight = sc.nextFloat();
            float calBMI = weight/(height* height);
            if(calBMI<18.5){
                loiKhuyen = "Bạn đang hơi nhẹ đó, bạn nên bổ sung dinh dưỡng nhiều hơn nữa nhé";
              }else if(calBMI>18.5 && calBMI<24.9){
                loiKhuyen = "Tuyệt vời, bạn có 1 cơ thể khỏe mạnh";
              }else if(calBMI>25.0 && calBMI<29.9){
                loiKhuyen = "Bạn hơi thừa cân đấy, nên ăn uống điều độ hơn nha";
              }else if(calBMI>30.0){
                loiKhuyen ="Bạn đang thừa cân rất nhiều, điều này là rất nguy hiểm cho sức khỏe của bạn";
              }
            System.out.println(loiKhuyen); 
            System.out.println("Bạn có muốn tiếp tục chương trình: ");
            String chosen = sc.next();
            if(chosen.equals("q")){
                System.exit(0);
            }
        }
      }
    public void regexEmail(){
        String regex = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        System.out.println("Nhập email của bạn: ");
        String email = sc.next();
        while (true){
            if(Pattern.matches(regex, email)){
                System.out.println("Đã đúng định dạng email");
                break;
            }else{
                System.out.println("Email bạn nhập sai định dạng rồi");
                break;
            }
        }
    }
    public void soNguyenTo(){
        System.out.print("Nhập vào số của bạn: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; ++i)
        {
            int count = 0; // đếm số ước của a
            for (int j = 2; j <= sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    count++;
                }
            }
            if (count == 0 && i > 1)
                System.out.println(i + " ");
        }
    }
}
