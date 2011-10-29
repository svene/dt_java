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
	Map<String, String> newFilenameBinding(Map<String, DTInputParameter> aInputParameters) {
		Map result = super.newFilenameBinding(aInputParameters)
		result <<
		[
			'@packagename@':DTUtil.dotsToSlashes(aInputParameters.packagename.value)
		]
		result
	}

	@Override
	Map<String, String> newTextBinding(Map<String, DTInputParameter> aInputParameters) {
		Map result = super.newTextBinding(aInputParameters)
		result <<
		[
			'packagename':aInputParameters.packagename.value
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
