package lab1.source;

public class Manufacturer {
    private String name;
    private Chair[] models;

    public Manufacturer(String Name, Chair... objects){
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
