package com.ubiqube.parser.tosca.deserializer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ubiqube.parser.tosca.Import;
import com.ubiqube.parser.tosca.Imports;

public class ImportDeserializer extends StdDeserializer<Imports> {
	/** serial. */
	private static final long serialVersionUID = 1L;

	public ImportDeserializer() {
		this(null);
	}

	public ImportDeserializer(final Class<?> vc) {
		super(vc);
	}

	@Override
	public Imports deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException {
		final Map<String, Import> imports = new HashMap<>();
		final ArrayNode value = p.getCodec().readTree(p);
		for (final JsonNode jsonNode : value) {
			if (jsonNode.isObject()) {
				final ObjectNode node = (ObjectNode) jsonNode;
				final Iterator<Entry<String, JsonNode>> fields = node.fields();
				while (fields.hasNext()) {
					final Entry<String, JsonNode> entry = fields.next();
					final Import imprt = new Import(entry.getKey(), entry.getValue().asText());
					imports.put(entry.getKey(), imprt);
				}
			} else if (jsonNode.isTextual()) {
				final String key = UUID.randomUUID().toString();
				final Import imprt = new Import(key, jsonNode.asText());
				imports.put(key, imprt);
			}
		}

		return new Imports(imports);
	}

}
