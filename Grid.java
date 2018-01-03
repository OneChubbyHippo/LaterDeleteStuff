/**
  Your name here
*/

public class Grid {

	private int row;
	private int col;
	private Robot robot;

	/**
	 * Construct new grid
	 * @param rows
	 * @param cols
	 */
	public Grid(int rows, int cols) {
		this.row = rows;
		this.col = cols;
	}
	
	/**
	 * Get rows
	 * @return number of rows
	 */
	public int getRows() {
		return this.row;
	}
	
	/**
	 * Get columns
	 * @return number of columns
	 */
	public int getCols() {
		return this.col;
	}
	
	/**
	 * Check if a given position is available.
	 * @param row
	 * @param col
	 * @return true if position in grid and not occupied
	 */
	public boolean isPositionAvailable(int row, int col) {

		if (robot.col == col || robot.row == row){
			return false;
		}

		return true;
	}
	
	/**
	 * Get robot at given position
	 * @param row
	 * @param col
	 * @return robot at position or null otherwise
	 */
	public Robot getRobotAt(int row, int col) {
		// Your code here
		return robot;
	}
	
	/**
	 * Add a robot to the grid
	 * @param r the robot to add
	 * @param row
	 * @param col
	 * @return True if added, false if position not available
	 */
	public boolean add(Robot r, int row, int col) {
		if ( isPositionAvailable(row, col) == true ){

			return true;
		}
		return false;
	}
	
	/**
	 * Move a robot from one position to another. Both positions must be valid and the destination
	 * must be not occupied. The current position given must be occupied by the given robot.
	 * @param r the robot
	 * @param curRow current row
	 * @param curCol current column
	 * @param destRow destination row
	 * @param destCol destination column
	 * @return true if robot moved, false otherwise.
	 */
	public boolean moveFromTo(Robot r, int curRow, int curCol, int destRow,
			int destCol) {
		// Your code here
		return false;
	}
	
	/**
	 * Print all the grid positions
	 */
	public void printGrid() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for(int i = 0; i < col ; i++){
			System.out.print("|");
			for (int j = 0; j < row; j++){
				System.out.print("      |");
			}
			System.out.println();
		}

		if (add(robot, row, col) == true){

		}


		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}
	
	/**
	 * Check if a position is within the grid.
	 * @param row
	 * @param col
	 * @return true if in grid, false otherwise
	 */
	public boolean isPositionValid(int row, int col) {
		if (row > this.row || row < 0 || col > this.col || col < 0 ){
			return false;
		}

		return true;
	}

}
