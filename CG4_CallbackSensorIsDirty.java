package com.mmm.jna.cg4essentials;

import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary.StdCallCallback;

public interface CG4_CallbackSensorIsDirty extends StdCallCallback 
{
	/**
	 * Preview image available notification.
     * <p>
     * Original signature : <code>typedef void *CG4_CallbackSensorIsDirty(void *, int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param notUsed [in] Not Used
	 * @param nDirtyFlag [in] Denote if the sensor surface is dirty. 0 means clean surface, 1 means dirty surface
	 */
	void invoke(Pointer notUsed, int nDirtyFlag);
}
