package com.mmm.jna.cg4essentials;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : CG4EssentialsApi.h</i>
 */
public class CgRollParameters extends Structure {
	/** The maximum number of frames used to stitch a image */
	public int MaxFrameNumber;
	/** If 1, enable the slide detection function, else disable */
	public int SlideDetectionStatus;
	/** 
	 * The number of pixel is considered to be sliding comparing to the previous frame. The smaller SlidingPixelCounter, the more sensitive to detect sliding and rotation.<br>
	 * good value = 8000, general value = 25000, low value = 31000 
	 */
	public int SlidingPixelCounter;
	/** 
	 * The threshold of percentage of sliding pixel to total pixel number. The smaller SlidingPercentageThreshold, the more sensitive to detect sliding and rotation. SlidingPercentageThreshold must within [0.0, 1.0]<br>
	 * good value = 0.157, general value = 0.202, low value = 0.26
	 */
	public float SlidingPercentageThreshold;
	/** 
	 * A measure to judge whether a pixel is sliding, if the SADMean of a pixel is greater than SlidingSADMeanThreshlod, it might be silding.<br>
	 * good value = 34, general value = 36, low value = 38
	 */
	public int SlidingSADMeanThreshlod;
	/** 
	 * The greater RollBackThreshold, the more sensitive to detect Roll Back. RollBackThreshold must be less than 0.<br>
	 * good value = -200, general value = -300, low value = -400
	 */
	public int RollBackThreshold;
	/** 
	 * The smaller CheckSensorThreshold, the more sensitive to detect Sensor.<br>
	 * good value = 255, general value = 500, low value = 1000
	 */
	public int CheckSensorThreshold;
	public CgRollParameters() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("MaxFrameNumber", "SlideDetectionStatus", "SlidingPixelCounter", "SlidingPercentageThreshold", "SlidingSADMeanThreshlod", "RollBackThreshold", "CheckSensorThreshold");
	}
	/**
	 * @param MaxFrameNumber < The maximum number of frames used to stitch a image<br>
	 * @param SlideDetectionStatus < =1 enable the slide detection function, else disable<br>
	 * @param SlidingPixelCounter < The number of pixel is considered to be sliding comparing to the previous frame<br>
	 * @param SlidingPercentageThreshold < The threshold of percentage of sliding pixel to total pixel number<br>
	 * @param SlidingSADMeanThreshlod < A measure to judge whether a pixel is sliding<br>
	 * @param RollBackThreshold < The greater RollBackThreshold, the more sensitive to detect Roll Back<br>
	 * @param CheckSensorThreshold < The smaller CheckSensorThreshold, the more sensitive to detect Sensor
	 */
	public CgRollParameters(int MaxFrameNumber, int SlideDetectionStatus, int SlidingPixelCounter, float SlidingPercentageThreshold, int SlidingSADMeanThreshlod, int RollBackThreshold, int CheckSensorThreshold) {
		super();
		this.MaxFrameNumber = MaxFrameNumber;
		this.SlideDetectionStatus = SlideDetectionStatus;
		this.SlidingPixelCounter = SlidingPixelCounter;
		this.SlidingPercentageThreshold = SlidingPercentageThreshold;
		this.SlidingSADMeanThreshlod = SlidingSADMeanThreshlod;
		this.RollBackThreshold = RollBackThreshold;
		this.CheckSensorThreshold = CheckSensorThreshold;
	}
	public CgRollParameters(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CgRollParameters implements Structure.ByReference {
		
	};
	public static class ByValue extends CgRollParameters implements Structure.ByValue {
		
	};
}
