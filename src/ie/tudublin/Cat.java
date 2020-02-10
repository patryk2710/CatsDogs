package ie.tudublin;

public class Cat extends Animal {
    private int numLives;
    
    public Cat(String name) {
        //Constructor chaining
        super(name);
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    public void speak() {
        System.out.println("Meow");
    }
}