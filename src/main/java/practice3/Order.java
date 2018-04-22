package practice3;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    private List<OrderLineItem> orderLineItemList;
    private List<BigDecimal> discounts;
    private BigDecimal tax;

    public Order(List<OrderLineItem> orderLineItemList, List<BigDecimal> discounts) {
        this.orderLineItemList = orderLineItemList;
        this.discounts = discounts;
        this.tax = new BigDecimal(0.1);
    }

    public BigDecimal calculate() {
        BigDecimal subTotal = new BigDecimal(0);
        PriceCalculator priceCalculator = new PriceCalculator(subTotal);
        subTotal = priceCalculator.getSubTotal(orderLineItemList, discounts);
        return subTotal.add(subTotal.multiply(this.tax));
    }
}
