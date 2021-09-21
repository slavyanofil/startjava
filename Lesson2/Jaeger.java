public class Jaeger {   
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
    }
    
    public Jaeger(String modelName, String mark, String origin, int strength) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.strength = strength;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if(modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public float getStrength() {
        return strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public float getArmor() {
        return armor;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String toString() {
        return "modelName = " + modelName + "mark = " + mark;
    }
}