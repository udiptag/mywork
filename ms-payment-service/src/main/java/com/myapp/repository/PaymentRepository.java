package com.myapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.myapp.model.Payment;

@RepositoryRestResource(path="/payments/")
public interface PaymentRepository extends JpaRepository<Payment, Long> {

	List<Payment> findByAmount(@Param("amount")long amount);
}
