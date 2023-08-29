package com.neosoft.jpqlpoc.repo;

import com.neosoft.jpqlpoc.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {
}