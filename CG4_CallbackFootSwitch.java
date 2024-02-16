package com.mmm.jna.cg4essentials;

import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary.StdCallCallback;

public interface CG4_CallbackFootSwitch extends StdCallCallback 
{
	/**
	 * This notification is sent to indicate message of trigger Footswitch.
     * <p>
     * Original signature : <code>typedef void *CG4_CallbackFootSwitch(void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param notUsed [in] Not Used
	 */
	void invoke(Pointer notUsed);
}
