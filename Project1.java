import java.util.Scanner;

public class Project1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String select;
        String strInput = null;
        String[] strMain = null;
        String find;
        String change;
        int strLength = 0;
        int wordNum = 0;
        int findNum;
        int changeNum;
        boolean findBool;
        boolean exitBool = true;



        System.out.println("""
                ===메뉴===
                i: 문자열 입력
                o: 문자열 출력
                s: 문자열 찾기
                r: 문자열 바꾸기
                h: 도움말
                e: 종료""");

        while(exitBool){
            System.out.print("선택: ");
            select = scanner.nextLine().trim();//trim은 공백문자없애주는 역할//
            switch (select){
                case "i", "I":
                    System.out.print("문자열을 입력하세요: ");
                    strInput = scanner.nextLine();
                    strLength = strInput.length();
                    strMain = strInput.split(" ");
                    if (strLength == 0){wordNum = 0;}
                    else {wordNum = strMain.length;}
                    break;

                case "o", "O":
                    System.out.printf("현재 문자열: %s\n", strInput);
                    System.out.printf("글자 수: %d\n", strLength);
                    System.out.printf("단어 수: %d\n", wordNum);
                    break;

                case "s", "S":
                    System.out.print("찾을 문자열을 입력하세요: ");
                    find = scanner.nextLine();
                    findNum = 0;
                    findBool = false;
                    for (int i = 0; i < wordNum; i++){
                        if (find.equals(strMain[i])) {
                            findNum++;
                            findBool = true;
                        }
                    }
                    if(findBool){
                        System.out.printf("%s 이/가 %d회 존재합니다.\n", find, findNum);
                    }
                    else{
                        System.out.println("문자열을 찾을 수 없습니다.");
                    }
                    break;

                case "r", "R": //replace 메소드를 사용하면 훠얼씬 편함,,//
                    StringBuilder newStr = new StringBuilder();
                    System.out.print("찾을 문자열을 입력하세요: ");
                    find = scanner.nextLine();
                    System.out.print("바꿀 문자열을 입력하세요: ");
                    change = scanner.nextLine();
                    changeNum = 0;
                    findBool = false;
                    for (int i = 0; i < wordNum; i++){
                        if (find.equals(strMain[i])) {
                            strMain[i] = change;
                            changeNum++;
                            findBool = true;
                        }
                    }
                    for (int k = 0; k < wordNum; k++){
                        newStr.append(strMain[k]);
                        if(k < wordNum-1) {
                            newStr.append(" ");
                        }
                    }
                    strInput = newStr.toString();//바뀐 내용 최신화//
                    strLength = strInput.length();
                    strMain = strInput.split(" ");
                    wordNum = strMain.length;
                    if(findBool){
                        System.out.printf("변경된 문자열: %s\n", strInput);
                        System.out.printf("%s 이/가 %d번 바뀌었습니다.\n", find, changeNum);
                    }
                    else {
                        System.out.println("바뀐게 없습니다.(찾을 문자열 잘못 입력)\n");
                    }
                    break;

                case "h", "H":
                    System.out.println("""
                            ===메뉴===
                            i: 문자열 입력
                            o: 문자열 출력
                            s: 문자열 찾기
                            r: 문자열 바꾸기
                            h: 도움말
                            e: 종료""");
                    break;

                case "e", "E":
                    exitBool = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }
        }



    }
}
