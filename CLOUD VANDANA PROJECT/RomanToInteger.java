package jdbc_programs;

/**
 * @author: G.Sravan Kumar
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX";
        int result = romanToInt(romanNumeral);
        System.out.println(result);
    }
    
    public static int romanToInt(String s) {
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int currentValue = getValue(s.charAt(i));
            int nextValue = (i < s.length() - 1) ? getValue(s.charAt(i + 1)) : 0;
            
            if (currentValue < nextValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        
        return result;
    }
    
    public static int getValue(char c) {
        if (c == 'I') {
            return 1;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'D') {
            return 500;
        } else if (c == 'M') {
            return 1000;
        } else {
            return 0;
        }
    }
}
