package herenciaPublicacion;
public abstract class Publication {

    protected String title;
    protected float price;

    public Publication() {
        title = "Unknown";
        price = 0.0f;
    }

    public Publication(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract void show();

    @Override
    public String toString() {
        return String.format("Publication[title=%s, price=%s]", title, price);
    }
}