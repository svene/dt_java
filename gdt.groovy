@GrabResolver(name='sven-github', root='http://svene.github.com/maven2/releases')
@Grab(group='org.svenehrke', module='dt_java', version='0.0.6')
import org.svenehrke.dt.Invoker

new Invoker().run(args)
