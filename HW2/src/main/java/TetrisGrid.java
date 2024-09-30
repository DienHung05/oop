//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				this.grid[i][j] = grid[i][j];
			}
		}
	}

	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		int r = grid.length;
		int l = grid[0].length;
		boolean[][] ngrid = new boolean[r][l];
		int cur = 0;
		for (int j = 0; j < l; j++) {
			boolean check = true;
			for (int i = 0; i < r; i++) {
				if (!check[i][j]) {
					check = false;
					break;
				}
			}
			if (!check) {
				for (int i = 0; i < r; i++) {
					ngrid[i][cur] = grid[i][j];
				}
				cur++;
			}
		}
		grid = ngird;
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid;
	}

	public static void main(String[] args) {

	}
}
