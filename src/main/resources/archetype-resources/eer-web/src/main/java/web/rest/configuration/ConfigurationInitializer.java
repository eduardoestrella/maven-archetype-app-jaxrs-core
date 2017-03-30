#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.rest.configuration;

import org.apache.log4j.Logger;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.xml.DOMConfigurator;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.net.URL;
import java.util.Set;

public class ConfigurationInitializer  implements ServletContainerInitializer {

    /** Log variable **/
    private static final Logger LOGGER = Logger.getLogger(ConfigurationInitializer.class);

    /** Nombre del fichero de propiedades del log4j **/
    private static final String lOG4J_XML_FILENAME = "META-INF/conf-log4j.xml";

    public void onStartup(Set<Class<?>> arg0, ServletContext servletContext) throws ServletException {

        // Cargamos el fichero de propiedades del LOG de la aplicación
        loadLog4j();
    }

    /**
     * Carga el fichero de propiedades del Log4j
     */
    private void loadLog4j() {
        URL log4jXMLURL = Loader.getResource(lOG4J_XML_FILENAME);
        DOMConfigurator.configure(log4jXMLURL);
    }

}
