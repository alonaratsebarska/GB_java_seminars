package Homework4;

public class Leetcode695_1 {
    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;
        Stack<int[]> stack = new Stack();
        boolean[][] seen = new boolean[grid.length][grid[0].length];

        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length; col++) {
                int area = 0;
                if(grid[row][col] == 1 && !seen[row][col]) {
                    stack.push(new int[]{row, col});
                    seen[row][col] = true;
                    area++;
                }
                while(!stack.isEmpty()) {
                    int[] toExplore = stack.pop();
                    int row1 = toExplore[0];
                    int col1 = toExplore[1];
                    if(row1 > 0 && !seen[row1 - 1][col1] && grid[row1 - 1][col1] == 1) {
                        stack.push(new int[]{row1 - 1, col1});
                        seen[row1 - 1][col1] = true;
                        area++;
                    }
                    if(row1 < grid.length - 1 && !seen[row1 + 1][col1] && grid[row1 + 1][col1] == 1) {
                        stack.push(new int[]{row1 + 1, col1});
                        seen[row1 + 1][col1] = true;
                        area++;
                    }
                    if(col1 > 0 && !seen[row1][col1 - 1] && grid[row1][col1 - 1] == 1) {
                        stack.push(new int[]{row1, col1 - 1});
                        seen[row1][col1 - 1] = true;
                        area++;
                    }
                    if(col1 < grid[0].length - 1 && !seen[row1][col1 + 1] && grid[row1][col1 + 1] == 1) {
                        stack.push(new int[]{row1, col1 + 1});
                        seen[row1][col1 + 1] = true;
                        area++;
                    }

                }
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
