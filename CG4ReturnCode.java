package com.mmm.jna.cg4essentials;

public class CG4ReturnCode {
	/** 
	 * Function completed successfully<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_STATUS_OK = (int)(0);
    
    /** <i>native declaration : CG4EssentialsApi.h</i> */
	//public static final int CG4_GENERIC_ERR = (int)(0);
    /** 
     * Invalid parameter value<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_INVALID_PARAM_VALUE = (int)((0) - 1);
    /** 
     * Insufficient memory<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MEM_ALLOC = (int)((0) - 2);
    /** 
     * Requested functionality isn't supported<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_NOT_SUPPORTED = (int)((0) - 3);
	/** 
	 * File open failed<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_FILE_OPEN = (int)((0) - 4);
    /**
     * File read failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i> 
     */
	public static final int CG4_ERR_FILE_READ = (int)((0) - 5);
    /** 
     * Resume thread failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_THREAD_RESUME_ERR = (int)((0) - 6);
	/** 
	 * Create thread failed<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_THREAD_CREATE_ERR = (int)((0) - 7);
    /**
     * Create event failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_EVENT_CREATE_ERR = (int)((0) - 8);
    /** 
     * Log level is lowly<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_LOG_LEVEL_LOW = (int)((0) - 9);
    /** 
     * Log directory is no exist<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_LOG_DIRECTORY_IS_NO_EXIST = (int)((0) - 10);
    /** 
     * Directory create failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_DIRECTORY_CREATE = (int)((0) - 11);
    /** 
     * File write failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_FILE_WRITE = (int)((0) - 12);
	
    /** <i>native declaration : CG4EssentialsApi.h</i> */
	//public static final int CG4_DEVICE_ERR = (int)(-600);
    /** 
     * Device communication failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_DEVICE_IO = (int)((-600) - 0);
    /** 
     * Command execution failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_COMMAND_FAILED = (int)((-600) - 1);
    /** 
     * Command execution timed out<br>
     * <i>native declaration : CG4EssentialsApi.h</i> 
     */
	public static final int CG4_ERR_COMMAND_TIMEOUT = (int)((-600) - 2);
    /** 
     * No device is detected/active<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_NO_DEVICE = (int)((-600) - 3);
	/** 
	 * No matching device is detected<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_NO_MATCHING_DEVICE = (int)((-600) - 4);
    /** 
     * Initialization failed because in use by another thread/process<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_DEVICE_ACTIVE = (int)((-600) - 5);
    /** 
     * Device needs to be initialized<br>
     * <i>native declaration : CG4EssentialsApi.h</i> 
     */
	public static final int CG4_ERR_NOT_INITIALIZED = (int)((-600) - 6);
	/** 
	 * Device is initialized<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_IS_INITIALIZED = (int)((-600) - 7);
    /** 
     * Another thread is currently using device functions<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_DEVICE_BUSY = (int)((-600) - 8);
	/** 
	 * No hardware support for requested function<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_NO_HARDWARE_SUPPORT = (int)((-600) - 9);
	/** 
	 * Device parameters can't be read<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_DEVICE_READ_PARAM = (int)((-600) - 10);
    /** 
     * Parameter write to device failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_DEVICE_WRITE_PARAM = (int)((-600) - 11);
    /** 
     * Parameter read from device is invalid<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_DEVICE_INVALID_PARAM = (int)((-600) - 12);
    /** 
     * No memory available for specified action (exceeded size)<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_DEVICE_INSUFFICIENT_MEMORY = (int)((-600) - 13);
    /** 
     * Device operation mode is incorrect<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_DEVICE_WRONG_OPERATION_MODE = (int)((-600) - 14);
    /** 
     * Device is capturing<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_IS_CAPTUREING = (int)((-600) - 15);
	/** 
	 * Device is not supported<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_DEVICE_NO_SUPPORT = (int)((-600) - 16);
	/** 
	 * To exceed the maximum of device number.<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_DEVICE_EXCEED_MAX = (int)((-600) - 17);
	/** 
	 * Invalid handle for device<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_HANDLE_INVALID = (int)((-600) - 18);
	/** 
	 * Input handle and current handle not match<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_HANDLE_NOT_MATCH = (int)((-600) - 19);
    /** 
     * Input auto capture area information error<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_AUTO_CAP_AREA_INFO = (int)((-600) - 20);
    /** 
     * No capture is running<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_NOT_CAPTURING = (int)((-600) - 21);
    /** 
     * Palm is Moving<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_CAPTURE_PALMMOVING = (int)((-600) - 22);
    /** 
     * Control stream failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_CONTROL_STREAM = (int)((-600) - 23);
    /** 
     * Set still stream information failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i> 
     */
	public static final int CG4_ERR_STILL_INFORMATION_SET = (int)((-600) - 24);
    /** 
     * Stuff and run stream failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_STUFF_AND_RUN_STREAM = (int)((-600) - 25);
    /** 
     * Set video property failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_SET_VIDEO_PROP = (int)((-600) - 26);
    /** 
     * Set exposure failed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_SET_EXPOSURE_FAILED = (int)((-600) - 27);
	/** 
	 * Setup DiEnum device information failed<br>
	 * <i>native declaration : CG4EssentialsApi.h</i> 
	 */
	public static final int CG4_ERR_SETUP_DI_ENUM_DEVICE_INFO = (int)((-600) - 28);
	/** 
	 * USB version is not supported<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_USB_VERSION_NO_SUPPORT = (int)((-600) - 29);
	/** 
	 * Invalid entry point<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_ENTRY_POINT_INVALID = (int)((-600) - 30);
	
	/** 
	 * Error<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_MOSAIC_ERR = (int)(-800);
	
	/** 
     * Invalid Input Parameters<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_InvalidInputParameters = (int)((-800) -1);
	/** 
     * Invalid Input Parameters1<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_InvalidInputParameters1 = (int)((-800) -2);
	/** 
     * Invalid Input Parameters2<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_InvalidInputParameters2 = (int)((-800) -3);
	/** 
     * Invalid Input Parameters3<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_InvalidInputParameters3 = (int)((-800) -4);
	/** 
     * Invalid Input Parameters4<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_InvalidInputParameters4 = (int)((-800) -5);
	/** 
     * Invalid Input Parameters5<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_InvalidInputParameters5 = (int)((-800) -6);
	/** 
     * Invalid Input Parameters6<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_InvalidInputParameters6 = (int)((-800) -7);
	/** 
     * Invalid Input Parameters7<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_InvalidInputParameters7 = (int)((-800) -8);
	/** 
     * Invalid Input Parameters8<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_InvalidInputParameters8 = (int)((-800) -9);
	/** 
     * Invalid Input Parameters9<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_InvalidInputParameters9 = (int)((-800) -10);
	/** 
     * Invalid Input Pointer<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_InvalidInputPointer = (int)((-800) -11);
	/** 
     * Can't Allocate Memory<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_CannotAllocateMemory = (int)((-800) -12);
	/** 
     * Can't Open File<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_CannotOpenFile = (int)((-800) -13);
	/** 
     * Can't Open Image File<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_CannotOpenImageFile = (int)((-800) -14);
	/** 
     * Can't Read Image Data<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_CannotReadImageData = (int)((-800) -15);
	/** 
     * Can't Open Capture Device, Please connect the fingerprint sensor to your computer or check whether its driver is installed<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_CannotOpenCaptureDevice = (int)((-800) -16);

    /** 
     * The sensor window might be dirty, please clean it before you capture fingerprints<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_DirtySensorWindow = (int)((-800) - 17);
	/** 
     * The sensor might be Low Contrast Please calibrate it<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_LowContrast = (int)((-800) - 18);
	/** 
     * The sensor might be Low Exposure Please calibrate it<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_LowExplosure = (int)((-800) - 19);
	/** 
     * The sensor might be Low Exposure Please calibrate it<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_LowBrightness = (int)((-800) - 20);
	/** 
     * If you have placed your finger quite hard on the sensor, then the brightness of the sensor might be too big or the contrast is too low<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_TooWhite = (int)((-800) - 21);
	/** 
     * The brightness of the sensor might be too small<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_TooDark = (int)((-800) - 22);
	/** 
     * If you have placed your finger quite hard on the sensor, then the contrast of the sensor is too low<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_SmallDynamicRange = (int)((-800) - 23);
	/** 
     * If you have placed your finger quite hard on the sensor, then the contrast of the sensor is too low<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_SmallVar = (int)((-800) - 24);

    /** 
     * Your rolling speed is too fast, please try pressing harder and rolling a little more slowly<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_TooFast = (int)((-800) - 25);
    /** 
     * Your rolling speed is too slow, please try rolling a little more faster<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_TooSlow = (int)((-800) - 26);
    /** 
     * Don't leave or roll backwards until you finish rolling all area of your finger<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_RollBack = (int)((-800) - 27);
    /** 
     * Don't slide your finger during rolling<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_Sliding = (int)((-800) - 28);
	/** 
     * Mosaicked image foreGound too small<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_MosaickedImageForeGoundTooSmall = (int)((-800) - 29);
	/** 
     * Mosaicked Foreground Width Too Small, please roll a little faster<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_MosaickedForeGoundWidthTooSmall = (int)((-800) - 30);
	/** 
     * Mosaicked Foreground Height Too Small<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_MosaickedForeGoundHeightTooSmall = (int)((-800) - 31);
	/** 
     * Mosaicked ForeGound Width Too Small because your finger left, rolled backwards or slide before complete fingerprint is sampled<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_MosaickedForeGoundWidthTooSmallEarlyAbort = (int)((-800) - 32);
	/** 
     * Mosaicked Image Center Too Low,please place your finger a little higher<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_MosaickedImageCenterTooLow = (int)((-800) - 33);
    /** 
     * Mosaicked Image Center Too High, please place your finger a little Lower<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_MosaickedImageCenterTooHigh = (int)((-800) - 34);
    /** 
     * Mosaicked Image Quality Too Low<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_MosaickedImageQualityTooLow = (int)((-800) - 35);
    /** 
     * Dry finger Please press harder or Calibrate the sensor with Lower sensor brightness and higher contrast<br>
     * <i>native declaration : CG4EssentialsApi.h</i> 
     */
	public static final int CG4_ERR_MOSAIC_DryFinger = (int)((-800) - 36);
    /** 
     * Wet finger Please press slighter or Calibrate the sensor Higher sensor brightness and higher contrast<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_WetFinger = (int)((-800) - 37);
    /** 
     * If your finger is on the sensor, please remove it from the sensor<br>
     * <i>native declaration : CG4EssentialsApi.h</i>
     */
	public static final int CG4_ERR_MOSAIC_DirtySensorWindow1 = (int)((-800) - 38);
	/** 
	 * Your finger is leaving<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_MOSAIC_FingerIsLeaving = (int)((-800) - 39);
	/** 
	 * Saturated<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_MOSAIC_Saturated = (int)((-800) - 40);
	/** 
	 * Too Many Defected Lines<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_MOSAIC_TooManyDefectedLines = (int)((-800) - 41);
	/** 
	 * Mosaicked Image Center Too Left, please place your finger a little right<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_MOSAIC_MosaickedImageCenterTooLeft = (int)((-800) - 42);
	/** 
	 * Mosaicked Image Center Too Right, please place your finger a little left<br>
	 * <i>native declaration : CG4EssentialsApi.h</i>
	 */
	public static final int CG4_ERR_MOSAIC_MosaickedImageCenterTooRight = (int)((-800) - 43);
	
	
	
