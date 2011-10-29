package org.svenehrke.dt.java

import org.svenehrke.directorytemplate.DTInputParameter
import org.svenehrke.directorytemplate.BaseDirectoryTemplateBuilder

class StandardDTDefinition extends BaseDirectoryTemplateBuilder {

	@Override
	Map<String, String> newFilenameBinding(Map<String, DTInputParameter> aInputParameters) {
		[:]
	}

	@Override
	Map<String, String> newTextBinding(Map<String, DTInputParameter> aInputParameters) {
		[:]
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
