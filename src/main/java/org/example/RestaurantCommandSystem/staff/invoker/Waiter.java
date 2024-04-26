package org.example.RestaurantCommandSystem.staff.invoker;


import org.example.RestaurantCommandSystem.menu.OrderItem;

import java.util.LinkedList;
import java.util.Queue;

//this class INVOKER
public class Waiter {
    private Queue<OrderItem> currentOrders;
//    private Queue<OrderItem> orderQueue;
//    private Queue<OrderItem> historyOfOrders;

    public Waiter() {
        this.currentOrders = new LinkedList<>();
    }

    public void takeOrder(OrderItem orderItem){
        currentOrders.add(orderItem);
        System.out.println("Order taken : " + orderItem);
    }
    public void cancelOrder(OrderItem orderItem){
        currentOrders.remove(orderItem);
        System.out.println(orderItem + "was canceled");
    }
    public void modifyOrder(OrderItem oldOrderItem,OrderItem newOrderItem){
        currentOrders.remove(oldOrderItem);
        currentOrders.add(newOrderItem);
        System.out.println(oldOrderItem.toString() + "\nwas modified to " + "\n"+newOrderItem.toString());
    }
}
