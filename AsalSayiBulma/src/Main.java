public class Main {
    public static void main(String[] args) {
        System.out.println("Prime Numbers Between 1-100 : ");

        for (int number = 2; number <= 100; number++) {

            boolean isPrime = true;

            for (int div = 2; div < number; div++) {
                if (number % div == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
