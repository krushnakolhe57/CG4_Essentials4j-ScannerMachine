package com.mmm.jna.cg4essentials;

/**
 * <i>native declaration : CG4EssentialsApi.h</i><br>
 * enum values
 */
public class CG4ScannerType {
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_ONE_FINGER = 300;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CSD301 = (int)CG4ScannerType.CG4_SCANNER_ONE_FINGER + 1;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CSD330 = (int)CG4ScannerType.CG4_SCANNER_ONE_FINGER + 2;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CSD200 = (int)CG4ScannerType.CG4_SCANNER_ONE_FINGER + 3;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CSD100 = (int)CG4ScannerType.CG4_SCANNER_ONE_FINGER + 4;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CSD301L = (int)CG4ScannerType.CG4_SCANNER_ONE_FINGER + 5;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CSD301B = (int)CG4ScannerType.CG4_SCANNER_ONE_FINGER + 6;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_TWO_FINGER = 400;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CSD450 = (int)CG4ScannerType.CG4_SCANNER_TWO_FINGER + 1;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CSD450K = (int)CG4ScannerType.CG4_SCANNER_TWO_FINGER + 2;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_FOUR_FINGER = 500;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CS500I = (int)CG4ScannerType.CG4_SCANNER_FOUR_FINGER + 1;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CS500E = (int)CG4ScannerType.CG4_SCANNER_FOUR_FINGER + 2;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CS1000E = (int)CG4ScannerType.CG4_SCANNER_FOUR_FINGER + 3;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_PALM = 600;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CS500P = (int)CG4ScannerType.CG4_SCANNER_PALM + 1;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CS1000P = (int)CG4ScannerType.CG4_SCANNER_PALM + 2;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_PENDING = 800;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_CS801B = (int)CG4ScannerType.CG4_SCANNER_PENDING + 1;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_SCANNER_NULL = -1;
	
	/**
	 * Get the name of the scanner type
	 */
	public static final String getName(int nScannerType) {
		switch(nScannerType) {
			case CG4_SCANNER_ONE_FINGER:
				return "CG4_SCANNER_ONE_FINGER";
			case CG4_SCANNER_CSD301:
				return "CG4_SCANNER_CSD301";
			case CG4_SCANNER_CSD330:
				return "CG4_SCANNER_CSD330";
			case CG4_SCANNER_CSD200:
				return "CG4_SCANNER_CSD200";
			case CG4_SCANNER_CSD100:
				return "CG4_SCANNER_CSD100";
			case CG4_SCANNER_CSD301L:
				return "CG4_SCANNER_CSD301L";
			case CG4_SCANNER_CSD301B:
				return "CG4_SCANNER_CSD301B";
			case CG4_SCANNER_TWO_FINGER:
				return "CG4_SCANNER_TWO_FINGER";
			case CG4_SCANNER_CSD450:
				return "CG4_SCANNER_CSD450";
			case CG4_SCANNER_CSD450K:
				return "CG4_SCANNER_CSD450K";
			case CG4_SCANNER_FOUR_FINGER:
				return "CG4_SCANNER_FOUR_FINGER";
			case CG4_SCANNER_CS500I:
				return "CG4_SCANNER_CS500I";
			case CG4_SCANNER_CS500E:
				return "CG4_SCANNER_CS500E";
			case CG4_SCANNER_CS1000E:
				return "CG4_SCANNER_CS1000E";
			case CG4_SCANNER_PALM:
				return "CG4_SCANNER_PALM";
			case CG4_SCANNER_CS500P:
				return "CG4_SCANNER_CS500P";
			case CG4_SCANNER_CS1000P:
				return "CG4_SCANNER_CS1000P";
			case CG4_SCANNER_PENDING:
				return "CG4_SCANNER_PENDING";
			case CG4_SCANNER_CS801B:
				return "CG4_SCANNER_CS801B";
			case CG4_SCANNER_NULL:
				return "CG4_SCANNER_NULL";
			default:
				return "Unknown";
		}
	}
};