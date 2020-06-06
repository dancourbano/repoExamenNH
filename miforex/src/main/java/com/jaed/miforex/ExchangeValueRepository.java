package com.jaed.miforex;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);
	
	@Query(value = "select distinct to from ExchangeValue")
	List<String> findAllCurrency();
}
