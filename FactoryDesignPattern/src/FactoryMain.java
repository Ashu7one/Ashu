import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingFactor;


public class FactoryMain {

	public static void main(String[] args) {
		
		OperatingFactor opf = new OperatingFactor();
		OS os =opf.getInstance("uuu"); //retuns new any 3 class
	
		os.specs();

	}

}
