package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            int r = cd(i);
            result.add(r == 0 ? "FizzBuzz" : r == 1 ? "Fizz" : r == 2 ? "Buzz" : ("" + i));
        }
        return result;
    }

    private int cd(int n) {
        if (n % 3 == 0 && n % 5 == 0) return 0;
        else if (n % 3 == 0) return 1;
        else if (n % 5 == 0) return 2;
        else return 3;
    }
}
