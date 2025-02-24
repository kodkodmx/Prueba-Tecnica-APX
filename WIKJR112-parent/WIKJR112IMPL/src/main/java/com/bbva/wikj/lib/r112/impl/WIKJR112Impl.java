package com.bbva.wikj.lib.r112.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

public class WIKJR112Impl extends WIKJR112Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR112Impl.class);

	@Override
	public Map<String, Object> executeSelect(String nuip) {
		return this.jdbcUtils.queryForMap("query.query1",nuip);
	}

	@Override
	public int executeInsert(Map<String, Object> args) {
		return this.jdbcUtils.update("query.query2", args);
	}
}
