import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("정수를 입력하세요: "); //1번//
        String Numstr = sc.next();
        int num1 = Integer.parseInt(Numstr);
        System.out.printf("현재까지 입력된 정수의 값은 %d 입니다.\n", num1);
        System.out.printf("정수를 입력하세요: "); //2번//
        Numstr = sc.next();
        num1 += Integer.parseInt(Numstr);
        System.out.printf("현재까지 입력된 정수의 값은 %d 입니다.\n", num1);
        System.out.printf("정수를 입력하세요: "); //3번//
        Numstr = sc.next();
        num1 += Integer.parseInt(Numstr);
        System.out.printf("현재까지 입력된 정수의 값은 %d 입니다.\n", num1);
        System.out.printf("정수를 입력하세요: "); //4번//
        Numstr = sc.next();
        num1 += Integer.parseInt(Numstr);
        System.out.printf("현재까지 입력된 정수의 값은 %d 입니다.\n", num1);
        System.out.printf("정수를 입력하세요: "); //5번//
        Numstr = sc.next();
        num1 += Integer.parseInt(Numstr);
        System.out.printf("현재까지 입력된 정수의 값은 %d 입니다.\n끝.", num1);
    }
}
