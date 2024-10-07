package introduction.fpij;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Iteration {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

//        for (int i = 0; i < friends.size(); i++) {
//            System.out.println(friends.get(i));
//        }

        // 外部イテレータ
        // どこから開始して、どこで終了するかイテレーションを明示的に制御する
        // つまり、どうやっていてレートするかと何を行うかが混在している
        System.out.println("外部イテレータ");
        for (var friend : friends) {
            System.out.println(friend);
        }

        // 内部イテレータ
        // どの様に行うかをライブラリに任せて、何を行うかに集中
        System.out.println("内部イテレータ - 匿名巻数");
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("内部イテレータ - ラムダ式");
        friends.forEach(System.out::println);

        System.out.println("内部イテレータ - ラムダ式（型推論）");
        friends.forEach(System.out::println);

        System.out.println("内部イテレータ - ラムダ式（型推論とパラメータ省略）");
        friends.forEach(System.out::println);

        System.out.println("内部イテレータ - ラムダ式（型推論とパラメータ省略とメソッド参照）");
        friends.forEach(System.out::println);

    }
}
