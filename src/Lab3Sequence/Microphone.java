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
public class Microphone implements SelfCheckCapable {

	Camera mycamera;
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Microphone";
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
	 * Mic records sound for video.
	 */	
	public void RecordSound() {
		// TODO Auto-generated method stub
		System.out.println("Record Sound");
		
	}

}
