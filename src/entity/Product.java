package entity;

public class Product {

    private int id;
    private String name;
    private double price;
    private int proteint;
    private int fat;
    private int carbohydrates;
    private boolean novelty;//новинка
    private double discont;
    private String typeProduct;

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price)  {
        this.price = price;
    }

    public void setProteint(int proteint) {
        this.proteint = proteint;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setNovelty(boolean novelty)  {
        this.novelty = novelty;
    }

    public void setDiscont(int discont) {
        this.discont = discont;
    }

    public void setTypeProduct(String typeProduct)  {
        this.typeProduct = typeProduct;
    }

    public int getId()  {
        return id;
    }

    public String getName()  {
        return name;
    }

    public double getPrice()  {
        return price;
    }

    public int getProteint()  {
        return proteint;
    }

    public int getFat()  {
        return fat;
    }

    public int getCarbohydrates()  {
        return carbohydrates;
    }

    public boolean isNovelty()  {
        return novelty;
    }

    public double getDiscont()  {
        return discont;
    }

    public String getTypeProduct()  {
        return typeProduct;
    }

    public double getPayPrice() {
        return price - discont * price / 100;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", proteint=" + proteint +
                ", fat=" + fat +
                ", carbohydrates=" + carbohydrates +
                ", novelty=" + novelty +
                ", discont=" + discont +
                ", typeProduct=" + typeProduct +
                '}';
    }

//    equals and HashCOde

}
