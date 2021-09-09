public class ConditionalStatement {   
    public static void main(String[] args) {
        short age = 35;
        if (age > 20) {
            System.out.println("Ты уже не молодой :(");
        }

        boolean male = true;
        if (male) {
            System.out.println("Пол мужской");
        }
        if (!male) {
            System.out.println("Корнет, Вы жещина?");
        }

        float height = 1.75f;
        if (height < 1.80) {
            System.out.println("Рост не большой");
        } else {
            System.out.println("Рост большой");
        }
        
        char firstLetterOfName = 'V';
        if (firstLetterOfName == 'M') {
            System.out.println("имя начинается на M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("имя начинается на I");
        } else {
            System.out.println("имя начинается ни на М, и ни на I, а на " + firstLetterOfName);
        }
    }
}