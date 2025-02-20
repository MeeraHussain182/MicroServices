package com.currency.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.currency.service.entity.CurrencyConversion;

@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyConversion, Long> {

}
