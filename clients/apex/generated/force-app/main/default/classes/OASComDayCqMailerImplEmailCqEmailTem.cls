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
 * OASComDayCqMailerImplEmailCqEmailTem
 */
public class OASComDayCqMailerImplEmailCqEmailTem implements OAS.MappedProperties {
    /**
     * Get mailerEmailCharset
     * @return mailerEmailCharset
     */
    public OASConfigNodePropertyString mailerEmailCharset { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'mailer.email.charset' => 'mailerEmailCharset'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComDayCqMailerImplEmailCqEmailTem getExample() {
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties = new OASComDayCqMailerImplEmailCqEmailTem();
          comDayCqMailerImplEmailCqEmailTemplateFactoryProperties.mailerEmailCharset = OASConfigNodePropertyString.getExample();
        return comDayCqMailerImplEmailCqEmailTemplateFactoryProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqMailerImplEmailCqEmailTem) {           
            OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties = (OASComDayCqMailerImplEmailCqEmailTem) obj;
            return this.mailerEmailCharset == comDayCqMailerImplEmailCqEmailTemplateFactoryProperties.mailerEmailCharset;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (mailerEmailCharset == null ? 0 : System.hashCode(mailerEmailCharset));
        return hashCode;
    }
}
