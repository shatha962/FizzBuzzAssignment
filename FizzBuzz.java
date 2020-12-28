public class FizzBuzz {
    public String fizzbuzz(int number) {
        int mod5 = number % 5;
        int mod3 = number % 3;
        if ((mod3 == 0) & (mod5 == 0)){
            return("FizzBuzz");
        }
        else if (mod3 == 0){
            return ("Fizz");
        }
        else if (mod5 == 0){
            return("Buzz");
        } else {
            return (number+"");
        }

    }
}