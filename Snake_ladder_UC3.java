import java.util.Random;

public class Snake_ladder_UC3 {
    public static void main(String[] args) {
        int current_place = 0;
        System.out.println("Welcone to Snake and Ladder Game Simulator");

        while (current_place <= 99) {
            Random rn = new Random();
            int dice = rn.nextInt(6) + 1;
            System.out.println("You got Die Number : "+dice);
            current_place = current_place + dice;

            Random a = new Random();
            int option = a.nextInt(3) + 1;
            switch (option) {
                case 1:
                    current_place = current_place;
                    System.out.println("You got No play");
                    break;
                case 2:
                    current_place = current_place + dice;
                    System.out.println("You got the Ladder");
                    break;
                case 3:
                    current_place = current_place - dice-dice;
                    System.out.println(" You got the Snake");
                    break;
            }

            System.out.println("Current plce of player : "+current_place);
            System.out.println("-----------------------------------");
        }
        System.out.println("Finally You won by reaching : "+current_place);
    }
}