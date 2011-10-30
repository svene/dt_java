package org.svenehrke.dt.java

import org.svenehrke.directorytemplate.DTInputParameter

class SimpleJavaDTDefinition extends StandardJavaDTDefinition {

	@Override
	Map<String, DTInputParameter> newInputParameters() {
		Map<String, DTInputParameter> result = super.newInputParameters()
		result['packagename'] = new DTInputParameter(value: 'org.svenehrke.simplejava', prompt: 'Packagename')
		result
	}

	@Override
	String templateName() {
		'simplejava'
	}

}
