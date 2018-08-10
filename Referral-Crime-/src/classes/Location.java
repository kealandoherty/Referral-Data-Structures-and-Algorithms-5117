package classes;

import java.util.ArrayList;

public class Location {
   
	private ArrayList<Crime> crimeList = new ArrayList<Crime>();
	
	private String locationName;
        private String lsoaName;
    
	
	public Location(){	}
	
	public Location(String locationName){
		setLocationName(locationName);
	}
        
        public void LSOA(String lsoaName) {
            setLsoaName(lsoaName);
      
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

        
        public String getlsoaName() {
		return lsoaName;
	}

	public void setLsoaName(String lsoaName) {
		this.lsoaName = lsoaName;
        }       

        
   

    
}