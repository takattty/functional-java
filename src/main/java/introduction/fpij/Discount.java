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
    }
}
