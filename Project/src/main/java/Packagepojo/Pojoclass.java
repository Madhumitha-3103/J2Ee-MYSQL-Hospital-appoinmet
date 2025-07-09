package Packagepojo;

public class Pojoclass {
private int appNo;
private String patientName;
private int patientAge;
private String patientDob;
private String doctorName;
private String dateandtime;
public int getAppNo() {
	return appNo;
}
public void setAppNo(int appNo) {
	this.appNo = appNo;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public int getPatientAge() {
	return patientAge;
}
public void setPatientAge(int patientAge) {
	this.patientAge = patientAge;
}
public String getPatientDob() {
	return patientDob;
}
public void setPatientDob(String patientDob) {
	this.patientDob = patientDob;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public String getDateandtime() {
	return dateandtime;
}
public void setDateandtime(String dateandtime) {
	this.dateandtime = dateandtime;
}
@Override
public String toString() {
	return "Pojoclass [appNo=" + appNo + ", patientName=" + patientName + ", patientAge=" + patientAge + ", patientDob="
			+ patientDob + ", doctorName=" + doctorName + ", dateandtime=" + dateandtime + "]";
}
public Pojoclass() {
	super();
	// TODO Auto-generated constructor stub
}
public Pojoclass(int appNo, String patientName, int patientAge, String patientDob, String doctorName,
		String dateandtime) {
	super();
	this.appNo = appNo;
	this.patientName = patientName;
	this.patientAge = patientAge;
	this.patientDob = patientDob;
	this.doctorName = doctorName;
	this.dateandtime = dateandtime;
}


}
