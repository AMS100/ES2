package C;

import M.Usuario;

public class ValidadorUsuarios {	
		Usuario usuario = new Usuario();
		
		public boolean validaNome(String nome) {
			if (nome.equals(usuario.getNomeUser())) {
	 			return true;		
			} else {
				return false;
			}
		}
		
		
		public boolean validaSenha(String senha) {
			if (senha.equals(usuario.getSenha())) {				
				return true;		
			} else {
				return false;			
			}
		}
		
		
		public void autenticaUser(String nome, String senha) {
			if (validaNome(nome) == true && validaSenha(senha)== true) {
				App.Form_Prints.msg("Senha válida");		
			} else {
				App.Form_Prints.msg("Senha inválida");			
			}
		}

}