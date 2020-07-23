package junit5.tdd;


public class FizzBuzzWhizz {
    public String play(int number) {
        String result= "";
        if (number % 3 == 0) {
            result+="fizz";

        }
        if(result==""){
            result= String.valueOf(number);
        }
        return result;
    }
}
