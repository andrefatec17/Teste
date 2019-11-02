package exc06;

public class Father extends Man {
	
	public String JovemIdosos(String idade){
		String edad = super.isOld(Integer.valueOf(idade))? "Idoso":"Jovem";
		return edad;
		
	}

}
