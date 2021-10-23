package digitalinnovation.one.experts.shoppingcart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@RedisHash("cart")
public class Cart {

    @Id
    private Integer id;
    private List<digitalinnovation.one.experts.shoppingcart.model.Item> items;

    public Cart() {
    }

    public Cart(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<digitalinnovation.one.experts.shoppingcart.model.Item> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

    public void setItems(List<digitalinnovation.one.experts.shoppingcart.model.Item> items) {
        this.items = items;
    }
}
