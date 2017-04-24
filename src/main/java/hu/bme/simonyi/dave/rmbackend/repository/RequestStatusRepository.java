package hu.bme.simonyi.dave.rmbackend.repository;

import hu.bme.simonyi.dave.rmbackend.model.Request;
import hu.bme.simonyi.dave.rmbackend.model.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by dkiss on 2017. 04. 10..
 */
public interface RequestStatusRepository extends JpaRepository<RequestStatus, Long>{
    public List<RequestStatus> findByName(String name);
}