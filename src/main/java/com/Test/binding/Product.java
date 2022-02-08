package com.Test.binding;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	private Integer productid;

	private String productname;

	private String productcost;
}
