package lab1.source;

public class ChairFrame {
    private float length;
    private float width;
    private float height;

    public ChairFrame() {
        length = width = height = (float) 10;
    }

    public ChairFrame(float l, float h, float w) {
        length = l;
        height = h;
        width = w;
    }

    public void show(){
        System.out.println("Class chairFrame:\nLength: " + length + "\nWidth: " + width + "\nHeight: " + height + ".\n");
    }
}
