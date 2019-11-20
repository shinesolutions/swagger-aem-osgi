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
 * OASComDayCqAuthImplCugCugSupportImpl
 */
public class OASComDayCqAuthImplCugCugSupportImpl implements OAS.MappedProperties {
    /**
     * Get cugExemptedPrincipals
     * @return cugExemptedPrincipals
     */
    public OASConfigNodePropertyArray cugExemptedPrincipals { get; set; }

    /**
     * Get cugEnabled
     * @return cugEnabled
     */
    public OASConfigNodePropertyBoolean cugEnabled { get; set; }

    /**
     * Get cugPrincipalsRegex
     * @return cugPrincipalsRegex
     */
    public OASConfigNodePropertyString cugPrincipalsRegex { get; set; }

    /**
     * Get cugPrincipalsReplacement
     * @return cugPrincipalsReplacement
     */
    public OASConfigNodePropertyString cugPrincipalsReplacement { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'cug.exempted.principals' => 'cugExemptedPrincipals',
        'cug.enabled' => 'cugEnabled',
        'cug.principals.regex' => 'cugPrincipalsRegex',
        'cug.principals.replacement' => 'cugPrincipalsReplacement'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComDayCqAuthImplCugCugSupportImpl getExample() {
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties = new OASComDayCqAuthImplCugCugSupportImpl();
          comDayCqAuthImplCugCugSupportImplProperties.cugExemptedPrincipals = OASConfigNodePropertyArray.getExample();
          comDayCqAuthImplCugCugSupportImplProperties.cugEnabled = OASConfigNodePropertyBoolean.getExample();
          comDayCqAuthImplCugCugSupportImplProperties.cugPrincipalsRegex = OASConfigNodePropertyString.getExample();
          comDayCqAuthImplCugCugSupportImplProperties.cugPrincipalsReplacement = OASConfigNodePropertyString.getExample();
        return comDayCqAuthImplCugCugSupportImplProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqAuthImplCugCugSupportImpl) {           
            OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties = (OASComDayCqAuthImplCugCugSupportImpl) obj;
            return this.cugExemptedPrincipals == comDayCqAuthImplCugCugSupportImplProperties.cugExemptedPrincipals
                && this.cugEnabled == comDayCqAuthImplCugCugSupportImplProperties.cugEnabled
                && this.cugPrincipalsRegex == comDayCqAuthImplCugCugSupportImplProperties.cugPrincipalsRegex
                && this.cugPrincipalsReplacement == comDayCqAuthImplCugCugSupportImplProperties.cugPrincipalsReplacement;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (cugExemptedPrincipals == null ? 0 : System.hashCode(cugExemptedPrincipals));
        hashCode = (17 * hashCode) + (cugEnabled == null ? 0 : System.hashCode(cugEnabled));
        hashCode = (17 * hashCode) + (cugPrincipalsRegex == null ? 0 : System.hashCode(cugPrincipalsRegex));
        hashCode = (17 * hashCode) + (cugPrincipalsReplacement == null ? 0 : System.hashCode(cugPrincipalsReplacement));
        return hashCode;
    }
}
