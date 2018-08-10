package classes;

public class Crime {

    public static boolean getCrimeType(Crime lsoaName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	private String crimeId;
	private String month;
	private String reported;
        private String fallsWithin;
	private String longitude;
	private String latitude;
	private String location;
	private String lsoaCode;
	private String lsoaName;
	private String crimeType;
	private String lastOutcome;
	private String context;
	
	public Crime(String fileString){
		String[] split  = fileString.split(",", -1);
		
		setCrimeId(split[0]);
		setMonth(split[1]);
		setReported(split[2]);
                setFallsWithin(split[3]);
		setLongitude(split[4]);
		setLatitude(split[5]);
                setLocation(split[6]);
                setLsoaName(split[7]);
		setLsoaCode(split[8]);
		setCrimeType(split[9]);
		if(split.length > 10){
                setLastOutcome(split[10]);
		setContext(split[11]);
                }
	}
	
	public Crime(String crimeId, String month, String reported, String FallsWithin, String longitude, String latitude, String location,
			String lsoaCode, String lsoaName, String crimeType, String lastOutcome, String context) {
	
		setCrimeId(crimeId);
		setMonth(month);
		setReported(reported);
                setFallsWithin(fallsWithin);
		setLongitude(longitude);
		setLatitude(latitude);
                setLsoaName(lsoaName);
		setLsoaCode(lsoaCode);
		setCrimeType(crimeType);
		setLastOutcome(lastOutcome);
		setContext(context);
	}

	public String getCrimeId() {
		return crimeId;
	}

	public void setCrimeId(String crimeId) {
		this.crimeId = crimeId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String isReported() {
		return reported;
	}

	public void setReported(String reported) {
		this.reported = reported;
	}

        public String getFallsWithin() {
            return fallsWithin;

        }
        public void setFallsWithin(String fallsWithin){
            this.fallsWithin = fallsWithin;
        }
        
	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLsoaCode() {
		return lsoaCode;
	}

	public void setLsoaCode(String lsoaCode) {
		this.lsoaCode = lsoaCode;
	}

	public String getLsoaName() {
		return lsoaName;
	}

	public void setLsoaName(String lsoaName) {
		this.lsoaName = lsoaName;
	}

	public String getCrimeType() {
		return crimeType;
	}

	public void setCrimeType(String crimeType) {
		this.crimeType = crimeType;
	}

	public String getLastOutcome() {
		return lastOutcome;
	}

	public void setLastOutcome(String lastOutcome) {
		this.lastOutcome = lastOutcome;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
        
	public String toString() {
                  return this.crimeId + "\t"  + this.month + "\t" + this.reported  + "\t" + this.fallsWithin + "\t" + this.longitude + "\t" + this.latitude + "\t" + this.location + "\t" + this.lsoaName + "\t" + this.lsoaCode + "\t" + this.crimeType + "\t" + this.lastOutcome + "\t" + this.context;
                }
}