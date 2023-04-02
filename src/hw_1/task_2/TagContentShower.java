package hw_1.task_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TagContentShower {
    static void showTagContent(String file) {

        try {
            Path filePath = Path.of(file);
            String content = Files.readString(filePath);
            Pattern pattern = Pattern.compile("<(.*)>(.*?)<(.*)>");
            Matcher matcher = pattern.matcher(content);
            System.out.println(" ");
            while (matcher.find()) {
                System.out.println(matcher.group(2));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        showTagContent("src\\hw_1\\task_1\\BankDeposites.xml");
    }
}
