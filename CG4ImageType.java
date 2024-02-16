package com.mmm.jna.cg4essentials;

/**
 * <i>native declaration : CG4EssentialsApi.h</i><br>
 * enum values
 */
public class CG4ImageType {
	/** Rolled finger print image */
	public static final int CG4_ROLL_SINGLE_FINGER = 0;
	/** Flat single finger */
	public static final int CG4_FLAT_SINGLE_FINGER = 1;
	/** Right flat fingers */
	public static final int CG4_FLAT_RIGHT_FINGERS = 2;
	/** Left flat fingers */
	public static final int CG4_FLAT_LEFT_FINGERS = 3;
	/** Two flat thumbs */
	public static final int CG4_FLAT_TWO_THUMBS = 4;
	/** Right thumb Rolled finger print image */
	public static final int CG4_ROLL_RIGHT_THUMB = 5;
	/** Left thumb Rolled finger print image */
	public static final int CG4_ROLL_LEFT_THUMB = 6;
	/** Full right palm */
	public static final int CG4_PALM_RIGHT_FULL = 7;
	/** Right writers palm */
	public static final int CG4_PALM_RIGHT_WRITERS = 8;
	/** Right lower palm */
	public static final int CG4_PALM_RIGHT_LOWER = 9;
	/** Right upper palm */
	public static final int CG4_PALM_RIGHT_UPPER = 10;
	/** Full left palm */
	public static final int CG4_PALM_LEFT_FULL = 11;
	/** Left writers palm */
	public static final int CG4_PALM_LEFT_WRITERS = 12;
	/** Left lower palm */
	public static final int CG4_PALM_LEFT_LOWER = 13;
	/** Left upper palm */
	public static final int CG4_PALM_LEFT_UPPER = 14;
	/** Right index Rolled finger print image */
	public static final int CG4_ROLL_RIGHT_INDEX = 15;
	/** Right middle Rolled finger print image */
	public static final int CG4_ROLL_RIGHT_MIDDLE = 16;
	/** Right ring Rolled finger print image */
	public static final int CG4_ROLL_RIGHT_RING = 17;
	/** Right small Rolled finger print image */
	public static final int CG4_ROLL_RIGHT_SMALL = 18;
	/** Left index Rolled finger print image */
	public static final int CG4_ROLL_LEFT_INDEX = 19;
	/** Left middle Rolled finger print image */
	public static final int CG4_ROLL_LEFT_MIDDLE = 20;
	/** Left ring Rolled finger print image */
	public static final int CG4_ROLL_LEFT_RING = 21;
	/** Left small Rolled finger print image */
	public static final int CG4_ROLL_LEFT_SMALL = 22;
	/** Right flat thumb */
	public static final int CG4_FLAT_RIGHT_THUMB = 23;
	/** Right flat index */
	public static final int CG4_FLAT_RIGHT_INDEX = 24;
	/** Right flat middle */
	public static final int CG4_FLAT_RIGHT_MIDDLE = 25;
	/** Right flat ring */
	public static final int CG4_FLAT_RIGHT_RING = 26;
	/** Right flat small */
	public static final int CG4_FLAT_RIGHT_SMALL = 27;
	/** Left flat thumb */
	public static final int CG4_FLAT_LEFT_THUMB = 28;
	/** Left flat index */
	public static final int CG4_FLAT_LEFT_INDEX = 29;
	/** Left flat middle */
	public static final int CG4_FLAT_LEFT_MIDDLE = 30;
	/** Left flat ring */
	public static final int CG4_FLAT_LEFT_RING = 31;
	/** Left flat small */
	public static final int CG4_FLAT_LEFT_SMALL = 32;
	public static final int CG4_FLAT_TWO_THUMBS_R_IndexMiddle = 33;
	public static final int CG4_FLAT_TWO_THUMBS_R_RingSmall = 34;
	public static final int CG4_FLAT_TWO_THUMBS_L_IndexMiddle = 35;
	public static final int CG4_FLAT_TWO_THUMBS_L_RingSmall = 36;
	/** No image (default after initialization) */
	public static final int CG4_TYPE_NONE = 37;
	
