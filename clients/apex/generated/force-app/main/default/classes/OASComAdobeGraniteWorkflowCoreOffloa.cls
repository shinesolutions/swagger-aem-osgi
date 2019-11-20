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
 * OASComAdobeGraniteWorkflowCoreOffloa
 */
public class OASComAdobeGraniteWorkflowCoreOffloa implements OAS.MappedProperties {
    /**
     * Get jobTopics
     * @return jobTopics
     */
    public OASConfigNodePropertyString jobTopics { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'job.topics' => 'jobTopics'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeGraniteWorkflowCoreOffloa getExample() {
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties = new OASComAdobeGraniteWorkflowCoreOffloa();
          comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.jobTopics = OASConfigNodePropertyString.getExample();
        return comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeGraniteWorkflowCoreOffloa) {           
            OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties = (OASComAdobeGraniteWorkflowCoreOffloa) obj;
            return this.jobTopics == comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.jobTopics;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (jobTopics == null ? 0 : System.hashCode(jobTopics));
        return hashCode;
    }
}
