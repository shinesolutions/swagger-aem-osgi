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
 * OASComDayCqDamCoreImplProcessSendTra
 */
public class OASComDayCqDamCoreImplProcessSendTra implements OAS.MappedProperties {
    /**
     * Get processLabel
     * @return processLabel
     */
    public OASConfigNodePropertyString processLabel { get; set; }

    /**
     * Get notifyOnComplete
     * @return notifyOnComplete
     */
    public OASConfigNodePropertyBoolean notifyOnComplete { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'process.label' => 'processLabel',
        'Notify on Complete' => 'notifyOnComplete'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComDayCqDamCoreImplProcessSendTra getExample() {
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties = new OASComDayCqDamCoreImplProcessSendTra();
          comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.processLabel = OASConfigNodePropertyString.getExample();
          comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.notifyOnComplete = OASConfigNodePropertyBoolean.getExample();
        return comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqDamCoreImplProcessSendTra) {           
            OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties = (OASComDayCqDamCoreImplProcessSendTra) obj;
            return this.processLabel == comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.processLabel
                && this.notifyOnComplete == comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.notifyOnComplete;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (processLabel == null ? 0 : System.hashCode(processLabel));
        hashCode = (17 * hashCode) + (notifyOnComplete == null ? 0 : System.hashCode(notifyOnComplete));
        return hashCode;
    }
}
