package com.mmm.jna.cg4essentials;

import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary.StdCallCallback;

public interface CG4_CallbackKeypad extends StdCallCallback 
{
	/**
	 * This notification is sent to indicate message of trigger Keypad.
     * <p>
     * Original signature : <code>typedef void *CG4_CallbackKeypad(void*, CG4KeypadType)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param notUsed [in] Not Used
	 * @param keypadType [in] current key type
	 */
	void invoke(Pointer notUsed, int keypadType);
}
