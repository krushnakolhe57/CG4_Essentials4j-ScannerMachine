package com.mmm.jna.cg4essentials;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : CG4EssentialsApiM.h</i>
 */
public class CG4MScannerExist extends Structure {
	/** Number of connected devices */
	public int nDevConnected;
	/** Number of connected CS500i */
	public int nCS500i;
	/** Number of connected CS500e */
	public int nCS500e;
	/** Number of connected CSD450 */
	public int nCSD450;
	/** Number of connected CSD330 */
	public int nCSD330;
	/** Number of connected CSD200 */
	public int nCSD200;
	/** Number of connected CS500p */
	public int nCS500p;
	/** Number of connected CS1000p */
	public int nCS1000p;
	/** Number of connected CS100 */
	public int nCSD100;
	/** Number of connected CSD450k */
	public int nCSD450k;
	/** Number of connected CS1000e */
	public int nCS1000e;
	/** Number of connected CSD301L */
	public int nCSD301L;
	/** Number of connected CSD301B */
	public int nCSD301B;
	/** scanner type, A mapping of array element onto device index. */
	public int[] scannerType = new int[10];
	public CG4MScannerExist() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("nDevConnected", "nCS500i", "nCS500e", "nCSD450", "nCSD330", "nCSD200", "nCS500p", "nCS1000p", "nCSD100", "nCSD450k", "nCS1000e", "nCSD301L", "nCSD301B", "scannerType");
	}
	public CG4MScannerExist(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CG4MScannerExist implements Structure.ByReference {
		
	};
	public static class ByValue extends CG4MScannerExist implements Structure.ByValue {
		
	};
}
