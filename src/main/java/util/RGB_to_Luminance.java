/* -*- mode: java; c-basic-offset: 8; indent-tabs-mode: t; tab-width: 8 -*- */

package util;

import ij.IJ;
import ij.ImagePlus;
import ij.plugin.PlugIn;

public class RGB_to_Luminance extends RGBToLuminance implements PlugIn {
	@Override
	public void run(String ignored) {

		ImagePlus colourImage = IJ.getImage();
		if( colourImage == null ) {
			IJ.error("No current image found");
			return;
		}
		if( colourImage.getType() != ImagePlus.COLOR_RGB ) {
			IJ.error("This plugin requires an RGB image");
			return;
		}

		ImagePlus converted=convertToLuminance(colourImage);
		converted.show();

	}

}
