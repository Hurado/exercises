public class PalindromChecker {

    public boolean isPalindrom(String input) {
        for(int i = 0; i < input.length() / 2; i++) {
                if(input.charAt(i) != input.charAt(input.length() - i - 1)) {
                    return false;
                }
        }
        return true;
    }
}
