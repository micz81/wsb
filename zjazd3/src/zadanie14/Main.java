package zadanie14;

@FieldEquals(firstField = "first", secondField = "another")
class Sample {
    public String first;
    public String second;

    public Sample(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("{first field: \"%s\", second field: \"%s\"}", first, second);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Sample[] samples = {
                new Sample("one", "two"),
                new Sample("hi", "hi"),
                new Sample("one", null),
                new Sample(null, "two"),
                new Sample(null, null),
                new Sample("", ""),
                new Sample(" ", " "),
                new Sample("", "  "),
        };

        for(Sample sample : samples) {
            System.out.printf("Object %s is valid: %s%n", sample, FieldEqualsValidator.validate(sample));
        }
    }


}
