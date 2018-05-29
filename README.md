#cucumber-java-gradle 
Cómo integrar Cucumber en Gradle.

(Puedes descargar un código de ejemplo con toda esta estructura aquí)

1.Dependencias en nuestro build.gradle

añadir las siguientes líneas:

    
compile group: 'io.cucumber', name: 'cucumber-core', version: '3.0.1'
compile group: 'io.cucumber', name: 'cucumber-java', version: '3.0.1'
testCompile group: 'io.cucumber', name: 'cucumber-junit', version: '3.0.1'

Para terminar de integrar los .jar necesarios, hacemos click derecho sobre nuestro proyecto ->Gradle->Refresh Gradle Project.

2. Creamos un fichero CukesRunner.java dentro de nuestro paquete para tests, con la siguiente estructura:

package es.wata.example;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" }, features = "src/test/resources")
public class CukesRunner {

}

2. Bajo nuestros paquetes, dependencias, build.gradle etc, hay otra carpeta src/test.
Creamos dentro de esta src/test una carpeta features, donde vamos a crear todos nuestros ficheros .feature. 
Cada feature tiene una sintaxis en que presentamos una serie de escenarios (casos concretos del problema a tratar). 
3.Si ahora ejecutamos CukesRunner.java como test unitario (JUnit Test), aparecerá un pseudocódigo, correspondiente al .class que ya rellenamos con las especificaciones en una nueva clase, dentro del mismo paquete en que se encuentra CukesRunner.

