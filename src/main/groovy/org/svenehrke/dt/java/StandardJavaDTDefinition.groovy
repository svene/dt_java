package org.svenehrke.dt.java

import org.svenehrke.directorytemplate.DTInputParameter
import org.svenehrke.directorytemplate.DTUtil

class StandardJavaDTDefinition extends StandardDTDefinition {

	@Override
	Map<String, DTInputParameter> newInputParameters() {
		def result = super.newInputParameters()
		result
	}

	@Override
	void addDerivedInputParameters(Map<String, DTInputParameter> aInputParameters) {
//		aInputParameters['appPackageName'] = new DTInputParameter(value: aInputParameters.extPackageName.value.replace('extension', 'app'), prompt: '-')
	}

	@Override
	Map<String, String> getFilenameBinding() {
		Map result = super.getFilenameBinding()
		result <<
		[
			'@packagename@':DTUtil.dotsToSlashes(inputParameters.packagename.value)
		]
		result
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
	List<String> getExclusions() {
		['.gif', '.png']
	}

	@Override
	String getZipName() {
		'dt_simplejava.zip'
	}
}
