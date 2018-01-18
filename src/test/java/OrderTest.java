import static org.fest.assertions.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

import com.tws.money.Customer;
import com.tws.money.CustomerRepository;
import com.tws.money.Invoice;
import com.tws.money.Order;
import com.tws.money.OrderRepository;
import com.tws.money.OrderService;
import com.tws.money.CustomerService;
import com.tws.money.PayMent;
import com.tws.money.Receiver;
import com.tws.money.SendInfo;

public class OrderTest {

	@Test
	public void saveTest() {
		
		OrderRepository orderRep = OrderRepository.getInstance();
		Customer cs = new Customer("YY");
		Receiver re = new Receiver("123", "123", "NN");
		SendInfo sndInf = new SendInfo("213", "213", "213");
		PayMent payment = new PayMent("345", "456");
		Invoice invoice = new Invoice("ad", "ad");
		Order order = new Order(null, re, sndInf, cs, invoice, payment);
		orderRep.storeOrder(order);
		Order outOrder = orderRep.findOrder(order.getId());
		assertThat(outOrder).isEqualTo(order);
	}
	
	@Test
	public void payTest() {
		OrderRepository orderRep = OrderRepository.getInstance();
		Customer cs = new Customer("YY");
		Receiver re = new Receiver("123", "123", "NN");
		SendInfo sndInf = new SendInfo("213", "213", "213");
		PayMent payment = new PayMent("345", "456");
		Invoice invoice = new Invoice("ad", "ad");
		Order order = new Order(null, re, sndInf, cs, invoice, payment);
		orderRep.storeOrder(order);
		OrderService os = new OrderService();
		os.payProcess(order.getId());
		Order outOrder = orderRep.findOrder(order.getId());
		assertThat(outOrder.getStatus()).isEqualTo("P");
	}
	
	@Test
	public void changeReceiverTest() {
		OrderRepository orderRep = OrderRepository.getInstance();
		CustomerRepository csRep = CustomerRepository.getInstance();
		Customer cs = new Customer("YY");
		Receiver re = new Receiver("123", "123", "NN");
		SendInfo sndInf = new SendInfo("213", "213", "213");
		PayMent payment = new PayMent("345", "456");
		Invoice invoice = new Invoice("ad", "ad");
		Order order = new Order(null, re, sndInf, cs, invoice, payment);
		OrderService os = new OrderService();
		CustomerService css = new CustomerService();
		orderRep.storeOrder(order);
		csRep.appendOrUpdateCustomer(cs);
		Receiver re2 = new Receiver("124", "124", "NN");
		cs.appendReceiver(re2);
	}
}
