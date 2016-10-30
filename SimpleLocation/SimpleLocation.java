public class SimpleLocation 
{

	public double latitude;
	public double longitude;

	// This is a constructor: method to create new object
	public SimpleLocation(double lat, double lon) 
	{

		this.latitude = lat;
		this.longitude = lon;

	}

	public double distance(SimpleLocation other) 
	{

		// "this" is the calling object
		return getDist(this.latitude, this.longitude,
			other.latitude, other.longitude);

	}

}