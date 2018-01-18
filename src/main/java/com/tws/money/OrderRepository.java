package com.tws.money;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
	private Map<String, Order> orderRep;
	private String path = "C:\\Users\\lizhongxiang\\workspace\\java-basic-project-master\\order.txt";
	private static OrderRepository instance;
	private OrderRepository() {
		this.orderRep = new HashMap<String, Order>();
	}
	
	public static OrderRepository getInstance() {
		if(instance == null) {
			instance = new OrderRepository();
		}
		return instance;
	}
	
	public Order findOrder(String id) {
		return this.orderRep.get(id);
	}
	
	public void storeOrder(Order order) {
		this.orderRep.put(order.getId(), order);
	}
	
	public void deleteOrder() {
		
	}
	
	public void storeToFile(Order order) throws IOException {
		File file = new File(path);
		if(!file.exists()){
            file.getParentFile().mkdirs();          
        }
        file.createNewFile();

        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(order.toString());
        bw.flush();
        bw.close();
	}
}
