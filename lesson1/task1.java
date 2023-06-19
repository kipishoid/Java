
public class task1 {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String[] array = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].length() != 0) {
                if (res.length() > 0) {
                    res.append(" ");
                }
                res.append(array[i]);
            }
        }
        return res.toString();
    }
}