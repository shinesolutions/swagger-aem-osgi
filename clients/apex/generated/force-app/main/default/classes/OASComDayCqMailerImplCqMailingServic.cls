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
 * OASComDayCqMailerImplCqMailingServic
 */
public class OASComDayCqMailerImplCqMailingServic implements OAS.MappedProperties {
    /**
     * Get maxRecipientCount
     * @return maxRecipientCount
     */
    public OASConfigNodePropertyString maxRecipientCount { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'max.recipient.count' => 'maxRecipientCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComDayCqMailerImplCqMailingServic getExample() {
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties = new OASComDayCqMailerImplCqMailingServic();
          comDayCqMailerImplCqMailingServiceProperties.maxRecipientCount = OASConfigNodePropertyString.getExample();
        return comDayCqMailerImplCqMailingServiceProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqMailerImplCqMailingServic) {           
            OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties = (OASComDayCqMailerImplCqMailingServic) obj;
            return this.maxRecipientCount == comDayCqMailerImplCqMailingServiceProperties.maxRecipientCount;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (maxRecipientCount == null ? 0 : System.hashCode(maxRecipientCount));
        return hashCode;
    }
}
