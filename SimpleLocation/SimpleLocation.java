public class SimpleLocation 
{

	public double latitude;
	public double longitude;

	// Default constructor: method to create new object without parameters
	// Constructor is "overloaded"
	public SimpleLocation
	{

		this.latitude = 32.9;
		this.longitude = -117.2;

	}

	// Parameter constructor: method to create new object with parameters
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

	public double distance(double otherLat, double otherLon)
	{

		// Body not shown

	}

}