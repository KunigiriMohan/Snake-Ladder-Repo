import java.util.Random;

public class Snake_lader_UC2 {
        public static void main(String[] args) {
            System.out.println("Welcone to Snake and Ladder Game Simulator");
            int current_place = 0;
            Random rn = new Random();
            int dice = rn.nextInt(6) + 1;
            current_place=current_place+dice;
            System.out.println("The Number Player Got on Die : "+dice);
            System.out.println("The Pressent Position of Player : " +current_place);

        }
    }
