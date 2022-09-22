package com.esprit.microservices.candidate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatRepository extends JpaRepository<Candidat, Integer> {

}
