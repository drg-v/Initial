package lab1.source;

import lab1.enumeration.ChairLegs;

public class Chair extends Furniture {

    private class Backboard {
        float height;
        float width;

        Backboard(float w, float h){
            height = h;
            width = w;
        }

        Backboard(){
            height = width = (float) 10;
        }

        public void show(){
            System.out.println("Class backboard:\nWidth: " + width + ".\nHeight: " + height + ".\n");
        }
    }

    Backboard back;
    ChairLegs num;
    ChairFrame frame;
    Seat sitting;
    Manufacturer producer;

    public Chair(float frame_l, ChairLegs number, float frame_h, float frame_w, float seat_h, float seat_w, String Name, Manufacturer obj){
        super();
        back = new Backboard(50, 60);
        num = number;
        frame = new ChairFrame(frame_l, frame_h, frame_w);
        sitting = new Seat(seat_h, seat_w);
        name = Name;
        producer = obj;
    }

    public Chair(String Name) {
        super();
        back = new Backboard();
        num = ChairLegs.FOUR;
        frame = new ChairFrame();
        sitting = new Seat();
        producer = new Manufacturer(Name, this);
    }

    public Chair() {
        super();
        back = new Backboard();
        num = ChairLegs.FOUR;
        frame = new ChairFrame();
        sitting = new Seat();
        producer = new Manufacturer(this.name + "`s Manufacturer", this);
    }
    public void showChair(){
        System.out.println("Class Chair:\nName: " + name + ".\n");
        back.show();
        num.show();
        frame.show();
        sitting.show();
        producer.show();
    }
    public void setName(String Name) {
        name = Name;
    }
}
