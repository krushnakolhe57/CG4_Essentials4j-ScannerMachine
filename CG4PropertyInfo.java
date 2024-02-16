package com.mmm.jna.cg4essentials;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : CG4EssentialsApi.h</i>
 */
public class CG4PropertyInfo extends Structure {
	private static final int CG4_MAX_STR_LEN = (int)128;
	
	/** 500 or 1000 ppi */
	public int nResolution;
	/** Device Maker */
	public byte[] szMaker = new byte[CG4_MAX_STR_LEN];
	/** Device model type */
	public byte[] szModel = new byte[CG4_MAX_STR_LEN];
	/** Device interface type (USB, FireWire) */
	public byte[] szInterfaceType = new byte[CG4_MAX_STR_LEN];
	/** Device serial no */
	public byte[] szSerial = new byte[CG4_MAX_STR_LEN];
	/** Firmware version of scanner */
	public byte[] szVer = new byte[CG4_MAX_STR_LEN];
	/** Manufacture date */
	public byte[] szManDate = new byte[CG4_MAX_STR_LEN];
	/** Last service date */
	public byte[] szServDate = new byte[CG4_MAX_STR_LEN];
	public CG4PropertyInfo() {
		super();
	}
	
	protected List<? > getFieldOrder() {
		return Arrays.asList("nResolution", "szMaker", "szModel", "szInterfaceType", "szSerial", "szVer", "szManDate", "szServDate");
	}
	/**
	 * @param nResolution 500 or 1000 ppi
	 * @param szMaker Device Maker
	 * @param szModel Device model type
	 * @param szInterfaceType Device interface type (USB, FireWire)
	 * @param szSerial Device serial no
	 * @param szVer Firmware version of scanner
	 * @param szManDate Manufacture date
	 * @param szServDate Last service date
	 */
	public CG4PropertyInfo(int nResolution, byte szMaker[], byte szModel[], byte szInterfaceType[], byte szSerial[], byte szVer[], byte szManDate[], byte szServDate[]) {
		super();
		this.nResolution = nResolution;
		if ((szMaker.length != this.szMaker.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szMaker = szMaker;
		if ((szModel.length != this.szModel.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szModel = szModel;
		if ((szInterfaceType.length != this.szInterfaceType.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szInterfaceType = szInterfaceType;
		if ((szSerial.length != this.szSerial.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szSerial = szSerial;
		if ((szVer.length != this.szVer.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szVer = szVer;
		if ((szManDate.length != this.szManDate.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szManDate = szManDate;
		if ((szServDate.length != this.szServDate.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szServDate = szServDate;
	}
	public CG4PropertyInfo(Pointer peer) {
		super(peer);
	}
	
	public int getResolution() {
		return nResolution;
	}
	public String getMaker() {
		return Native.toString(szMaker);
	}
	public String getModel() {
		return Native.toString(szModel);
	}
	public String getInterfaceType() {
		return Native.toString(szInterfaceType);
	}
	public String getSerial() {
		return Native.toString(szSerial);
	}
	public String getVer() {
		return Native.toString(szVer);
	}
	public String getManDate() {
		return Native.toString(szManDate);
	}
	public String getServDate() {
		return Native.toString(szServDate);
	}
	
	public static class ByReference extends CG4PropertyInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CG4PropertyInfo implements Structure.ByValue {
		
	};
}
