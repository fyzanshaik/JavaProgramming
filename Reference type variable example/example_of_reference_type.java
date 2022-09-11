import java.util.Date;

public class example_of_reference_type {
    public static void main(String[] args) {
        byte age = 30;
        //This is a primitive type variable, it doesn't have any classes inside it.
        Date now = new Date();
        // A reference type of Data which stores complex object objects such as "time"
        now.getTime();
        System.out.println(now);
    }
}
