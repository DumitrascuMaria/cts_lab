package ro.ase.cts.seminar8;

//import ro.ase.cts.seminar8.facade.Kitchen;
import ro.ase.cts.seminar8.facade.OrderFacade;
//import ro.ase.cts.seminar8.facade.Waiter;

public class Main {

	public static void main(String[] args) {
		
		//fara facade
//		Waiter waiter=new Waiter("Marcel");
//		Kitchen kitchen=new Kitchen();
//		
//		waiter.takeOrder();
//		waiter.sendOrderToKitchen();
//		kitchen.prepareFood();
//		kitchen.callWaiter();
//		waiter.serveCustmoer();
//		kitchen.washDishes();
		
		//cu facade
		OrderFacade facade=new OrderFacade();
		facade.order();
		//cuv cheie=complex/complexitate/ ascunderea complexitatii sistemului in sine

	}

}
