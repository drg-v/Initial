package enumeration;

public enum ChairLegs {
    THREE(3), FOUR(4);
    private int number;
    ChairLegs(int i) {
        number = i;
    }
    int getNumber() {
        return number;
    }
    public void show(){
        System.out.println("ENUM class chairLegs:\nnumber: " + number + ".\n");
    }
}
