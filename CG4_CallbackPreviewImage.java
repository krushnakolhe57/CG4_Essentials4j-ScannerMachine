package com.mmm.jna.cg4essentials;

import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary.StdCallCallback;

public interface CG4_CallbackPreviewImage extends StdCallCallback  
{
	/**
	 * Preview image available notification.
     * <p>
     * Original signature : <code>typedef void *CG4_CallbackPreviewImage(void*, ImageData)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param notUsed [in] Not Used
	 * @param image [in] Preview image (valid until callback function is exited)
	 */
	void invoke(Pointer notUsed, ImageData.ByValue image);
}
