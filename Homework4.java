import java.util.Scanner;


public class Homework4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        String numInput = sc.nextLine();
        String[] numArr =  numInput.split(" ");
        int num1 = Integer.parseInt(numArr[0]);
        int num2 = Integer.parseInt(numArr[1]);
        int result = gcd2(num1,num2);
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", result);

    }

    public static int gcd(int a, int b){
        if (a == b) {return a;}
        else if(a == 0){return b;}
        else if(a>b){return gcd(a-b,b);}
        else { return gcd(a, b-a);}
    }

    public static int gcd2(int a, int b){
        if (b == 0){
            return a;
        }
        else {return gcd2(b, a%b);}
    }
}
