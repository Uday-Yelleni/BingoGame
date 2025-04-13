import java.util.*;

public class BingoGame {
    public static void main(String[] args) {
        int[][] card = BingoCard.generateBingoCard();
        BingoCard.printBingoCard(card);

        boolean[][] marked = new boolean[5][5];
        marked[2][2] = true; // Center is blank

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 75; i++) numbers.add(i);
        Collections.shuffle(numbers);

        int moves = 0;
        for (int number : numbers) {
            moves++;
            markCard(card, marked, number, moves);
            if (checkBingo(marked)) {
                System.out.println("Bingo achieved in " + moves + " calls!");
                break;
            }
        }
    }

    public static void markCard(int[][] card, boolean[][] marked, int number, int move) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (card[row][col] == number) {
                    marked[row][col] = true;
                    System.out.printf("The number %d was found on %d move.%n",number, move);
                }
            }
        }

    }

    public static boolean checkBingo(boolean[][] marked) {
        // Check rows and columns
        for (int i = 0; i < 5; i++) {
            if (allTrue(marked[i])) return true; // row
            if (allTrue(new boolean[]{marked[0][i], marked[1][i], marked[2][i], marked[3][i], marked[4][i]})) return true; // col
        }

        // Check diagonals
        if (allTrue(new boolean[]{marked[0][0], marked[1][1], marked[2][2], marked[3][3], marked[4][4]})) return true;
        if (allTrue(new boolean[]{marked[0][4], marked[1][3], marked[2][2], marked[3][1], marked[4][0]})) return true;

        return false;
    }

    public static boolean allTrue(boolean[] arr) {
        for (boolean b : arr) if (!b) return false;
        return true;
    }
}