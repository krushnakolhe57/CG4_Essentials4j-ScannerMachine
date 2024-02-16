package com.mmm.jna.cg4essentials;

/**
 * <i>native declaration : CG4EssentialsApi.h</i><br>
 * enum values
 */
public class CG4LedType {
	/** LEDs to indicate finger LEDs */
	public static final int CG4_LED_FINGER = 0;
	/** LEDs to indicate status LEDs */
	public static final int CG4_LED_STATUS = 1;
	/** LEDs to indicate extend LEDs */
	public static final int CG4_LED_EXTEND = 2;
	/** No LED field available */
	public static final int CG4_LED_NONE = 3;
	
	/**
	 * Get the name of the led type
	 */
	public static final String getName(int nLedType) {
		switch(nLedType) {
			case CG4_LED_FINGER:
				return "CG4_LED_FINGER";
			case CG4_LED_STATUS:
				return "CG4_LED_STATUS";
			case CG4_LED_EXTEND:
				return "CG4_LED_EXTEND";
			case CG4_LED_NONE:
				return "CG4_LED_NONE";
			default:
				return "Unknown";
		}
	}
};
