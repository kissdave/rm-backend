package hu.bme.simonyi.dave.rmbackend.repository;

import hu.bme.simonyi.dave.rmbackend.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dkiss on 2017. 03. 28..
 */
public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
