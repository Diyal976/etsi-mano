package com.ubiqube.parser.tosca;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ubiqube.parser.tosca.constraints.Constraint;

public class ValueObject {
	private String type;
	private Boolean required = Boolean.TRUE;
	private Object def;
	private String description;
	private EntrySchema entrySchema;
	private List<Constraint> constraints = new ArrayList<>();
	private String status;

	public static ValueObject createList(final String type) {
		final ValueObject vo = new ValueObject();
		vo.setType("list");
		final EntrySchema entrySchema = new EntrySchema();
		entrySchema.setType(type);
		vo.setEntrySchema(entrySchema);
		return vo;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setRequired(final Boolean required) {
		this.required = required;
	}

	@JsonProperty("default")
	public Object getDef() {
		return def;
	}

	public void setDef(final Object def) {
		this.def = def;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@JsonProperty("entry_schema")
	public EntrySchema getEntrySchema() {
		return entrySchema;
	}

	public void setEntrySchema(final EntrySchema entrySchema) {
		this.entrySchema = entrySchema;
	}

	public List<Constraint> getConstraints() {
		return constraints;
	}

	public void setConstraints(final List<Constraint> constraints) {
		this.constraints = constraints;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("ValueObject [type=" + type + ", ");
		if (null != required) {
			sb.append("required=" + required + ", ");
		}
		if (null != def) {
			sb.append("def=" + def + ", ");
		}
		if (null != description) {
			sb.append("description=" + description.replace("\n", " ") + ", ");
		}
		if (null != entrySchema) {
			sb.append("entrySchema=" + entrySchema + ", ");
		}
		if (null != constraints) {
			sb.append("constraints=" + constraints + ", ");
		}
		if (null != status) {
			sb.append("status=" + status);
		}
		sb.append("]\n");
		return sb.toString();
	}

}
