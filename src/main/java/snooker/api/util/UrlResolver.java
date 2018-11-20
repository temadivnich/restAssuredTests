package snooker.api.util;

import java.util.Map;

import static java.util.stream.Collectors.joining;

public class UrlResolver {

    public static String toQueryString(Map<String, String> params) {
        return params.entrySet().stream().map(Map.Entry::toString).collect(joining("&", "?", ""));
    }

}
