package org.svenehrke.dt.java

import org.svenehrke.directorytemplate.DTInputParameter

class GradleDTDefinition extends StandardDTDefinition {

	@Override
	Map<String, DTInputParameter> newInputParameters() {
		Map<String, DTInputParameter> result = super.newInputParameters()
		result['packagename'] = new DTInputParameter(value: 'org.svenehrke.simplejava', prompt: 'Packagename')
		result
	}

	@Override
	Map<String, String> newTextBinding(Map<String, DTInputParameter> aInputParameters) {
		Map result = super.newTextBinding(aInputParameters)
		result <<
		[
			'packagename':inputParameters.packagename.value
		]
		result
	}

	@Override
	String templateName() {
		'gradle'
	}

}
