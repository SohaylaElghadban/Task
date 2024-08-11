package Main.Manager.Service.impl;

import Main.Manager.Entity.itemEntity;
import Main.Manager.Repository.itemRepository;
import Main.Manager.Service.itemServiceInterfce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class itemService implements itemServiceInterfce {

    private final itemRepository Rep;

    @Autowired

    public itemService(itemRepository Rep) {
        this.Rep = Rep;
    }
@Override
    public itemEntity save(itemEntity itemEntity) {
        return Rep.save(itemEntity);
    }
@Override
    public List<itemEntity> getByItemCode(String itemCode) {
        return Rep.findByItemCode(itemCode);
    }
@Override
    public List<itemEntity> getByNameContains(String name) {
        return Rep.findByItemNameContaining(name);
    }
}
