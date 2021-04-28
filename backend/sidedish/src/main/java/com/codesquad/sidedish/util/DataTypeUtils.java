package com.codesquad.sidedish.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataTypeUtils {

    public static List<String> toList(String rawString) {
        if (rawString == null) {
            return Collections.singletonList(rawString);
        }
        rawString = rawString.replaceAll("\\[", "")
                .replaceAll("\\]", "")
                .replace("\"", "")
                .replace(" ", "");

        String[] strings = rawString.split(",");

        return Arrays.asList(strings);
    }
}
