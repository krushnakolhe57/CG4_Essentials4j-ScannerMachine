package com.mmm.jna.cg4essentials;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : CG4EssentialsApi.h</i>
 */
public class ImageData extends Structure {
	/** Pointer to image buffer */
	public Pointer Buffer;
	/** Image horizontal size */
	public int Width;
	/** Image vertical size */
	public int Height;
	/** Horizontal image resolution (in PPI) */
	public double ResolutionX;
	/** Vertical image resolution (in PPI) */
	public double ResolutionY;
	/** Image acquisition time (in seconds). This value contains the time taken for acquisition from device (without processing time) */
	public double FrameTime;
	/** Image line pitch (in Bytes). Positive values indicate top down line order. Negative values mean bottom up line order. */
	public int Pitch;
	/** Number of Bits per pixel */
	public byte BitsPerPixel;
	/** Image color format */
	public int Format;
	/** Marks image as finally processed. A value of "FALSE" disqualifies image for further processing (e.g. interim or preprocessed result images). */
	public boolean IsFinal;
	public ImageData() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Buffer", "Width", "Height", "ResolutionX", "ResolutionY", "FrameTime", "Pitch", "BitsPerPixel", "Format", "IsFinal");
	}
	public ImageData(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ImageData implements Structure.ByReference {
		
	};
	public static class ByValue extends ImageData implements Structure.ByValue {
		
	};
}
