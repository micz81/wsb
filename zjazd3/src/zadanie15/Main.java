package zadanie15;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "a b c";
//        String s3 = "GGdsd gfWEG gvrVFWgV 34";
//        String s4 = "   ";
//        String s5 = null;
//
        UpperCase upper = s -> s != null ? s.toUpperCase() : null;
//        System.out.println(upper.upperCase("\""+s1+"\""));
//        System.out.println(upper.upperCase("\""+s2+"\""));
//        System.out.println(upper.upperCase("\""+s3+"\""));
//        System.out.println(upper.upperCase("\""+s4+"\""));
//        System.out.println(upper.upperCase("\""+s4+"\""));
//        System.out.println(upper.upperCase("\""+s5+"\""));
//
//        System.out.println("============");
//
        LetterSpaceSeparated let = s -> s != null ? s.replace("", " ").trim() : null;
//        System.out.println(let.letterSpaceSeparated("\""+s1+"\""));
//        System.out.println(let.letterSpaceSeparated("\""+s2+"\""));
//        System.out.println(let.letterSpaceSeparated("\""+s3+"\""));
//        System.out.println(let.letterSpaceSeparated("\""+s4+"\""));
//        System.out.println(let.letterSpaceSeparated("\""+s5+"\""));

        Stream.of("abc", "a b c", "GGdsd gfWEG gvrVFWgV 34", "   ", null)
                .map(s -> upper.upperCase(s))
                .forEach(System.out::println);

        System.out.println("============");

        Stream.of("abc", "a b c", "GGdsd gfWEG gvrVFWgV 34", "   ", null)
                .map(s -> let.letterSpaceSeparated(s))
                .forEach(System.out::println);
    }
}
