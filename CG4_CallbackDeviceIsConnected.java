package com.mmm.jna.cg4essentials;

import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary.StdCallCallback;

public interface CG4_CallbackDeviceIsConnected extends StdCallCallback  
{
	/**
	 * Is connected the current device?
     * <p>
     * Original signature : <code>typedef void *CG4_CallbackDeviceIsConnected(void *, BOOL)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param notUsed [in] Not Used
	 * @param bIsExist [in] Flag to indicate if the current equipment is exist or not.
	 */
	void invoke(Pointer notUsed, boolean bIsExist);
}
