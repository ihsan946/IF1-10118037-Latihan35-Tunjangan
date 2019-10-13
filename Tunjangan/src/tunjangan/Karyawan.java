package tunjangan;

public class Karyawan {

   
                     public  double tunjangan;
	public  double totalGaji = 0;
	

	/**
	 * 
	 * @param parStatus
     * @return 
	 */
	public double hitungTunjangan(double gaji) {
		return gaji * 0.35;
	}

	/**
	 * 
	 * @param parGaji
     * @param parStatus
     
	 */
	public void hitungGaji(double parGaji, String parStatus) {
                                if(parStatus.equals("Menikah")){
                                    tunjangan = hitungTunjangan(parGaji);
                                }
                                else{
                                    tunjangan = 0;
                                }
                                totalGaji = parGaji + tunjangan;
	}

}