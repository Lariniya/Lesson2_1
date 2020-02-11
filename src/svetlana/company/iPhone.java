package svetlana.company;

public class iPhone extends MobilePhone{

    private int photo;

    public iPhone (String producer) {

        super(producer);
        photo = 10;
    }

    @Override
    public String toString() {
        return "Я айфон и делаю классные фоточки";
    }

    public boolean createPhoto(int newPhoto) {
        if(validatePhoto(newPhoto)) {
            this.photo = newPhoto;
            return true;
        }
        return false;
    }

    private boolean validatePhoto(int photo) {
        if(photo>20){
            System.out.println("Слишком много селфи, ты и так красивая");
            return false;
        }

        if(photo<5){
            System.out.println("Чего так мало селфи, ты себя совсем не любишь?");
            return false;
        }
        else return true;
    }
}
