import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat extends Automat{
    public HotBeverageAutomat(List<Product> products){
        super();
    }

    public Product getProduct(String name, int price, double volume, double temp){

        ArrayList<HotBeverage> tempProduct=new ArrayList<>();

        for (Product product:productList){
            if(product instanceof Beverages&&product.getName().equals(name)&&product.getPrice()==price){
                if (((HotBeverage) product).getVolume() == volume && ((HotBeverage) product).getTemp() == temp) {
                    tempProduct.add((HotBeverage) product);
                }
            }
        }
        return null;

    }


}
