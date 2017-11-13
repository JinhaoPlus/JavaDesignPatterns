package top.jinhaoplus.Chap4_FactoryMethod.idcard;

import top.jinhaoplus.Chap4_FactoryMethod.framework.Factory;
import top.jinhaoplus.Chap4_FactoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<String>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
