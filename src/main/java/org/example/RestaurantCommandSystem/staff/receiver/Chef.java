package org.example.RestaurantCommandSystem.staff.receiver;


import org.example.RestaurantCommandSystem.menu.OrderItem;

//this class RECEIVER
public class Chef {
    public void prepareDish(OrderItem orderItem) {
        // Логіка підготовки страви на основі отриманих даних
        System.out.println("Dish prepared for order: " + orderItem);
    }



}
