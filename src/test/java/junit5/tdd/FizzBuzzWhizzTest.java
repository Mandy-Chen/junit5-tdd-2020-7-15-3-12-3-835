package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzWhizzTest {

    @Test
    void should_return_1_when_play_fizz_buzz_whizz_given_1() {
        //given
        int number=1;
        //when
        FizzBuzzWhizz fizzBuzzWhizz=new FizzBuzzWhizz();
        String actual=fizzBuzzWhizz.play(number);
        //then
        assertThat(actual, is("1"));
    }

    @Test
    void should_return_fizz_when_play_fizz_buzz_whizz_given_3() {
        //given
        int number=3;
        //when
        FizzBuzzWhizz fizzBuzzWhizz=new FizzBuzzWhizz();
        String actual=fizzBuzzWhizz.play(number);
        //then
        assertThat(actual,is("fizz"));
    }
}
