package com.mmm.jna.cg4essentials;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : CG4EssentialsApi.h</i>
 */
public class CG4ApiVersion extends Structure {
	private static final int CG4_MAX_STR_LEN = (int)128;
	/** Product version string */
	public byte[] Product = new byte[CG4_MAX_STR_LEN];
	/** SDK version string */
	public byte[] SdkVer = new byte[CG4_MAX_STR_LEN];
	/** ClydeMosaic.dll version string */
	public byte[] MosaicVer = new byte[CG4_MAX_STR_LEN];
	public CG4ApiVersion() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Product", "SdkVer", "MosaicVer");
	}
	/**
	 * @param Product Product version string
	 * @param SdkVer SDK version string
	 * @param MosaicVer ClydeMosaic.dll version string
	 */
	public CG4ApiVersion(byte Product[], byte SdkVer[], byte MosaicVer[]) {
		super();
		if ((Product.length != this.Product.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Product = Product;
		if ((SdkVer.length != this.SdkVer.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.SdkVer = SdkVer;
		if ((MosaicVer.length != this.MosaicVer.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.MosaicVer = MosaicVer;
	}
	public CG4ApiVersion(Pointer peer) {
		super(peer);
	}
	
	public String getProduct() {
		return Native.toString(Product);
	}
	public String getSdkVer() {
		return Native.toString(SdkVer);
	}
	public String getMosaicVer() {
		return Native.toString(MosaicVer);
	}
	
	public static class ByReference extends CG4ApiVersion implements Structure.ByReference {
		
	};
	public static class ByValue extends CG4ApiVersion implements Structure.ByValue {
		
	};
}
