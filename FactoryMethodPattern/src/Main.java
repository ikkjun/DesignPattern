import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Eriksen",  16);
        Product card2 = factory.create("Heungmin Son", 7);
        Product card3 = factory.create("Kane", 10);
        card1.use();
        card2.use();
        card3.use();

    }
}
