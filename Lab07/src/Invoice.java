import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<LineItem> lineItems;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.lineItems = new ArrayList<>();
    }

    public void addLineItem(LineItem item) {
        lineItems.add(item);
    }

    public double getTotalAmountDue() {
        return lineItems.stream().mapToDouble(LineItem::getTotal).sum();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}