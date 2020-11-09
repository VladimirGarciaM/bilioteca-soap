package com.ixcorp.app.bibliotecasoap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

import java.util.ArrayList;
import java.util.List;

@EnableWs
@Configuration
public class SoapWebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServelet(ApplicationContext context) {
        MessageDispatcherServlet dispatcherServlet = new MessageDispatcherServlet();
        dispatcherServlet.setApplicationContext(context);
        dispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(dispatcherServlet, "/soapWs/*");
    }

    @Bean
    public XsdSchema usXsdSchema() {
        return new SimpleXsdSchema(new ClassPathResource("autor.xsd"));
    }


   /* @Bean(name = "users")
    public DefaultWsdl11Definition wsdl11Definition(XsdSchema xsdSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setSchema(xsdSchema);
        wsdl11Definition.setLocationUri("/soapWs");
        wsdl11Definition.setPortTypeName("userService");
        wsdl11Definition.setTargetNamespace("http:/ixcorp.com.pe/biblioteca-soap/users");
        //wsdl11Definition.setSchemaCollection(updateContactXsd());
        return wsdl11Definition;
    }*/

    @Bean(name = "autor")
    public DefaultWsdl11Definition wsdl11Definition1(XsdSchema xsdSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setSchema(xsdSchema);
        wsdl11Definition.setLocationUri("/soapWs");
        wsdl11Definition.setPortTypeName("autorService");
        wsdl11Definition.setTargetNamespace("http:/ixcorp.com.pe/biblioteca-soap/autor");
        return wsdl11Definition;
    }

    public Resource[] getSchemas() {
        List<Resource> schemaResources = new ArrayList<>();
        schemaResources.add(new ClassPathResource("firstService.xsd"));
        schemaResources.add(new ClassPathResource("secondService.xsd"));
        schemaResources.add(new ClassPathResource("thirdService.xsd"));
        return schemaResources.toArray(new Resource[schemaResources.size()]);
    }

   /* @Bean
    public XsdSchemaCollection updateContactXsd() throws Exception {
        CommonsXsdSchemaCollection xsds = new CommonsXsdSchemaCollection(new ClassPathResource("xsds/contact/outboundMessage.xsd"));
        xsds.setInline(true);
        return xsds;
    }*/
}
