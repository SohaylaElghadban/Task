package Main.Manager.Service;

import Main.Manager.Entity.itemEntity;

import java.util.List;

public interface itemServiceInterfce {
    itemEntity save(itemEntity itemEntity);

    List<itemEntity> getByItemCode(String itemCode);

    List<itemEntity> getByNameContains(String name);
}
