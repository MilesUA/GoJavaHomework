package offline.module03;

/**
 * Created by Miles on 09.02.2017.
 */
public class NissanJukeCar {
//    Wheel[] wheels = new Wheel[4];
    Wheal[] wheals = new Wheal[4];
    double engineValue = 1.6;
    int doorsMount = 5;
    double petrol = 20;
    String name;

    String color;

    public boolean goToDestination(String cityName){
        if (petrol == 0){
            return false;
        }
        return true;

        //System.out.println(cityName);
    }



    public NissanJukeCar(String color) {
        this.color = color;
    }
}
