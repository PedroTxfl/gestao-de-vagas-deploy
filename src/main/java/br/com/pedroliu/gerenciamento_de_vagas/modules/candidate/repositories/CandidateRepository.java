package br.com.pedroliu.gerenciamento_de_vagas.modules.candidate.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedroliu.gerenciamento_de_vagas.modules.candidate.entities.CandidateEntity;


public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {
    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);
    
    Optional<CandidateEntity> findByUsername(String username);
}
