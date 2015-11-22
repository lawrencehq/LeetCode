import java.util.LinkedList;
import java.util.List;


/**
 * @author hq
 * Given a digit string, return all possible letter combinations that the number could represent.
 * For example, like the telephone buttons, 2->abc, 3->def,etc.
 */
public class LetterCombination {
	/*public List<String> letterCombinations(String digits) {
        List<String> results = new LinkedList<String>();
        
        if (digits == null || digits.equals("")) {
        	return results;
        }
        
        results.add(digits);
        String str;
        char[] chars;
        boolean change;
        int listLength;
        int digitsLength = digits.length();
        for (int i = 0; i < digitsLength; i++) {
        	listLength = results.size();
        	for (int j = 0; j < listLength; j++) {
        		str = results.get(j);
				chars = str.toCharArray();
				change = false;
				switch (str.charAt(i)) {
				case '2':
					change = true;
					chars[i] = 'a';
					results.add(String.valueOf(chars));
					chars[i] = 'b';
					results.add(String.valueOf(chars));
					chars[i] = 'c';
					results.add(String.valueOf(chars));
					break;
				case '3':
					change = true;
					chars[i] = 'd';
					results.add(String.valueOf(chars));
					chars[i] = 'e';
					results.add(String.valueOf(chars));
					chars[i] = 'f';
					results.add(String.valueOf(chars));
					break;
				case '4':
					change = true;
					chars[i] = 'g';
					results.add(String.valueOf(chars));
					chars[i] = 'h';
					results.add(String.valueOf(chars));
					chars[i] = 'i';
					results.add(String.valueOf(chars));
					break;
				case '5':
					change = true;
					chars[i] = 'j';
					results.add(String.valueOf(chars));
					chars[i] = 'k';
					results.add(String.valueOf(chars));
					chars[i] = 'l';
					results.add(String.valueOf(chars));
					break;
				case '6':
					change = true;
					chars[i] = 'm';
					results.add(String.valueOf(chars));
					chars[i] = 'o';
					results.add(String.valueOf(chars));
					chars[i] = 'n';
					results.add(String.valueOf(chars));
					break;
				case '7':
					change = true;
					chars[i] = 'p';
					results.add(String.valueOf(chars));
					chars[i] = 'q';
					results.add(String.valueOf(chars));
					chars[i] = 'r';
					results.add(String.valueOf(chars));
					chars[i] = 's';
					results.add(String.valueOf(chars));
					break;
				case '8':
					change = true;
					chars[i] = 't';
					results.add(String.valueOf(chars));
					chars[i] = 'u';
					results.add(String.valueOf(chars));
					chars[i] = 'v';
					results.add(String.valueOf(chars));
					break;
				case '9':
					change = true;
					chars[i] = 'w';
					results.add(String.valueOf(chars));
					chars[i] = 'x';
					results.add(String.valueOf(chars));
					chars[i] = 'y';
					results.add(String.valueOf(chars));
					chars[i] = 'z';
					results.add(String.valueOf(chars));
					break;

				default:
					break;
				}
				if (change) {
					results.remove(j);
					j--;
					listLength--;
				}
        	}
        }
        
        return results;
    }*/
	//A better way to solve the problem
	String[] chars = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<String>();
        if(digits == null || digits.length() == 0) {
        	return result;
        }
        backtracking(result, new StringBuilder(), digits, 0);
        return result;
    }

    public void backtracking(List<String> result, StringBuilder sb, String digits, int index) {
        if(index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String str = chars[digits.charAt(index) - '0'];
        for(char c : str.toCharArray()) {
            sb.append(c);
            backtracking(result, sb, digits, index + 1);
            sb.setLength(sb.length() - 1);
        }
    }
}
