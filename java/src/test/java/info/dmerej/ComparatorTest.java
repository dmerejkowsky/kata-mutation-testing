package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComparatorTest {
    @Test
    void less_than() {
        var comparator = new Comparator();
        comparator.compare(1, 2);
        assertThat(comparator.result).isEqualTo("less than");
    }

    @Test
    void greater_than() {
        var comparator = new Comparator();
        comparator.compare(2, 1);
        assertThat(comparator.result).isEqualTo("greater than");
    }
}