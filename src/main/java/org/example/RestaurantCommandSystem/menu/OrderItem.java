package org.example.RestaurantCommandSystem.menu;

public class OrderItem {
  private MenuItem menuItem;
  private String additionalOptions;

  public OrderItem() {
  }

  public OrderItem(MenuItem menuItem) {
    this.menuItem = menuItem;
  }

  public OrderItem(MenuItem menuItem, String additionalOptions) {
    this.menuItem = menuItem;
    this.additionalOptions = additionalOptions;
  }

  public MenuItem getMenuItem() {
    return menuItem;
  }

  public void setMenuItem(MenuItem menuItem) {
    this.menuItem = menuItem;
  }

  public String getAdditionalOptions() {
    return additionalOptions;
  }

  public void setAdditionalOptions(String additionalOptions) {
    this.additionalOptions = additionalOptions;
  }

  @Override
  public String toString() {
    return "OrderItem{" +
            "menuItem=" + menuItem +
            ", additionalOptions='" + additionalOptions + '\'' +
            '}';
  }
}
