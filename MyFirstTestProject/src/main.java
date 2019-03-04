/**
 * 
 */

/**
 * @author Xuri
 *
 */
public class main {

	/**
	 * 
	 */
	public main() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] var = new int[100][100];
		
		for (int i = 0;i<99;i++) {
			for (int j = 0; j < 99; j++) {
				var[i][j] = i*j;
				System.out.print(((var[i][j] < 10 ) ?  (" " + var[i][j]) : (var[i][j] ))+ " ");
			}
			System.out.println();
		}

	}

}
