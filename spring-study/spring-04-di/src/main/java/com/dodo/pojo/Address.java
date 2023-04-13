package com.dodo.pojo;

import java.util.StringJoiner;

public class Address {
		private String address;
		
		public String getAddress() {
				return address;
		}
		
		public void setAddress(String address) {
				this.address = address;
		}
		
		@Override
		public String toString() {
				return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
						.add("address='" + address + "'")
						.toString();
		}
}