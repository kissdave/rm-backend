package hu.bme.simonyi.dave.rmbackend.repository;

import hu.bme.simonyi.dave.rmbackend.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dkiss on 2017. 04. 10..
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
