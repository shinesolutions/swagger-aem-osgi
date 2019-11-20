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
 * OASComAdobeGraniteCompatrouterImplRo
 */
public class OASComAdobeGraniteCompatrouterImplRo {
    /**
     * Get id
     * @return id
     */
    public OASConfigNodePropertyString id { get; set; }

    /**
     * Get compatPath
     * @return compatPath
     */
    public OASConfigNodePropertyString compatPath { get; set; }

    /**
     * Get newPath
     * @return newPath
     */
    public OASConfigNodePropertyString newPath { get; set; }

    public static OASComAdobeGraniteCompatrouterImplRo getExample() {
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties = new OASComAdobeGraniteCompatrouterImplRo();
          comAdobeGraniteCompatrouterImplRoutingConfigProperties.id = OASConfigNodePropertyString.getExample();
          comAdobeGraniteCompatrouterImplRoutingConfigProperties.compatPath = OASConfigNodePropertyString.getExample();
          comAdobeGraniteCompatrouterImplRoutingConfigProperties.newPath = OASConfigNodePropertyString.getExample();
        return comAdobeGraniteCompatrouterImplRoutingConfigProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeGraniteCompatrouterImplRo) {           
            OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties = (OASComAdobeGraniteCompatrouterImplRo) obj;
            return this.id == comAdobeGraniteCompatrouterImplRoutingConfigProperties.id
                && this.compatPath == comAdobeGraniteCompatrouterImplRoutingConfigProperties.compatPath
                && this.newPath == comAdobeGraniteCompatrouterImplRoutingConfigProperties.newPath;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (compatPath == null ? 0 : System.hashCode(compatPath));
        hashCode = (17 * hashCode) + (newPath == null ? 0 : System.hashCode(newPath));
        return hashCode;
    }
}
