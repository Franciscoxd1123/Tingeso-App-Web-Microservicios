package org.example.PBRequest.repository;

import org.example.PBRequest.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long>{
    public List<Request> findByRut(String rut);
}
