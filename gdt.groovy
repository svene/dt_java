@GrabResolver(name='sven-github', root='http://svene.github.com/maven2/releases')
@Grapes([
	@Grab(group='org.svenehrke', module='dt_java', version='0.0.2')
])
import org.svenehrke.dt.java.SimpleJavaDTBuilder
import org.svenehrke.dt.java.SimpleSwingDTBuilder
import org.svenehrke.dt.java.GradleDTBuilder

Map templates = [
	'simplejava' : new SimpleJavaDTDefinition(),
	'simpleswing' : new SimpleSwingDTDefinition(),
	'gradle' : new GradleDTDefinition()
]

if (!args) {
	printUsage(templates)
}
String key = args[0]
if (!templates.keySet().contains(key)) {
	printUsage()
}

templates[key].createTargetFolder()

def printUsage(Map aTemplates) {
	println 'Usage: groovy jdt.groovy ' + aTemplates.keySet().join(' | ')
	System.exit(1)
}

