import java.util.*;

public class Homework8 {
    public static void main(String[] args){
        HashMap<String, String> IdPw = new HashMap<String, String>();
        IdPw.put("myId", "myPass");
        IdPw.put("mtId2", "myPass2");
        IdPw.put("myId3", "myPass3");
        String idIn;
        String pwIn;
        Boolean idRpt = false;
        Scanner scId = new Scanner(System.in);
        do{
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            idIn = scId.nextLine();
            idIn = idIn.trim();
            if(IdPw.containsKey(idIn)){
                Scanner scPw = new Scanner(System.in);
                System.out.print("password: ");
                pwIn = scPw.nextLine();
                pwIn = pwIn.trim();

                if(IdPw.get(idIn).equals(pwIn)){
                    System.out.println("id와 비밀번호가 일치합니다.");
                    idRpt = true;
                }
                else{
                    System.out.println("비밀번호가 일치하지 않습니다.\n");
                }
            }
            else{
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
        }while(idRpt == false);
    }
}
