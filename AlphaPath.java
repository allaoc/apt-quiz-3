public class AlphaPath {
      public String hasPath(String[] maze) {
          int c = 0;
		  char[][] grid = new char[maze.length][maze[0].length()];
		  int xA = -1;
		  int yA = -1;
		  for (String line : maze) {
			  for (int k = 0; k < line.length(); k++) {
				  grid[c][k] = line.charAt(k);
				  if (grid[c][k] == 'A') {
					  yA = c;
					  xA = k;
				  }
			  }
			  c++;
		  }
		  if (search(grid,xA,yA)) return "YES";
          return "NO";
      }
	  private boolean search(char[][] grid, int xA, int yA) {
		  if (yA >= grid.length || xA >= grid[0].length || yA < 0 || xA < 0) return false;
		  if (grid[yA][xA] == 'Z') return true;
		  int[] xs = {-1,0,0,1};
		  int[] ys = {0,1,-1,0};
		  for (int c = 0; c < 4; c++) {
			  if (yA+ys[c] >= grid.length || xA+xs[c] >= grid[0].length || yA+ys[c] < 0 || xA+xs[c] < 0) continue;
			  if (grid[yA+ys[c]][xA+xs[c]] == grid[yA][xA] + 1) return search(grid,xA+xs[c],yA+ys[c]);
		  }
		  return false;
	  }
  } 