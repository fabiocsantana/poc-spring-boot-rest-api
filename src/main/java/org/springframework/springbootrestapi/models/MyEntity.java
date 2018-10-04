package org.springframework.springbootrestapi.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "id", "creation_date", "name", "value" })
public class MyEntity {
	@JsonProperty(value = "id")
	private Long id;

	@JsonProperty(value = "creation_date")
	private LocalDateTime creationDate;

	@JsonProperty(value = "name")
	private String name;

	@JsonProperty(value = "value")
	private BigDecimal value;

	public MyEntity() {
	}

	public MyEntity(Long id, LocalDateTime creationDate, String name, BigDecimal value) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.name = name;
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
