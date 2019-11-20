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
 * OASComAdobeGraniteAuthImsImplIMSAcce
 */
public class OASComAdobeGraniteAuthImsImplIMSAcce implements OAS.MappedProperties {
    /**
     * Get authImsClientSecret
     * @return authImsClientSecret
     */
    public OASConfigNodePropertyString authImsClientSecret { get; set; }

    /**
     * Get customizerType
     * @return customizerType
     */
    public OASConfigNodePropertyString customizerType { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'auth.ims.client.secret' => 'authImsClientSecret',
        'customizer.type' => 'customizerType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeGraniteAuthImsImplIMSAcce getExample() {
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties = new OASComAdobeGraniteAuthImsImplIMSAcce();
          comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.authImsClientSecret = OASConfigNodePropertyString.getExample();
          comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.customizerType = OASConfigNodePropertyString.getExample();
        return comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeGraniteAuthImsImplIMSAcce) {           
            OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties = (OASComAdobeGraniteAuthImsImplIMSAcce) obj;
            return this.authImsClientSecret == comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.authImsClientSecret
                && this.customizerType == comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.customizerType;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (authImsClientSecret == null ? 0 : System.hashCode(authImsClientSecret));
        hashCode = (17 * hashCode) + (customizerType == null ? 0 : System.hashCode(customizerType));
        return hashCode;
    }
}
