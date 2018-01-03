/**
  Your name here
*/

public class Robot {

	protected char name;
	private Grid grid;
	protected int row;
	protected int col;
	private int energyUnits;

	/**
	 * Construct a robot and place it in the grid.
	 * 
	 * @param name
	 * @param grid
	 * @param row
	 * @param col
	 * @param energyUnits
	 */
	public Robot(char name, Grid grid, int row, int col, int energyUnits) {
		this.name = name;
		this.grid = grid;
		this.row = row;
		this.col = col;
		this.energyUnits = energyUnits;
	}

	/**
	 * Set a task for the robot and the destination for the task.
	 * An error message is printed to indicate an invalid destination.
	 * @param task
	 * @param destRow
	 * @param destCol
	 * @return true if destination is valid, false otherwise.
	 */
	public boolean setTask(String task, int destRow, int destCol) {

		if (destCol > grid.getCols() || destCol < 0 ||
				destRow > grid.getRows() || destRow < 0){
			System.out.println("Destination (" + destRow + ", " +
					destCol + ") is not a valid grid position");
			return false;
		}
		return true;
	}

	/**
	 * Move to destination and execute the task. An error message is printed if
	 * there is no task set, not enough energy, or blocked along the way.
	 * 
	 * @param printEachStep if true the state of the grid is printed after each step 
	 * @return true if task executed successfully, false otherwise
	 */
	public boolean executeTask(boolean printEachStep) {
		return false;
		// Your code here
	}
	
	/**
	 * Add more energy to the robot
	 * @param energyUnits
	 */
	public void recharge(int energyUnits) {
		// Your code here
	}

	public String toString(Robot r){
		return r.name + "(" + r.row + ", " + r.col + ")";
	}

            // Your code here
	
	
	
	
	
}
