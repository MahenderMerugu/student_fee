package com.infosys.studs.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.studs.Entity.FeeEntity;

@Repository
public interface StdFeeRespository extends JpaRepository<FeeEntity, Long>{

}
