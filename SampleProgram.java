package com.mmm.jna.cg4essentials.example;

import com.mmm.jna.cg4essentials.*;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.io.File;
import java.nio.IntBuffer;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleProgram extends JFrame{
	
//	static {
//		
//		System.loadLibrary("/cg4essentials4j/src/main/resources/CG4EssentialsApi.dll");
//		System.loadLibrary("/cg4essentials4j/src/main/resources/ClydeMosaic.dll");
//		System.loadLibrary("/cg4essentials4j/src/main/resources/ResolutionImprove.dll");
//		
//	}
	CG4EssentialsApiLibrary cg4 = CG4EssentialsApiLibrary.INSTANCE;
	CG4EssentialsApiMLibrary cg4M = CG4EssentialsApiMLibrary.INSTANCE;
	private int nDeviceId = 0;
	private int scannerType = CG4ScannerType.CG4_SCANNER_NULL;
	
	private JPanel contentPane;
	private JComboBox<String> comboBoxDeviceId;
	private JTextArea textAreaInfo;
	private JComboBox<String> comboBoxImageType;
	private JCheckBox chckbxAutoCapture;
	private JSpinner spinnerNumberOfObjects;
	private JSpinner spinnerBeep;
	private JTextField textFieldFingerLeds;
	private JTextField textFieldStatusLeds;
	private JTextField textFieldExtendLeds;
	private JLabel labelImage;
	
	private JTextField textFieldDeviceStatus;
 	private JTextField textFieldObjectQualityStatus;
 	
 	private final CG4_CallbackPreviewImage callbackPreviewImage = new CG4_CallbackPreviewImage() { 
		 public void invoke(Pointer notUsed, ImageData.ByValue image) {
			 previewImageCallback(notUsed, image); 
	}};
	
	private final CG4_CallbackTakingResultImage callbackTakingResultImage = new CG4_CallbackTakingResultImage() { 
		 public void invoke(Pointer notUsed) {
			 takingResultImageCallback(notUsed); 
	}};
	
	private final CG4_CallbackResultImage callbackResultImage = new CG4_CallbackResultImage() { 
		 public void invoke(Pointer notUsed, int imageStatus, ImageData.ByValue image, int imageType, int detectedObjects) {
			 resultImageCallback(notUsed, imageStatus, image, imageType, detectedObjects); 
	}};
	
	private final CG4_CallbackFootSwitch callbackFootSwitch = new CG4_CallbackFootSwitch() { 
		 public void invoke(Pointer notUsed) {
			 footSwitchCallback(notUsed); 
 	}};
 	
 	private final CG4_CallbackKeypad callbackKeypad = new CG4_CallbackKeypad() { 
		 public void invoke(Pointer notUsed, int keypadType) {
			 keypadCallback(notUsed, keypadType); 
	}};
	
	private final CG4_CallbackObjectQuality callbackObjectQuality = new CG4_CallbackObjectQuality() { 
		 public void invoke(Pointer notUsed, int fingerCountState, Pointer QualityArray, int qualityCount) {
			 objectQualityCallback(notUsed, fingerCountState, QualityArray, qualityCount); 
	}};
	
	private final CG4_CallbackSensorIsDirty callbackSensorIsDirty = new CG4_CallbackSensorIsDirty() { 
		 public void invoke(Pointer notUsed, int nDirtyFlag) {
			 sensorIsDirtyCallback(notUsed, nDirtyFlag); 
 	}};
	
	private final CG4_CallbackDeviceIsConnected callbackDeviceIsConnected = new CG4_CallbackDeviceIsConnected() { 
		 public void invoke(Pointer notUsed, boolean bIsExist) {
			 deviceIsConnectedCallback(notUsed, bIsExist); 
	}};


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SampleProgram frame = new SampleProgram();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SampleProgram() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				setComboDeviceId();
				comboBoxImageType.addItem("FLAT_MODE");
				comboBoxImageType.addItem("ROLL_MODE");
				comboBoxImageType.setSelectedIndex(0);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Main", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 495, 141);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDeviceId = new JLabel("Device ID:");
		lblDeviceId.setBounds(139, 24, 58, 14);
		panel.add(lblDeviceId);
		
		JButton btnInitialize = new JButton("Initialize");
		btnInitialize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				initialize();
			}
		});
		btnInitialize.setBounds(20, 67, 147, 23);
		panel.add(btnInitialize);
		
		JButton btnRelease = new JButton("Release");
		btnRelease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				release();
			}
		});
		btnRelease.setBounds(177, 67, 147, 23);
		panel.add(btnRelease);
		
		JButton btnGetDeviceInfo = new JButton("Get Device Info");
		btnGetDeviceInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showDeviceInfo();
			}
		});
		btnGetDeviceInfo.setBounds(20, 101, 147, 23);
		panel.add(btnGetDeviceInfo);
		
		JButton btnGetApiVersion = new JButton("Get API Version");
		btnGetApiVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showApiVersion();
			}
		});
		btnGetApiVersion.setBounds(177, 101, 147, 23);
		panel.add(btnGetApiVersion);
		
		comboBoxDeviceId = new JComboBox<String>();
		comboBoxDeviceId.setBounds(207, 21, 138, 20);
		panel.add(comboBoxDeviceId);
		
		JButton btnReleaseAll = new JButton("Release All");
		btnReleaseAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				releaseAll();
			}
		});
		btnReleaseAll.setBounds(334, 67, 151, 23);
		panel.add(btnReleaseAll);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Capture", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 163, 495, 160);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnSetMode = new JButton("Set Mode");
		btnSetMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMode();
			}
		});
		btnSetMode.setBounds(20, 21, 147, 23);
		panel_1.add(btnSetMode);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StartCapture();
			}
		});
		btnStart.setBounds(20, 55, 147, 23);
		panel_1.add(btnStart);
		
		JButton btnTakeResultImage = new JButton("Take Result Image");
		btnTakeResultImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TakeResultImage();
			}
		});
		btnTakeResultImage.setBounds(20, 89, 147, 23);
		panel_1.add(btnTakeResultImage);
		
		JButton btnAbort = new JButton("Abort");
		btnAbort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Abort();
			}
		});
		btnAbort.setBounds(20, 123, 147, 23);
		panel_1.add(btnAbort);
		
		JLabel lblImageType = new JLabel("Image Type:");
		lblImageType.setBounds(183, 27, 81, 14);
		panel_1.add(lblImageType);
		
		comboBoxImageType = new JComboBox<String>();
		comboBoxImageType.setBounds(274, 24, 121, 20);
		panel_1.add(comboBoxImageType);
		
		chckbxAutoCapture = new JCheckBox("Auto Capture");
		chckbxAutoCapture.setBounds(180, 57, 147, 23);
		panel_1.add(chckbxAutoCapture);
		
		JLabel lblNumberOfObjects = new JLabel("Number of objects to detect:");
		lblNumberOfObjects.setBounds(183, 95, 169, 14);
		panel_1.add(lblNumberOfObjects);
		
		SpinnerNumberModel spinnerNumModelNumberOfObjects = new SpinnerNumberModel(1, 1, 4, 1);
		spinnerNumberOfObjects = new JSpinner();
		spinnerNumberOfObjects.setBounds(358, 92, 37, 20);
		spinnerNumberOfObjects.setModel(spinnerNumModelNumberOfObjects);
		panel_1.add(spinnerNumberOfObjects);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Controls", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 334, 495, 160);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnBeep = new JButton("Beep");
		btnBeep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beep();
			}
		});
		btnBeep.setBounds(22, 21, 145, 23);
		panel_2.add(btnBeep);
		
		JButton btnGetFingerLed = new JButton("Get Finger Leds");
		btnGetFingerLed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFingerLeds();
			}
		});
		btnGetFingerLed.setBounds(22, 55, 145, 23);
		panel_2.add(btnGetFingerLed);
		
		JButton btnGetStatusLeds = new JButton("Get Status Leds");
		btnGetStatusLeds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getStatusLeds();
			}
		});
		btnGetStatusLeds.setBounds(22, 89, 145, 23);
		panel_2.add(btnGetStatusLeds);
		
		JButton btnNewButton = new JButton("Set Finger Leds");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFingerLeds();
			}
		});
		btnNewButton.setBounds(190, 54, 145, 23);
		panel_2.add(btnNewButton);
		
		JButton btnSetStatusLeds = new JButton("Set Status Leds");
		btnSetStatusLeds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setStatusLeds();
			}
		});
		btnSetStatusLeds.setBounds(190, 88, 145, 23);
		panel_2.add(btnSetStatusLeds);
		
		SpinnerNumberModel spinnerNumModelBeep = new SpinnerNumberModel(0, 0, 7, 1);
		spinnerBeep = new JSpinner();
		spinnerBeep.setBounds(199, 21, 38, 20);
		spinnerBeep.setModel(spinnerNumModelBeep);
		panel_2.add(spinnerBeep);
		
		textFieldFingerLeds = new JTextField();
		textFieldFingerLeds.setBounds(359, 55, 32, 20);
		panel_2.add(textFieldFingerLeds);
		
		textFieldStatusLeds = new JTextField();
		textFieldStatusLeds.setBounds(359, 89, 32, 20);
		panel_2.add(textFieldStatusLeds);
		
		JButton btnGetExtendLeds = new JButton("Get Extend Leds");
		btnGetExtendLeds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getExtendLeds();
			}
		});
		btnGetExtendLeds.setBounds(22, 123, 145, 23);
		panel_2.add(btnGetExtendLeds);
		
		JButton btnSetExtendLeds = new JButton("Set Extend Leds");
		btnSetExtendLeds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendLeds();
			}
		});
		btnSetExtendLeds.setBounds(190, 123, 145, 23);
		panel_2.add(btnSetExtendLeds);
		
		textFieldExtendLeds = new JTextField();
		textFieldExtendLeds.setBounds(359, 124, 32, 20);
		panel_2.add(textFieldExtendLeds);
		
		JLabel lblHex = new JLabel("hex.");
		lblHex.setBounds(401, 59, 46, 14);
		panel_2.add(lblHex);
		
		JLabel label = new JLabel("hex.");
		label.setBounds(401, 93, 46, 14);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("hex.");
		label_1.setBounds(401, 127, 46, 14);
		panel_2.add(label_1);
		
		textAreaInfo = new JTextArea();
		textAreaInfo.setBounds(515, 11, 394, 123);
		contentPane.add(textAreaInfo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(515, 191, 394, 303);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		labelImage = new JLabel("");
		panel_3.add(labelImage);
		
		textFieldDeviceStatus = new JTextField();
		textFieldDeviceStatus.setBounds(515, 160, 194, 20);
		contentPane.add(textFieldDeviceStatus);
		textFieldDeviceStatus.setColumns(10);
		
		textFieldObjectQualityStatus = new JTextField();
		textFieldObjectQualityStatus.setText("");
		textFieldObjectQualityStatus.setBounds(719, 160, 194, 20);
		contentPane.add(textFieldObjectQualityStatus);
		textFieldObjectQualityStatus.setColumns(10);
		
		JLabel lblDeviceStatus = new JLabel("Device Status:");
		lblDeviceStatus.setBounds(515, 145, 135, 14);
		contentPane.add(lblDeviceStatus);
		
		JLabel lblFingerStatus = new JLabel("Finger Status:");
		lblFingerStatus.setBounds(719, 145, 148, 14);
		contentPane.add(lblFingerStatus);
	}
	
	public void displayMessage(final String strMsg, final boolean bAppendText) {
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		    	if (bAppendText)
					textAreaInfo.append(strMsg + "\n");
				else
					textAreaInfo.setText(strMsg + "\n");
		    	//System.out.println(strMsg);
		    }
		});
		
		SwingWorker<Void, Void> myWorker= new SwingWorker<Void, Void>() {
    	    @Override
    	    protected Void doInBackground() throws Exception {
    	    	return null;
    	    }
    	    
    	    @Override
	       protected void done() {
    	    	if (bAppendText)
					textAreaInfo.append(strMsg + "\n");
				else
					textAreaInfo.setText(strMsg + "\n");
		    	System.out.println(strMsg);
	       }
    	};
    	myWorker.execute();
    	
    	if (bAppendText)
			textAreaInfo.append(strMsg + "\n");
		else
			textAreaInfo.setText(strMsg + "\n");
    	System.out.println(strMsg);
    }

	public void initialize()
	{
		CgRollParameters.ByValue cg4RollParmVal = new CgRollParameters.ByValue();
		
		displayMessage("Initializing scanner... please wait ...", false);
		CG4MScannerExist.ByReference scannerExistRef = new CG4MScannerExist.ByReference();
		int rc = cg4M.CG4_M_Main_GetConnectedScanner(scannerExistRef);
		if (rc != CG4ReturnCode.CG4_STATUS_OK)
        {
			displayMessage("CG4_Main_GetConnectedScanner failed, returned code: " + rc, true);
			return;
        }
		
		IntBuffer handleRef = IntBuffer.allocate(1);
		nDeviceId = comboBoxDeviceId.getSelectedIndex();
		displayMessage("CG4_M_Main_Initialize()", true);
		rc = cg4M.CG4_M_Main_Initialize(nDeviceId, handleRef);
		displayMessage("CG4_M_Main_Initialize returned code = " + rc, true);
		if (rc != CG4ReturnCode.CG4_STATUS_OK)
        {
			//if (nRet != CG4ReturnCode.CG4_ERR_USB_VERSION_NO_SUPPORT)
			//	displayMessage("This device can NOT run on the full speed mode.");
			//else
			return;
        }
		// init callback functions.
		// call backs must not go out of scope or be garbage collected

        IntByReference notUsedReference = new IntByReference();
        notUsedReference.setValue(0);
        Pointer notUsed = notUsedReference.getPointer();
		cg4M.CG4_M_Capture_RegisterCallbackPreviewImage(
				nDeviceId,
				callbackPreviewImage,
			  	notUsed
               );
		cg4M.CG4_M_Capture_RegisterCallbackTakingResultImage(
				nDeviceId,
				callbackTakingResultImage,
			  	notUsed
               );
		cg4M.CG4_M_Capture_RegisterCallbackResultImage(
				nDeviceId,
				callbackResultImage,
			  	notUsed
               );
		cg4M.CG4_M_Capture_RegisterCallbackFootSwitch(
				nDeviceId,
				callbackFootSwitch,
			  	notUsed
               );
		cg4M.CG4_M_Capture_RegisterCallbackKeypad(
				nDeviceId,
				callbackKeypad,
			  	notUsed
               );
		cg4M.CG4_M_Capture_RegisterCallbackObjectQuality(
				nDeviceId,
				callbackObjectQuality,
				notUsed
               );
		cg4M.CG4_M_Capture_RegisterCallbackDeviceIsConnected(
				nDeviceId,
				callbackDeviceIsConnected,
			  	notUsed
               );
		cg4M.CG4_M_Capture_RegisterCallbackSensorIsDirty(
				nDeviceId,
				callbackSensorIsDirty,
			  	notUsed
               );

        // Set up roll parameters
        cg4RollParmVal.MaxFrameNumber             = 100;
        cg4RollParmVal.SlideDetectionStatus       = 1;
        cg4RollParmVal.SlidingPixelCounter        = 25000;
        cg4RollParmVal.SlidingPercentageThreshold = 0.115F;
        cg4RollParmVal.SlidingSADMeanThreshlod    = 36;
        cg4RollParmVal.RollBackThreshold          = -100;
        cg4RollParmVal.CheckSensorThreshold       = 400;
        rc = cg4M.CG4_M_Capture_SetRollParameters(nDeviceId, cg4RollParmVal);
        if (rc != CG4ReturnCode.CG4_STATUS_OK)
        {
        	displayMessage("CG4_M_Capture_SetRollParameters failed, returned code: " + rc, true);
            return;
        }

        // Calibrate device
        displayMessage("CG4_M_Capture_Calibration()", true);
        rc = cg4M.CG4_M_Capture_Calibration(nDeviceId);
        if (rc != CG4ReturnCode.CG4_STATUS_OK)
        {
        	//displayMessage("CG4_M_Capture_Calibration failed, returned code: " + rc, true);
            return;
        }
        displayMessage("CG4_M_Capture_Calibration returned code: " + rc, true);

        // Get device type
        getDeviceType();

        displayMessage("CG4_M_Main_Initialize succeed", true);
	}
	
	public void release()
	{
		int rc = cg4M.CG4_M_Main_DeInitialize(nDeviceId);
		textFieldDeviceStatus.setText(null);
     	textFieldObjectQualityStatus.setText(null);
        displayMessage("CG4_M_Main_DeInitialize returned code: " + rc, false);
	}
	
	public void releaseAll()
	{
		int rc = cg4M.CG4_M_Main_DeInitializeAll();
		textFieldDeviceStatus.setText(null);
     	textFieldObjectQualityStatus.setText(null);
        displayMessage("CG4_M_Main_DeInitialize returned code: " + rc, false);
	}
	
	public void showDeviceInfo()
	{
		CG4PropertyInfo.ByReference cg4PropertyInfoRef = new CG4PropertyInfo.ByReference();
        cg4M.CG4_M_Main_GetDeviceInfo(nDeviceId, cg4PropertyInfoRef);
        String x = "";
        x += "Interface Type = " + cg4PropertyInfoRef.getInterfaceType() + "\n";
        x += "Maker = " + cg4PropertyInfoRef.getMaker() + "\n";
        x += "Manufacture Date = " + cg4PropertyInfoRef.getManDate() + "\n";
        x += "Model = " + cg4PropertyInfoRef.getModel() + "\n";
        x += "Serial Number = " + cg4PropertyInfoRef.getSerial() + "\n";
        x += "Serv Date = " + cg4PropertyInfoRef.getServDate() + "\n";
        x += "Version = " + cg4PropertyInfoRef.getVer() + "\n";
        JOptionPane.showMessageDialog(null, x, "Device Info", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void showApiVersion() {
		CG4ApiVersion.ByReference apiVersionRef = new CG4ApiVersion.ByReference();
		int rc = cg4M.CG4_M_Main_GetAPIVersion(apiVersionRef);
		if (rc == CG4ReturnCode.CG4_STATUS_OK) {
			JOptionPane.showMessageDialog(null, "Product: " + apiVersionRef.getProduct() + "\nSDK Version: " + apiVersionRef.getSdkVer(), "Device Info", JOptionPane.INFORMATION_MESSAGE);
		}
			
	}
	
	public void SetMode()
	{
		int rc = CG4ReturnCode.CG4_STATUS_OK;
        int imageType = CG4ImageType.CG4_FLAT_RIGHT_FINGERS;
        int ImgResolution = CG4ImageResolution.CG4_IMAGE_RESOLUTION_500;
        boolean bAutoCapture = false;
        boolean bAutoContrast = false;
        IntBuffer fullImgWidth = IntBuffer.allocate(1); 
        IntBuffer fullImgHeight = IntBuffer.allocate(1); 
        IntBuffer baseResolutionX = IntBuffer.allocate(1); 
        IntBuffer baseResolutionY = IntBuffer.allocate(1); 
        
     	textFieldObjectQualityStatus.setText(null);
     	

        int nFingerCount = (Integer)spinnerNumberOfObjects.getValue();
        
        if (nFingerCount <= 0 || nFingerCount > 4)
        	nFingerCount = 1;

        try
        {
            if (comboBoxImageType.getSelectedIndex() == 0)
            {
                switch (scannerType)
                {
                    case CG4ScannerType.CG4_SCANNER_CS1000P:
                    case CG4ScannerType.CG4_SCANNER_CS1000E:
                        if (nFingerCount == 1)
                        {
                            imageType = CG4ImageType.CG4_FLAT_SINGLE_FINGER;
                        }
                        else
                        {
                            imageType = CG4ImageType.CG4_FLAT_RIGHT_FINGERS;
                        }
                        break;
                    case CG4ScannerType.CG4_SCANNER_CS500P:
                    case CG4ScannerType.CG4_SCANNER_CS500I:
                    case CG4ScannerType.CG4_SCANNER_CS500E:
                        imageType = CG4ImageType.CG4_FLAT_RIGHT_FINGERS;
                        break;
                    case CG4ScannerType.CG4_SCANNER_CSD450:
                    case CG4ScannerType.CG4_SCANNER_CSD450K:
                        if (nFingerCount == 1)
                        {
                            imageType = CG4ImageType.CG4_FLAT_SINGLE_FINGER;
                        }
                        else
                        {
                            imageType = CG4ImageType.CG4_FLAT_TWO_THUMBS;
                        }
                        break;
                    case CG4ScannerType.CG4_SCANNER_CSD330:
                    case CG4ScannerType.CG4_SCANNER_CSD200:
                    case CG4ScannerType.CG4_SCANNER_CSD100:
                    default:
                        imageType = CG4ImageType.CG4_FLAT_SINGLE_FINGER;
                        break;
                }
            }
            else
            {
                imageType = CG4ImageType.CG4_ROLL_SINGLE_FINGER;
            }

            if (chckbxAutoCapture.isSelected())
                bAutoCapture = true;

            displayMessage("CG4_M_Capture_SetMode()", false);
            
            rc = cg4M.CG4_M_Capture_SetMode(
            					nDeviceId,
                                imageType, 
                                ImgResolution, 
                                bAutoCapture, 
                                bAutoContrast, 
                                fullImgWidth, 
                                fullImgHeight,
                                baseResolutionX,
                                baseResolutionY
                                );
            displayMessage("CG4_M_Capture_SetMode returned code = " + rc, true);
        }
        catch(Exception ex)
        {
        	JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
	}
	
	public void StartCapture()
	{
		int rc = CG4ReturnCode.CG4_STATUS_OK;

        try
        {
            displayMessage("CG4_M_Capture_Start()", false);

            int nFingerCount = (Integer)spinnerNumberOfObjects.getValue();
            
            if (nFingerCount <= 0 || nFingerCount > 4)
            	nFingerCount = 1;

            if (comboBoxImageType.getSelectedIndex() == 0) // Flat
            {
                rc = cg4M.CG4_M_Capture_Start(nDeviceId, nFingerCount, true);
            }
            else //Roll
            {
            	nFingerCount = 1;
                rc = cg4M.CG4_M_Capture_Start(nDeviceId, nFingerCount, true);
                if (rc == CG4ReturnCode.CG4_STATUS_OK)
                {
                    rc = cg4M.CG4_M_Capture_SetStartRollingFlag(nDeviceId, true);
                }
            }

            displayMessage("CG4_M_Capture_Start returned code = " + rc, true);
        }
        catch(Exception ex)
        {
        	JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
	}
	
	public void TakeResultImage()
	{
		int rc = CG4ReturnCode.CG4_STATUS_OK;

        displayMessage("CG4_M_Capture_TakeResultImage()", false);

        rc = cg4M.CG4_M_Capture_TakeResultImage(nDeviceId);
        displayMessage("CG4_M_Capture_TakeResultImage() returned code = " + rc, true);
        displayMessage("CG4_M_Capture_AcquireResultImage()", true);
        rc = cg4M.CG4_M_Capture_AcquireResultImage(nDeviceId);
        displayMessage("CG4_M_Capture_AcquireResultImage() returned code = " + rc, true);

        if (rc == CG4ReturnCode.CG4_STATUS_OK)
        {
            cg4M.CG4_M_Capture_SetCaptureOK(nDeviceId);
        }
	}
	
	public void Abort()
	{
		int rc = CG4ReturnCode.CG4_STATUS_OK;
     	textFieldObjectQualityStatus.setText(null);
		displayMessage("CG4_M_Capture_Abort()", false);
        try
        {
            rc = cg4M.CG4_M_Capture_Abort(nDeviceId);
            //if (rc == CG4ReturnCode.CG4_STATUS_OK)
            //{
                displayMessage("CG4_M_Capture_Abort() returned code = " + rc, true);
            //}
        }
        catch(Exception ex)
        {
        	JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
	}

	public void setComboDeviceId()
	{
		String strMsg = "";
		String strScannerType = "";
		CG4MScannerExist.ByReference scannerExistRef = new CG4MScannerExist.ByReference();
		int rc = cg4M.CG4_M_Main_GetConnectedScanner(scannerExistRef);
		if (rc != CG4ReturnCode.CG4_STATUS_OK)
        {
			displayMessage("CG4_Main_GetConnectedScanner failed, returned code: " + rc, false);
			return;
        }
		
		comboBoxDeviceId.removeAll();
		for (int i = 0; i < scannerExistRef.nDevConnected; i++)
        {
			int scannerType = scannerExistRef.scannerType[i];
			switch (scannerType) {
			case CG4ScannerType.CG4_SCANNER_CS500I:
            	strScannerType = "CS500I";
            	break;
            case CG4ScannerType.CG4_SCANNER_CS500E:
            	strScannerType = "CS500E";
            	break;
            case CG4ScannerType.CG4_SCANNER_CSD450:
            	strScannerType = "CSD450";
            	break;
            case CG4ScannerType.CG4_SCANNER_CSD330:
            	strScannerType = "CSD330";
            	break;
            case CG4ScannerType.CG4_SCANNER_CSD200:
            	strScannerType = "CSD200";
            	break;
            case CG4ScannerType.CG4_SCANNER_CS500P:
            	strScannerType = "CS500P";
            	break;
            case CG4ScannerType.CG4_SCANNER_CS1000P:
            	strScannerType = "CS1000P";
            	break;
            case CG4ScannerType.CG4_SCANNER_CSD100:
            	strScannerType = "CSD100";
            	break;
            case CG4ScannerType.CG4_SCANNER_CSD450K:
            	strScannerType = "CSD450K";
            	break;
            case CG4ScannerType.CG4_SCANNER_CS1000E:
            	strScannerType = "CSD1000e";
            	break;
            default:
            	strScannerType = "Unknown";
            	break;
            }

            strMsg = "Device " + i + " (" + strScannerType + ")";
            comboBoxDeviceId.addItem(strMsg);
        }

		if (comboBoxDeviceId.getItemCount() > 0)
			comboBoxDeviceId.setSelectedIndex(0);
	}
	
	public void getDeviceType()
    {
        CG4PropertyInfo.ByReference cg4PropertyInfoRef = new CG4PropertyInfo.ByReference();
        cg4M.CG4_M_Main_GetDeviceInfo(nDeviceId, cg4PropertyInfoRef);

        String strModel = cg4PropertyInfoRef.getModel();
        strModel = strModel.toUpperCase();
        if (strModel.contains("CS500E"))
        {
        	scannerType = CG4ScannerType.CG4_SCANNER_CS500E;
        }
        else if (strModel.contains("CSD330"))
        {
        	scannerType = CG4ScannerType.CG4_SCANNER_CSD330;
        }
        else if (strModel.contains("CS500I"))
        {
        	scannerType = CG4ScannerType.CG4_SCANNER_CS500I;
        }
        else if (strModel.contains("CS500P"))
        {
        	scannerType = CG4ScannerType.CG4_SCANNER_CS500P;
        }
        else if (strModel.contains("CSD200"))
        {
        	scannerType = CG4ScannerType.CG4_SCANNER_CSD200;
        }
        else if (strModel.contains("CSD450"))
        {
        	scannerType = CG4ScannerType.CG4_SCANNER_CSD450;
        }
        else if (strModel.contains("CSD100"))
        {
        	scannerType = CG4ScannerType.CG4_SCANNER_CSD100;
        }
        else if (strModel.contains("CSD450K"))
        {
        	scannerType = CG4ScannerType.CG4_SCANNER_CSD450K;
        }
        else if (strModel.contains("CS1000P"))
        {
        	scannerType = CG4ScannerType.CG4_SCANNER_CS1000P;
        }
        if (strModel.contains("CS1000E"))
        {
        	scannerType = CG4ScannerType.CG4_SCANNER_CS1000E;
        }
    }
	
	public void beep() {
		cg4.CG4_Controls_Beeper((Integer)spinnerBeep.getValue());
	}
	
	public void getFingerLeds() {
		IntBuffer valueRef = IntBuffer.allocate(1);
		int rc = cg4.CG4_Controls_GetLEDs(CG4LedType.CG4_LED_FINGER, valueRef);
		displayMessage("CG4_Controls_GetLEDs(CG4_LED_FINGER) returned code = " + rc, false);
	    if(rc == CG4ReturnCode.CG4_STATUS_OK)
	    {
	        displayMessage("FINGER LedValue= 0x" + Integer.toHexString(valueRef.get(0)) + " hex.", true);
	    }
	}
	
	public void setFingerLeds() {
		try
		{
			int hexInt = Integer.parseInt(textFieldExtendLeds.getText(), 16);
			int rc = cg4.CG4_Controls_SetLEDs(CG4LedType.CG4_LED_FINGER, hexInt);
			displayMessage("CG4_Controls_SetLEDs(CG4_LED_FINGER) returned code = " + rc, false);
		}
		catch(NumberFormatException ex)
		{
			displayMessage("Invalid hex string (" + textFieldFingerLeds.getText() + ")", false);
			JOptionPane.showMessageDialog(null, "Invalid hex string.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void getStatusLeds() {
		IntBuffer valueRef = IntBuffer.allocate(1);
		int rc = cg4.CG4_Controls_GetLEDs(CG4LedType.CG4_LED_STATUS, valueRef);
		displayMessage("CG4_Controls_GetLEDs(CG4_LED_STATUS) returned code = " + rc, false);
	    if(rc == CG4ReturnCode.CG4_STATUS_OK)
	        displayMessage("STATUS LedValue= 0x" + Integer.toHexString(valueRef.get(0)) + " hex.", true);
	}
	
	public void setStatusLeds() {
		try
		{
			int hexInt = Integer.parseInt(textFieldExtendLeds.getText(), 16);
			int rc = cg4.CG4_Controls_SetLEDs(CG4LedType.CG4_LED_STATUS, hexInt);
			displayMessage("CG4_Controls_SetLEDs(CG4_LED_STATUS) returned code = " + rc, false);
		}
		catch(NumberFormatException ex)
		{
			displayMessage("Invalid hex string (" + textFieldStatusLeds.getText() + ")", false);
			JOptionPane.showMessageDialog(null, "Invalid hex string.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void getExtendLeds() {
		IntBuffer valueRef = IntBuffer.allocate(1);
		int rc = cg4.CG4_Controls_GetLEDs(CG4LedType.CG4_LED_EXTEND, valueRef);
		displayMessage("CG4_Controls_GetLEDs(CG4_LED_EXTEND) returned code = " + rc, false);
	    if(rc == CG4ReturnCode.CG4_STATUS_OK)
	        displayMessage("EXTEND LedValue = 0x" + Integer.toHexString(valueRef.get(0)) + " hex.", true); 	
	}
	
	public void setExtendLeds() {
		try
		{
			int hexInt = Integer.parseInt(textFieldExtendLeds.getText(), 16);
			int rc = cg4.CG4_Controls_SetLEDs(CG4LedType.CG4_LED_EXTEND, hexInt);
			displayMessage("CG4_Controls_SetLEDs(CG4_LED_EXTEND) returned code = " + rc, false);
		}
		catch(NumberFormatException ex)
		{
			displayMessage("Invalid hex string (" + textFieldExtendLeds.getText() + ")", false);
			JOptionPane.showMessageDialog(null, "Invalid hex string.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public double getScaleFactor(int iMasterSize, int iTargetSize) {
        return (double) iTargetSize / (double) iMasterSize;
    }

	
	public double getScaleFactorToFit(int origWidth, int origHeight, int toFitWidth, int toFitHeight) {
        double dScale = 1d;
        if (origWidth > -1 && origHeight > -1 && toFitWidth > -1 && toFitHeight > -1) {
            double dScaleWidth = getScaleFactor(origWidth, toFitWidth);
            double dScaleHeight = getScaleFactor(origHeight, toFitHeight);
            dScale = Math.min(dScaleHeight, dScaleWidth);
        }
        return dScale;
    }
	
	public static BufferedImage resize(BufferedImage image, int width, int height, int pitch) {   
	    BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
	    Graphics2D g2d = (Graphics2D) bi.createGraphics();
	    
	    if (pitch < 0) {
		    AffineTransform tran = AffineTransform.getTranslateInstance(0, bi.getHeight());
	        AffineTransform flip = AffineTransform.getScaleInstance(1d, -1d);
	        tran.concatenate(flip);
	        g2d.setTransform(tran);
	    }

	    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
	    g2d.drawImage(image, 0, 0, width, height, null);
	    g2d.dispose();
	    return bi;
	}
	
	public void showImage(ImageData.ByValue image, boolean bSaveToFile) {
		try
        {
		    byte byImage[] = image.Buffer.getByteArray(0, image.Width * image.Height);
		    BufferedImage bufferedImage = new BufferedImage(image.Width, image.Height, BufferedImage.TYPE_BYTE_GRAY); 
		    bufferedImage.getRaster().setDataElements(0, 0, image.Width, image.Height, byImage);
		    BufferedImage resizedImage = resize(bufferedImage, labelImage.getWidth(), labelImage.getHeight(), image.Pitch);
		    labelImage.setIcon(new ImageIcon(resizedImage));
		    
		    if (bSaveToFile) {
		    	File picDir = new File(Paths.get("").toAbsolutePath().toString() + "\\Pics\\");
		    	if (!picDir.exists()) {
		    		picDir.mkdirs();
		    	}
		    	DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		    	Date date = new Date();
		    	File picFile = new File(picDir.getAbsolutePath() + "\\" + dateFormat.format(date) + ".bmp");
		    	if (ImageIO.write(bufferedImage, "BMP", picFile))
		    		JOptionPane.showMessageDialog(null, "Image Location:\n" + picDir.getAbsolutePath() + "\\" + picDir.getName(), "Image Saved", JOptionPane.INFORMATION_MESSAGE);
		    }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
	}
	
	private void previewImageCallback(Pointer notUsed, ImageData.ByValue image) {
		showImage(image, false);
	}
	
	private void takingResultImageCallback(Pointer notUsed) {
		//cg4M.CG4_M_Controls_Beeper(nDeviceId, 3);
	}
	
	private void resultImageCallback(Pointer notUsed, int imageStatus, ImageData.ByValue image, int imageType, int detectedObjects) {
		if (imageStatus >= CG4ReturnCode.CG4_STATUS_OK)
			cg4M.CG4_M_Controls_Beeper(nDeviceId, 3);
	    
	    if( imageStatus >= CG4ReturnCode.CG4_STATUS_OK )
	    {
			showImage(image, true);
	    }
	    else
	    {
	        displayMessage("Image acquisition failed, Error code= " + imageStatus, false);
	    }
	}
	
	private void footSwitchCallback(Pointer notUsed) {
		cg4M.CG4_M_Controls_Beeper(nDeviceId, 2);
	}
	
	private void keypadCallback(Pointer notUsed, int keypadType) {
		String str = "Press button is = ";
	
	    if (keypadType == CG4KeypadType.CG4_KEYPAD_C_KEYS)
	        str += "CG4_KEYPAD_C_KEYS";
	    else if (keypadType == CG4KeypadType.CG4_KEYPAD_D_KEYS)
	        str += "CG4_KEYPAD_D_KEYS";

	    displayMessage(str, false);
	}
	
	
	private void objectQualityCallback(Pointer notUsed, int fingerCountState, Pointer QualityArray, int qualityCount) {
	    String str = "";
	    if (fingerCountState == CG4ObjectCountState.CG4_TOO_MANY_OBJECTS)
	        str += "TOO_MANY_OBJECTS";
	    else if(fingerCountState == CG4ObjectCountState.CG4_TOO_FEW_OBJECTS)
	        str += "TOO_FEW_OBJECTS";
	    else
	        str += "OBJECT_COUNT_OK";

	    //str += "\r\n";
	    //for (int i = 0; i < qualityCount; i++)
	    //{
	    //	str += "Qua[" + i + "] = " + QualityArray.getInt(i) + "\n";
	    //}

	    textFieldObjectQualityStatus.setText(str);
	}
	
	private void deviceIsConnectedCallback(Pointer notUsed, boolean bIsExist)
	{
		if (!bIsExist) {
			if (cg4M.CG4_M_Main_IsInitialized(nDeviceId) == CG4ReturnCode.CG4_STATUS_OK)
				textFieldDeviceStatus.setText("Initialized / Disconnected");
			else
				textFieldDeviceStatus.setText("Not initialized / Disconnected");
		}
		else {
			if (cg4M.CG4_M_Main_IsInitialized(nDeviceId) == CG4ReturnCode.CG4_STATUS_OK)
				textFieldDeviceStatus.setText("Initialized / Connected");
			else
				textFieldDeviceStatus.setText("Not initialized / Connected");
	    }
	}
	
	private void sensorIsDirtyCallback(Pointer notUsed, int nDirtyFlag) {
		if (nDirtyFlag == 0) {
			//displayMessage("Sensor is OK", false);
		}
		else {
			//displayMessage("Sensor is dirty", false);
		}
		
	}
}
