package br.com.sprj.microservice.store.model;

public class Purchase {

	private Long orderId;
	private Integer preparatiomTime;
	private String address;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Integer getPreparatiomTime() {
		return preparatiomTime;
	}

	public void setPreparatiomTime(Integer preparatiomTime) {
		this.preparatiomTime = preparatiomTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
