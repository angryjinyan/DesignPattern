public class Application {
    public static void main(String[] args){
        Person yj = new Person("YJ");

        System.out.println("\n First look: ");

        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        sneakers.Decorate(yj);
        bigTrouser.Decorate(sneakers);
        tShirts.Decorate(bigTrouser);
        tShirts.Show();

    }

}