	/**
	 * Get the name of the return code.
	 */
	public static final String getName(int nReturnCode) {
		switch(nReturnCode) {
			case CG4_STATUS_OK:
				return "CG4_STATUS_OK";
			case CG4_ERR_INVALID_PARAM_VALUE:
				return "CG4_ERR_INVALID_PARAM_VALUE";
			case CG4_ERR_MEM_ALLOC:
				return "CG4_ERR_MEM_ALLOC";
			case CG4_ERR_NOT_SUPPORTED:
				return "CG4_ERR_NOT_SUPPORTED";
			case CG4_ERR_FILE_OPEN:
				return "CG4_ERR_FILE_OPEN";
			case CG4_ERR_FILE_READ:
				return "CG4_ERR_FILE_READ";
			case CG4_ERR_THREAD_RESUME_ERR:
				return "CG4_ERR_THREAD_RESUME_ERR";
			case CG4_ERR_THREAD_CREATE_ERR:
				return "CG4_ERR_THREAD_CREATE_ERR";
			case CG4_ERR_EVENT_CREATE_ERR:
				return "CG4_ERR_EVENT_CREATE_ERR";
			case CG4_ERR_LOG_LEVEL_LOW:
				return "CG4_ERR_LOG_LEVEL_LOW";
			case CG4_ERR_LOG_DIRECTORY_IS_NO_EXIST:
				return "CG4_ERR_LOG_DIRECTORY_IS_NO_EXIST";
			case CG4_ERR_DIRECTORY_CREATE:
				return "CG4_ERR_DIRECTORY_CREATE";
			case CG4_ERR_FILE_WRITE:
				return "CG4_ERR_FILE_WRITE";
			
			//case CG4_DEVICE_ERR:
			//	return "CG4_DEVICE_ERR";
			case CG4_ERR_DEVICE_IO:
				return "CG4_ERR_DEVICE_IO";
			case CG4_ERR_COMMAND_FAILED:
				return "CG4_ERR_COMMAND_FAILED";
			case CG4_ERR_COMMAND_TIMEOUT:
				return "CG4_ERR_COMMAND_TIMEOUT";
			case CG4_ERR_NO_DEVICE:
				return "CG4_ERR_NO_DEVICE";
			case CG4_ERR_NO_MATCHING_DEVICE:
				return "CG4_ERR_NO_MATCHING_DEVICE";
			case CG4_ERR_DEVICE_ACTIVE:
				return "CG4_ERR_DEVICE_ACTIVE";
			case CG4_ERR_NOT_INITIALIZED:
				return "CG4_ERR_NOT_INITIALIZED";
			case CG4_ERR_IS_INITIALIZED:
				return "CG4_ERR_IS_INITIALIZED";
			case CG4_ERR_DEVICE_BUSY:
				return "CG4_ERR_DEVICE_BUSY";
			case CG4_ERR_NO_HARDWARE_SUPPORT:
				return "CG4_ERR_NO_HARDWARE_SUPPORT";
			case CG4_ERR_DEVICE_READ_PARAM:
				return "CG4_ERR_DEVICE_READ_PARAM";
			case CG4_ERR_DEVICE_WRITE_PARAM:
				return "CG4_ERR_DEVICE_WRITE_PARAM";
			case CG4_ERR_DEVICE_INVALID_PARAM:
				return "CG4_ERR_DEVICE_INVALID_PARAM";
			case CG4_ERR_DEVICE_INSUFFICIENT_MEMORY:
				return "CG4_ERR_DEVICE_INSUFFICIENT_MEMORY";
			case CG4_ERR_DEVICE_WRONG_OPERATION_MODE:
				return "CG4_ERR_DEVICE_WRONG_OPERATION_MODE";
			case CG4_ERR_IS_CAPTUREING:
				return "CG4_ERR_IS_CAPTUREING";
			case CG4_ERR_DEVICE_NO_SUPPORT:
				return "CG4_ERR_DEVICE_NO_SUPPORT";
			case CG4_ERR_DEVICE_EXCEED_MAX:
				return "CG4_ERR_DEVICE_EXCEED_MAX";
			case CG4_ERR_HANDLE_INVALID:
				return "CG4_ERR_HANDLE_INVALID";
			case CG4_ERR_HANDLE_NOT_MATCH:
				return "CG4_ERR_HANDLE_NOT_MATCH";
			case CG4_ERR_AUTO_CAP_AREA_INFO:
				return "CG4_ERR_AUTO_CAP_AREA_INFO";
			case CG4_ERR_NOT_CAPTURING:
				return "CG4_ERR_NOT_CAPTURING";
			case CG4_ERR_CAPTURE_PALMMOVING:
				return "CG4_ERR_CAPTURE_PALMMOVING";
			case CG4_ERR_CONTROL_STREAM:
				return "CG4_ERR_CONTROL_STREAM";
			case CG4_ERR_STILL_INFORMATION_SET:
				return "CG4_ERR_STILL_INFORMATION_SET";
			case CG4_ERR_STUFF_AND_RUN_STREAM:
				return "CG4_ERR_STUFF_AND_RUN_STREAM";
			case CG4_ERR_SET_VIDEO_PROP:
				return "CG4_ERR_SET_VIDEO_PROP";
			case CG4_ERR_SET_EXPOSURE_FAILED:
				return "CG4_ERR_SET_EXPOSURE_FAILED";
			case CG4_ERR_SETUP_DI_ENUM_DEVICE_INFO:
				return "CG4_ERR_SETUP_DI_ENUM_DEVICE_INFO";
			case CG4_ERR_USB_VERSION_NO_SUPPORT:
				return "CG4_ERR_USB_VERSION_NO_SUPPORT";
			case CG4_ERR_ENTRY_POINT_INVALID:
				return "CG4_ERR_ENTRY_POINT_INVALID";
			
				
			case CG4_ERR_MOSAIC_InvalidInputParameters:
				return "CG4_ERR_MOSAIC_InvalidInputParameters";
			case CG4_ERR_MOSAIC_InvalidInputParameters1:
				return "CG4_ERR_MOSAIC_InvalidInputParameters1";
			case CG4_ERR_MOSAIC_InvalidInputParameters2:
				return "CG4_ERR_MOSAIC_InvalidInputParameters2";
			case CG4_ERR_MOSAIC_InvalidInputParameters3:
				return "CG4_ERR_MOSAIC_InvalidInputParameters3";
			case CG4_ERR_MOSAIC_InvalidInputParameters4:
				return "CG4_ERR_MOSAIC_InvalidInputParameters4";
			case CG4_ERR_MOSAIC_InvalidInputParameters5:
				return "CG4_ERR_MOSAIC_InvalidInputParameters5";
			case CG4_ERR_MOSAIC_InvalidInputParameters6:
				return "CG4_ERR_MOSAIC_InvalidInputParameters6";
			case CG4_ERR_MOSAIC_InvalidInputParameters7:
				return "CG4_ERR_MOSAIC_InvalidInputParameters7";
			case CG4_ERR_MOSAIC_InvalidInputParameters8:
				return "CG4_ERR_MOSAIC_InvalidInputParameters8";
			case CG4_ERR_MOSAIC_InvalidInputParameters9:
				return "CG4_ERR_MOSAIC_InvalidInputParameters9";
			case CG4_ERR_MOSAIC_InvalidInputPointer:
				return "CG4_ERR_MOSAIC_InvalidInputPointer";
			case CG4_ERR_MOSAIC_CannotAllocateMemory:
				return "CG4_ERR_MOSAIC_CannotAllocateMemory";
			case CG4_ERR_MOSAIC_CannotOpenFile:
				return "CG4_ERR_MOSAIC_CannotOpenFile";
			case CG4_ERR_MOSAIC_CannotOpenImageFile:
				return "CG4_ERR_MOSAIC_CannotOpenImageFile";
			case CG4_ERR_MOSAIC_CannotReadImageData:
				return "CG4_ERR_MOSAIC_CannotReadImageData";
			case CG4_ERR_MOSAIC_CannotOpenCaptureDevice:
				return "CG4_ERR_MOSAIC_CannotOpenCaptureDevice";
			case CG4_ERR_MOSAIC_DirtySensorWindow:
				return "CG4_ERR_MOSAIC_DirtySensorWindow";
			case CG4_ERR_MOSAIC_LowContrast:
				return "CG4_ERR_MOSAIC_LowContrast";
			case CG4_ERR_MOSAIC_LowExplosure:
				return "CG4_ERR_MOSAIC_LowExplosure";
			case CG4_ERR_MOSAIC_LowBrightness:
				return "CG4_ERR_MOSAIC_LowBrightness";
			case CG4_ERR_MOSAIC_TooWhite:
				return "CG4_ERR_MOSAIC_TooWhite";
			case CG4_ERR_MOSAIC_TooDark:
				return "CG4_ERR_MOSAIC_TooDark";
			case CG4_ERR_MOSAIC_SmallDynamicRange:
				return "CG4_ERR_MOSAIC_SmallDynamicRange";
			case CG4_ERR_MOSAIC_SmallVar:
				return "CG4_ERR_MOSAIC_SmallVar";
			case CG4_ERR_MOSAIC_TooFast:
				return "CG4_ERR_MOSAIC_TooFast";
			case CG4_ERR_MOSAIC_TooSlow:
				return "CG4_ERR_MOSAIC_TooSlow";
			case CG4_ERR_MOSAIC_RollBack:
				return "CG4_ERR_MOSAIC_RollBack";
			case CG4_ERR_MOSAIC_Sliding:
				return "CG4_ERR_MOSAIC_Sliding";
			case CG4_ERR_MOSAIC_MosaickedImageForeGoundTooSmall:
				return "CG4_ERR_MOSAIC_MosaickedImageForeGoundTooSmall";
			case CG4_ERR_MOSAIC_MosaickedForeGoundWidthTooSmall:
				return "CG4_ERR_MOSAIC_MosaickedForeGoundWidthTooSmall";
			case CG4_ERR_MOSAIC_MosaickedForeGoundHeightTooSmall:
				return "CG4_ERR_MOSAIC_MosaickedForeGoundHeightTooSmall";
			case CG4_ERR_MOSAIC_MosaickedForeGoundWidthTooSmallEarlyAbort:
				return "CG4_ERR_MOSAIC_MosaickedForeGoundWidthTooSmallEarlyAbort";
			case CG4_ERR_MOSAIC_MosaickedImageCenterTooLow:
				return "CG4_ERR_MOSAIC_MosaickedImageCenterTooLow";
			case CG4_ERR_MOSAIC_MosaickedImageCenterTooHigh:
				return "CG4_ERR_MOSAIC_MosaickedImageCenterTooHigh";
			case CG4_ERR_MOSAIC_MosaickedImageQualityTooLow:
				return "CG4_ERR_MOSAIC_MosaickedImageQualityTooLow";
			case CG4_ERR_MOSAIC_DryFinger:
				return "CG4_ERR_MOSAIC_DryFinger";
			case CG4_ERR_MOSAIC_WetFinger:
				return "CG4_ERR_MOSAIC_WetFinger";
			case CG4_ERR_MOSAIC_DirtySensorWindow1:
				return "CG4_ERR_MOSAIC_DirtySensorWindow1";
			case CG4_ERR_MOSAIC_FingerIsLeaving:
				return "CG4_ERR_MOSAIC_FingerIsLeaving";
			case CG4_ERR_MOSAIC_Saturated:
				return "CG4_ERR_MOSAIC_Saturated";
			case CG4_ERR_MOSAIC_TooManyDefectedLines:
				return "CG4_ERR_MOSAIC_TooManyDefectedLines";
			case CG4_ERR_MOSAIC_MosaickedImageCenterTooLeft:
				return "CG4_ERR_MOSAIC_MosaickedImageCenterTooLeft";
			case CG4_ERR_MOSAIC_MosaickedImageCenterTooRight:
				return "CG4_ERR_MOSAIC_MosaickedImageCenterTooRight";
			default:
				return "Unknown";
		}
	}
}
