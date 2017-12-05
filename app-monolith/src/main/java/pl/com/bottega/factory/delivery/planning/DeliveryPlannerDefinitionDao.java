package pl.com.bottega.factory.delivery.planning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryPlannerDefinitionDao extends JpaRepository<DeliveryPlannerDefinitionEntity, String> {
}