
@Grab(group='org.eclipse.jgit', module='org.eclipse.jgit', version='2.3.1.201302201838-r')
import org.eclipse.jgit.storage.file.FileRepositoryBuilder
import org.eclipse.jgit.lib.Repository
import org.eclipse.jgit.api.Git
import org.eclipse.jgit.api.CloneCommand
import org.eclipse.jgit.api.ReflogCommand

if (args.size() < 1 || args.size() > 4) {
	printUsage()
	System.exit(1)
}
def gitHubMode = args[0] == '-github'

String userHome = System.properties['user.home']
String gdtHome = System.properties['user.home'] + '/.gdt'

String ghUserName = 'svene'
String ghRepoName = 'dt_java'
String templateDirectory = 'templatedirectory'
String remoteUrl
String localRepoLocation
if (gitHubMode) {
	if (args.size() < 3) {
		printUsage()
		System.exit(1)
	}
	ghUserName = args[1]
	ghRepoName = args[2]
	if (args.size() > 3) {
		templatedirectory = args[3]
	}
	remoteUrl = "https://github.com/${ghUserName}/${ghRepoName}.git"
	localRepoLocation = "${gdtHome}/${ghRepoName}"
}
else {
	println 'Non github mode not supported yet'
	System.exit(0)

	remoteUrl = args[0]
	if (args.size() > 1) {
		templatedirectory = args[1]
	}
}



FileRepositoryBuilder builder = new FileRepositoryBuilder();
Repository repository = builder.setWorkTree(new File(gdtHome)).build()
Git git = new Git(repository);
CloneCommand clone = git.cloneRepository();
clone.setBare(false);
clone.setCloneAllBranches(true);
clone.setDirectory(new File(localRepoLocation)).setURI(remoteUrl);
clone.call();

println "Repository ${ghUserName}/${ghRepoName} cloned into local folder ${ghRepoName}"

def printUsage() {
	println """
	usage:
	  groovy gdt2.groovy <repourl> <templatedirectory (default='templatedirectory')>
	  groovy gdt2.groovy -github <user> <repo> <templatedirectory (default='templatedirectory')>

	examples:
	  groovy gdt2.groovy https://github.com/svene/dt_java.git
	  groovy gdt2.groovy -github svene dt_java
	"""
}


//----------------------------------------------------
/*
git.checkout().setName('eb36bddf2fff3d74d2bafdc510481422408beff2').call()

ReflogCommand rlc = new ReflogCommand()
rlc.setRef('d1c7c7877430ee122bbc14241f920c1fea34b27e')
rlc.call()
*/
