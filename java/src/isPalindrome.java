import java.util.ArrayList;
import java.util.List;

public class isPalindrome {

    public boolean isPalindrome(String s) {
        // 高层次（主干）逻辑

        List<String> l = new ArrayList<>();
        l.add("");

        String filteredS = _filterNonNumberAndChar(s);
        return _reverseString(s).equalsIgnoreCase(filteredS);
    }

    private String _reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private String _filterNonNumberAndChar(String s) {
        return s.replaceAll("[^A-Za-z0-9]", "");
    }
}
