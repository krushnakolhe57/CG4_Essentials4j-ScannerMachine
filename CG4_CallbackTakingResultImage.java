package com.mmm.jna.cg4essentials;


import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary.StdCallCallback;

public interface CG4_CallbackTakingResultImage extends StdCallCallback 
{
	/**
	 * This notification is sent to indicate begin of result image acquisition.
     * <p>
     * Original signature : <code>typedef void *CG4_CallbackTakingResultImage(void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param notUsed [in] Not Used
	 */
	public void invoke(Pointer notUsed);
}
