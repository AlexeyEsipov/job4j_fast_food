package domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Класс заказов. Содержит поля - заказчик {@code user}, содержание заказа - список блюд {@code dishList},
 * себестоимость заказа {@code orderCost}, цена заказа для заказчика {@code orderPrice},
 * статус {@code completed} - {@code true} если заказ доставлен и {@code false} если заказ в процессе доставки.
 * @author Есипов Алексей
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {
    @EqualsAndHashCode.Include
    private int id;
    private User user;
    private List<Dish> dishList;
    private double orderPrice;
    private double orderCost;
    private boolean completed;
}
