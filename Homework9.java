import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {

    private static final String DB_FILE_PATH = "db.txt";
    private static Map<String, String> userMap = new HashMap<>();

    public static void main(String[] args) {
        if (!loadUserData()) {
            System.err.println("오류: 사용자 데이터 로딩에 실패했습니다. 프로그램을 종료합니다.");
            return;
        }

        loginSystem();
    }

    private static boolean loadUserData() {
        try (BufferedReader br = new BufferedReader(new FileReader(DB_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+"); 
                if (parts.length == 2) {
                    userMap.put(parts[0].trim(), parts[1].trim());
                }
            }
            return true;
        } catch (IOException e) {
            System.err.println("파일 읽기 오류: " + DB_FILE_PATH + " 파일을 찾을 수 없거나 읽을 수 없습니다.");
            e.printStackTrace();
            return false;
        }
    }

    private static void loginSystem() {
        Scanner scanner = new Scanner(System.in);
        String inputId = "";
        String inputPassword = "";
        boolean loginSuccess = false;

        while (!loginSuccess) {
            System.out.println("id와 password를 입력해주세요.");
            
            System.out.print("id : ");
            inputId = scanner.nextLine().trim();

            if (!userMap.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            inputPassword = scanner.nextLine().trim();

            String storedPassword = userMap.get(inputId);
            
            if (storedPassword.equals(inputPassword)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                loginSuccess = true;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }
        
        scanner.close();
    }
}
