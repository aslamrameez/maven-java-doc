package org.binary.maven.plugin.doc;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

@Mojo( name = "javadoc", defaultPhase = LifecyclePhase.DEPLOY, requiresDependencyResolution = ResolutionScope.TEST, requiresProject = true, threadSafe = true )
public class JavaDocMojo extends AbstractDocMojo{

	public void execute() throws MojoExecutionException, MojoFailureException {
		
	}

}
