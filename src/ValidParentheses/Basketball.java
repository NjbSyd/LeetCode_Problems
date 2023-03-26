package ValidParentheses;

import java.util.LinkedList;

public class Basketball {
    public int calPoints(String[] str) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("C")) {
                list.removeLast();
            } else if (str[i].equals("D")) {
                list.add(list.getLast() * 2);
            } else if (str[i].equals("+")) {
                list.add(list.getLast() + list.get(list.size() - 2));
            } else {
                list.add(Integer.parseInt(str[i]));
            }
        }
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
