
public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		char[][] grid = new char[][];
		int res = 1e7;
		int mnr = 0, mxr = 0, mnc = 0, mxc = 0;
		for (int i = 1; i <= grid.size(); i++) {
			for (int j = 1; j <= grid[i].size(); i++) {
				if(grid[i][j] == ch) {
					if(i < mnr) mnr = i;
					if(i > mxr) mxr = i;
					if(j < mnc) mnc = j;
					if(j > mxc) mxc = j;
				}
				else return 0;
			}
		}
		int h = mxr - mnr + 1;
		int w = mxc - mnc + 1;
		return h * w;
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		private int check(char[][] grid, int i, int j) {
			char cur = grid[i][j];
			int a = 0, b = 0, l = 0, r = 0;
			for(int k = i - 1; k >= 0 && grid[k][j] == cur; k--) {
				a++;
			}
			for(int k = i + 1; k < grid.length && grid[k][j] == cur; k++) {
				b++;
			}
			for(int k = j - 1; k >= 0 && grid[i][k] == cur; k--) {
				l++;
			}
			for(int k = j + 1; k < grid[0].length && grid[i][k] == cur; k++) {
				r++;
			}
			int wid = l + 1;
			if(a == b && b == l && l == r) return wid;
			return 0;
		}
		public int countPlus(char[][] grid) {
			int cnt = 0;
			for (int i = 1; i < grid.length - 1; i++) {
				for (int j = 1; j < grid[i].length - 1; j++) {
					int wid = check(grid, i, j);
					if (wid >= 2) {
						cnt++;
					}
				}
			}
			return cnt;
		}
	}
}
