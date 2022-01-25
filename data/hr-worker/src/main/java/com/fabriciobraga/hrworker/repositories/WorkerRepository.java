package com.fabriciobraga.hrworker.repositories;

import com.fabriciobraga.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
