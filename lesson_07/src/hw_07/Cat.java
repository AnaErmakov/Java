package hw_07;

public class Cat {
    private String name;
    private int appetite;
    protected boolean satiation;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiation = false;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiation = true;
        }
    }

    public void printInfo(){
        if (satiation) {
            System.out.println(this.name + " сыт");
        }
        else {
            System.out.println(this.name + " голоден");
        }
    }
}
