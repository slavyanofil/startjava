public class WolfTest {   
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.male = true;
        wolf.name = "Akella";
        wolf.colour = "Light grey";
        System.out.println("Волк самец: " + wolf.male);
        System.out.println("Кличка волка: " + wolf.name);
        System.out.println("Вес волка: " + wolf.weight);
        System.out.println("Возраст волка: " + wolf.age);
        System.out.println("Окрас: " + wolf.colour);
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}