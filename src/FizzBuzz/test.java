package FizzBuzz;

import java.util.List;

public class test {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> list = s.fizzBuzz(10);
        for (String i :list) {
            System.out.print(i+" ");
        }
    }
}

