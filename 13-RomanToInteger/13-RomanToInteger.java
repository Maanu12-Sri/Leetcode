// Last updated: 2/13/2026, 11:24:06 AM
class Solution {

    public int intVal(char ch) {
        if (ch == 'I') {
            return 1;
        } else if (ch == 'V') {
            return 5;
        } else if (ch == 'X') {
            return 10;
        } else if (ch == 'L') {
            return 50;
        } else if (ch == 'C') {
            return 100;
        } else if (ch == 'D') {
            return 500;
        } else if (ch == 'M') {
            return 1000;
        } else {
            return 0;  
        }
    }

    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;

        while (i < s.length() - 1) {
            int current = intVal(s.charAt(i));
            int next = intVal(s.charAt(i + 1));

            if (current >= next) {
                sum += current;
                i++;
            } else {
                sum += (next - current);
                i += 2;
            }
        }

      
        if (i < s.length()) {
            sum += intVal(s.charAt(i));
        }

        return sum;
    }
}
