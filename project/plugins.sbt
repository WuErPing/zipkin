
resolvers ++= Seq(
  "gradle" at "http://gradle.artifactoryonline.com/gradle/libs/",
  "maven" at "http://repo1.maven.org/maven2/",
  "ibiblio" at "http://mirrors.ibiblio.org/maven2",
  // "travisci-central" at "http://maven.travis-ci.org/nexus/content/repositories/central/",
  // "travisci-sonatype" at "http://maven.travis-ci.org/nexus/content/repositories/sonatype/",
  "twitter.com" at "http://maven.twttr.com/",  
  "freemarker" at "http://freemarker.sourceforge.net/maven2/",
  "local" at ("file:" + System.getProperty("user.home") + "/.m2/repository/"))


libraryDependencies ++= Seq(
    "com.google.collections" % "google-collections" % "0.8",
    "org.codehaus.plexus"    % "plexus-utils"       % "1.5.4",
    "org.slf4j"              % "slf4j-api"          % "1.6.1",
    "org.slf4j"              % "slf4j-simple"       % "1.6.1",
    "com.twitter"            % "scrooge-generator"  % "3.1.1")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")