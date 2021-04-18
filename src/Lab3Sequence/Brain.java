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
public class Brain implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Brain";
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
	 * Brain stores video recording.
	 */
	public void StoreVideo() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Brain sends commands to body and parts of Perseverance.
	 */
	public void ExecutesCommand() {
		// TODO Auto-generated method stub
		System.out.println("Command Sent");
		Camera mycamera = new Camera();
		mycamera.RecordVideo();
	}

}
