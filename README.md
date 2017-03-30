# Maven Archetype App-Rest-Core

This Maven Archetype generate a base project with 3 modules:

- **App** (ear). Application container
- **Web** (was). Web proyect with jax-rs for use with Api RestFul
- **Core** (jar). MicroService SOA Library

# Generate Archetype 

- [eer-archetype-rest-core-1.0-SNAPSHOT](https://github.com/eduardoestrella/maven-archetype-rest-core/blob/master/target/eer-archetype-rest-core-1.0-SNAPSHOT.jar)

# How to generate local Archetype

You have to `cd` in the parent archetype (in our case in root path of repository) and run:

``` $ mvn install ```

This will regenerate the `target` and the `eer-archetype-rest-core-1.0-SNAPSHOT]` jar file, if you want to change the archetype project, remember to edit the archetype `pom.xml` file `groupId` and `artifactId` properties

# How to generate the project base

Type:

``` $ mvn archetype:generate ```

Your newly deployed archetype will be listed as the last one of a list that will appear in your terminal, choose the archetype, fill in the parameters and hit enter, open up your file browser and check that all the generated files accomodates to the supplied parameters.

# More info
- https://maven.apache.org/guides/mini/guide-creating-archetypes.html
- http://geekofficedog.blogspot.com.es/2013/08/creating-maven-archetypes-tutorial.html

