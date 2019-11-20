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
 * OASComDayCqTaggingImplTagGarbageColl
 */
public class OASComDayCqTaggingImplTagGarbageColl implements OAS.MappedProperties {
    /**
     * Get schedulerExpression
     * @return schedulerExpression
     */
    public OASConfigNodePropertyString schedulerExpression { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'scheduler.expression' => 'schedulerExpression'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComDayCqTaggingImplTagGarbageColl getExample() {
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties = new OASComDayCqTaggingImplTagGarbageColl();
          comDayCqTaggingImplTagGarbageCollectorProperties.schedulerExpression = OASConfigNodePropertyString.getExample();
        return comDayCqTaggingImplTagGarbageCollectorProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqTaggingImplTagGarbageColl) {           
            OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties = (OASComDayCqTaggingImplTagGarbageColl) obj;
            return this.schedulerExpression == comDayCqTaggingImplTagGarbageCollectorProperties.schedulerExpression;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (schedulerExpression == null ? 0 : System.hashCode(schedulerExpression));
        return hashCode;
    }
}
