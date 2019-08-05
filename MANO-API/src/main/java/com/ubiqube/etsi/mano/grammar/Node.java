package com.ubiqube.etsi.mano.grammar;

public class Node {

	public enum Operand {
		EQ("eq"),
		NEQ("neq"),
		GT("gt"),
		LT("lt"),
		GTE("gte"),
		LTE("lte"),
		CONT("cont"),
		NCONT("ncont");

		public final String op;

		private Operand(String _op) {
			op = _op;
		}
	}

	private String name;
	private Operand op;
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Operand getOp() {
		return op;
	}

	public void setOp(Operand op) {
		this.op = op;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [name=" + name + ", op=" + op + ", value=" + value + "]";
	}

}