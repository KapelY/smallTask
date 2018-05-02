package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DistinctWordFinder {
    public static List findDistinct(String path) {
        List<String> input = new ArrayList<>();
        List<String> output = new ArrayList<>();
        try {
            input = Files.lines(Paths.get(path)).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String regex = "[a-z]+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        for (String text :
                input) {
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                output.add(matcher.group(0));
            }

        }
        return output;
    }
}
