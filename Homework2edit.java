import java.util.Scanner;

public class Student {
    // ... (Student 클래스는 그대로 사용)
    int StudentNum;
    String Name;
    String Major;
    int PhoneNum;

    Student(){
        StudentNum = 0;
        Name = "";
        Major = "";
        PhoneNum = 0;
    }

    void setStudentNum(int StudentNum){
        this.StudentNum = StudentNum;
    }
    void setName(String Name){
        this.Name = Name;
    }
    void setMajor(String Major){
        this.Major = Major;
    }
    void setPhoneNum(int PhoneNum){
        this.PhoneNum = PhoneNum;
    }

    int getStudentNum(){return StudentNum;}
    String getName(){return Name;}
    String getMajor(){return Major;}
    String getPhoneNum(){
        String Phonenumstr;
        String FinalPhoneNum;
        Phonenumstr = "0" + Integer.toString(PhoneNum); 
        FinalPhoneNum = Phonenumstr.substring(0,3) + "-" +
                        Phonenumstr.substring(3,7) + "-" +
                        Phonenumstr.substring(7);
        return FinalPhoneNum;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3]; // 학생 객체를 담을 배열 생성

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%d번째 학생의 학번, 이름, 전공, 전화번호를 입력하세요: ", i + 1);
            
            String studentInformation = scanner.nextLine(); 
            String[] infoArray = studentInformation.split(" ");

            students[i] = new Student(); // 배열의 각 위치에 새로운 학생 객체 생성
            students[i].setStudentNum(Integer.parseInt(infoArray[0]));
            students[i].setName(infoArray[1]);
            students[i].setMajor(infoArray[2]);
            students[i].setPhoneNum(Integer.parseInt(infoArray[3]));
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("==========================================");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%d번째 학생: %d %s %s %s\n",
                    i + 1,
                    students[i].getStudentNum(),
                    students[i].getName(),
                    students[i].getMajor(),
                    students[i].getPhoneNum());
        }
        
        scanner.close(); // 스캐너 사용 후 닫아주는 것이 좋음
    }
}
