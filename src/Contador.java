import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Please, insert a number:");
            var firstNumber = scanner.nextLong();

            System.out.println("Please, insert another number bigger than the first one:");
            var secondNumber = scanner.nextLong();


            try {
                printNumbers(firstNumber, secondNumber);
            } catch(ParametrosInvalidosException ex) {
                System.out.println("The second number is smaller than the first. Please, pass the correct numbers");
            }

            System.out.println("Do you wanna continue? (y/n)");
            var response = scanner.next();

            var isToContinue = response.equalsIgnoreCase("y");

            if(!isToContinue) {
                break;
            }
        }


    }

    private static void printNumbers(Long initialCount, Long finalCount) {
        if(initialCount > finalCount) {
            throw new ParametrosInvalidosException("The first number needs to be bigger than first.");
        }

        for(var i = initialCount; i <= finalCount; i++) {
            System.out.printf("Printing number %s \n", i);
        }
    }
}
