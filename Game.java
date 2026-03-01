package JavaLibs;

import javax.swing.JOptionPane;

public class Game {
    public static void main(String[] args) {




        //Variables
String nameInput = JOptionPane.showInputDialog("Enter your name (eg. John): ");

String ageInput = JOptionPane.showInputDialog("Enter your age (eg. 36): ");
    int playerAge = Integer.parseInt(ageInput);

String upperCasePronoun = JOptionPane.showInputDialog("Enter your preferred subject pronoun with an Uppercase First Letter (eg. He, She, They): ");

String lowerCasePronoun = upperCasePronoun.toLowerCase();

String possessivePronoun = JOptionPane.showInputDialog("Enter your preferred possessive pronoun (eg. His, Hers, Their): ");

String lowerCasePossessive = possessivePronoun.toLowerCase();

String moneyInput = JOptionPane.showInputDialog("Enter how much money your character has (eg. 12.00): ");
    double money = Double.parseDouble(moneyInput);

String gameLocation =  JOptionPane.showInputDialog("Enter Where the Story Takes Place (eg. Littleton): ");

String dogName = JOptionPane.showInputDialog("Enter your dog's name (eg. Max)");

String petsInput = JOptionPane.showInputDialog("Enter the positive number of cats you own (eg. 9): ");
        int numberOfPets = Integer.parseInt(petsInput);

String petGrowthInput = JOptionPane.showInputDialog("Enter a positive integer number for the number of cats you obtain each year (eg. 3): ");
        int petsPerYear = Integer.parseInt(petGrowthInput);

String favoriteCatsName = JOptionPane.showInputDialog("Enter your favorite cat's name (eg. Max)");



    //Story
        System.out.println("Once upon a time, in a mysterious place called " + gameLocation + ",");
        System.out.println("there lived an individual named " + nameInput + ".");
        System.out.print(nameInput + " was ");
        System.out.println(playerAge + " years old.");
        System.out.println(upperCasePronoun + " was/were very poor, and ");
        System.out.println("had only " + money + " dollars to " + lowerCasePossessive + " name.");

        System.out.println();

        System.out.println("One day, " + nameInput + ", while walking " + lowerCasePossessive + " dog named " + dogName + ", met a strange individual on the street.");
        System.out.println("This person wore all black, and had a hood that hid their face in shadow.");
        System.out.println(nameInput + " was wary of them, but was also desperate to pay for " + lowerCasePossessive + " many cats.");

            System.out.println();

         System.out.println(nameInput + " had " + numberOfPets + " cats and got " + petsPerYear + " more every year.");
         System.out.println("In 5 years, " + nameInput + " was going to have " + (numberOfPets + (5 * petsPerYear)) + " cats!");
         System.out.println(nameInput + "'s favorite cat was named " + favoriteCatsName + ".");
            System.out.println(nameInput + " couldn't stand to think what would happen to his cats if he couldn't pay his bills.");
        System.out.println("Against " + lowerCasePossessive + " better judgement, " + nameInput + " decided to listen to what they had to say.");

        System.out.println();

        double money2 = money;

        System.out.println("The mysterious figure had a strange offer: ");
        System.out.println("should " + nameInput + " accept, the amount of money in " + lowerCasePossessive);
        System.out.println("pockets would double every minute, on the minute, for the rest of " + lowerCasePossessive + " life.");
        System.out.println(nameInput + " couldn't believe what " + lowerCasePronoun + " had heard.");
        System.out.println("'You mean in one minute I'll have " + (money2 *= 2) + " dollars in my pocket? " + nameInput + " responded.'");
        System.out.println("'And in two minutes I'll have " + (money2 *= 2) +  " dollars in my pocket?'");
        System.out.println("'And so on?'");
        System.out.println("The figure grunted in affirmation.");

        System.out.println();

        System.out.println("Before " + nameInput + " could respond, the figure proposed another option: ");
        System.out.println("'Or, on your birthday every year, I will raise 1,000 people from poverty. But you may only choose one of these offers.'");
        System.out.println(nameInput + " considered the choice for a moment...a lifetime of wealth, ");
        System.out.println("or the improvement in quality of life for countless people that " + lowerCasePronoun + " would never meet.");

        System.out.println();

        System.out.println("While " + nameInput + " would normally consider themself an altruist, ");
        System.out.println("in this moment, " + lowerCasePronoun + " was/were overcome with greed.");
        System.out.println("With mansions and private islands on " + lowerCasePossessive + " mind, ");
        System.out.println(nameInput + " eagerly chose the first option.");
        System.out.println("Beneath the shadow of their hood, the mouth of the strange figured curled up slowly into a smile.");

        System.out.println();

        System.out.println("'Excellent' it said. ");
        System.out.println("'When the sun rises tomorrow morning, it will be so.'");
        System.out.println("Ecstatic with " + lowerCasePossessive + " turn of fate, ");
        System.out.println(nameInput + " raced home, called " + lowerCasePossessive + " boss to quit, ");
        System.out.println("and fell asleep, dreaming of all the things that " + lowerCasePronoun + " would buy.");

        System.out.println();

        System.out.println(nameInput + " woke early the next morning, dressed, ");
        System.out.println("and went outside to await the sunrise, unable to control " + lowerCasePossessive + " excitement.");
        System.out.println("In the instant that the first rays of light raced over the horizon, ");
        System.out.println(nameInput + " felt a sudden weight in " + lowerCasePossessive + " pocket.");

        System.out.println();

        System.out.println("Reaching into " + lowerCasePossessive + " pocket, ");
        System.out.println(nameInput + " felt coins clinking between " + lowerCasePossessive + " fingers.");
        System.out.println("When " + nameInput + " counted the money, there was indeed " + money + " dollars in quarters.");
        System.out.println("After another minute, ");
        System.out.println((money *=2 ) + " dollars in quarters appeared.");

        System.out.println();

        System.out.println("Unable to contain " + lowerCasePossessive + " joy, " + nameInput + " let out a self-obsessed yelp of euphoria. ");
        System.out.println("Somewhere, in a far off place, the hooded figure let out a terrifying laugh. ");
        System.out.println("'How selfish and stupid these creatures are' the figure thought to himself.");

        System.out.println();

        System.out.println(nameInput + "'s joy soon turned to terror as the sheer volume of coins became more and more unmanageable.");
        System.out.println(possessivePronoun + " pockets tore open and each new wave of coins would fall straight to the ground.");
        System.out.println("Within minutes, " + nameInput + " began to struggle for air, buried underneath an avalanche of greed.");
        System.out.println("At last, the coins stopped multiplying, a sign that the curse's owner had ceased to be.");

        System.out.println();

        System.out.println("To this day, the story of " + nameInput + " is remembered as a lesson in the repercussions of greed.");



    }
}
