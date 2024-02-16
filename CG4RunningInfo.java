package com.mmm.jna.cg4essentials;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : CG4EssentialsApi.h</i>
 */
public class CG4RunningInfo extends Structure {
	/** Flag to Initialized */
	public boolean bIsInitialized;
	/** Flag to Capturing */
	public boolean bIsCaptueing;
	/** Flag to Capture abort */
	public boolean bIsCaptureAbort;
	/** Flag to auto capture */
	public boolean bAutoCapture;
	/** Flag to auto contrast */
	public boolean bAutoContrast;
	/** Flag to start preview */
	public boolean bStartPreview;
	/** Flag to capture OK */
	public boolean bIsCaptureOK;
	/** Flag to start rolling */
	public boolean bIsStartRolling;
	/**  Error code */
	public int nErrorCode;
	public CG4RunningInfo() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("bIsInitialized", "bIsCaptueing", "bIsCaptureAbort", "bAutoCapture", "bAutoContrast", "bStartPreview", "bIsCaptureOK", "bIsStartRolling", "nErrorCode");
	}
	/**
	 * @param bIsInitialized Flag to Initialized<br>
	 * @param bIsCaptueing Flag to Capturing<br>
	 * @param bIsCaptureAbort Flag to Capture abort<br>
	 * @param bAutoCapture Flag to auto capture<br>
	 * @param bAutoContrast Flag to auto contrast<br>
	 * @param bStartPreview Flag to start preview<br>
	 * @param bIsCaptureOK Flag to capture OK<br>
	 * @param bIsStartRolling Flag to start rolling<br>
	 * @param nErrorCode Error code
	 */
	public CG4RunningInfo(boolean bIsInitialized, boolean bIsCaptueing, boolean bIsCaptureAbort, boolean bAutoCapture, boolean bAutoContrast, boolean bStartPreview, boolean bIsCaptureOK, boolean bIsStartRolling, int nErrorCode) {
		super();
		this.bIsInitialized = bIsInitialized;
		this.bIsCaptueing = bIsCaptueing;
		this.bIsCaptureAbort = bIsCaptureAbort;
		this.bAutoCapture = bAutoCapture;
		this.bAutoContrast = bAutoContrast;
		this.bStartPreview = bStartPreview;
		this.bIsCaptureOK = bIsCaptureOK;
		this.bIsStartRolling = bIsStartRolling;
		this.nErrorCode = nErrorCode;
	}
	public CG4RunningInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CG4RunningInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CG4RunningInfo implements Structure.ByValue {
		
	};
}
