package br.com.impacta.prateleiradigital.persistencia;

import br.com.impacta.prateleiradigital.negocio.Filme;

public class FilmeDAO {

	/**
	 * 
	 * @param filme
	 * @return
	 */

	public boolean insert(Filme filme) {

		if (filme != null) {
			return true;
		}

		return false;
	}

}
