import java.util.Random;

public class Snake_lader_UC1 {
    public static void main(String[] args) {
        System.out.println("Welcone to Snake and Ladder Game Simulator");
        int current_place = 0;
        System.out.println("Current Position of a Player : "+current_place);
        Random rn = new Random();
        int dice = rn.nextInt(10) + 1;
        System.out.println("The Player Got  the Number : "+dice);
        System.out.println("The Current Position of Player : "+dice);
    }
    }
