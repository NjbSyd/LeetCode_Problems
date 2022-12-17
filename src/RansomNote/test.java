package RansomNote;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String ransomNote = "aac";
        String magazine = "aab";
        boolean result = solution.canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}
