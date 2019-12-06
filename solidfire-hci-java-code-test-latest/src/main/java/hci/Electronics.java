package hci;

import java.util.Arrays;

public class Electronics {
	Integer cpuCores = 8; 
	Integer memoryGb = 8; 
	String[] supportedFeatures = new String[] {"Wi-Fi", "Bluetooth", "Speakers"};
	String[] extendedFeatures = null;
	
	public boolean isFeatureSupported(String featureName) {
		// Return true if a feature is supported, false otherwise. 
		return Arrays.stream(supportedFeatures).anyMatch(featureName::equals);
	}
	
	public String featuresToString() {
		// Print the supported features
		return Arrays.toString(supportedFeatures);
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.init();
		System.out.println("TV Feature List:\n\t" + tv.featuresToString() + "\n\tCPU Cores: " + tv.cpuCores + "\n\tMemory Gb: " + tv.memoryGb);
		System.out.println("\tWi-Fi supported: " + Boolean.toString(tv.isFeatureSupported("Wi-Fi")));
		
		Laptop laptop = new Laptop();
		laptop.init();
		System.out.println("Laptop Feature List:\n\t" + laptop.featuresToString() + "\n\tCPU Cores: " + laptop.cpuCores + "\n\tMemory Gb: " + laptop.memoryGb);
		System.out.println("\tHDMI supported: " + Boolean.toString(laptop.isFeatureSupported("HDMI")));
	}
}