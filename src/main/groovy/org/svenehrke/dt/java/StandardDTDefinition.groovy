package org.svenehrke.dt.java

import org.svenehrke.directorytemplate.BaseDTDefinition
import org.svenehrke.directorytemplate.DTInputParameter

class StandardDTDefinition extends BaseDTDefinition {

	@Override
	Map<String, DTInputParameter> newInputParameters() {
		Map<String, DTInputParameter> result = [:]
		result['ROOT_FOLDER'] = new DTInputParameter(value: 'myproject', prompt: 'Projectname (name of root folder)')
		result
	}

	@Override
	void addDerivedInputParameters(Map<String, DTInputParameter> aInputParameters) {
//		aInputParameters['appPackageName'] = new DTInputParameter(value: aInputParameters.extPackageName.value.replace('extension', 'app'), prompt: '-')
	}

	@Override
	Map<String, String> getFilenameBinding() {
		[
			//todo: apply from input parameters automatically?:
			'@ROOT_FOLDER@':inputParameters.ROOT_FOLDER.value,
		]
	}

	@Override
	Map<String, String> getTextBinding() {
		[
			:
		]
	}

	@Override
	List<String> getExclusions() {
		['.gif', '.png']
	}

	@Override
	String getZipName() {
		'dt_somezip.zip'
	}
}
