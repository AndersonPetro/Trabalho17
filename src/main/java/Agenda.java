
public class Agenda {
	
	public boolean agenda(String nome,String endereco , String telefone ) {
		if(nome!=null || endereco!=null || telefone!=null) {
			return true;
		}
		return false;
		}
	
	public String achaEnderecoSarandi(String rua) {
		if(rua=="Toledo ") {
			return "Sarandi";
		}
		else {
			return "Não Existe";
		}
	}
    	public String achaNumeroTelefone(String telefone) {
			if(telefone=="3321-22-48 ") {
				return "3321-22-48 ";
			}
			else {
				return"Não Existe";
			}	
     }

		
			
	

}