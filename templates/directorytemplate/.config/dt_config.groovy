def util = new org.svenehrke.directorytemplate.DTUtil()

config {
	parameters = [
		[name: 'group', value: 'org.mycompany', prompt: 'Maven Group: '],
		[name: 'templatename', value: 'mytemplate', prompt: 'Template name: '],
	]
	transformer = { params ->
		def result = []
		result.addAll(params)

		def p = result.find {param -> param.name == 'templatename'}
		result << [name: '@templatename@', value: p.value, prompt: p.prompt]
		String lcTemplatename = p.value.toLowerCase()
		result << [name: 'lctemplatename', value: lctemplatename, prompt: p.prompt]
		result << [name: '@lctemplatename@', value: lcTemplatename, prompt: p.prompt]

		p = result.find {param -> param.name == 'group'}
		result << [name: 'packagename', value: "${p.value.toLowerCase()}.$lcTemplatename", prompt: p.prompt]

		p = result.find {param -> param.name == 'packagename'}
		result << [name: '@packagename@', value: util.dotsToSlashes(p.value), prompt: p.prompt]

		result
	}
	textBinding {
		fileExclusionFilter = { File file ->
			['.png', '.gif'].any {file.name.endsWith(it)}
		}
	}
}
