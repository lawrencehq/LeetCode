/**
 * @author hq
 * Determine if a Sudoku is valid.
 * A valid Sudoku board (partially filled) is not necessarily solvable.
 */
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		Set<Character> nums = new HashSet<Character>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (nums.contains(board[i][j])) {
					return false;
				} else {
					if (board[i][j] != '.') {
						nums.add(board[i][j]);
					}
				}
			}
			nums.clear();
		}
		for (int j = 0; j < board.length; j++) {
			for (int i = 0; i < board[j].length; i++) {
				if (nums.contains(board[i][j])) {
					return false;
				} else {
					if (board[i][j] != '.') {
						nums.add(board[i][j]);
					}
				}
			}
			nums.clear();
		}
		for (int i = 0; i < board.length; i += 3) {
			for (int j = 0; j < board[i].length; j += 3) {
				for (int m = i; m < i + 3; m++) {
					for (int n = j; n < j + 3; n++) {
						if (nums.contains(board[m][n])) {
							return false;
						} else {
							if (board[m][n] != '.') {
								nums.add(board[m][n]);
							}
						}
					}
				}
				nums.clear();
			}
		}
		return true;
	}
}
