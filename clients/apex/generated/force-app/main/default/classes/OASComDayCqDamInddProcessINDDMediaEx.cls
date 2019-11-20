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
 * OASComDayCqDamInddProcessINDDMediaEx
 */
public class OASComDayCqDamInddProcessINDDMediaEx implements OAS.MappedProperties {
    /**
     * Get processLabel
     * @return processLabel
     */
    public OASConfigNodePropertyString processLabel { get; set; }

    /**
     * Get cqDamInddPagesRegex
     * @return cqDamInddPagesRegex
     */
    public OASConfigNodePropertyString cqDamInddPagesRegex { get; set; }

    /**
     * Get idsJobDecoupled
     * @return idsJobDecoupled
     */
    public OASConfigNodePropertyBoolean idsJobDecoupled { get; set; }

    /**
     * Get idsJobWorkflowModel
     * @return idsJobWorkflowModel
     */
    public OASConfigNodePropertyString idsJobWorkflowModel { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'process.label' => 'processLabel',
        'cq.dam.indd.pages.regex' => 'cqDamInddPagesRegex',
        'ids.job.decoupled' => 'idsJobDecoupled',
        'ids.job.workflow.model' => 'idsJobWorkflowModel'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComDayCqDamInddProcessINDDMediaEx getExample() {
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties = new OASComDayCqDamInddProcessINDDMediaEx();
          comDayCqDamInddProcessINDDMediaExtractProcessProperties.processLabel = OASConfigNodePropertyString.getExample();
          comDayCqDamInddProcessINDDMediaExtractProcessProperties.cqDamInddPagesRegex = OASConfigNodePropertyString.getExample();
          comDayCqDamInddProcessINDDMediaExtractProcessProperties.idsJobDecoupled = OASConfigNodePropertyBoolean.getExample();
          comDayCqDamInddProcessINDDMediaExtractProcessProperties.idsJobWorkflowModel = OASConfigNodePropertyString.getExample();
        return comDayCqDamInddProcessINDDMediaExtractProcessProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqDamInddProcessINDDMediaEx) {           
            OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties = (OASComDayCqDamInddProcessINDDMediaEx) obj;
            return this.processLabel == comDayCqDamInddProcessINDDMediaExtractProcessProperties.processLabel
                && this.cqDamInddPagesRegex == comDayCqDamInddProcessINDDMediaExtractProcessProperties.cqDamInddPagesRegex
                && this.idsJobDecoupled == comDayCqDamInddProcessINDDMediaExtractProcessProperties.idsJobDecoupled
                && this.idsJobWorkflowModel == comDayCqDamInddProcessINDDMediaExtractProcessProperties.idsJobWorkflowModel;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (processLabel == null ? 0 : System.hashCode(processLabel));
        hashCode = (17 * hashCode) + (cqDamInddPagesRegex == null ? 0 : System.hashCode(cqDamInddPagesRegex));
        hashCode = (17 * hashCode) + (idsJobDecoupled == null ? 0 : System.hashCode(idsJobDecoupled));
        hashCode = (17 * hashCode) + (idsJobWorkflowModel == null ? 0 : System.hashCode(idsJobWorkflowModel));
        return hashCode;
    }
}
