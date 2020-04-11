package br.com.bandtec.jpa1.repositorios;

import br.com.bandtec.jpa1.entidades.Esporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsporteRepository extends JpaRepository<Esporte, Integer> {

}
