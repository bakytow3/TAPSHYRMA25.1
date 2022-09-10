import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


            HashMap<Integer, Car> map = new HashMap<>();
            map.put(1, new Car("123213211", 4455));

            HashMap<Integer, CarData> map2 = new HashMap<>();
            map2.put(1, new CarData( 2012,"BMW5",4500335,"Black"));

            for (Map.Entry elements : map.entrySet()) {
                System.out.println(elements.getValue());
            }
            for (Map.Entry elements1 : map2.entrySet()) {
                System.out.println(elements1.getValue());
            }
    }
}