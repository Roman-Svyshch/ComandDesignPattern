package org.example.RestaurantCommandSystem.command;

import org.example.RestaurantCommandSystem.menu.MenuItem;
import org.example.RestaurantCommandSystem.menu.OrderItem;

public class CancelOrderCommand implements Command{
    private OrderItem orderItem;

    public CancelOrderCommand(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public void execute() {
        System.out.println("Cancel order " + orderItem);
    }

    @Override
    public String toString() {
        return "CancelOrderCommand{" +
                "orderItem=" + orderItem +
                '}';
    }
}
