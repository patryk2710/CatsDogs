package ie.tudublin;

public class Animal {
    private String name;

    // Constructor
    // Same name as the class
    // No return type
    // If you dont add a constructor, you will be given a default constructor
    // If you add a constructor there is no default one
    public Animal(String name) { 
        setName(name);
    }
    
    public String getName() { //accessor method to get the name and return it
        return name;
    }

    public void setName(String name) { //setter method to access name and change it
        this.name = name;
    }

    public void speak() {
        System.out.println("I cant speak");
    }

}