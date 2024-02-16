package com.mmm.jna.cg4essentials;

/**
 * <i>native declaration : CG4EssentialsApi.h</i><br>
 * enum values
 */
public class CG4ObjectQualityState {
	/** Object not detected */
	public static final int CG4_OBJECT_NOT_PRESENT = 0;
	/** Object tracking OK */
	public static final int CG4_OBJECT_GOOD = 1;
	/** Object contrast too low */
	public static final int CG4_OBJECT_TOO_LIGHT = 2;
	/** Object contrast too dark  */
	public static final int CG4_OBJECT_TOO_DARK = 3;
	/** Object shape not OK */
	public static final int CG4_OBJECT_BAD_SHAPE = 4;
	/** Object position not within tracking area */
	public static final int CG4_OBJECT_POSITION_NOT_OK = 5;
	/** Object position too left */
	public static final int CG4_OBJECT_POSITION_TOO_LEFT = 6;
	/** Object position too right */
	public static final int CG4_OBJECT_POSITION_TOO_RIGHT = 7;
	/** Object core not found */
	public static final int CG4_OBJECT_CORE_NOT_PRESENT = 8;
	/** Required tracking time has not been reached yet */
	public static final int CG4_OBJECT_TRACKING_NOT_OK = 9;
	
	/**
	 * Get the name of the object quality state.
	 */
	public static final String getName(int nQualityState) {
		switch(nQualityState) {
			case CG4_OBJECT_NOT_PRESENT:
				return "CG4_OBJECT_NOT_PRESENT";
			case CG4_OBJECT_GOOD:
				return "CG4_OBJECT_GOOD";
			case CG4_OBJECT_TOO_LIGHT:
				return "CG4_OBJECT_TOO_LIGHT";
			case CG4_OBJECT_TOO_DARK:
				return "CG4_OBJECT_TOO_DARK";
			case CG4_OBJECT_BAD_SHAPE:
				return "CG4_OBJECT_BAD_SHAPE";
			case CG4_OBJECT_POSITION_NOT_OK:
				return "CG4_OBJECT_POSITION_NOT_OK";
			case CG4_OBJECT_POSITION_TOO_LEFT:
				return "CG4_OBJECT_POSITION_TOO_LEFT";
			case CG4_OBJECT_POSITION_TOO_RIGHT:
				return "CG4_OBJECT_POSITION_TOO_RIGHT";
			case CG4_OBJECT_CORE_NOT_PRESENT:
				return "CG4_OBJECT_CORE_NOT_PRESENT";
			case CG4_OBJECT_TRACKING_NOT_OK:
				return "CG4_OBJECT_TRACKING_NOT_OK";
			default:
				return "Unknown";
		}
	}
};
