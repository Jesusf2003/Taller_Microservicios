package com.payment.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "payment")
public class Payment {

	@Id
	private String id;
	private String cnumber;
	private String cname;
	private String vdate;
	private String secode;
}