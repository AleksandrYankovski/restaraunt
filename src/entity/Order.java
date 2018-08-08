package entity;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {


    private int id;
    private User user;
    private List<Product> products;
    private Date date;
    private Time time;
    private OrderStatus orderStatus = OrderStatus.ACTIVE;
    private double summaryPrice;
    private double discont;

    public Order() {
        products = new ArrayList<>();
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setSummaryPrice(double summaryPrice) {
        this.summaryPrice = summaryPrice;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setDiscont(double discont) {
        this.discont = discont;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public double getSummaryPrice() {
        return summaryPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public double getDiscont() {
        return discont;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", products=" + products +
                ", date=" + date +
                ", time=" + time +
                ", orderStatus=" + orderStatus +
                ", summaryPrice=" + summaryPrice +
                ", discont=" + discont +
                '}';
    }
}
