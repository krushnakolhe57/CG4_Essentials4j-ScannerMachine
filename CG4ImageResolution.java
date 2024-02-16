package com.mmm.jna.cg4essentials;

/**
 * <i>native declaration : CG4EssentialsApi.h</i><br>
 * enum values
 */
public class CG4ImageResolution {
	/** 500ppi */
	public static final int CG4_IMAGE_RESOLUTION_500 = 500;
	/** 1000ppi */
	public static final int CG4_IMAGE_RESOLUTION_1000 = 1000;
	
	/**
	 * Get the name of the image resolution
	 */
	public static final String getName(int nImageResolution) {
		switch(nImageResolution) {
			case CG4_IMAGE_RESOLUTION_500:
				return "CG4_IMAGE_RESOLUTION_500";
			case CG4_IMAGE_RESOLUTION_1000:
				return "CG4_IMAGE_RESOLUTION_1000";
			default:
				return "Unknown";
		}
	}
};
