package urfu.lesson6;

public class Item
{
    private float price;
    private Info info;

    public Item(float price, Info info)
    {
        this.price = price;
        this.info = info;
    }

    public float getPrice() {
        return price;
    }

    public Info getInfo() {
        return info;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
