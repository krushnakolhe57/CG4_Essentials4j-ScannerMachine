package com.mmm.jna.cg4essentials;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : CG4EssentialsApi.h</i>
 */
public class CG4ScannerExist extends Structure {
	/** connected scanner count */
	public int nDevConnected;
	/** Flag to CS500i */
	public boolean bCS500i;
	/** Flag to CS500e */
	public boolean bCS500e;
	/** Flag to CSD450 */
	public boolean bCSD450;
	/** Flag to CSD330 */
	public boolean bCSD330;
	/** Flag to CSD200 */
	public boolean bCSD200;
	/** Flag to CS500p */
	public boolean bCS500p;
	/** Flag to CS1000p */
	public boolean bCS1000p;
	/** Flag to CSD100 */
	public boolean bCSD100;
	/** Flag to CSD450k */
	public boolean bCSD450k;
	/** Flag to CS1000e */
	public boolean bCS1000e;
	/** Flag to CSD301L */
	public boolean bCSD301L;
	/** Flag to CSD301B */
	public boolean bCSD301B;
	public CG4ScannerExist() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("nDevConnected", "bCS500i", "bCS500e", "bCSD450", "bCSD330", "bCSD200", "bCS500p", "bCS1000p", "bCSD100", "bCSD450k", "bCS1000e", "bCSD301L", "bCSD301B");
	}
	public CG4ScannerExist(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CG4ScannerExist implements Structure.ByReference {
		
	};
	public static class ByValue extends CG4ScannerExist implements Structure.ByValue {
		
	};
}
