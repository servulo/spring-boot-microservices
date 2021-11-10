package br.com.sprj.microservice.store.dto;

public class OrderItemDTO {

	private Long id;
	private Integer preparationDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPreparationDate() {
		return preparationDate;
	}

	public void setPreparationDate(Integer preparationDate) {
		this.preparationDate = preparationDate;
	}

}
