import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Product {
    protected String name;

    protected Integer price;
    protected Integer quantity;

    protected Calendar bestBefore;




    public Product(String name, Integer price, Integer quantity, Calendar bestBefore) {
        this.name = name;
        this.price = price;
        this.quantity =quantity;
        this.bestBefore= bestBefore;

    }

    ArrayList<Product> productList=new ArrayList<>();

    public void initProduct(ArrayList<Product> myProductlist){
        productList=myProductlist;
    }

    public String getName(){
        return name;
    }

    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public Calendar getBestBefore(){
        return bestBefore;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setBestBefore(Calendar bestBefore) {
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", bestBefore=" + bestBefore.get(Calendar.DATE)+"."+bestBefore.get(Calendar.MONTH)+"."+bestBefore.get(Calendar.YEAR)+
                '}';
    }



}
