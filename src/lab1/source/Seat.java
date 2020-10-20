package lab1.source;

public class Seat {
    private float height;
    private float width;

    public Seat() {
        height = width = (float) 10;
    }

    public Seat(float h, float w) {
        height = h;
        width = w;
    }
    
    public void show(){
        System.out.println("Class seat:\nHeight: " + height + ".\nWidth: " + width + ".\n");
    }
}
