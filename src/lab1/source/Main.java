package lab1.source;

import java.util.ArrayList;
import java.util.Iterator;
import lab1.enumeration.ChairLegs;

class Example {

    public static void main(String[] args){
        ArrayList<Chair> lst = new ArrayList<Chair>();
        Manufacturer obj = new Manufacturer("Wood master");
        lst.add(new Chair(40.0f, ChairLegs.THREE, 10.0f, 10.0f, 60.0f, 50.0f, "First", obj));
        lst.add(new Chair(45.0f, ChairLegs.FOUR, 11.0f, 12.0f, 61.0f, 51.0f, "Second", obj));
        lst.add(new Chair(50.0f, ChairLegs.THREE, 12.0f, 14.0f, 62.0f, 52.0f, "Third", obj));
        lst.add(new Chair(55.0f, ChairLegs.FOUR, 13.0f, 16.0f, 63.0f, 53.0f, "Fourth", obj));
        lst.add(new Chair(60.0f, ChairLegs.THREE, 14.0f, 18.0f, 64.0f, 54.0f, "Fifth", obj));
        Iterator<Chair> chairIterator = lst.iterator();
        while (chairIterator.hasNext()) {
            chairIterator.next().showChair();
        }
    }

}