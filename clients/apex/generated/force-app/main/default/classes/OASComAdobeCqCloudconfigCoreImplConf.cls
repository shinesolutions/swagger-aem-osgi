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
 * OASComAdobeCqCloudconfigCoreImplConf
 */
public class OASComAdobeCqCloudconfigCoreImplConf implements OAS.MappedProperties {
    /**
     * Get flushAgents
     * @return flushAgents
     */
    public OASConfigNodePropertyArray flushAgents { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'flush.agents' => 'flushAgents'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeCqCloudconfigCoreImplConf getExample() {
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties = new OASComAdobeCqCloudconfigCoreImplConf();
          comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.flushAgents = OASConfigNodePropertyArray.getExample();
        return comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeCqCloudconfigCoreImplConf) {           
            OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties = (OASComAdobeCqCloudconfigCoreImplConf) obj;
            return this.flushAgents == comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.flushAgents;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (flushAgents == null ? 0 : System.hashCode(flushAgents));
        return hashCode;
    }
}
