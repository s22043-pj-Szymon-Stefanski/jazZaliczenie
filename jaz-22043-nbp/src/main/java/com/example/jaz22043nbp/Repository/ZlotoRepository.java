package com.example.jaz22043nbp.Repository;

import com.example.jaz22043nbp.Entity.ZlotoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZlotoRepository extends JpaRepository<ZlotoModel, Long> {
}
