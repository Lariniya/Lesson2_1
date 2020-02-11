package svetlana.company;

import java.util.Objects;

public class MobilePhone {

    private boolean isSoldOut;
    private String producer;

    public MobilePhone(String producer) {
        this.isSoldOut = false;
        this.producer = producer; //телефон определенного производителя лежит в магазине и ждет, пока его купят
    }

    public boolean trySoldOut(){
        isSoldOut = !isSoldOut;
        return true;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "isSoldOut=" + isSoldOut +
                ", producer='" + producer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilePhone that = (MobilePhone) o;
        return Objects.equals(producer, that.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer);
    }
}
