package com.mmm.jna.cg4essentials;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.platform.win32.WinDef;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
/**
 * JNA Wrapper for library <b>CG4EssentialsApiM</b>
 */
public interface CG4EssentialsApiMLibrary extends StdCallLibrary {
	public static final String JNA_LIBRARY_NAME = "CG4EssentialsApi";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(CG4EssentialsApiMLibrary.JNA_LIBRARY_NAME);
	public static final CG4EssentialsApiMLibrary INSTANCE = (CG4EssentialsApiMLibrary)Native.loadLibrary(CG4EssentialsApiMLibrary.JNA_LIBRARY_NAME, CG4EssentialsApiMLibrary.class);
	/** <i>native declaration : CG4EssentialsApiM.h</i> */
	public static final int CG4_MAX_DEVICE_NUM = (int)10;
	
	/**
	 * Get connected device count.
     * <p>
     * Original signature : <code>int CG4_M_Main_GetConnectedScanner(CG4ScannerExist *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param scannerExist [in,out] connected scanner; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Main_GetConnectedScanner(CG4MScannerExist.ByReference scannerExist);
	/**
	 * Get DLL version information.
     * <p>
     * Original signature : <code>int CG4_M_Main_GetAPIVersion(CG4ApiVersion *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param info [in,out] API version information; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Main_GetAPIVersion(CG4ApiVersion.ByReference info);
	/**
	 * Get Running information.
     * <p>
     * Original signature : <code>int CG4_M_Main_GetRunningInfo(int, CG4RunningInfo *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
	 * @param info [in,out] Device running information; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Main_GetRunningInfo(int handle, CG4RunningInfo.ByReference info);
	/**
	 * Initialize scanner.
     * <p>
     * Original signature : <code>int CG4_M_Main_Initialize(int, int *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param deviceIndex [in] Zero-based device index for device to init
	 * @param handle [in,out] Function returns device handle to be used for subsequent function calls
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Main_Initialize(int deviceIndex, IntBuffer handle);
	/**
	 * DeInitialize scanner.
     * <p>
     * Original signature : <code>int CG4_M_Main_DeInitialize()</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in,out] Device handle obtained by CG4_M_Main_Initialize()
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Main_DeInitialize(int handle);
	/**
	 * DeInitialize all currently initialized scanner.
     * <p>
     * Original signature : <code>int CG4_M_Main_DeInitializeAll()</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Main_DeInitializeAll();
	/**
	 * Check if device is fully initialized.
     * <p>
     * Original signature : <code>int CG4_M_Main_IsInitialized(int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Main_IsInitialized(int handle);
	/**
	 * Retrieve detailed device information.
     * <p>
     * Original signature : <code>int CG4_M_Main_GetDeviceInfo(int, CG4PropertyInfo *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param info [in,out] Basic device information; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Main_GetDeviceInfo(int handle, CG4PropertyInfo.ByReference info);
	/**
	 * Set capture mode. This function needs to be called prior to CG4_M_Capture_Start().
     * <p>
     * Original signature : <code>int CG4_M_Capture_SetMode(int, CG4ImageType, CG4ImageResolution, BOOL, BOOL, int, int, int, int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param imageType [in] Image type to capture
     * @param imageResolution [in] Requested capture resolution
     * @param AutoCapture [in] Flag to auto capture
     * @param AutoContrast [in] Flag to auto contrast
     * @param resultWidth [in,out] Returns width of captured result image in pixels
     * @param resultHeight [in,out] Returns height of captured result image in pixels
     * @param baseResolutionX [in,out] Returns image horizontal base resolution before processing
     * @param baseResolutionY [in,out] Returns image vertical base resolution before processing
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_SetMode(int handle, int imageType, int imageResolution, boolean AutoCapture, boolean AutoContrast, IntBuffer resultWidth, IntBuffer resultHeight, IntBuffer baseResolutionX, IntBuffer baseResolutionY);
	/**
	 * Start image acquisition.
     * <p>
     * Original signature : <code>int CG4_M_Capture_Start(int, int, BOOL)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param numberOfObjects [in] Number of expected fingerprints in the image
     * @param AutoAcquireResultImage [in] Auto acquire result image flag
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_Start(int handle, int numberOfObjects, boolean AutoAcquireResultImage);
	/**
	 * Abort running image acquisition.
     * <p>
     * Original signature : <code>int CG4_M_Capture_Abort(int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_Abort(int handle);
	/**
	 * Initiate manual result image acquisition. This function needs to be called prior to CG4_M_Capture_AcquireResultImage(). 
     * <p>
     * Original signature : <code>int CG4_M_Capture_TakeResultImage(int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_TakeResultImage(int handle);
	/**
	 * Acquire the result image, it might take several seconds, expect a delay
     * <p>
     * Original signature : <code>int CG4_M_Capture_AcquireResultImage(int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_AcquireResultImage(int handle);
	/**
	 * Acquire the result image, it might take several seconds, expect a delay
     * <p>
     * Original signature : <code>int CG4_M_Controls_SetStateLEDs(int, CG4ImageType, unsigend char *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param CapTypeApi [in] Image type to active status LED's
     * @param StateLEDs [in] show type of active LED's
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Controls_SetStateLEDs(int handle, int CapTypeApi, ByteBuffer StateLEDs);
	/**
	 * Set active LED's on the device.
     * <p>
     * Original signature : <code>int CG4_M_Controls_SetLEDs(int, CG4LedType, int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param ledType [in] Show type of active LED's
     * @param ledValue [in] Value of the status LED
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Controls_SetLEDs(int handle, int ledType, int ledValue);
	/**
	 * Get active LED's on the device.
     * <p>
     * Original signature : <code>int CG4_M_Controls_GetLEDs(int, CG4LedType, int *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param ledType [in] Show type of active LED's
     * @param ledValue [in,out] Led's value
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Controls_GetLEDs(int handle, int ledType, IntBuffer ledValue);
	/**
	 * Send beep pattern to internal device beeper.
     * <p>
     * Original signature : <code>int CG4_M_Controls_Beeper(int, int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param BeepMode [in] Beeper mode
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Controls_Beeper(int handle, int BeepMode);
	/**
	 * Set captured flag is OK.
     * <p>
     * Original signature : <code>int CG4_M_Capture_SetCaptureOK(int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_SetCaptureOK(int handle);
	/**
	 * Set start rolling flag.
     * <p>
     * Original signature : <code>int CG4_M_Capture_SetStartRollingFlag(int, BOOL)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param flag [in] Flag to start rolling
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_SetStartRollingFlag(int handle, boolean flag);
	/**
	 * Get roll parameters.
     * <p>
     * Original signature : <code>int CG4_M_Capture_GetRollParameters(int, CgRollParameters *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param para [in,out] Roll construct parameters; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_GetRollParameters(int handle, CgRollParameters.ByReference para);
	/**
	 * Set roll parameters.
     * <p>
     * Original signature : <code>int CG4_M_Capture_SetRollParameters(int, CgRollParameters)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param para [in] Roll construct parameters
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_SetRollParameters(int handle, CgRollParameters.ByValue para);
	/**
	 * Calibrate scanner.
     * <p>
     * Original signature : <code>int CG4_M_Capture_Calibration(int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_Calibration(int handle);
	/**
	 * Register Footswitch information.
     * <p>
     * Original signature : <code>int CG4_M_Controls_RegisterFootSwitchInfo(int, HWND, UINT)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param hWnd [in] Windows handler to display live image
     * @param Msg [in] Footswitch message id
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Controls_RegisterFootSwitchInfo(int handle, WinDef.HWND hWnd, int Msg);
    
	/**
	 * Callback preview image availability.
     * <p>
     * Original signature : <code>int CG4_M_Capture_RegisterCallbackPreviewImage(int, CG4_CallbackPreviewImage, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param callback [in] Pointer to the notification function
     * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_RegisterCallbackPreviewImage(int handle, CG4_CallbackPreviewImage callback, Pointer notUsed);
    
	/**
	 * Callback for start of result image capture.
     * <p>
     * Original signature : <code>int CG4_M_Capture_RegisterCallbackTakingResultImage(int, CG4_CallbackTakingResultImage, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param callback [in] Pointer to the notification function
     * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_RegisterCallbackTakingResultImage(int handle, CG4_CallbackTakingResultImage callback, Pointer notUsed);
    	
	/**
	 * Callback for completion of result image acquisition.
     * <p>
     * Original signature : <code>int CG4_M_Capture_RegisterCallbackResultImage(int, CG4_CallbackResultImage, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param callback [in] Pointer to the notification function
     * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_RegisterCallbackResultImage(int handle, CG4_CallbackResultImage callback, Pointer notUsed);
    
	/**
	 * Callback for message of trigger Footswitch.
     * <p>
     * Original signature : <code>int CG4_M_Capture_RegisterCallbackFootSwitch(int, CG4_CallbackFootSwitch, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param callback [in] Pointer to the notification function
     * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_RegisterCallbackFootSwitch(int handle, CG4_CallbackFootSwitch callback, Pointer notUsed);
    
	
	/**
	 * Callback for message of trigger Keypad.
     * <p>
     * Original signature : <code>int CG4_M_Capture_RegisterCallbackKeypad(int, CG4_CallbackKeypad, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param callback [in] Pointer to the notification function
     * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_RegisterCallbackKeypad(int handle, CG4_CallbackKeypad callback, Pointer notUsed);
    
	
	/**
	 * Register callback function for fingerprint qualities change during capture operation.
     * <p>
     * Original signature : <code>int CG4_M_Capture_RegisterCallbackObjectQuality(int, CG4_CallbackObjectQuality, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param callback [in] Pointer to the notification function
     * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_RegisterCallbackObjectQuality(int handle, CG4_CallbackObjectQuality callback, Pointer notUsed);
    
	
	/**
	 * Register callback function for the current equipment is exist.
     * <p>
     * Original signature : <code>int CG4_M_Capture_RegisterCallbackDeviceIsConnected(int, CG4_CallbackDeviceIsConnected, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param callback [in] Pointer to the notification function
     * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_RegisterCallbackDeviceIsConnected(int handle, CG4_CallbackDeviceIsConnected callback, Pointer notUsed);

	/**
	 * Get rolling mask image.
     * <p>
     * Original signature : <code>int CG4_M_Capture_GetImageMask(int, unsigned char *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param pImageMask [in,out] Rolling mask image; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_GetImageMask(int handle, ByteBuffer pImageMask);
	/**
	 * Set auto capture information.
     * <p>
     * Original signature : <code>int CG4_M_Capture_SetAutoCapInfo(int, CG4AutoCapInfo)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param para [in] Auto capture information
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_SetAutoCapInfo(int handle, CG4AutoCapInfo.ByValue para);
	/**
	 * Set auto capture area information image.
     * <p>
     * Original signature : <code>int CG4_M_Capture_SetAutoCapArea(int, BOOL, int, int, int, int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param bAutoCapArea [in] auto capture area flag
     * @param xPos [in] x coordinate
     * @param yPos [in] y coordinate
     * @param width [in] The width of the area
     * @param height [in] The height of the area
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_SetAutoCapArea(int handle, boolean bAutoCapArea, int xPos, int yPos, int width, int height);
	/**
	 * Set auto capture finger mask.
     * <p>
     * Original signature : <code>int CG4_M_Capture_SetAutoCapFinMask(int, int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param nFinMask [in] Finger mask.
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_SetAutoCapFinMask(int handle, int nFinMask);
	/**
	 * Set command mask.
     * <p>
     * Original signature : <code>int CG4_M_Control_CmdSetValue(int, DWORD)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param dwCommandMask [in] command mask.
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Control_CmdSetValue(int handle, int dwCommandMask);
    
	
	/**
	 * Register callback function which is invoked when dirty sensor surface is detected.
     * <p>
     * Original signature : <code>int CG4_M_Capture_RegisterCallbackSensorIsDirty(int, CG4_CallbackSensorIsDirty, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @param handle [in] Device handle obtained by CG4_M_Main_Initialize()
     * @param callback [in] Callback function entry pointer
     * @param notUsed [in] Not used.
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_M_Capture_RegisterCallbackSensorIsDirty(int handle, CG4_CallbackSensorIsDirty callback, Pointer notUsed);
	
}
