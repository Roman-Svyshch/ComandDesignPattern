package org.example.RestaurantCommandSystem;

import org.example.RestaurantCommandSystem.command.CancelOrderCommand;
import org.example.RestaurantCommandSystem.command.ModifyOrderCommand;
import org.example.RestaurantCommandSystem.command.TakeOrderCommand;
import org.example.RestaurantCommandSystem.menu.MenuItem;
import org.example.RestaurantCommandSystem.menu.OrderItem;
import org.example.RestaurantCommandSystem.staff.invoker.Waiter;

public class Main {
    public static void main(String[] args) {
        MenuItem menuItem1 = new MenuItem("Pizza Diavola", "Chilli Pizza", 360);
        MenuItem menuItem2 = new MenuItem("Kebab", "Chilli Kebab", 170);
        MenuItem menuItem3 = new MenuItem("Borch", "Ukrainian Borch with Salo", 120);

        OrderItem orderItem1 = new OrderItem(menuItem1, "With spice chilly sauce");
        OrderItem orderItem2 = new OrderItem(menuItem2);
        OrderItem orderItem3 = new OrderItem(menuItem3);

        Waiter waiter = new Waiter(); // Ініціалізуємо екземпляр класу Waiter
        System.out.println("=================================Take order");

        TakeOrderCommand takeOrderCommand1 = new TakeOrderCommand(orderItem1);
        TakeOrderCommand takeOrderCommand2 = new TakeOrderCommand(orderItem2);
        waiter.takeOrder(orderItem1);
        waiter.takeOrder(orderItem2);
        waiter.takeOrder(orderItem3);
        System.out.println("=================================Modify order");

        ModifyOrderCommand modifyOrderCommand1 = new ModifyOrderCommand(orderItem1);
        waiter.modifyOrder(orderItem1, orderItem3);
        System.out.println(modifyOrderCommand1.toString());

        System.out.println("=================================Cancel order");
        CancelOrderCommand cancelOrderCommand = new CancelOrderCommand(orderItem3);
        System.out.println(cancelOrderCommand.toString());
    }
}
