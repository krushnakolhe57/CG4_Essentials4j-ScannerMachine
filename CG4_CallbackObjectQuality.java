package com.mmm.jna.cg4essentials;

import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary.StdCallCallback;

public interface CG4_CallbackObjectQuality extends StdCallCallback 
{
	/**
	 * Fingerprint quality change notification.
     * <p>
     * Original signature : <code>typedef void *CG4_CallbackObjectQuality(void*, CG4ObjectCountState, CG4ObjectQualityState *, int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param notUsed [in] Not Used
	 * @param fingerCountState [in] Finger count state (OK, too few, too many)
	 * @param QualityArray [in] Pointer to an array of finger tip quality states (array size in quality count)
	 * @param qualityCount [in] Size of fingerprint quality array
	 */
	void invoke(Pointer notUsed, int fingerCountState, Pointer QualityArray, int qualityCount);
}