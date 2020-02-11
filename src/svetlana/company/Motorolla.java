package svetlana.company;

public class Motorolla extends MobilePhone{

    private int weight;

    public Motorolla(String producer, int weight) {
        super(producer);
        this.weight = weight + 10;
    }

    @Override
    public String toString() {
        return "Я очень надежный, солидный и вешу " + weight + "кг";
    }

    public boolean buyPhone(int newMotorolla) {
        if(takePhone(newMotorolla)) {
            this.weight = newMotorolla;
            return true;
        }
        return false;
    }

    private boolean takePhone(int weight) {
        if(weight>30){
            System.out.println("Рано еще меня покупать, иди качайся в зал");
            return false;
        }

        if(weight<15){
            System.out.println("Тебе повезло, я похудел. Покупай меня");
            return false;
        }
        else return true;
    }
}
