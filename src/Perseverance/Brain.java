/**
 * 
 */
package Perseverance;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author frosa
 *
 */
public class Brain implements SelfCheckCapable {
String ModelType;
int ModelYear;
String ProcessingSystem;
int Memory;

/**
 * This tells the rover what to do.
 */
void ExecuteCommands() {
}

/**
 * Runs checks for all rover systems.
 */
void SystemCheck() {
}

/**
 * Generates a report after checking system that can be sent back to earth.
 */
void GenerateReport() {
}



	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
