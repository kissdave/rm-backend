package hu.bme.simonyi.dave.rmbackend.repository;

import hu.bme.simonyi.dave.rmbackend.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dkiss on 2017. 04. 10..
 */
public interface CardRepository extends JpaRepository<Card, Long> {
}
