package com.certificate.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Data
@AllArgsConstructor
@Document(collection = "certificate")
public class Certificate {

	@Id
	private String id;
	private String name;
	private String type;
	private String title;
	private String date;
	private String exp;
}