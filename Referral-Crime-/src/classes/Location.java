package classes;

import java.util.ArrayList;

public class Location {
   
	private ArrayList<Crime> crimeList = new ArrayList<Crime>();
	
	private String locationName;
	
	public Location(){	}
	
	public Location(String locationName){
		setLocationName(locationName);
	}

	public ArrayList<Crime> getCrimeList() {
		return crimeList;
	}

	public void setCrimeList(ArrayList<Crime> crimeList) {
		this.crimeList = crimeList;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
        }       
}