public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);
    }
}

class Course{
    private String code;
    private String name;

    public Course(){}
    public Course(String code, String name){
        this.code = code;
        this.name = name;
    }
    public String getCode(){return code;}
    public String getName(){return name;}
}

class OnlineCourse extends Course{

    public OnlineCourse(){}
    public OnlineCourse(String code, String name){
        super(code, name);
    }
    @Override
    public String toString(){
        String msg = "Code: " + getCode() + ", Name: " + getName() + ", Type: Online";
        return msg;
    }
}

class OfflineCourse extends Course{

    public OfflineCourse(){}
    public OfflineCourse(String code, String name){
        super(code, name);
    }
    @Override
    public String toString(){
        String msg = "Code: " + getCode() + ", Name: " + getName() + ", Type: Offline";
        return msg;
    }
}
