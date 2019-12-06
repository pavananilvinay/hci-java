package hci;

import java.util.Arrays;
import java.util.stream.Stream;

public class Tv extends Electronics {
	public void init() {
		cpuCores = 1;
		memoryGb = 2;
		extendedFeatures = new String[] {"USB 3.0", "HDMI", "Headphone Jack", "Remote"};
		supportedFeatures = Stream.concat(Arrays.stream(supportedFeatures), Arrays.stream(extendedFeatures)).toArray(String[]::new);
	}
}