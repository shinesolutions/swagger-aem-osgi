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
 * OASComAdobeGraniteSocialgraphImplSoc
 */
public class OASComAdobeGraniteSocialgraphImplSoc implements OAS.MappedProperties {
    /**
     * Get group2memberRelationshipOutgoing
     * @return group2memberRelationshipOutgoing
     */
    public OASConfigNodePropertyString group2memberRelationshipOutgoing { get; set; }

    /**
     * Get group2memberExcludedOutgoing
     * @return group2memberExcludedOutgoing
     */
    public OASConfigNodePropertyArray group2memberExcludedOutgoing { get; set; }

    /**
     * Get group2memberRelationshipIncoming
     * @return group2memberRelationshipIncoming
     */
    public OASConfigNodePropertyString group2memberRelationshipIncoming { get; set; }

    /**
     * Get group2memberExcludedIncoming
     * @return group2memberExcludedIncoming
     */
    public OASConfigNodePropertyArray group2memberExcludedIncoming { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'group2member.relationship.outgoing' => 'group2memberRelationshipOutgoing',
        'group2member.excluded.outgoing' => 'group2memberExcludedOutgoing',
        'group2member.relationship.incoming' => 'group2memberRelationshipIncoming',
        'group2member.excluded.incoming' => 'group2memberExcludedIncoming'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeGraniteSocialgraphImplSoc getExample() {
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties = new OASComAdobeGraniteSocialgraphImplSoc();
          comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberRelationshipOutgoing = OASConfigNodePropertyString.getExample();
          comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberExcludedOutgoing = OASConfigNodePropertyArray.getExample();
          comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberRelationshipIncoming = OASConfigNodePropertyString.getExample();
          comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberExcludedIncoming = OASConfigNodePropertyArray.getExample();
        return comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeGraniteSocialgraphImplSoc) {           
            OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties = (OASComAdobeGraniteSocialgraphImplSoc) obj;
            return this.group2memberRelationshipOutgoing == comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberRelationshipOutgoing
                && this.group2memberExcludedOutgoing == comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberExcludedOutgoing
                && this.group2memberRelationshipIncoming == comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberRelationshipIncoming
                && this.group2memberExcludedIncoming == comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberExcludedIncoming;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (group2memberRelationshipOutgoing == null ? 0 : System.hashCode(group2memberRelationshipOutgoing));
        hashCode = (17 * hashCode) + (group2memberExcludedOutgoing == null ? 0 : System.hashCode(group2memberExcludedOutgoing));
        hashCode = (17 * hashCode) + (group2memberRelationshipIncoming == null ? 0 : System.hashCode(group2memberRelationshipIncoming));
        hashCode = (17 * hashCode) + (group2memberExcludedIncoming == null ? 0 : System.hashCode(group2memberExcludedIncoming));
        return hashCode;
    }
}
