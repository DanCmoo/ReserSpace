package com.dancmo.project.reserspace.persistence.repository;

import com.dancmo.project.reserspace.persistence.entity.Space;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface SpaceRespository extends JpaRepository<Space, UUID>{

}
