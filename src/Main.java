public class Main {
    public static void main(String[] args) {
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));

        System.out.println(LastDigitChecker.isValid(10));
        System.out.println(LastDigitChecker.isValid(468));
        System.out.println(LastDigitChecker.isValid(1051));
    }
}

//* hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
//
//* hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
//
//* hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000

//* isValid(10); → should return true since 10 is within the range of 10-1000
//
//* isValid(468); → should return true since 468 is within the range of 10-1000
//
//* isValid(1051); → should return false since 1051 is not within the range of 10-1000
