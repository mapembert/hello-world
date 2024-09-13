Copy TririgaBusinessConnect.jar and TririgaCustomTask.jar from your TRIRIGA install into this directory. Then run:

mvn install:install-file -DgroupId=com.tririga -DartifactId=business-connect -Dversion=1.0 -Dpackaging=jar -Dfile=TririgaBusinessConnect.jar

mvn install:install-file -DgroupId=com.tririga -DartifactId=custom-task -Dversion=1.0 -Dpackaging=jar -Dfile=TririgaCustomTask.jar

This will install those files into your local Maven repository (you only need to do this once, globally).

Then do:

mvn clean install

This will build the project into target/hello-world.jar. This build does a source bundle, so the jarfile also includes the source tree to build itself; if you don't want that you can comment out the noted part in the pom.xml.

Then you would create a TRIRIGA ClassLoader record named "HelloWorld" (it has to be named that - the ClassLoader name has to match the name of the IConnect implementation class, which has to be in the "com.tririga.custom" Java package). Then create a "hello-world.jar" ResourceFile record under that ClassLoader and upload the jarfile to the binary field on that.

Then you should be able to go to either of these URLs to see it in action:


http://localhost:8001/html/en/default/rest/HelloWorld

http://localhost:8001/rest/HelloWorld

