
public class FizzBuzz {

     public boolean isDivisibleByThree(int number) {
         if (number % 3 == 0) return true;
         return false;
     }

     public boolean isDivisibleByFive(int number) {
         if (number % 5 == 0) return true;
         return false;
     }

     public boolean isDivisibleByFifteen(int number) {
         if (number % 15 == 0) return true;
         return false;
     }

     public String play(int number) {
         return "Fizz";
     }




}