	/**
	 * Get the name of the image type
	 */
	public static final String getName(int nImageType) {
		switch(nImageType) {
			case CG4_ROLL_SINGLE_FINGER:
				return "CG4_ROLL_SINGLE_FINGER";
			case CG4_FLAT_SINGLE_FINGER:
				return "CG4_FLAT_SINGLE_FINGER";
			case CG4_FLAT_RIGHT_FINGERS:
				return "CG4_FLAT_RIGHT_FINGERS";
			case CG4_FLAT_LEFT_FINGERS:
				return "CG4_FLAT_LEFT_FINGERS";
			case CG4_FLAT_TWO_THUMBS:
				return "CG4_FLAT_TWO_THUMBS";
			case CG4_ROLL_RIGHT_THUMB:
				return "CG4_ROLL_RIGHT_THUMB";
			case CG4_ROLL_LEFT_THUMB:
				return "CG4_ROLL_LEFT_THUMB";
			case CG4_PALM_RIGHT_FULL:
				return "CG4_PALM_RIGHT_FULL";
			case CG4_PALM_RIGHT_WRITERS:
				return "CG4_PALM_RIGHT_WRITERS";
			case CG4_PALM_RIGHT_LOWER:
				return "CG4_PALM_RIGHT_LOWER";
			case CG4_PALM_RIGHT_UPPER:
				return "CG4_PALM_RIGHT_UPPER";
			case CG4_PALM_LEFT_FULL:
				return "CG4_PALM_LEFT_FULL";
			case CG4_PALM_LEFT_WRITERS:
				return "CG4_PALM_LEFT_WRITERS";
			case CG4_PALM_LEFT_LOWER:
				return "CG4_PALM_LEFT_LOWER";
			case CG4_PALM_LEFT_UPPER:
				return "CG4_PALM_LEFT_UPPER";
			case CG4_ROLL_RIGHT_INDEX:
				return "CG4_ROLL_RIGHT_INDEX";
			case CG4_ROLL_RIGHT_MIDDLE:
				return "CG4_ROLL_RIGHT_MIDDLE";
			case CG4_ROLL_RIGHT_RING:
				return "CG4_ROLL_RIGHT_RING";
			case CG4_ROLL_RIGHT_SMALL:
				return "CG4_ROLL_RIGHT_SMALL";
			case CG4_ROLL_LEFT_INDEX:
				return "CG4_ROLL_LEFT_INDEX";
			case CG4_ROLL_LEFT_MIDDLE:
				return "CG4_ROLL_LEFT_MIDDLE";
			case CG4_ROLL_LEFT_RING:
				return "CG4_ROLL_LEFT_RING";
			case CG4_ROLL_LEFT_SMALL:
				return "CG4_ROLL_LEFT_SMALL";
			case CG4_FLAT_RIGHT_THUMB:
				return "CG4_FLAT_RIGHT_THUMB";
			case CG4_FLAT_RIGHT_INDEX:
				return "CG4_FLAT_RIGHT_INDEX";
			case CG4_FLAT_RIGHT_MIDDLE:
				return "CG4_FLAT_RIGHT_MIDDLE";
			case CG4_FLAT_RIGHT_RING:
				return "CG4_FLAT_RIGHT_RING";
			case CG4_FLAT_RIGHT_SMALL:
				return "CG4_FLAT_RIGHT_SMALL";
			case CG4_FLAT_LEFT_THUMB:
				return "CG4_FLAT_LEFT_THUMB";
			case CG4_FLAT_LEFT_INDEX:
				return "CG4_FLAT_LEFT_INDEX";
			case CG4_FLAT_LEFT_MIDDLE:
				return "CG4_FLAT_LEFT_MIDDLE";
			case CG4_FLAT_LEFT_RING:
				return "CG4_FLAT_LEFT_RING";
			case CG4_FLAT_LEFT_SMALL:
				return "CG4_FLAT_LEFT_SMALL";
			case CG4_FLAT_TWO_THUMBS_R_IndexMiddle:
				return "CG4_FLAT_TWO_THUMBS_R_IndexMiddle";
			case CG4_FLAT_TWO_THUMBS_R_RingSmall:
				return "CG4_FLAT_TWO_THUMBS_R_RingSmall";
			case CG4_FLAT_TWO_THUMBS_L_IndexMiddle:
				return "CG4_FLAT_TWO_THUMBS_L_IndexMiddle";
			case CG4_FLAT_TWO_THUMBS_L_RingSmall:
				return "CG4_FLAT_TWO_THUMBS_L_RingSmall";
			case CG4_TYPE_NONE:
				return "CG4_TYPE_NONE";
			default:
				return "Unknown";
		}
	}
};