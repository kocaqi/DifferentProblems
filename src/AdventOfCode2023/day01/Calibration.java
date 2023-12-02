package AdventOfCode2023.day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calibration {

    private static final Map<String, Integer> spelledOutDigits = new HashMap<>();

    static {
        spelledOutDigits.put("one", 1);
        spelledOutDigits.put("two", 2);
        spelledOutDigits.put("three", 3);
        spelledOutDigits.put("four", 4);
        spelledOutDigits.put("five", 5);
        spelledOutDigits.put("six", 6);
        spelledOutDigits.put("seven", 7);
        spelledOutDigits.put("eight", 8);
        spelledOutDigits.put("nine", 9);
    }

    public static void main(String[] args) {
        List<String> inputStrings = getInputStringsFromFile("C:\\Users\\User\\Desktop\\EPOKA UNIVERSITY\\LeetCodeAndOthers\\src\\AdventOfCode2023\\day01\\day01input.txt");
        int calibrationValue = calculateCalibrationValue(inputStrings);
        System.out.println("Calibration Value: " + calibrationValue);
    }

    private static List<String> getInputStringsFromFile(String filePath) {
        List<String> inputStrings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                inputStrings.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStrings;
    }

    private static int calculateCalibrationValue(List<String> inputStrings) {
        int sum = 0;
        for (String str : inputStrings) {
            int firstDigit = extractDigit(str, true);
            int lastDigit = extractDigit(str, false);
            sum += (10 * firstDigit + lastDigit);
        }
        return sum;
    }

    private static int extractDigit(String str, boolean isFirst) {
        char[] chars = str.toCharArray();

        int index = isFirst ? 0 : chars.length - 1;

        while (index < chars.length && index >= 0) {
            if (Character.isDigit(chars[index])) {
                return Character.getNumericValue(chars[index]);
            } else {
                for (Map.Entry<String, Integer> entry : spelledOutDigits.entrySet()) {
                    String spelledOutDigit = entry.getKey();
                    if (str.startsWith(spelledOutDigit, index)) {
                        return entry.getValue();
                    }
                }
            }
            index = isFirst ? index + 1 : index - 1;
        }

        return 0;
    }
}
