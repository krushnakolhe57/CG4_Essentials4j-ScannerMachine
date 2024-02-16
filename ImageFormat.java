package com.mmm.jna.cg4essentials;

/**
 * <i>native declaration : CG4EssentialsApi.h</i><br>
 * enum values
 */
public class ImageFormat {
	/** Gray scale image */
	public static final int IMG_FORMAT_GRAY = 0;
	/** 24 bit RGB color image */
	public static final int IMG_FORMAT_RGB24 = 1;
	/** True color RGB image */
	public static final int IMG_FORMAT_RGB32 = 2;
	
	/**
	 * Get the name of the image format.
	 */
	public static final String getName(int nImageFormat) {
		switch(nImageFormat) {
			case IMG_FORMAT_GRAY:
				return "IMG_FORMAT_GRAY";
			case IMG_FORMAT_RGB24:
				return "IMG_FORMAT_RGB24";
			case IMG_FORMAT_RGB32:
				return "IMG_FORMAT_RGB32";
			default:
				return "Unknown";
		}
	}
};
