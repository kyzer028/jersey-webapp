package fr.domicalis.care;


import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.TracingConfig;
import org.glassfish.jersey.server.mvc.freemarker.FreemarkerMvcFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.ManagedBean;

@ManagedBean
public class App extends ResourceConfig {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public App() {
        logger.debug("Configure jersey APP.");

        packages("fr.domicalis.care.resources");

//        // Resources.
//        register(DefaultResource.class);
//        register(MyResource.class);


        //property(ServletProperties.FILTER_STATIC_CONTENT_REGEX, "/.*css");
        //property(ServletProperties.FILTER_FORWARD_ON_404 ,true);

        register(FreemarkerMvcFeature.class);
        property(FreemarkerMvcFeature.TEMPLATE_BASE_PATH, "templates");
//        property(FreemarkerMvcFeature.TEMPLATE_OBJECT_FACTORY, FreemarkerFactory.class);

//        property(CommonProperties.METAINF_SERVICES_LOOKUP_DISABLE, true);
//        property(CommonProperties.FEATURE_AUTO_DISCOVERY_DISABLE, true);
//        property(CommonProperties.JSON_PROCESSING_FEATURE_DISABLE, true);
//        property(CommonProperties.MOXY_JSON_FEATURE_DISABLE, true);


        // Logging.
        register(LoggingFeature.class);


        // Tracing support.
        property(ServerProperties.TRACING, TracingConfig.ON_DEMAND.name());

        logger.debug("Configuration done.");
    }


}