package com.bbva.wikj.lib.r111.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.wikj.lib.r111.WIKJR111;
import com.bbva.wikj.lib.r112.WIKJR112;

public abstract class WIKJR111Abstract extends AbstractLibrary implements WIKJR111 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected WIKJR112 wikjR112;

	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

	public void setWikjR112(WIKJR112 wikjR112) {
		this.wikjR112 = wikjR112;
	}

}