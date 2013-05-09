def util = new org.svenehrke.directorytemplate.DTUtil()

config {
	parameters = [
		//[name: 'packagename', value: 'com.company.package', prompt: 'Packagename'],
	]
	transformer = { params ->
		def result = []
		result.addAll(params)

		result
	}
	textBinding {
		fileExclusionFilter = { File file ->
			['.jar'].any {file.name.endsWith(it)}
		}
	}
}
