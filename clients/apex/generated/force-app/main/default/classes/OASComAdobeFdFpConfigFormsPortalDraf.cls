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
 * OASComAdobeFdFpConfigFormsPortalDraf
 */
public class OASComAdobeFdFpConfigFormsPortalDraf implements OAS.MappedProperties {
    /**
     * Get portalOutboxes
     * @return portalOutboxes
     */
    public OASConfigNodePropertyArray portalOutboxes { get; set; }

    /**
     * Get draftDataService
     * @return draftDataService
     */
    public OASConfigNodePropertyString draftDataService { get; set; }

    /**
     * Get draftMetadataService
     * @return draftMetadataService
     */
    public OASConfigNodePropertyString draftMetadataService { get; set; }

    /**
     * Get submitDataService
     * @return submitDataService
     */
    public OASConfigNodePropertyString submitDataService { get; set; }

    /**
     * Get submitMetadataService
     * @return submitMetadataService
     */
    public OASConfigNodePropertyString submitMetadataService { get; set; }

    /**
     * Get pendingSignDataService
     * @return pendingSignDataService
     */
    public OASConfigNodePropertyString pendingSignDataService { get; set; }

    /**
     * Get pendingSignMetadataService
     * @return pendingSignMetadataService
     */
    public OASConfigNodePropertyString pendingSignMetadataService { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'portal.outboxes' => 'portalOutboxes',
        'draft.data.service' => 'draftDataService',
        'draft.metadata.service' => 'draftMetadataService',
        'submit.data.service' => 'submitDataService',
        'submit.metadata.service' => 'submitMetadataService',
        'pendingSign.data.service' => 'pendingSignDataService',
        'pendingSign.metadata.service' => 'pendingSignMetadataService'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeFdFpConfigFormsPortalDraf getExample() {
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties = new OASComAdobeFdFpConfigFormsPortalDraf();
          comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.portalOutboxes = OASConfigNodePropertyArray.getExample();
          comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.draftDataService = OASConfigNodePropertyString.getExample();
          comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.draftMetadataService = OASConfigNodePropertyString.getExample();
          comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.submitDataService = OASConfigNodePropertyString.getExample();
          comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.submitMetadataService = OASConfigNodePropertyString.getExample();
          comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.pendingSignDataService = OASConfigNodePropertyString.getExample();
          comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.pendingSignMetadataService = OASConfigNodePropertyString.getExample();
        return comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeFdFpConfigFormsPortalDraf) {           
            OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties = (OASComAdobeFdFpConfigFormsPortalDraf) obj;
            return this.portalOutboxes == comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.portalOutboxes
                && this.draftDataService == comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.draftDataService
                && this.draftMetadataService == comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.draftMetadataService
                && this.submitDataService == comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.submitDataService
                && this.submitMetadataService == comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.submitMetadataService
                && this.pendingSignDataService == comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.pendingSignDataService
                && this.pendingSignMetadataService == comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.pendingSignMetadataService;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (portalOutboxes == null ? 0 : System.hashCode(portalOutboxes));
        hashCode = (17 * hashCode) + (draftDataService == null ? 0 : System.hashCode(draftDataService));
        hashCode = (17 * hashCode) + (draftMetadataService == null ? 0 : System.hashCode(draftMetadataService));
        hashCode = (17 * hashCode) + (submitDataService == null ? 0 : System.hashCode(submitDataService));
        hashCode = (17 * hashCode) + (submitMetadataService == null ? 0 : System.hashCode(submitMetadataService));
        hashCode = (17 * hashCode) + (pendingSignDataService == null ? 0 : System.hashCode(pendingSignDataService));
        hashCode = (17 * hashCode) + (pendingSignMetadataService == null ? 0 : System.hashCode(pendingSignMetadataService));
        return hashCode;
    }
}
