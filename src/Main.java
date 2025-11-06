import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int read() throws FileNotFoundException {
        int score = 0;
        File f = new File("Guesses.txt");
        Scanner s = new Scanner(f);
        String guess1;
        String guess2;
        while (s.hasNext()) {
            WordMatch guesses = new WordMatch(s.next());
            guess1 = s.next();
            guess2 = s.next();
            score += guesses.scoreGuess(guesses.findBetterGuess(guess1, guess2));
        }
        return score;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read());


//        public static void main(String[] args) {
//        WordMatch w = new WordMatch("mississippi");
//        System.out.println(w.scoreGuess("i"));
//        System.out.println(w.scoreGuess("iss"));
//        System.out.println(w.scoreGuess("issipp"));
//        System.out.println(w.scoreGuess("mississippi"));
//
//        WordMatch game = new WordMatch("concatenation");
//        System.out.println(game.scoreGuess("ten"));
//        System.out.println(game.scoreGuess("nation"));
//        System.out.println(game.findBetterGuess("ten", "nation"));
//        System.out.println(game.scoreGuess("con"));
//        System.out.println(game.scoreGuess("cat"));
//        System.out.println(game.findBetterGuess("con", "cat"));

    }

}

// public static int read() throws FileNotFoundException {
//        int meetings = 0;
//        File f = new File("Schedules.txt");
//        Scanner s = new Scanner(f);
//        String schedule = "";
//        while (s.hasNext()) {
//            while (s.hasNextBoolean()) {
//                schedule += s.nextBoolean() + " ";
//            }
//                AppointmentBook a = new AppointmentBook(readSchedule(schedule));
//
//                if (a.makeAppointment(s.nextInt(), s.nextInt(), s.nextInt()))
//                    meetings++;
//            }
//        schedule = "";
//        return meetings;
//        }