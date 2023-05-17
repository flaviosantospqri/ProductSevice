package flavio.spring.course.entities.enums;

public enum OrderStatus {
    WAITTING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code){
        for(OrderStatus order: OrderStatus.values()){
            if(order.code == code){
                return order;
            }
        }
        throw new IllegalArgumentException("No Order Status defined to this number");
    }
}
