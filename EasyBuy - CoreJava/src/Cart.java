public interface Cart {
    void addItem(Item item, int quantity);
    void removeItem(int itemId);
    void updateItemQuantity(int itemId, int quantity);
    double getTotal();
    void clearCart();
    void displayCart();
    void displayTotalPrice();
}
