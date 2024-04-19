package ma.fsm.jpafsm.repositories;

import ma.fsm.jpafsm.entities.Role;
import ma.fsm.jpafsm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public  interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String roleName);
}
