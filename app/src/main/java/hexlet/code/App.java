package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.interfaces.Game;


public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");

        System.out.println("0 - Exit");

        String gameNumber = Cli.getGameNumber();
        switch (gameNumber) {
            case "1":
                Greet.greet();
                break;
            case "2":
                Game evenGame = new Even();
                Engine.run(evenGame);
                break;
            case "3":
                Game calcGame = new Calc();
                Engine.run(calcGame);
                break;
            case "4":
                Game gcdGame = new GCD();
                Engine.run(gcdGame);
                break;
            case "5":
                Game progressionGame = new Progression();
                Engine.run(progressionGame);
                break;
            case "6":
                Game primeGame = new Prime();
                Engine.run(primeGame);
                break;
            default:
                return;
        }
    }
}
