package org.example.RestaurantCommandSystem.command;

import org.example.RestaurantCommandSystem.menu.OrderItem;

public class TakeOrderCommand implements Command{
    private OrderItem orderItem;


    public TakeOrderCommand(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public void execute() {
        System.out.println("Order item " + orderItem);
    }

    @Override
    public String toString() {
        return "TakeOrderCommand{" +
                "orderItem=" + orderItem +
                '}';
    }
}
