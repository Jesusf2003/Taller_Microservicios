package com.order.domain;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

	private String id;
	private String cnumber;
	private String cname;
	private String vdate;
	private String secode;
}