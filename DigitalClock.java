import java.text.SimpleDateFormat;
import java.util.Date;
public class DigitalClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
           
            Date currentTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

            String formattedTime = sdf.format(currentTime);

            System.out.print("\r" + formattedTime);

            // Sleep for 1 second (1000 milliseconds)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


