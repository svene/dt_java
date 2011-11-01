package org.svenehrke.dt.java

import org.svenehrke.directorytemplate.DTInputParameter

class SimpleSwingDTBuilder extends StandardJavaDTBuilder {

	@Override
	Map<String, DTInputParameter> newInputParameters() {
		Map<String, DTInputParameter> result = super.newInputParameters()
		result['packagename'] = new DTInputParameter(value: 'org.svenehrke.simpleswing', prompt: 'Packagename')
		result
	}

	@Override
	String templateName() {
		'simpleswing'
	}

}
