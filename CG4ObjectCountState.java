package com.mmm.jna.cg4essentials;

/**
 * <i>native declaration : CG4EssentialsApi.h</i><br>
 * enum values
 */
public class CG4ObjectCountState {
	/** Object count is OK. */
	public static final int CG4_OBJECT_COUNT_OK = 0;
	/** Object count is too many objects. */
	public static final int CG4_TOO_MANY_OBJECTS = 1;
	/** Object count is too few objects. */
	public static final int CG4_TOO_FEW_OBJECTS = 2;
	
	/**
	 * Get the name of the object count state.
	 */
	public static final String getName(int nCountState) {
		switch(nCountState) {
			case CG4_OBJECT_COUNT_OK:
				return "CG4_OBJECT_COUNT_OK";
			case CG4_TOO_MANY_OBJECTS:
				return "CG4_TOO_MANY_OBJECTS";
			case CG4_TOO_FEW_OBJECTS:
				return "CG4_TOO_FEW_OBJECTS";
			default:
				return "Unknown";
		}
	}
};
