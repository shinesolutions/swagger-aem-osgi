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
 * OASComAdobeCqDamCfmImplComponentComp
 */
public class OASComAdobeCqDamCfmImplComponentComp implements OAS.MappedProperties {
    /**
     * Get damCfmComponentResourceType
     * @return damCfmComponentResourceType
     */
    public OASConfigNodePropertyString damCfmComponentResourceType { get; set; }

    /**
     * Get damCfmComponentFileReferenceProp
     * @return damCfmComponentFileReferenceProp
     */
    public OASConfigNodePropertyString damCfmComponentFileReferenceProp { get; set; }

    /**
     * Get damCfmComponentElementsProp
     * @return damCfmComponentElementsProp
     */
    public OASConfigNodePropertyString damCfmComponentElementsProp { get; set; }

    /**
     * Get damCfmComponentVariationProp
     * @return damCfmComponentVariationProp
     */
    public OASConfigNodePropertyString damCfmComponentVariationProp { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'dam.cfm.component.resourceType' => 'damCfmComponentResourceType',
        'dam.cfm.component.fileReferenceProp' => 'damCfmComponentFileReferenceProp',
        'dam.cfm.component.elementsProp' => 'damCfmComponentElementsProp',
        'dam.cfm.component.variationProp' => 'damCfmComponentVariationProp'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeCqDamCfmImplComponentComp getExample() {
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties = new OASComAdobeCqDamCfmImplComponentComp();
          comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentResourceType = OASConfigNodePropertyString.getExample();
          comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentFileReferenceProp = OASConfigNodePropertyString.getExample();
          comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentElementsProp = OASConfigNodePropertyString.getExample();
          comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentVariationProp = OASConfigNodePropertyString.getExample();
        return comAdobeCqDamCfmImplComponentComponentConfigImplProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeCqDamCfmImplComponentComp) {           
            OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties = (OASComAdobeCqDamCfmImplComponentComp) obj;
            return this.damCfmComponentResourceType == comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentResourceType
                && this.damCfmComponentFileReferenceProp == comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentFileReferenceProp
                && this.damCfmComponentElementsProp == comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentElementsProp
                && this.damCfmComponentVariationProp == comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentVariationProp;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (damCfmComponentResourceType == null ? 0 : System.hashCode(damCfmComponentResourceType));
        hashCode = (17 * hashCode) + (damCfmComponentFileReferenceProp == null ? 0 : System.hashCode(damCfmComponentFileReferenceProp));
        hashCode = (17 * hashCode) + (damCfmComponentElementsProp == null ? 0 : System.hashCode(damCfmComponentElementsProp));
        hashCode = (17 * hashCode) + (damCfmComponentVariationProp == null ? 0 : System.hashCode(damCfmComponentVariationProp));
        return hashCode;
    }
}
