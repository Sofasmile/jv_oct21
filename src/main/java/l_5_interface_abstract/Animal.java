package l_5_interface_abstract;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal eat smth");
    }

    public abstract void say();
}
