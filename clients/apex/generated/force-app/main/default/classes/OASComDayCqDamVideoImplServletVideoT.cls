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
 * OASComDayCqDamVideoImplServletVideoT
 */
public class OASComDayCqDamVideoImplServletVideoT {
    /**
     * Get enabled
     * @return enabled
     */
    public OASConfigNodePropertyBoolean enabled { get; set; }

    public static OASComDayCqDamVideoImplServletVideoT getExample() {
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties = new OASComDayCqDamVideoImplServletVideoT();
          comDayCqDamVideoImplServletVideoTestServletProperties.enabled = OASConfigNodePropertyBoolean.getExample();
        return comDayCqDamVideoImplServletVideoTestServletProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqDamVideoImplServletVideoT) {           
            OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties = (OASComDayCqDamVideoImplServletVideoT) obj;
            return this.enabled == comDayCqDamVideoImplServletVideoTestServletProperties.enabled;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (enabled == null ? 0 : System.hashCode(enabled));
        return hashCode;
    }
}
