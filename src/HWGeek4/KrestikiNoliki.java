package HWGeek4;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class KrestikiNoliki {


    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final char DOT_EMPTY = '.';
    private static char[][] field;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAi;
    private static int roundCounter;
    private static int winLeght;

    public static void main(String[] args) {
        play();
    }

    private static void play() {
        while (true) {
            playRound();
            System.out.printf("SCORE: HUMAN    AI\n" +
                    "        %d       %d\n", scoreHuman, scoreAi);
            System.out.println("Wanna play again? Y or N >>>>> ");
            if (!scanner.next().toLowerCase().equals("y")) {
                System.out.println("Good by!");
                break;
            }
        }
    }

    private static void playRound() {
        System.out.printf("Round #\n", roundCounter++);
        setGameProp();
        printField();

        while (true) {
            humanTurn();
            printField();
            if (chekAll(DOT_X)) break;
            aiTurn();
            printField();
            if (chekAll(DOT_0)) break;
        }
    }
    private static void setGameProp() {
        System.out.println("Please enter field size");
        int sizeX = scanner.nextInt();
        int sizeY = scanner.nextInt();
        if (sizeX < 3) {
            sizeX = 3;
        }
        if (sizeY < 3) {
            sizeY = 3;
        }
        initField(sizeX, sizeY);
        System.out.println("Please enter win leght");
        if (winLeght < 3) {
            winLeght = 3;
        }
        if (winLeght > fieldSizeX || winLeght > fieldSizeY) {
            winLeght = Math.min(fieldSizeX, fieldSizeY);
        }
}
    private static boolean chekAll(char dot) {

        if (chekWin(dot, winLeght)) {
            if (dot == DOT_X) {
                System.out.println("Human win!");
                scoreHuman++;
            } else {
                System.out.println("AI win!");
                scoreAi++;
            }
            return true;
        }
        if (chekDraw()) return true;
        return false;
    }

    private static boolean chekDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(y, x)) return false;
            }
        }
        System.out.println("Draw");
        return true;
    }

    private static boolean chekWin(char dot, int lenght) {
        for (int y = 0; y<fieldSizeY; y++) {
            for (int x = 0; x<fieldSizeX; x++) {
        if (chekLine(x, y, 1, 0, lenght, dot)) return true;
        if (chekLine(x, y, 1, 1, lenght, dot)) return true;
        if (chekLine(x, y, 0, 1, lenght, dot)) return true;
        if (chekLine(x, y, 1, -1, lenght, dot)) return true;
    }
}
        return false;
//        // hor
//    if (field[0][0] == dot && field[0][1] == dot && field[0][2] == dot)
//        return true;
//    if (field[1][0] == dot && field[1][1] == dot && field[1][2] == dot)
//            return true;
//    if (field[2][0] == dot && field[2][1] == dot && field[2][2] == dot)
//            return true;
//        //vert
//        if (field[0][0] == dot && field[1][0] == dot && field[2][0] == dot)
//            return true;
//        if (field[0][1] == dot && field[1][1] == dot && field[2][1] == dot)
//            return true;
//        if (field[0][2] == dot && field[1][2] == dot && field[2][2] == dot)
//            return true;
////        //daig
//        if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot)
//            return true;
//        if (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot)
//            return true;
        //return false;

    }
    private static boolean chekLine(int x, int y, int incrementX, int incrementY, int len, char dot) {
        int endXLine = x + (len - 1) * incrementX;
        int endYLine = y + (len - 1) * incrementY;
        if (!isCellValid(endYLine, endXLine)) return false;
        for (int i = 0; i < len; i++) {
            if (field[y + i * incrementY][x + i * incrementX] != dot) return false;
        }
        return true;
    }
    private static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        } while (!isCellEmpty(y, x));

        field[y][x] = DOT_0;
    }
    private static void humanTurn() {
        int x;
        int y;
        boolean isFirstTry = true;
     do {
         if (!isFirstTry) {
             System.out.println("Wrong coordinates, tyr again");
         }
         isFirstTry = false;
         System.out.println("Please enter coordinates yore turn x & y split by whitespace >>>>>>> ");
         x = scanner.nextInt() - 1;
         y = scanner.nextInt() - 1;
     } while (!isCellValid(y , x) || !isCellEmpty(y, x));

     field[y][x] = DOT_X;
    }
    private static boolean isCellValid(int y, int x){
        return x >= 0 && y >=0 && x < fieldSizeX && y < fieldSizeY;
}
    private static boolean isCellEmpty(int y, int x) {
    return field[y][x] == DOT_EMPTY;
    }

    private static void initField(int sizeX, int sizeY) {
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;
        field = new char [sizeY][sizeX];
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j ++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1 );
        }
        System.out.println();
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print("-");
        }
            System.out.println();
//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//            System.out.print(field[y][x] + " ");
//    }
//            System.out.println();
//}

        }
}




