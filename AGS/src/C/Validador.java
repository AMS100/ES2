package C;

import M.Usuario;

public class Validador {	

		
		public static boolean validaNome(String nome){
			if (nome.equals(Usuario.getNomeUser())){ // BUSCA VALOR QUE ESTÁ SETADO NO GETUSER
	 			return true;		
			}else{
				return false;
			}
		}
		
		
		public static boolean validaSenha(String senha){
			if (senha.equals(Usuario.getSenha())){
				return true;		
			}else{
				return false;			
			}
		}
		
		
		public static void autenticaUser(String nome, String senha){
			if (validaNome(nome) == true && validaSenha(senha)== true){
				App.Form_Prints.msg("Senha válida");		
			}else{
				App.Form_Prints.msg("Senha inválida");			
			}
		}

}