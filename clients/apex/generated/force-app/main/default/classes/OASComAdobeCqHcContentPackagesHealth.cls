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
 * OASComAdobeCqHcContentPackagesHealth
 */
public class OASComAdobeCqHcContentPackagesHealth implements OAS.MappedProperties {
    /**
     * Get hcName
     * @return hcName
     */
    public OASConfigNodePropertyString hcName { get; set; }

    /**
     * Get hcTags
     * @return hcTags
     */
    public OASConfigNodePropertyArray hcTags { get; set; }

    /**
     * Get hcMbeanName
     * @return hcMbeanName
     */
    public OASConfigNodePropertyString hcMbeanName { get; set; }

    /**
     * Get packageNames
     * @return packageNames
     */
    public OASConfigNodePropertyArray packageNames { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'hc.name' => 'hcName',
        'hc.tags' => 'hcTags',
        'hc.mbean.name' => 'hcMbeanName',
        'package.names' => 'packageNames'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeCqHcContentPackagesHealth getExample() {
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties = new OASComAdobeCqHcContentPackagesHealth();
          comAdobeCqHcContentPackagesHealthCheckProperties.hcName = OASConfigNodePropertyString.getExample();
          comAdobeCqHcContentPackagesHealthCheckProperties.hcTags = OASConfigNodePropertyArray.getExample();
          comAdobeCqHcContentPackagesHealthCheckProperties.hcMbeanName = OASConfigNodePropertyString.getExample();
          comAdobeCqHcContentPackagesHealthCheckProperties.packageNames = OASConfigNodePropertyArray.getExample();
        return comAdobeCqHcContentPackagesHealthCheckProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeCqHcContentPackagesHealth) {           
            OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties = (OASComAdobeCqHcContentPackagesHealth) obj;
            return this.hcName == comAdobeCqHcContentPackagesHealthCheckProperties.hcName
                && this.hcTags == comAdobeCqHcContentPackagesHealthCheckProperties.hcTags
                && this.hcMbeanName == comAdobeCqHcContentPackagesHealthCheckProperties.hcMbeanName
                && this.packageNames == comAdobeCqHcContentPackagesHealthCheckProperties.packageNames;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (hcName == null ? 0 : System.hashCode(hcName));
        hashCode = (17 * hashCode) + (hcTags == null ? 0 : System.hashCode(hcTags));
        hashCode = (17 * hashCode) + (hcMbeanName == null ? 0 : System.hashCode(hcMbeanName));
        hashCode = (17 * hashCode) + (packageNames == null ? 0 : System.hashCode(packageNames));
        return hashCode;
    }
}
