public class FoodOrderSystem {

    enum OrderStatus {
        RECEIVED("Order Received"),
        PREPARING("Preparing Food"),
        READY("Ready for Delivery"),
        DELIVERED("Delivered"),
        CANCELLED("Cancelled");
        
        private final String statusName;
        
        OrderStatus(String statusName) {
            this.statusName = statusName;
        }
        
        public String getStatusName() {
            return statusName;
        }
    }

    static class FoodOrder {
        private final int orderId;
        private OrderStatus status;
        
        public FoodOrder(int orderId) {
            this.orderId = orderId;
            this.status = OrderStatus.RECEIVED;
        }
        
        public void updateStatus(OrderStatus newStatus) {
            this.status = newStatus;
        }
        
        public void displayStatus() {
            System.out.println("Order ID: #" + orderId);
            System.out.println("Current Status: " + status.getStatusName());
            System.out.println();
        }
        
        public boolean isDelivered() {
            return status == OrderStatus.DELIVERED;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Food Order Tracking System ===");
        
        FoodOrder order = new FoodOrder(101);
        order.displayStatus();
        
        changeStatus(order, OrderStatus.PREPARING);
        changeStatus(order, OrderStatus.READY);
        changeStatus(order, OrderStatus.DELIVERED);
        
        if (order.isDelivered()) {
            System.out.println("Order successfully delivered!");
        }
    }
    
    private static void changeStatus(FoodOrder order, OrderStatus newStatus) {
        System.out.println("Updating status to: " + newStatus.getStatusName());
        order.updateStatus(newStatus);
        order.displayStatus();
    }
}
