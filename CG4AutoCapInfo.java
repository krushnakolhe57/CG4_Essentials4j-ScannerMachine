package com.mmm.jna.cg4essentials;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : CG4EssentialsApi.h</i>
 */
public class CG4AutoCapInfo extends Structure {
	/** The resolution of Live image */
	public int nLiveRes;
	/** This item control the minimum average grey level for each fingerprint block.(the default value is 230) */
	public int nAutoCap_GreyLevel;
	/** This item means how many percent over the whole capture screen(the default value is 2.0) */
	public double dAutoCap_SquarePecent;
	/** This item control the fingerprint quality(the default value is 12) */
	public int nAutoCap_Qua;
	/** This item means how many still frames need to be detected before trigger(the default value is 3) */
	public int nAutoCap_NoMoveFrames;
	/** This item control the fingerprint center, X-axis coordinates(the default value is 10) */
	public int nAutoCap_MaxDevCentX;
	/** This item control the fingerprint center, Y-axis coordinates(the default value is 10) */
	public int nAutoCap_MaxDevCentY;
	/** This item control the fingerprint gray level(the default value is 15) */
	public int nAutoCap_MaxDevGrey;
	/** This item control the fingerprint area shift between two continuous image frames(the default value is 3000) */
	public int nAutoCap_MaxDevSquare;
	public CG4AutoCapInfo() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("nLiveRes", "nAutoCap_GreyLevel", "dAutoCap_SquarePecent", "nAutoCap_Qua", "nAutoCap_NoMoveFrames", "nAutoCap_MaxDevCentX", "nAutoCap_MaxDevCentY", "nAutoCap_MaxDevGrey", "nAutoCap_MaxDevSquare");
	}
	/**
	 * @param nLiveRes The resolution of Live image
	 * @param nAutoCap_GreyLevel This item control the minimum average grey level for each fingerprint block.(the default value is 230)
	 * @param dAutoCap_SquarePecent This item means how many percent over the whole capture screen(the default value is 2.0)
	 * @param nAutoCap_Qua This item control the fingerprint quality(the default value is 12)
	 * @param nAutoCap_NoMoveFrames This item means how many still frames need to be detected before trigger(the default value is 3)
	 * @param nAutoCap_MaxDevCentX This item control the fingerprint center, X-axis coordinates(the default value is 10)
	 * @param nAutoCap_MaxDevCentY This item control the fingerprint center, Y-axis coordinates(the default value is 10)
	 * @param nAutoCap_MaxDevGrey This item control the fingerprint gray level(the default value is 15)
	 * @param nAutoCap_MaxDevSquare This item control the fingerprint area shift between two continuous image frames(the default value is 3000)
	 */
	public CG4AutoCapInfo(int nLiveRes, int nAutoCap_GreyLevel, double dAutoCap_SquarePecent, int nAutoCap_Qua, int nAutoCap_NoMoveFrames, int nAutoCap_MaxDevCentX, int nAutoCap_MaxDevCentY, int nAutoCap_MaxDevGrey, int nAutoCap_MaxDevSquare) {
		super();
		this.nLiveRes = nLiveRes;
		this.nAutoCap_GreyLevel = nAutoCap_GreyLevel;
		this.dAutoCap_SquarePecent = dAutoCap_SquarePecent;
		this.nAutoCap_Qua = nAutoCap_Qua;
		this.nAutoCap_NoMoveFrames = nAutoCap_NoMoveFrames;
		this.nAutoCap_MaxDevCentX = nAutoCap_MaxDevCentX;
		this.nAutoCap_MaxDevCentY = nAutoCap_MaxDevCentY;
		this.nAutoCap_MaxDevGrey = nAutoCap_MaxDevGrey;
		this.nAutoCap_MaxDevSquare = nAutoCap_MaxDevSquare;
	}
	public CG4AutoCapInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CG4AutoCapInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CG4AutoCapInfo implements Structure.ByValue {
		
	};
}
