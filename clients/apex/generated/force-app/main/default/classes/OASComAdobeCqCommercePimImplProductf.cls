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
 * OASComAdobeCqCommercePimImplProductf
 */
public class OASComAdobeCqCommercePimImplProductf implements OAS.MappedProperties {
    /**
     * Get feedGeneratorAlgorithm
     * @return feedGeneratorAlgorithm
     */
    public OASConfigNodePropertyDropDown feedGeneratorAlgorithm { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'Feed generator algorithm' => 'feedGeneratorAlgorithm'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeCqCommercePimImplProductf getExample() {
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties = new OASComAdobeCqCommercePimImplProductf();
          comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.feedGeneratorAlgorithm = OASConfigNodePropertyDropDown.getExample();
        return comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeCqCommercePimImplProductf) {           
            OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties = (OASComAdobeCqCommercePimImplProductf) obj;
            return this.feedGeneratorAlgorithm == comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.feedGeneratorAlgorithm;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (feedGeneratorAlgorithm == null ? 0 : System.hashCode(feedGeneratorAlgorithm));
        return hashCode;
    }
}
