package com.mmm.jna.cg4essentials;

public class CG4CmdMask {
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_CMD_MASK = (int)0x0000;
	/** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_CMD_MASK_HALO = (int)0x0001;
    /** <i>native declaration : CG4EssentialsApi.h</i> */
	public static final int CG4_CMD_MASK_FAKE_DETECTION = (int)0x0002;
	
	/**
	 * Get the name of the command mask
	 */
	public static final String getName(int nCmdMask) {
		switch(nCmdMask) {
			case CG4_CMD_MASK:
				return "CG4_CMD_MASK";
			case CG4_CMD_MASK_HALO:
				return "CG4_CMD_MASK_HALO";
			case CG4_CMD_MASK_FAKE_DETECTION:
				return "CG4_CMD_MASK_FAKE_DETECTION";
			default:
				return "Unknown";
		}
	}
}
