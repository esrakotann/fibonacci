import java.util.ArrayList;

public class Main {

    public void fibonacci() {
        ArrayList<Integer> fibonacciList = new ArrayList<Integer>();
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        boolean isPrime;
        int smallPrime = 0;
        int bigPrime = 0;
        fibonacciList.add(firstNumber);
        fibonacciList.add(secondNumber);

        for (int i = 0; i < (firstNumber + secondNumber); i++) {
            nextNumber = firstNumber + secondNumber;
            fibonacciList.add(nextNumber);
            if(nextNumber <500000) {
                isPrime = primeNumber(nextNumber);
                if(isPrime) {
                    if(nextNumber>smallPrime) {
                        smallPrime = nextNumber;
                    }
                }
            }
            else if(nextNumber >= 500000) {
                isPrime = primeNumber(nextNumber);
                if(isPrime) {
                    bigPrime = nextNumber;
                    break;
                }
            }
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        int result = resultNumber(bigPrime,smallPrime);
    }

    public boolean primeNumber(int number) {
        boolean isPrime = true;
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public int resultNumber(int bigNumber, int smallNumber) {
        int sonuc = bigNumber - smallNumber;
        System.out.println("Fibonacci dizesinde 500.000 ’den küçük en büyük asal sayı ile, 500.000 den büyük en küçük asal sayı arasındaki fark : " + sonuc);

        return sonuc;
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.fibonacci();
    }
}