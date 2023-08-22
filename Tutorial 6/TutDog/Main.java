class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Labrador");

        System.out.println("Before modification:");
        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());

        dog1.setName("Charlie");
        dog2.setBreed("German Shepherd");

        System.out.println();
        System.out.println("After modification:");
        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());
    }
}
