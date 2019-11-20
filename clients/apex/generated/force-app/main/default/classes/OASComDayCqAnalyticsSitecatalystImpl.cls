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
 * OASComDayCqAnalyticsSitecatalystImpl
 */
public class OASComDayCqAnalyticsSitecatalystImpl implements OAS.MappedProperties {
    /**
     * Get cqAnalyticsSitecatalystServiceDatacenterUrl
     * @return cqAnalyticsSitecatalystServiceDatacenterUrl
     */
    public OASConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl { get; set; }

    /**
     * Get devhostnamepatterns
     * @return devhostnamepatterns
     */
    public OASConfigNodePropertyArray devhostnamepatterns { get; set; }

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
        'cq.analytics.sitecatalyst.service.datacenter.url' => 'cqAnalyticsSitecatalystServiceDatacenterUrl',
        'connection.timeout' => 'connectionTimeout',
        'socket.timeout' => 'socketTimeout'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComDayCqAnalyticsSitecatalystImpl getExample() {
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties = new OASComDayCqAnalyticsSitecatalystImpl();
          comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.cqAnalyticsSitecatalystServiceDatacenterUrl = OASConfigNodePropertyArray.getExample();
          comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.devhostnamepatterns = OASConfigNodePropertyArray.getExample();
          comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.connectionTimeout = OASConfigNodePropertyInteger.getExample();
          comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.socketTimeout = OASConfigNodePropertyInteger.getExample();
        return comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqAnalyticsSitecatalystImpl) {           
            OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties = (OASComDayCqAnalyticsSitecatalystImpl) obj;
            return this.cqAnalyticsSitecatalystServiceDatacenterUrl == comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.cqAnalyticsSitecatalystServiceDatacenterUrl
                && this.devhostnamepatterns == comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.devhostnamepatterns
                && this.connectionTimeout == comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.connectionTimeout
                && this.socketTimeout == comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.socketTimeout;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (cqAnalyticsSitecatalystServiceDatacenterUrl == null ? 0 : System.hashCode(cqAnalyticsSitecatalystServiceDatacenterUrl));
        hashCode = (17 * hashCode) + (devhostnamepatterns == null ? 0 : System.hashCode(devhostnamepatterns));
        hashCode = (17 * hashCode) + (connectionTimeout == null ? 0 : System.hashCode(connectionTimeout));
        hashCode = (17 * hashCode) + (socketTimeout == null ? 0 : System.hashCode(socketTimeout));
        return hashCode;
    }
}
