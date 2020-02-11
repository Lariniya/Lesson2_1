package svetlana.company;


public class Main {

    public static void main(String[] args) {

       demoPublicAndPrivate();

        demoEncapsulation();

        demoEqualsAndHashCode();

    }

    private static void demoPublicAndPrivate() {
        System.out.println("Новый айфончик умеет много фоткать");
        iPhone iphone = new iPhone("USA");
        iphone.createPhoto(4);
        iphone.createPhoto(25);

        System.out.println("Давайте посмотрим Ксаоми! Какой дешевый телефон!");
        Xiaomi xiaomi = new Xiaomi("China", 20000);
        xiaomi.trySoldOut();

        System.out.println("Твоя моторолла ждет тебя");
        Motorolla motorolla = new Motorolla("USA", 10);
        motorolla.buyPhone(4);
        motorolla.buyPhone(40);

        System.out.println("Давайте посмотрим Ксаоми! Какой дешевый телефон!");
        Xiaomi newXiaomi = new Xiaomi("China", 20000);
        xiaomi.trySoldOut();
    }

    private static void demoEncapsulation() {
        MobilePhone newIPhone = new MobilePhone("USA");
        System.out.println(newIPhone.toString());
        System.out.println("Мы хотим купить Айфон!");
        newIPhone.trySoldOut();
        System.out.println(newIPhone.toString());

        MobilePhone newXiaomi = new MobilePhone("China");
        MobilePhone newMotorolla = new MobilePhone("China");
        MobilePhone[] phonesArray = new MobilePhone[3];
        phonesArray[0] = newIPhone;
        phonesArray[1] = newXiaomi;
        phonesArray[2] = newMotorolla;

        System.out.println("Демонстрирую полиморфизм");
        for(int phoneNumber = 0; phoneNumber < phonesArray.length; phoneNumber ++){
            System.out.println(phonesArray[phoneNumber].toString());
        }
    }

    private static void demoEqualsAndHashCode() {
        MobilePhone newIPhone1 = new MobilePhone("USA");
        MobilePhone newIPhone2 = new MobilePhone("UK");
        MobilePhone newIPhone3 = new MobilePhone("Argentina");

        System.out.println("Сравниваю с помощью equals");
        System.out.println(newIPhone1.equals(newIPhone2));
        System.out.println("Сравниваю с помощью ==");
        System.out.println(newIPhone1 == newIPhone2);
        System.out.println("Хэш коды");
        System.out.println(newIPhone1.hashCode() + " " + newIPhone2.hashCode() + " " + newIPhone3.hashCode());
    }

}