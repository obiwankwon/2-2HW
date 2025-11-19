public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}

abstract class Printer {
    protected String model;        // 모델명
    protected int printedCount;    // 현재까지의 출력 매수
    protected int availableCount;  // 출력 가능 매수

    public Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0;
    }

    // 추상 메서드: 인쇄 기능
    public abstract boolean print();
}

class InkjetPrinter extends Printer {

    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        // availableCount가 0일 경우 (잉크 부족)
        if (availableCount == 0) {
            // xx매는 printedCount(이전까지의 출력매수) +1이 됨
            System.out.println(model + ": " + (printedCount + 1) + "매째 인쇄 실패 - 잉크 부족.");
            return false; // false 리턴하여 while 루프 종료
        } else {
            // availableCount가 1 이상일 경우
            printedCount++;
            availableCount--;
            // 성공 메시지 출력 (main 함수 실행 이해를 돕기 위해 추가)
            System.out.println(model + ": 인쇄 성공 (" + printedCount + "매 출력, " + availableCount + "매 잔여)");
            return true; // true 리턴하여 while 루프 계속 진행
        }
    }
}

class LaserPrinter extends Printer {

    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        // availableCount가 0일 경우 (토너 부족)
        if (availableCount == 0) {
            // xx매는 printedCount(이전까지의 출력매수) +1이 됨
            System.out.println(model + ": " + (printedCount + 1) + "매째 인쇄 실패 - 토너 부족.");
            return false; // false 리턴하여 while 루프 종료
        } else {
            // availableCount가 1 이상일 경우
            printedCount++;
            availableCount--;
            // 성공 메시지 출력 (main 함수 실행 이해를 돕기 위해 추가)
            System.out.println(model + ": 인쇄 성공 (" + printedCount + "매 출력, " + availableCount + "매 잔여)");
            return true; // true 리턴하여 while 루프 계속 진행
        }
    }
}
