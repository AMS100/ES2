package M;

public class Funcionario {

	static String nomeUser = "PEDRO";
	static String tipoFunc = "ATENDENTE";
	
	public static void setNomeUser(String nomeUser) {
		Funcionario.nomeUser = nomeUser;
	}
	
	public static String getNomeUser() {
		return nomeUser;
	}
	
	public static void setTipoFunc(String tipoFunc) {
		Funcionario.tipoFunc = tipoFunc;
	}
	
	public static String getTipoFunc() {
		return tipoFunc;
	}
	
}