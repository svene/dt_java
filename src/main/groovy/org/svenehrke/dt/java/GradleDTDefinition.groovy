package org.svenehrke.dt.java

import org.svenehrke.directorytemplate.BaseDTDefinition
import org.svenehrke.directorytemplate.DTInputParameter
import org.svenehrke.directorytemplate.DTUtil

class GradleDTDefinition extends StandardDTDefinition {

	@Override
	Map<String, DTInputParameter> newInputParameters() {
		Map<String, DTInputParameter> result = super.newInputParameters()
		result['packagename'] = new DTInputParameter(value: 'org.svenehrke.simplejava', prompt: 'Packagename')
		result
	}

	@Override
	void addDerivedInputParameters(Map<String, DTInputParameter> aInputParameters) {
//		aInputParameters['appPackageName'] = new DTInputParameter(value: aInputParameters.extPackageName.value.replace('extension', 'app'), prompt: '-')
	}

	@Override
	Map<String, String> getTextBinding() {
		Map result = super.getTextBinding()
		result <<
		[
			'packagename':inputParameters.packagename.value
		]
		result
	}

	@Override
	String getZipName() {
		'dt_gradle.zip'
	}
}
