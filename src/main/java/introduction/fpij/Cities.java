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
        /**
         * 宣言的
         * ・状態変更が可能な変数を扱わなくなった
         * ・イテレーションのステップが隠蔽
         * ・実行すべきことに明確に焦点が合っている
         * ・邪魔が少なく、要件を表現している
         * ・エラー発生の可能性がより少ない
         * ・簡単に理解＋保守できる
         * これらが改善された。「どうやって実行するか」じゃなく、「何をしたいか」を宣言する形に変換できた。
         * 確かに、状態変更な変数は減って嬉しいし、何をしたいかは明確。
         * 命令的な処理だと、8行の中から真ん中まで読まないといけない。
         * さらに、その条件から何をするのかまで見ないといけない。（計算なのか、別のメソッドを呼ぶのか、またfor文を回すのかなど）
         * なので宣言的にかけると、「何をしたいか」が明確になるのを実感。
         */
    }
}
