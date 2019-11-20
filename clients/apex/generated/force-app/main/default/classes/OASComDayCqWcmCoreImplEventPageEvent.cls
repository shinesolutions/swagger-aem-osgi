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
 * OASComDayCqWcmCoreImplEventPageEvent
 */
public class OASComDayCqWcmCoreImplEventPageEvent {
    /**
     * Get configured
     * @return configured
     */
    public OASConfigNodePropertyString configured { get; set; }

    public static OASComDayCqWcmCoreImplEventPageEvent getExample() {
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties = new OASComDayCqWcmCoreImplEventPageEvent();
          comDayCqWcmCoreImplEventPageEventAuditListenerProperties.configured = OASConfigNodePropertyString.getExample();
        return comDayCqWcmCoreImplEventPageEventAuditListenerProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqWcmCoreImplEventPageEvent) {           
            OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties = (OASComDayCqWcmCoreImplEventPageEvent) obj;
            return this.configured == comDayCqWcmCoreImplEventPageEventAuditListenerProperties.configured;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (configured == null ? 0 : System.hashCode(configured));
        return hashCode;
    }
}
