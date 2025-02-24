package com.bbva.wikj.lib.r112;

import java.util.Map;

public interface WIKJR112 {

	Map<String, Object> executeSelect(String nuip);

	 int executeInsert(Map<String, Object> args);
}
