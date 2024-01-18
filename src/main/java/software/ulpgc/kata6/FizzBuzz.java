package software.ulpgc.kata6;

public class FizzBuzz {
    private final int value;

    public FizzBuzz(int value) {
        this.value = value;
    }

    public String compute() {
        if (this.value % 3 == 0) return "Fizz";
        if (this.value % 5 == 0) return "Buzz";
        return String.valueOf(this.value);
    }
}
