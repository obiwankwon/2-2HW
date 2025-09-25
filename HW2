import java.util.Scanner;


public class Student {
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
        Phonenumstr = "0"+Integer.toString(PhoneNum);
        FinalPhoneNum = Phonenumstr.substring(0,3)+"-"+
                        Phonenumstr.substring(3,7)+"-"+
                        Phonenumstr.substring(7);
        return FinalPhoneNum;
    }

}

class StudentTest{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        String StudentInformation = scanner.nextLine();
        String[] Array = StudentInformation.split(" ");
        Student s1 = new Student();
        s1.setStudentNum(Integer.parseInt(Array[0]));
        s1.setName(Array[1]);
        s1.setMajor(Array[2]);
        s1.setPhoneNum(Integer.parseInt(Array[3]));

        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        String StudentInformation2 = scanner.nextLine();
        String[] Array2 = StudentInformation2.split(" ");
        Student s2 = new Student();
        s2.setStudentNum(Integer.parseInt(Array2[0]));
        s2.setName(Array2[1]);
        s2.setMajor(Array2[2]);
        s2.setPhoneNum(Integer.parseInt(Array2[3]));

        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        String StudentInformation3 = scanner.nextLine();
        String[] Array3 = StudentInformation3.split(" ");
        Student s3 = new Student();
        s3.setStudentNum(Integer.parseInt(Array3[0]));
        s3.setName(Array3[1]);
        s3.setMajor(Array3[2]);
        s3.setPhoneNum(Integer.parseInt(Array3[3]));

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.printf("첫번째 학생: %d %s %s %s \n",s1.getStudentNum(), s1.getName(), s1.getMajor(), s1.getPhoneNum());
        System.out.printf("두번째 학생: %d %s %s %s \n",s2.getStudentNum(), s2.getName(), s2.getMajor(), s2.getPhoneNum());
        System.out.printf("세번째 학생: %d %s %s %s \n",s3.getStudentNum(), s3.getName(), s3.getMajor(), s3.getPhoneNum());
    }
}
