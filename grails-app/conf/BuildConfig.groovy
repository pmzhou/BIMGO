grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
        build 'joda-time:joda-time:2.1'
        build('org.apache.poi:poi:3.8')
        build('org.apache.poi:poi-ooxml:3.8')
        build('org.apache.poi:poi-ooxml-schemas:3.8')
        build('org.apache.commons:commons-compress:1.4.1')
        // runtime 'mysql:mysql-connector-java:5.1.20'
        compile "org.apache.httpcomponents:httpclient:4.2.1"
    }

    plugins {
        runtime ':mongodb:1.1.0.GA'
        //runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.7.2"
        runtime ":jquery-ui:1.8.15"
        runtime ":resources:1.1.6"

        // Uncomment these (or add new ones) to enable additional resources capabilities
        //runtime ":zipped-resources:1.0"
        //runtime ":cached-resources:1.0"
        //runtime ":yui-minify-resources:0.1.4"
        //runtime ":database-migration:1.1"

        build ":tomcat:$grailsVersion"

        compile ':cache:1.0.0'
    }
}
