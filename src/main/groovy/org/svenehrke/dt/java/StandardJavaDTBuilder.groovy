package org.svenehrke.dt.java

import org.svenehrke.directorytemplate.DTInputParameter
import org.svenehrke.directorytemplate.DTUtil

abstract class StandardJavaDTBuilder extends StandardDTBuilder {

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

}
