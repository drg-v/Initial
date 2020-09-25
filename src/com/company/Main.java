package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import enumeration.ChairLegs;

class Example {

    private abstract static class Furniture {
        protected String name;
        abstract public void setName(String Name);
    }

    private static class Seat {
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

    private static class ChairFrame {
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

    public static class Manufacturer {
        private String name;
        private Chair[] models;

        public Manufacturer(String Name, Chair ... objects){
            name = Name;
            if(objects.length > 0) {
                models = new Chair[objects.length];
                for (int i = 0; i < objects.length; i++) {
                    models[i] = objects[i];
                }
            } else {
                models = new Chair[1];
                models[0] = new Chair(name);
            }
        }
        public void show(){
            System.out.println("Manufacturer`s name: " + name + ".\n");
        }
    }
    public static class Chair extends Furniture {

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