package herenciaPublicacion;

public class Disco extends Publication {

    private float duration;

    public Disco() {
        super();
        duration = 0.0f;
    }

    public Disco(String title, float price, float duration) {
        super(title, price);
        this.duration = duration;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    @Override
    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Duration: " + duration);
    }
}