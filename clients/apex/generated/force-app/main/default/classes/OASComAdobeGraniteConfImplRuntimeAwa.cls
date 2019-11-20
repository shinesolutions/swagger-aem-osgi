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
 * OASComAdobeGraniteConfImplRuntimeAwa
 */
public class OASComAdobeGraniteConfImplRuntimeAwa {
    /**
     * Get enabled
     * @return enabled
     */
    public OASConfigNodePropertyBoolean enabled { get; set; }

    /**
     * Get fallbackPaths
     * @return fallbackPaths
     */
    public OASConfigNodePropertyArray fallbackPaths { get; set; }

    public static OASComAdobeGraniteConfImplRuntimeAwa getExample() {
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties = new OASComAdobeGraniteConfImplRuntimeAwa();
          comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.enabled = OASConfigNodePropertyBoolean.getExample();
          comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.fallbackPaths = OASConfigNodePropertyArray.getExample();
        return comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeGraniteConfImplRuntimeAwa) {           
            OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties = (OASComAdobeGraniteConfImplRuntimeAwa) obj;
            return this.enabled == comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.enabled
                && this.fallbackPaths == comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.fallbackPaths;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (enabled == null ? 0 : System.hashCode(enabled));
        hashCode = (17 * hashCode) + (fallbackPaths == null ? 0 : System.hashCode(fallbackPaths));
        return hashCode;
    }
}
