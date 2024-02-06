package pharmacyproj.pharmacy.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacyproj.pharmacy.pharmacy.entity.Pharmacy;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}
