package com.fredericoffs.dslearn.repositories;

import com.fredericoffs.dslearn.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
