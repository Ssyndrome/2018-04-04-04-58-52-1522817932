package practice3;

import java.math.BigDecimal;
import java.util.List;

public class PriceCalculator {
    BigDecimal subTotal;

    public PriceCalculator(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getSubTotal(List<OrderLineItem> orderLineItemList, List<BigDecimal> discounts) {
        // Total up line items
        for (OrderLineItem lineItem : orderLineItemList) {
            subTotal = subTotal.add(lineItem.getPrice());
        }

        // Subtract discounts
        for (BigDecimal discount : discounts) {
            subTotal = subTotal.subtract(discount);
        }
        return subTotal;
    }
}
