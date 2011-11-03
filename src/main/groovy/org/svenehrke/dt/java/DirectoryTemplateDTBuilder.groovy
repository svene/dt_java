package org.svenehrke.dt.java

import org.svenehrke.directorytemplate.DTInputParameter
import org.svenehrke.directorytemplate.DTUtil

class DirectoryTemplateDTBuilder extends StandardDTBuilder {

	@Override
	String templateName() {
		'directorytemplate'
	}

	@Override
	Map<String, DTInputParameter> newInputParameters() {
		Map<String, DTInputParameter> result = super.newInputParameters()
		result['group'] = new DTInputParameter(value: 'org.mygroup', prompt: 'Maven Group: ')
		result['templatename'] = new DTInputParameter(value: 'MyTemplate', prompt: 'Template name: ')
		result
	}

	@Override
	Map<String, DTInputParameter> newDerivedInputParameters(Map<String, DTInputParameter> aInputParameters) {
		Map<String, DTInputParameter> result = super.newInputParameters()
		String lcTemplatename = aInputParameters.templatename.value.toLowerCase()
		result <<
		[
			'lctemplatename': new DTInputParameter(value: lcTemplatename)
			, 'packagename': new DTInputParameter(value: "${aInputParameters.group.value.toLowerCase()}.$lcTemplatename")
		]
		result
	}

	@Override
	Map<String, String> newFilenameBinding(Map<String, DTInputParameter> aInputParameters) {
		Map result = super.newFilenameBinding(aInputParameters)
		result <<
		[
			'@packagename@':DTUtil.dotsToSlashes(aInputParameters.packagename.value)
			,'@templatename@':aInputParameters.templatename.value
			,'@lctemplatename@':aInputParameters.lctemplatename.value
		]
		result
	}

	@Override
	Map<String, String> newTextBinding(Map<String, DTInputParameter> aInputParameters) {
		Map result = super.newTextBinding(aInputParameters)
		result <<
		[
			'group':aInputParameters.group.value
			,'packagename':aInputParameters.packagename.value
			,'templatename':aInputParameters.templatename.value
			,'lctemplatename':aInputParameters.lctemplatename.value
		]
		result
	}
}
