package M;

public class Usuario {
	
	static String nomeUser = "ams";
	static String senha = "123";

	public static void setNomeUser(String nomeUser) {
		Usuario.nomeUser = nomeUser;
	}
	
	public static String getNomeUser() {
		return nomeUser;
	}
	
	public static void setSenha(String senha) {
		Usuario.senha = senha;
	}
	
	public static String getSenha() {
		return senha;
	}
	
}