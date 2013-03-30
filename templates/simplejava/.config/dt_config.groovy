def util = new org.svenehrke.directorytemplate.DTUtil()

config {
	parameters = [
		[name: 'packagename', value: 'org.svenehrke.simplejava', prompt: 'Packagename'],
	]
	transformer = { params ->
		def result = []
		result.addAll(params)

		def p = params.find {param -> param.name == 'packagename'}
		result << [name: '@packagename@', value: util.dotsToSlashes(p.value), prompt: p.prompt]

		result
	}
	textBinding {
		fileExclusionFilter = { File file ->
			['.png', '.gif'].any {file.name.endsWith(it)}
		}
	}
}
