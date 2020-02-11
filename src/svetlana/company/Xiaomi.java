package svetlana.company;

public class Xiaomi extends MobilePhone{

    private int cost;

    public Xiaomi(String producer, int cost) {
        super(producer);
        this.cost = cost + 1000; //цена производителя плюс налог
    }

    @Override
    public String toString() {
        return "Я классный дешевый телефон и стою " + cost + " рублей. Купи меня!";
    }

    @Override
    public boolean trySoldOut() {
        System.out.println("Меня не пропускают на таможне, но я тебя очень жду. Купи, купи, купи!");
        return false;
    }
}
