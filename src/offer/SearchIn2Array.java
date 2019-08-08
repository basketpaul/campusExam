package offer;

public class SearchIn2Array {
    public static void main(String[] args) {

    }

    public boolean Find(int target, int[][] array) {
        int maxRow = array.length, maxCol = array[0].length;
        int row = 0, col = maxCol - 1;
        while (row < maxRow && col >= 0) {
            if (array[row][col] == target) {
                return true;
            } else if (array[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
