import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Names {
    public static void main(String[] args){
        List<String> fullNames = new ArrayList<>();
        fullNames.add("Nguyen Cong            Khanh");
        fullNames.add("nGuYen Thanh tRung");
        fullNames.add("Nguyen  Minh An");
        fullNames.add("Nguyen Viet Anh");
        fullNames.add("Le Van Phu");
        fullNames.add("Le  Quang Tung");
        fullNames.add("Son Bui");

        for (int i = 0;i<fullNames.size();i++){
            System.out.println(fullNames.get(i).replaceAll("\\s\\s+", " ").trim()
            );
            

        }
    }
}