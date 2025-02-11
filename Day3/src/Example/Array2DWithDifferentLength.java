package Example;

public class Array2DWithDifferentLength {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9}
        };

        for (int y = 0; y < grid.length; ++y){
            for (int x = 0; x < grid[y].length; ++x) {
                System.out.println("%2d "+ grid[y][x]);
            }
            System.out.println();
        }
        int[][] grid1 = new int[3][];
        grid1[0] = new int[2];
        grid1[1] = new int[3];
        grid1[2] = new int[4];

        for (int y = 0; y < grid1.length; ++y) {
            for (int x = 0; x < grid1[y].length; ++x) {
                System.out.println("%2d " + grid1[y][x]);
            }
            System.out.println();
        }
    }
}
