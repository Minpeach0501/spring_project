package Vehicle;

public class Bus {

    private static int count =1000;
    int maxPassenger = 45;
    int passenger;
    int price = 1200;
    int money;
    int number;
    int fuel = 100;
    int speed;
    boolean isRun = true;

    public Bus() {
        count++;
        this.number = count;
    }
    //운행
    public void run() {
        if(fuel>9){
            isRun=true;
        }
        else {
            isRun=false;
            System.out.println("주유가 필요합니다.");
        }
    }
    //상태변경
    public void changeStatus() {
        if(!isRun && fuel>9) {
            isRun = true;
        } else {
            isRun = !isRun;
        }
    }
    //승객탐승
    public void addPassenger(int passenger) {
        if(this.passenger<maxPassenger && isRun) {
            this.passenger += passenger;
            money += price;
        } else {
            System.out.println("탑승이 불가능합니다.");
        }
    }
    //속도 변경
    public void changeSpeed(int speed) {
        if(fuel<10) {
            System.out.println("주유량을 확인해주세요");
            changeStatus();
        }
        else this.speed += speed; //현재속도 증감
    }
}

