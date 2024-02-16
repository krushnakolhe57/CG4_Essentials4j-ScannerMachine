package com.mmm.jna.cg4essentials;

import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary.StdCallCallback;

public interface CG4_CallbackResultImage extends StdCallCallback 
{
	/**
	 * Callback for start of result image capture.
     * <p>
     * Original signature : <code>typedef void *CG4_CallbackResultImage(void*, int, ImageData, int, int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param notUsed [in] Not Used
	 * @param imageStatus [in] Result image status value (value >= CG4_STATUS_OK indicates success)
	 * @param image [in] Preview image (valid until callback function is exited)
	 * @param imageType [in] Result image type (e.g. LSCAN_ROLL_SINGLE_FINGER)
	 * @param detectedObjects [in] Number of detected objects/fingers in result image
	 */
	void invoke(Pointer notUsed, int imageStatus, ImageData.ByValue image, int imageType, int detectedObjects);
}