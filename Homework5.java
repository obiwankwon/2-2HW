public class Homework5 {
    public static void main(String[] args){
        PersonalComputer pc = new PersonalComputer();
        pc.turnOn();
        pc.printInfo();
    }
}

class PersonalComputer{
    public void turnOn(){
        Computer com = new Computer();
        Monitor mon = new Monitor();
        com.turnOn();
        mon.turnOn();
    }
    public void printInfo(){
        Computer com = new Computer();
        Monitor mon = new Monitor();
        com.printInfo();
        mon.printInfo();
    }


}

class Monitor {
    private String monitorSize = "32 inch";
    private String color = "black";
    private String power = "45W";

    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }

    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.printf(" Size: %s\n", monitorSize);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}

class Computer{
    private String cpu = "Core i7";
    private String memory = "16GB";
    private String color = "white";
    private String hd = " 2TB";
    private String power = "700W";

    public void turnOn(){
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.printf(" CPU: %s\n", cpu);
        System.out.printf(" Memory: %s\n", memory);
        System.out.printf(" HDD: %s\n", hd);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}
