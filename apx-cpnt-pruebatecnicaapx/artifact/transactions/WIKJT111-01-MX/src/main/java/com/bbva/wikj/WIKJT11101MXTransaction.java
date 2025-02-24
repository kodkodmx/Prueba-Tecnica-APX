package com.bbva.wikj;

import com.bbva.wikj.dto.user.DtoOut;
import com.bbva.wikj.lib.r111.WIKJR111;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WIKJT11101MXTransaction extends AbstractWIKJT11101MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT11101MXTransaction.class);


	@Override
	public void execute() {
		WIKJR111 wikjR111 = this.getServiceLibrary(WIKJR111.class);
		DtoOut dtoOut = wikjR111.execute(this.getDtoin());
		this.setDtoout(dtoOut);
	}

}
