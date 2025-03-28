public class EarthVolume {
    public static void main(String[] args) {
		//inputing values
        double earthRadiusKm = 6378;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusKm, 3);//calculating volume in km
        double kmToMileConversion = 0.621371;
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMileConversion, 3);//calculating volume in miles
		
		//displaying output
        System.out.println("Q7: Compute the Volume of Earth");
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
	}
}
