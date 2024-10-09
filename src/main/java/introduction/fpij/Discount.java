package introduction.fpij;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Discount {
    public static void main(String[] args) {
        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12")
        );

        // 価格が20ドル以上の場合だけ合計して、そこから10%割引する実装。
        var total= BigDecimal.ZERO;
        for (var price : prices) {
            if (price.compareTo(new BigDecimal("20")) > 0) {
                total = total.add(price);
            }
        }
        System.out.println(total.multiply(BigDecimal.valueOf(0.9)));

        // プリミティブ型への執着
        // 単一責任の原則を無視

        // 改善
        // これを思いつくには、.multiplyや.reduceの使い方がわかっていて
        // 先にどう処理するかを明確にしておかないといけない。
        // たとえば、上のコメントだけならmapまで出来るけどreduceは知らないと出来ない
        // 次これを生かすなら、まずは上のコメントアウトをstreamで処理しやすいように改善すると、もっと例を増やすべき
        // まぁでもちょっとやりすぎ感はあるな
        final BigDecimal totalOfDiscountedPrices = prices.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(totalOfDiscountedPrices);
    }
}
