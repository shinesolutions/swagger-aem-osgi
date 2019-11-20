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
 * OASComAdobeGraniteCommentsInternalCo
 */
public class OASComAdobeGraniteCommentsInternalCo implements OAS.MappedProperties {
    /**
     * Get replicateCommentResourceTypes
     * @return replicateCommentResourceTypes
     */
    public OASConfigNodePropertyArray replicateCommentResourceTypes { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'replicate.comment.resourceTypes' => 'replicateCommentResourceTypes'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeGraniteCommentsInternalCo getExample() {
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties = new OASComAdobeGraniteCommentsInternalCo();
          comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.replicateCommentResourceTypes = OASConfigNodePropertyArray.getExample();
        return comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeGraniteCommentsInternalCo) {           
            OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties = (OASComAdobeGraniteCommentsInternalCo) obj;
            return this.replicateCommentResourceTypes == comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.replicateCommentResourceTypes;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (replicateCommentResourceTypes == null ? 0 : System.hashCode(replicateCommentResourceTypes));
        return hashCode;
    }
}
