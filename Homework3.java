import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int num2;
        int max;
        int min;

        System.out.print("몇 개의 수를 입력할 예정인가요?");
        num = scanner.nextInt();
        int[] Array = new int[num];
        System.out.print("수를 입력하세요:");
        num2 = scanner.nextInt();
        Array[0] = num2;
        max = Array[0];
        min = Array[0];
        for (int i = 1; i < num; i++){
            Array[i] = scanner.nextInt();
        }

        for (int j = 1; j < num; j++){
            if (max < Array[j]){
                max = Array[j];
            }
            else{
                max = max;
            }

        }
        for (int k = 1; k < num; k++){
            if (min > Array[k]){
                min = Array[k];
            }
            else{
                min = min;
            }
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
    }
}
