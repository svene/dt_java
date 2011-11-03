package org.svenehrke.dt

import org.svenehrke.dt.java.GradleDTBuilder
import org.svenehrke.dt.java.SimpleSwingDTBuilder
import org.svenehrke.dt.java.SimpleJavaDTBuilder

class Invoker {
	Map templates = [
		'simplejava' : new SimpleJavaDTBuilder(),
		'simpleswing' : new SimpleSwingDTBuilder(),
		'gradle' : new GradleDTBuilder()
	]

	def run(String[] args) {
		if (!args) {
			printUsage(templates)
		}
		String key = args[0]
		if (!templates.keySet().contains(key)) {
			printUsage()
		}

		templates[key].createTargetFolder()

	}

	def printUsage(Map aTemplates) {
		println 'Usage: groovy jdt.groovy ' + aTemplates.keySet().join(' | ')
		System.exit(1)
	}

}
