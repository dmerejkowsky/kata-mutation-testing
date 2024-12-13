package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    @Test
    void fizz() {
        var fizzBuzz = new FizzBuzz();
        var actual = FizzBuzz.get(3);
        assertThat(actual).isEqualTo("Fizz");
    }

    @Test
    void buzz() {
        var fizzBuzz = new FizzBuzz();
        var actual = FizzBuzz.get(5);
        assertThat(actual).isEqualTo("Buzz");
    }

    @Test
    void other() {
        var fizzBuzz = new FizzBuzz();
        var actual = FizzBuzz.get(1);
        assertThat(actual).isEqualTo("1");
    }
}