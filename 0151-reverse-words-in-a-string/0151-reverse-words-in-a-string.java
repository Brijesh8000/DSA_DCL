class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int i = n - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0) {
          
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break;

          
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

           
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(s, j + 1, i + 1);

            i = j;
        }

        return sb.toString();
    }
}