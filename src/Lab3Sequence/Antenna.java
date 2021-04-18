/**
 * 
 */
package Lab3Sequence;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author frosa
 *
 */
public class Antenna implements SelfCheckCapable {

	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Antenna";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Antenna myantenna = new Antenna();
		myantenna.ReceiveCommunication();
	}

	/**
	 * Antenna receives communications from NASA.
	 */
	private void ReceiveCommunication() {
		// TODO Auto-generated method stub
		System.out.println("Communication Received");
		Brain mybrain = new Brain();
		mybrain.ExecutesCommand();
	}

}
