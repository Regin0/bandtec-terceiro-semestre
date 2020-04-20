package com.example.jpa2.repository;

import com.example.jpa2.entidades.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarroRepository extends JpaRepository <Carro, Integer> {
    List<Carro> findByMarca(String marca);

    Carro findByPlaca(String placa);

    void deleteByMarca(String marca);

    long countByMarca(String marca);

    boolean existsByMarca(String marca);

    List<Carro> findByMarcaAndModelo(String marca, String modelo);
}
