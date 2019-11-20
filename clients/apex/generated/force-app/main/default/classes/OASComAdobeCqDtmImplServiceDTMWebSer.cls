/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OAS-api/OAS-codegen.git
 * Do not edit the class manually.
 */

/**
 * OASComAdobeCqDtmImplServiceDTMWebSer
 */
public class OASComAdobeCqDtmImplServiceDTMWebSer implements OAS.MappedProperties {
    /**
     * Get connectionTimeout
     * @return connectionTimeout
     */
    public OASConfigNodePropertyInteger connectionTimeout { get; set; }

    /**
     * Get socketTimeout
     * @return socketTimeout
     */
    public OASConfigNodePropertyInteger socketTimeout { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'connection.timeout' => 'connectionTimeout',
        'socket.timeout' => 'socketTimeout'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeCqDtmImplServiceDTMWebSer getExample() {
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties = new OASComAdobeCqDtmImplServiceDTMWebSer();
          comAdobeCqDtmImplServiceDTMWebServiceImplProperties.connectionTimeout = OASConfigNodePropertyInteger.getExample();
          comAdobeCqDtmImplServiceDTMWebServiceImplProperties.socketTimeout = OASConfigNodePropertyInteger.getExample();
        return comAdobeCqDtmImplServiceDTMWebServiceImplProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeCqDtmImplServiceDTMWebSer) {           
            OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties = (OASComAdobeCqDtmImplServiceDTMWebSer) obj;
            return this.connectionTimeout == comAdobeCqDtmImplServiceDTMWebServiceImplProperties.connectionTimeout
                && this.socketTimeout == comAdobeCqDtmImplServiceDTMWebServiceImplProperties.socketTimeout;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (connectionTimeout == null ? 0 : System.hashCode(connectionTimeout));
        hashCode = (17 * hashCode) + (socketTimeout == null ? 0 : System.hashCode(socketTimeout));
        return hashCode;
    }
}
