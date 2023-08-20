package com.online.payment.biller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.payment.biller.model.Biller;

public interface BillerRepository extends JpaRepository<Biller, Long> {

}
