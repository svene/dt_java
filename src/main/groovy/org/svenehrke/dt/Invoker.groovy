package org.svenehrke.dt

import org.svenehrke.dt.java.GradleDTBuilder
import org.svenehrke.dt.java.SimpleSwingDTBuilder
import org.svenehrke.dt.java.SimpleJavaDTBuilder
import org.svenehrke.dt.java.DirectoryTemplateDTBuilder

class Invoker {
	Map templates = [
		'simplejava' : new SimpleJavaDTBuilder()
		, 'simpleswing' : new SimpleSwingDTBuilder()
		, 'gradle' : new GradleDTBuilder()
		, 'directorytemplate' : new DirectoryTemplateDTBuilder()
	]

	def run(String[] args) {
		if (!args) {
			printUsage(templates)
		}
		String key = args[0]
		if (!templates.keySet().contains(key)) {
			printUsage(templates)
		}

		templates[key].createTargetFolder()

	}

	def printUsage(Map aTemplates) {
		println 'Usage: groovy jdt.groovy ' + aTemplates.keySet().join(' | ')
		System.exit(1)
	}

}
