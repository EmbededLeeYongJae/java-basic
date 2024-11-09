package class1;

public class ProductOrderMain {

	public static void main(String[] args) {

		ProductOrder[] productOrder = new ProductOrder[3];
		
		ProductOrder product1 = new ProductOrder();
		product1.productName = "두부";
		product1.price = 2000;
		product1.quantity = 2;
		productOrder[0] = product1 ;
		
		ProductOrder product2 = new ProductOrder();
		product2.productName = "김치";
		product2.price = 5000;
		product2.quantity = 1;
		productOrder[1] = product2;
		
		ProductOrder product3 = new ProductOrder();
		product3.productName = "콜라";
		product3.price =5000;
		product3.quantity = 2;
		productOrder[2] = product3;
		
		int totalAmount = 0;
		for(int i = 0; i < productOrder.length; i++) {
			System.out.println("상품명 : " + productOrder[i].productName + ", 가격 " + productOrder[i].price + ", 수량 " + productOrder[i].quantity);
		System.out.println( totalAmount += productOrder[i].price * productOrder[i].quantity); 
		}
		
	}

}
