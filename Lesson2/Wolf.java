public class Wolf {   
    boolean male = true;
    String name = "Grey";
    float weight = 50.5f;
    int age = 5;
    String colour = "Dark grey";

    public void move() {
        System.out.println("Волк идёт");
    }

    public void sit() {
        System.out.println("Волк сидит");
    }

    public void run() {
        System.out.println("Волк бежит");
    }

    public void howl() {
        System.out.println("Волк воет");
    }

    public void hunt() {
        System.out.println("Волк охотится");
    }
}