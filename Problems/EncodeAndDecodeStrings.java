package Problems;

import java.util.*;

public class EncodeAndDecodeStrings {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('/').append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        Scanner scanner = new Scanner(s);
        scanner.useDelimiter("/");
        while (scanner.hasNext()) {
            int len = scanner.nextInt();
            String str = scanner.next();
            res.add(str.substring(0, len));
        }
        return res;
    }
}

