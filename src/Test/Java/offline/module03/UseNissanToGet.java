package offline.module03;

/**
 * Created by Miles on 09.02.2017.
 */
public class UseNissanToGet {
    public static void main(String[] args) {
        NissanJukeCar myCar = new NissanJukeCar("white");

//        myCar.color = "red";
        System.out.println(myCar.color);

        NissanJukeCar femilyCar = new NissanJukeCar("yello");
        System.out.println(femilyCar.color);

        for (int i = 0; i < myCar.wheals.length; i++) {
            myCar.wheals[i] = new Wheal(i);
        }

//        boolean arreweInParis

    }
}
