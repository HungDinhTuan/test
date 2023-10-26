public class LineItem extends Product {
    private int quatity;

    public LineItem() {

    }

    public LineItem(long sku, String name, String category, Double price, int quantity, int quatity) {
        super(sku, name, category, price, quantity);
        this.quatity = quatity;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    // method cost()
    public Double cost(){
        return getPrice() * quatity;
    }

    @Override
    public String toString() {
        return "Lineltem{" +
                "quatity=" + quatity +
                '}';
    }
}
