package cn.ty;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestGit {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
