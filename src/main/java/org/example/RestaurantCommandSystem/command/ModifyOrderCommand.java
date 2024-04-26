package org.example.RestaurantCommandSystem.command;

import org.example.RestaurantCommandSystem.menu.OrderItem;

public class ModifyOrderCommand implements Command {

    private OrderItem orderItem;

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public ModifyOrderCommand(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public void execute() {
        System.out.println("Update Order Item " + orderItem);
    }

    @Override
    public String toString() {
        return "ModifyOrderCommand{" +
                "orderItem=" + orderItem +
                '}';
    }
}
