import java.util.*;

public class BingoCard {

    public static void main(String[] args){
        int[][] card = generateBingoCard();
        printBingoCard(card);
    }

    public static int generateRandomNumbers(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
    public static int[] generateUniqueNumbers(int min, int max, int count){

        int[] result = new int[count];
        int filled = 0;

        while (filled < count){
            int num = generateRandomNumbers(min, max);
            if(!contains(result, filled, num)){
                result[filled] = num;
                filled++;
            }
        }
        return result;
    }

    public static boolean contains(int[] result, int filled, int num){
        for (int i = 0; i <= filled; i++ ){
            if(result[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int[][] generateBingoCard() {
        int[][] card = new int[5][5]; // [row][column]

        int[] b = generateUniqueNumbers(1, 15, 5);
        int[] i = generateUniqueNumbers(16, 30, 5);
        int[] n = generateUniqueNumbers(31, 45, 4); // middle row will be skipped
        int[] g = generateUniqueNumbers(46, 60, 5);
        int[] o = generateUniqueNumbers(61, 75, 5);

        for (int row = 0; row < 5; row++) {
            card[row][0] = b[row];
            card[row][1] = i[row];
            if (row < 2) card[row][2] = n[row];
            else if (row > 2) card[row][2] = n[row - 1]; // skip row 2
            card[row][3] = g[row];
            card[row][4] = o[row];
        }

        card[2][2] = 0; // Free space in the center
        return card;
    }

    public static void printBingoCard(int[][] card) {
        System.out.println(" B   I   N   G   O");
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (row == 2 && col == 2) {
                    System.out.print(" F  "); // center free space
                } else {
                    System.out.printf("%2d  ", card[row][col]);
                }
            }
            System.out.println();
        }
    }


}
