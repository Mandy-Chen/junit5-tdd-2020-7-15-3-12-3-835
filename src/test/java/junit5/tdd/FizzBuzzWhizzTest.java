package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzWhizzTest {

    @Test
    void should_return_1_when_play_fizz_buzz_whizz_given_1() {
        //given
        int number = 1;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.play(number);
        //then
        assertThat(actual, is("1"));
    }

    @Test
    void should_return_fizz_when_play_fizz_buzz_whizz_given_3() {
        //given
        int number = 3;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.play(number);
        //then
        assertThat(actual, is("fizz"));
    }

    @Test
    void should_return_buzz_when_play_fizz_buzz_whizz_given_5() {
        //given
        int number = 5;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.play(number);
        //then
        assertThat(actual, is("buzz"));
    }

    @Test
    void should_return_whizz_when_play_fizz_buzz_whizz_given_7() {
        //given
        int number = 7;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.play(number);
        //then
        assertThat(actual, is("whizz"));
    }

    @Test
    void should_return_fizzbuzz_play_fizz_buzz_whizz_given_15() {
        //given
        int number = 15;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.play(number);
        //then
        assertThat(actual, is("fizzbuzz"));
    }

    @Test
    void should_return_fizzwhizz_play_fizz_buzz_whizz_given_21() {
        //given
        int number = 21;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.play(number);
        //then
        assertThat(actual, is("fizzwhizz"));
    }

    @Test
    void should_return_buzzwhizz_play_fizz_buzz_whizz_given_35() {
        //given
        int number = 35;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.play(number);
        //then
        assertThat(actual, is("buzzwhizz"));
    }

    @Test
    void should_return_fizzbuzzwhiz_play_fizz_buzz_whizz_given_105() {
        //given
        int number = 105;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.play(number);
        //then
        assertThat(actual, is("fizzbuzzwhizz"));

    }
}
