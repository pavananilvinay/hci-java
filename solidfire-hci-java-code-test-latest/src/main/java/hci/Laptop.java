package hci;

import java.util.Arrays;
import java.util.stream.Stream;

public class Laptop extends Electronics {
	public void init() {
		cpuCores = 2;
		memoryGb = 6;
		extendedFeatures = new String[] { "NFC", "USB-C", "Touchscreen", "GPS", "Accelerometer",
				"Fingerprint sensor", "Phone Calls" };
		supportedFeatures = Stream.concat(Arrays.stream(supportedFeatures), Arrays.stream(extendedFeatures))
				.toArray(String[]::new);
	}
}