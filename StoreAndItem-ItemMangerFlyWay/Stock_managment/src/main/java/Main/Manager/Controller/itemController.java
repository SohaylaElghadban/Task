package Main.Manager.Controller;

import Main.Manager.Entity.itemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/items")
public class itemController {

    private final Main.Manager.Service.impl.itemService itemService;

    @Autowired
    public itemController(Main.Manager.Service.impl.itemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public itemEntity createItem(@RequestBody itemEntity itemEntity) {
        return itemService.save(itemEntity);
    }

    @GetMapping("/{itemCode}")
    public List<itemEntity> getItemsByCode(@PathVariable String itemCode) {
        return itemService.getByItemCode(itemCode);
    }

    @GetMapping("/search")
    public List<itemEntity> searchItemsByName(@RequestParam String name) {
        return itemService.getByNameContains(name);
    }
}
