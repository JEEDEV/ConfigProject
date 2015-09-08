import java.io.IOException;


public class ReadConfigMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetPropertyValues properties = new GetPropertyValues();
		try {
			((GetPropertyValues) properties).getPropValues();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
