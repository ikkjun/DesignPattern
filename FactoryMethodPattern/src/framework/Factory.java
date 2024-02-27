package framework;

public abstract class Factory {
    public final Product create(String owner, int number) {
        Product p = createProduct(owner, number);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner, int number);
    protected abstract void registerProduct(Product product);
}
