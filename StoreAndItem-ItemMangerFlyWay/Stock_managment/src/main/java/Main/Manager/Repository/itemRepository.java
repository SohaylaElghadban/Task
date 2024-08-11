package Main.Manager.Repository;

import Main.Manager.Entity.itemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface itemRepository extends JpaRepository<itemEntity, Integer> {
    List<itemEntity> findByItemCode(String itemCode);
    List<itemEntity> findByItemNameContaining(String itemName);
}