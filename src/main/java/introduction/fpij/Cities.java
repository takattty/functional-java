package introduction.fpij;

import java.util.Arrays;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Albany", "Boulder", "Chicago", "Denver", "Eugene");
        boolean flag = false;
        for (String city : cities) {
            if (city.equals("Chicago")) {
                flag = true;
                break;
            }
        }
        System.out.println("contain Chicago? : " + flag);

        // 宣言的な処理
        System.out.println("contain Chicago? : " + cities.contains("Chicago"));
    }
}
