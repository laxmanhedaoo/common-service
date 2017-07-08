package com.common.enums;

public enum ServiceEnum {

	USER("user"), NOTIFICATION("notification"), TASK("task");

	private ServiceEnum(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return this.name;
	}

}
