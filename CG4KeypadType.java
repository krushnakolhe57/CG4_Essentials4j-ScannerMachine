package com.mmm.jna.cg4essentials;

/**
 * <i>native declaration : CG4EssentialsApi.h</i><br>
 * enum values
 */
public class CG4KeypadType {
	/** Keypad 'C' button */
	public static final int CG4_KEYPAD_C_KEYS = 0;
	/** Keypad 'D' button */
	public static final int CG4_KEYPAD_D_KEYS = 1;
	/** No keypad available */
	public static final int CG4_KEYPAD_NONE = 2;
	
	/**
	 * Get the name of the keypad type
	 */
	public static final String getName(int nKeypadType) {
		switch(nKeypadType) {
			case CG4_KEYPAD_C_KEYS:
				return "CG4_KEYPAD_C_KEYS";
			case CG4_KEYPAD_D_KEYS:
				return "CG4_KEYPAD_D_KEYS";
			case CG4_KEYPAD_NONE:
				return "CG4_KEYPAD_NONE";
			default:
				return "Unknown";
		}
	}
};
