package Vehicle;

public class Taxi {
    private static int count = 2000;
    int number;
    int fuel =100;
    int speed;
    String destination = "";
    int distance = 2000;
    int distanceToDestination;
    int minimumFare = 3800;
    int ratePerDistance;
    int money;
    boolean isRun =false;

    //기본생성자
    public Taxi() {
        count++;
        this.number = count;
    }

    //운행시작
    public void run() {
        if(fuel>9 && !isRun){
            isRun= true;
        }
    }

    //승객 탑승
    public void addPassenger(String destination, int distanceToDestination) {
        if(!isRun){
            this.destination = destination;
            this.distanceToDestination = distanceToDestination;
            run();
        } else {
            System.out.println("탑승불가 운행중입니다");
        }
    }

    //속도 변경
    public void changeSpeed(int speed){
        if(isRun){
            this.speed += speed;
        }
    }

    //거리당 요금추가
    public void addrate() {
        ratePerDistance = ((distanceToDestination -distance)/100)*100 + minimumFare;
    }

    //요금 결제
    public void payment() {
        if(isRun){
            money += ratePerDistance;
            System.out.println("최종요금은 "+money+"원입니다.");
            ratePerDistance = 0;
            isRun = false;
        }else {
            System.out.println("결제불가 운행중이 아닙니다.");
        }
    }

}
