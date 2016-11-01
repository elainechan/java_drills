public class SimpleLocation
{

	// Rule of thumb:
	// Make member variables private
	// Make global methods public
	// Make helper methods private
	private double latitude;
	private double longitude;

	// Getters and setters allow more control
	public double getLatitude()
	{

		return this.latitude;
	
	}

	public void setLatitude(double lat)
	{

		this.latitude = lat;
	
	}

	// Default constructor: method to create new object without parameters
	// Constructor is "overloaded"
	public SimpleLocation()
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