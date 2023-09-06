import java.io.FileWriter;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class game {
    Scanner sc = new Scanner(System.in);

    void onePlayer() {
        try {
            FileWriter fw = new FileWriter("onePlayerResult.txt");
            Random number = new Random();
            int num = number.nextInt(4);
            System.out.println("Enter 'r' for \"ROCK\", 'p' for \"PAPER\", 's' for \"SCISSORS\" and 't' for \"THREAD\"");
            System.out.print("Enter your option: ");
            String you = sc.next();
            String comp;
            if (num == 1) {
                comp = "r";
            } else if (num == 2) {
                comp = "p";
            } else if (num == 3) {
                comp = "s";
            } else {
                comp = "t";
            }
            if (you.equalsIgnoreCase("r") || you.equalsIgnoreCase("p") || you.equalsIgnoreCase("s") || you.equalsIgnoreCase("t")) {
                // Condition for draw
                if (you.equalsIgnoreCase(comp)) {
                    System.out.println("Game Draw!");
                    fw.write("Score = 0");
                }
                // Non-draw conditions
                if (you.equalsIgnoreCase("p") && comp.equalsIgnoreCase("r")) {
                    System.out.println("You Won!");
                    fw.write("Score = 1");
                } else if (you.equalsIgnoreCase("r") && comp.equalsIgnoreCase("p")) {
                    System.out.println("You Lose!");
                    fw.write("Score = 0");
                }
                if (you.equalsIgnoreCase("r") && comp.equalsIgnoreCase("s")) {
                    System.out.println("You Won!");
                    fw.write("Score = 1");
                } else if (you.equalsIgnoreCase("s") && comp.equalsIgnoreCase("r")) {
                    System.out.println("You Lose!");
                    fw.write("Score = 0");
                }
                if (you.equalsIgnoreCase("t") && comp.equalsIgnoreCase("r")) {
                    System.out.println("You Won!");
                    fw.write("Score = 1");
                } else if (you.equalsIgnoreCase("r") && comp.equalsIgnoreCase("t")) {
                    System.out.println("You Lose!");
                    fw.write("Score = 0");
                }
                if (you.equalsIgnoreCase("s") && comp.equalsIgnoreCase("p")) {
                    System.out.println("You Won!");
                    fw.write("Score = 1");
                } else if (you.equalsIgnoreCase("p") && comp.equalsIgnoreCase("s")) {
                    System.out.println("You Lose!");
                    fw.write("Score = 0");
                }
                if (you.equalsIgnoreCase("t") && comp.equalsIgnoreCase("p")) {
                    System.out.println("You Won!");
                    fw.write("Score = 1");
                } else if (you.equalsIgnoreCase("p") && comp.equalsIgnoreCase("t")) {
                    System.out.println("You Lose!");
                    fw.write("Score = 0");
                }
                if (you.equalsIgnoreCase("s") && comp.equalsIgnoreCase("t")) {
                    System.out.println("You Won!");
                    fw.write("Score = 1");
                } else if (you.equalsIgnoreCase("t") && comp.equalsIgnoreCase("s")) {
                    System.out.println("You Lose!");
                    fw.write("Score = 0");
                }
            } else {
                System.out.println("You have given a wrong input.");
            }
            System.out.printf("You chose: %s, and A.I. chose: %s \n", you, comp);
            fw.write("\nYou chose: " + you + ", and A.I. chose: " + comp);
            fw.close();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("--> " + e);
        }
    }

    void twoPlayer() {
        try {
            FileWriter fw = new FileWriter("twoPlayerResult.txt");
            System.out.println("Enter 'r' for \"ROCK\", 'p' for \"PAPER\", 's' for \"SCISSORS\" and 't' for \"THREAD\"");
            System.out.print("For PLAYER 1, enter your option: ");
            String player1 = sc.next();
            System.out.print("For PLAYER 2, enter your option: ");
            String player2 = sc.next();
            if (player1.equalsIgnoreCase("r") || player1.equalsIgnoreCase("p") || player1.equalsIgnoreCase("s") || player1.equalsIgnoreCase("t")) {
                // Condition for draw
                if (player1.equalsIgnoreCase(player2)) {
                    System.out.println("Game Draw!");
                    fw.write("Winner Player --> 2");
                }
                // Non-draw conditions
                if (player1.equalsIgnoreCase("p") && player2.equalsIgnoreCase("r")) {
                    System.out.println("Player 1 Won!");
                    fw.write("Winner Player --> 1");
                } else if (player1.equalsIgnoreCase("r") && player2.equalsIgnoreCase("p")) {
                    System.out.println("Player 2 Won!");
                    fw.write("Winner Player --> 2");
                }
                if (player1.equalsIgnoreCase("r") && player2.equalsIgnoreCase("s")) {
                    System.out.println("Player 1 Won!");
                    fw.write("Winner Player --> 1");
                } else if (player1.equalsIgnoreCase("s") && player2.equalsIgnoreCase("r")) {
                    System.out.println("Player 2 Won!");
                    fw.write("Winner Player --> 2");
                }
                if (player1.equalsIgnoreCase("t") && player2.equalsIgnoreCase("r")) {
                    System.out.println("Player 1 Won!");
                    fw.write("Winner Player --> 1");
                } else if (player1.equalsIgnoreCase("r") && player2.equalsIgnoreCase("t")) {
                    System.out.println("Player 2 Won!");
                    fw.write("Winner Player --> 2");
                }
                if (player1.equalsIgnoreCase("s") && player2.equalsIgnoreCase("p")) {
                    System.out.println("Player 1 Won!");
                    fw.write("Winner Player --> 1");
                } else if (player1.equalsIgnoreCase("p") && player2.equalsIgnoreCase("s")) {
                    System.out.println("Player 2 Won!");
                    fw.write("Winner Player --> 2");
                }
                if (player1.equalsIgnoreCase("t") && player2.equalsIgnoreCase("p")) {
                    System.out.println("Player 1 Won!");
                    fw.write("Winner Player --> 1");
                } else if (player1.equalsIgnoreCase("p") && player2.equalsIgnoreCase("t")) {
                    System.out.println("Player 2 Won!");
                    fw.write("Winner Player --> 2");
                }
                if (player1.equalsIgnoreCase("s") && player2.equalsIgnoreCase("t")) {
                    System.out.println("Player 1 Won!");
                    fw.write("Winner Player --> 1");
                } else if (player1.equalsIgnoreCase("t") && player2.equalsIgnoreCase("s")) {
                    System.out.println("Player 2 Won!");
                    fw.write("Winner Player --> 2");
                }
            } else {
                System.out.println("You have given a wrong input.");
            }
            System.out.printf("Player 1 chose: %s, and Player 2 chose: %s \n", player1, player2);
            fw.write("\nPlayer 1 chose: " + player1 + ", and Player 2 chose: " + player2);
            fw.close();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }
}

public class Game_Stone_Paper_Scissors_Thread {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            game g = new game();
            System.out.println("********** Game: Stone, Paper, Scissors, Thread **********");
            Calendar cal = Calendar.getInstance();
            System.out.println(cal.getTime());
            System.out.println("Enter option 1 --> For playing against A.I.");
            System.out.println("Enter option 2 --> For playing between two players");
            System.out.print("Enter your option: ");
            int play = sc.nextInt();
            if (play == 1) {
                g.onePlayer();
            } else if (play == 2) {
                g.twoPlayer();
            } else {
                System.out.println("You have entered the wrong option");
            }
            System.out.println("Open onePlayerResult.txt to see score");
        } catch (Exception e) {
            System.out.println("--> " + e);
        } finally {
            System.out.println("\n********** Thank you for playing **********");
        }
    }
}
