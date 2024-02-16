package com.mmm.jna.cg4essentials;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.platform.win32.WinDef;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
/**
 * JNA Wrapper for library <b>CG4EssentialsApi</b>
 */
public interface CG4EssentialsApiLibrary extends StdCallLibrary {
	public static final String JNA_LIBRARY_NAME = "CG4EssentialsApi";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(CG4EssentialsApiLibrary.JNA_LIBRARY_NAME);
	public static final CG4EssentialsApiLibrary INSTANCE = (CG4EssentialsApiLibrary)Native.loadLibrary(CG4EssentialsApiLibrary.JNA_LIBRARY_NAME, CG4EssentialsApiLibrary.class);
	

	/**
	 * Get connected device count.
     * <p>
     * Original signature : <code>int CG4_Main_GetConnectedScanner(CG4ScannerExist *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param scannerExist [in,out] connected scanner; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Main_GetConnectedScanner(CG4ScannerExist.ByReference scannerExist);
	/**
	 * Get DLL version information.
     * <p>
     * Original signature : <code>int CG4_Main_GetAPIVersion(CG4ApiVersion *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param info [in,out] API version information; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Main_GetAPIVersion(CG4ApiVersion.ByReference info);
	/**
	 * Get Running information.
     * <p>
     * Original signature : <code>int CG4_Main_GetRunningInfo(CG4RunningInfo *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param info [in,out] Device running information; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Main_GetRunningInfo(CG4RunningInfo.ByReference info);
	/**
	 * Initialize scanner.
     * <p>
     * Original signature : <code>int CG4_Main_GetConnectedScanner(CG4ScannerType)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param ScannerType [in] scanner type; default value is CG_SCANNER_CS500I
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Main_Initialize(int ScannerType);
	/**
	 * DeInitialize scanner.
     * <p>
     * Original signature : <code>int CG4_Main_DeInitialize()</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Main_DeInitialize();
	/**
	 * Fast Startup scanner.
     * <p>
     * Original signature : <code>int CG4_Main_FastStartup(CG4ScannerType)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param ScannerType [in] scanner type; default value is CG_SCANNER_CS500I
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Main_FastStartup(int ScannerType);
	/**
	 * StandBy scanner.
     * <p>
     * Original signature : <code>int CG4_Main_StandBy()</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Main_StandBy();
	/**
	 * Retrieve detailed device information.
     * <p>
     * Original signature : <code>int CG4_Main_GetDeviceInfo(CG4PropertyInfo *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param info [in,out] Basic device information; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Main_GetDeviceInfo(CG4PropertyInfo.ByReference info);
	/**
	 * Set capture mode. This function needs to be called prior to CG4_CAPTURE_Start().
     * <p>
     * Original signature : <code>int CG4_Capture_SetMode(CG4ImageType, CG4ImageResolution, BOOL, BOOL, int *, int *, int *, int *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
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
	public int CG4_Capture_SetMode(int imageType, int imageResolution, boolean AutoCapture, boolean AutoContrast, IntBuffer resultWidth, IntBuffer resultHeight, IntBuffer baseResolutionX, IntBuffer baseResolutionY);
	/**
	 * Start image acquisition.
     * <p>
     * Original signature : <code>int CG4_Capture_Start(int, BOOL)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param numberOfObjects [in] Number of expected fingertips in the image
	 * @param AutoAcquireResultImage [in] Auto acquire result image flag
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_Start(int numberOfObjects, boolean AutoAcquireResultImage);
	/**
	 * Abort running image acquisition.
     * <p>
     * Original signature : <code>int CG4_Capture_Abort()</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_Abort();
	/**
	 * Initiate manual result image acquisition. This function needs to be called prior to CG4_Capture_AcquireResultImage().
     * <p>
     * Original signature : <code>int CG4_Capture_TakeResultImage()</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_TakeResultImage();
	/**
	 * Acquire the result image, it might take several seconds, expect a delay
     * <p>
     * Original signature : <code>int CG4_Capture_AcquireResultImage()</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_AcquireResultImage();
	/**
	 * Initiate manual contrast optimization.
     * <p>
     * Original signature : <code>int CG4_Capture_OptimizeContrast()</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_OptimizeContrast();
	/**
	 * Set active status LED's on device.
     * <p>
     * Original signature : <code>int CG4_Controls_SetStateLEDs(CG4ImageType, unsigned char *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param CapTypeApi [in] Image type to active status LED's
	 * @param StateLEDs [in] Show type of active LED's
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Controls_SetStateLEDs(int CapTypeApi, ByteBuffer StateLEDs);
	/**
	 * Set active LED's on device.
     * <p>
     * Original signature : <code>int CG4_Controls_SetLEDs(CG4LedType, int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param ledType [in] Show type of active LED's
	 * @param ledValue [in] Led's value
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Controls_SetLEDs(int ledType, int ledValue);
	/**
	 * Get active LED's on device.
     * <p>
     * Original signature : <code>int CG4_Controls_GetLEDs(CG4LedType, int *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param ledType [in] Show type of active LED's
	 * @param ledValue [in,out] Led's value
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Controls_GetLEDs(int ledType, IntBuffer ledValue);
	/**
	 * Send beep pattern to internal device beeper.
     * <p>
     * Original signature : <code>int CG4_Controls_Beeper(int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param BeepMode [in] Beeper mode
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Controls_Beeper(int BeepMode);
	/**
	 * Set captured flag is OK.
     * <p>
     * Original signature : <code>int CG4_Capture_SetCaptureOK()</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_SetCaptureOK();
	/**
	 * Set start rolling flag.
     * <p>
     * Original signature : <code>int CG4_Capture_SetStartRollingFlag(BOOL)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param flag [in] Flag to start rolling
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_SetStartRollingFlag(boolean flag);
	/**
	 * Get roll parameters.
     * <p>
     * Original signature : <code>int CG4_Capture_GetRollParameters(CgRollParameters *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param para [in,out] Roll construct parameters; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_GetRollParameters(CgRollParameters.ByReference para);
	/**
	 * Set roll parameters.
     * <p>
     * Original signature : <code>int CG4_Capture_SetRollParameters(CgRollParameters)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param para [in] Roll construct parameters
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_SetRollParameters(CgRollParameters.ByValue para);
	/**
	 * Calibrate scanner.
     * <p>
     * Original signature : <code>int CG4_Capture_Calibration()</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_Calibration();
	/**
	 * Register Footswitch information.
     * <p>
     * Original signature : <code>int CG4_Controls_RegisterFootSwitchInfo(HWND, UINT)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param hWnd [in] Windows handler to display live image
	 * @param Msg [in] Footswitch message id
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Controls_RegisterFootSwitchInfo(WinDef.HWND hWnd, int Msg);
	/**
	 * Callback preview image availability.
     * <p>
     * Original signature : <code>int CG4_Main_GetConnectedScanner(CG4_CallbackPreviewImage, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param callback [in] Pointer to the notification function 
	 * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
    public int CG4_Capture_RegisterCallbackPreviewImage(CG4_CallbackPreviewImage callback, Pointer notUsed);
    /**
	 * Callback for start of result image capture.
     * <p>
     * Original signature : <code>int CG4_Capture_RegisterCallbackTakingResultImage(CG4_CallbackTakingResultImage, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param callback [in] Pointer to the notification function 
	 * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
    public int CG4_Capture_RegisterCallbackTakingResultImage(CG4_CallbackTakingResultImage callback, Pointer notUsed);
    /**
	 * Callback for completion of result image acquisition.
     * <p>
     * Original signature : <code>int CG4_Capture_RegisterCallbackResultImage(CG4_CallbackResultImage, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param callback [in] Pointer to the notification function 
	 * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
    public int CG4_Capture_RegisterCallbackResultImage(CG4_CallbackResultImage callback, Pointer notUsed);
    /**
	 * Callback for message of trigger Footswitch.
     * <p>
     * Original signature : <code>int CG4_Capture_RegisterCallbackFootSwitch(CG4_CallbackFootSwitch, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param callback [in] Pointer to the notification function 
	 * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
    public int CG4_Capture_RegisterCallbackFootSwitch(CG4_CallbackFootSwitch callback, Pointer notUsed);
    /**
	 * Callback for message of trigger Keypad.
     * <p>
     * Original signature : <code>int CG4_Capture_RegisterCallbackKeypad(CG4_CallbackKeypad, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param callback [in] Pointer to the notification function 
	 * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
    public int CG4_Capture_RegisterCallbackKeypad(CG4_CallbackKeypad callback, Pointer notUsed);
    /**
	 * Register callback function for fingerprint qualities change during capture operation.
     * <p>
     * Original signature : <code>int CG4_Capture_RegisterCallbackObjectQuality(CG4_CallbackObjectQuality, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param callback [in] Pointer to the notification function 
	 * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
    public int CG4_Capture_RegisterCallbackObjectQuality(CG4_CallbackObjectQuality callback, Pointer notUsed);
    /**
	 * Register callback function for the current equipment is connected.
     * <p>
     * Original signature : <code>int CG4_Capture_RegisterCallbackDeviceIsConnected(CG4_CallbackDeviceIsConnected, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param callback [in] Pointer to the notification function 
	 * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
    public int CG4_Capture_RegisterCallbackDeviceIsConnected(CG4_CallbackDeviceIsConnected callback, Pointer notUsed);

    /**
	 * Get rolling mask image.
     * <p>
     * Original signature : <code>int CG4_Capture_GetImageMask(unsigned char *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param pImageMask [in,out] Rolling mask image; memory provided by caller!
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_GetImageMask(ByteBuffer pImageMask);

	/**
	 * Set auto capture information.
     * <p>
     * Original signature : <code>int CG4_Capture_SetAutoCapInfo(CG4AutoCapInfo)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param para [in] Auto capture information
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_SetAutoCapInfo(CG4AutoCapInfo.ByValue para);

	/**
	 * Set auto capture area information image.
     * <p>
     * Original signature : <code>int CG4_Capture_SetAutoCapArea(BOOL, int, int, int, int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param bAutoCapArea [in]  auto capture area flag
	 * @param xPos [in] x coordinate
	 * @param yPos [in] y coordinate
	 * @param width [in] the width of the area
	 * @param height [in] the height of the area
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_SetAutoCapArea(boolean bAutoCapArea, int xPos, int yPos, int width, int height);

	/**
	 * Set auto capture finger mask.
     * <p>
     * Original signature : <code>int CG4_Capture_SetAutoCapFinMask(int)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param nFinMask [in] finger mask.
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_SetAutoCapFinMask(int nFinMask);
	/**
	 * Set command mask.
     * <p>
     * Original signature : <code>int CG4_Control_CmdSetValue(DWORD)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param dwCommandMask [in] command mask.
     * @return Returns 0 if successful, error code Otherwise.
	 */
    public int CG4_Control_CmdSetValue(int dwCommandMask);
    
    /**
	 * Register callback function which is invoked when dirty sensor surface is detected.
     * <p>
     * Original signature : <code>int CG4_Capture_RegisterCallbackSensorIsDirty(CG4_CallbackSensorIsDirty, void *)</code><br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
     *
	 * @param callback [in] Callback function entry pointer
	 * @param notUsed [in] Not used
     * @return Returns 0 if successful, error code Otherwise.
	 */
	public int CG4_Capture_RegisterCallbackSensorIsDirty(CG4_CallbackSensorIsDirty callback, Pointer notUsed);
    
}
