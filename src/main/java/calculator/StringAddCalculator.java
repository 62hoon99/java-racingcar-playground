package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return sum(str);
    }

    private static int sum(String str) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] tokens= m.group(2).split(customDelimiter);
            // 덧셈 구현
            return sum(tokens);
        }
        return sum(str.split(",|:"));
    }

    private static int sum(String[] split) {
        return Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .peek(StringAddCalculator::validateNum)
                .sum();
    }

    private static void validateNum(int num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }
    }
}
