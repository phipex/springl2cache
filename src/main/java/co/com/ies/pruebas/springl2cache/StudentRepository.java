package co.com.ies.pruebas.springl2cache;

import java.util.Optional;
import java.util.UUID;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,UUID> {

    @Cacheable(value = "estudiantes", key = "#id")
    Optional<Student> findById(UUID id);
    
}
