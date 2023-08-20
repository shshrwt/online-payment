package com.online.payment.biller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.payment.biller.model.Biller;
import com.online.payment.biller.model.BillerDetails;


public interface BillerDetailsRepository extends JpaRepository<BillerDetails, Integer> {
}
