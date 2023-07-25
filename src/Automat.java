import java.util.ArrayList;
import java.util.List;


public class Automat {
    List<Product> productList = new ArrayList<>();

    public Automat() {
        this.productList = productList;
    }

    public void initProduct(List <Product> myList){
        productList=myList;
    }

    public Product getProduct(String name) {

        ArrayList<Product> tempProduct=new ArrayList<>();
        for(Product element:productList){
            if(element.getName().equals(name)){
                return element;
            }
        }
        return null;
    }

}
