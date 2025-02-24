package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.user.DtoIn;
import com.bbva.wikj.dto.user.DtoOut;

public abstract class AbstractWIKJT11101MXTransaction extends AbstractTransaction {

	public AbstractWIKJT11101MXTransaction(){
	}

	protected DtoIn getDtoin(){
		return (DtoIn)this.getParameter("dtoIn");
	}

	protected void setDtoout(final DtoOut field){
		this.addParameter("dtoOut", field);
	}
}
