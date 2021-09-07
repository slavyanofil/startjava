public class ConditionalStatement {   
    public static void main(String[] args) {
        short age=35;
        boolean male=true;
        float height=1.75f;
        char firstLetterOfName='V';
        if (age>20) {
            System.out.println("Ты уже не молодой :(");
        }
        if (male) {
            System.out.println("Пол мужской");
        }
        if (!male) {
            System.out.println("Корнет, Вы жещина?");
        }
        if (height<1.80) {
            System.out.println("Рост не большой");
        } else {
            System.out.println("Рост большой");
        }
        if (firstLetterOfName=='\u004D') {
            System.out.println("имя начинается на M");
        } else if (firstLetterOfName=='\u0049') {
            System.out.println("имя начинается на I");
        } else {
            System.out.println("имя начинается ни на М, и ни на I, а на "+firstLetterOfName);
        }
    }
}