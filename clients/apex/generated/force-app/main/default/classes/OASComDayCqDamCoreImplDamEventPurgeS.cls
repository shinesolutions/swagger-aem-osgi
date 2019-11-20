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
 * OASComDayCqDamCoreImplDamEventPurgeS
 */
public class OASComDayCqDamCoreImplDamEventPurgeS implements OAS.MappedProperties {
    /**
     * Get schedulerExpression
     * @return schedulerExpression
     */
    public OASConfigNodePropertyString schedulerExpression { get; set; }

    /**
     * Get maxSavedActivities
     * @return maxSavedActivities
     */
    public OASConfigNodePropertyInteger maxSavedActivities { get; set; }

    /**
     * Get saveInterval
     * @return saveInterval
     */
    public OASConfigNodePropertyInteger saveInterval { get; set; }

    /**
     * Get enableActivityPurge
     * @return enableActivityPurge
     */
    public OASConfigNodePropertyBoolean enableActivityPurge { get; set; }

    /**
     * Get eventTypes
     * @return eventTypes
     */
    public OASConfigNodePropertyDropDown eventTypes { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'scheduler.expression' => 'schedulerExpression'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComDayCqDamCoreImplDamEventPurgeS getExample() {
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties = new OASComDayCqDamCoreImplDamEventPurgeS();
          comDayCqDamCoreImplDamEventPurgeServiceProperties.schedulerExpression = OASConfigNodePropertyString.getExample();
          comDayCqDamCoreImplDamEventPurgeServiceProperties.maxSavedActivities = OASConfigNodePropertyInteger.getExample();
          comDayCqDamCoreImplDamEventPurgeServiceProperties.saveInterval = OASConfigNodePropertyInteger.getExample();
          comDayCqDamCoreImplDamEventPurgeServiceProperties.enableActivityPurge = OASConfigNodePropertyBoolean.getExample();
          comDayCqDamCoreImplDamEventPurgeServiceProperties.eventTypes = OASConfigNodePropertyDropDown.getExample();
        return comDayCqDamCoreImplDamEventPurgeServiceProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqDamCoreImplDamEventPurgeS) {           
            OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties = (OASComDayCqDamCoreImplDamEventPurgeS) obj;
            return this.schedulerExpression == comDayCqDamCoreImplDamEventPurgeServiceProperties.schedulerExpression
                && this.maxSavedActivities == comDayCqDamCoreImplDamEventPurgeServiceProperties.maxSavedActivities
                && this.saveInterval == comDayCqDamCoreImplDamEventPurgeServiceProperties.saveInterval
                && this.enableActivityPurge == comDayCqDamCoreImplDamEventPurgeServiceProperties.enableActivityPurge
                && this.eventTypes == comDayCqDamCoreImplDamEventPurgeServiceProperties.eventTypes;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (schedulerExpression == null ? 0 : System.hashCode(schedulerExpression));
        hashCode = (17 * hashCode) + (maxSavedActivities == null ? 0 : System.hashCode(maxSavedActivities));
        hashCode = (17 * hashCode) + (saveInterval == null ? 0 : System.hashCode(saveInterval));
        hashCode = (17 * hashCode) + (enableActivityPurge == null ? 0 : System.hashCode(enableActivityPurge));
        hashCode = (17 * hashCode) + (eventTypes == null ? 0 : System.hashCode(eventTypes));
        return hashCode;
    }
}
