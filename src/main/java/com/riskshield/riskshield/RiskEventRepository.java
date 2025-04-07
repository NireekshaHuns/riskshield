package com.riskshield.riskshield;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskEventRepository extends JpaRepository<RiskEvent, Long> {
}
