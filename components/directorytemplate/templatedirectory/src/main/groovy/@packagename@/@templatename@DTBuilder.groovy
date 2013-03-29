package ${packagename}

import org.svenehrke.directorytemplate.DTInputParameter
import org.svenehrke.directorytemplate.BaseDirectoryTemplateBuilder

class ${templatename}DTBuilder extends BaseDirectoryTemplateBuilder {

	@Override
	String templateName() {
		'${templatename}'
	}

	@Override
	Map<String, DTInputParameter> newInputParameters() {
		Map<String, DTInputParameter> result = super.newInputParameters()
		result <<
		[
			:
		]
		result
	}

	Map<String, DTInputParameter> newDerivedInputParameters(Map<String, DTInputParameter> aInputParameters) {
		Map result = super.newDerivedInputParameters(aInputParameters)
		result <<
		[
			:
		]
		result
	}

	@Override
	Map<String, String> newFilenameBinding(Map<String, DTInputParameter> aInputParameters) {
		Map result = super.newFilenameBinding(aInputParameters)
		result <<
			[
				:
			]
		result
	}
	@Override
	Map<String, String> newTextBinding(Map<String, DTInputParameter> aInputParameters) {
		Map result = super.newTextBinding(aInputParameters)
		result <<
		[
			:
		]
		result
	}
}
