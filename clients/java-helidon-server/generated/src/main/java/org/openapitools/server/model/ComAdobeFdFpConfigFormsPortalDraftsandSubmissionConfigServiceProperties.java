package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties   {

    private ConfigNodePropertyArray portalOutboxes;
    private ConfigNodePropertyString draftDataService;
    private ConfigNodePropertyString draftMetadataService;
    private ConfigNodePropertyString submitDataService;
    private ConfigNodePropertyString submitMetadataService;
    private ConfigNodePropertyString pendingSignDataService;
    private ConfigNodePropertyString pendingSignMetadataService;

    /**
     * Default constructor.
     */
    public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.
     *
     * @param portalOutboxes portalOutboxes
     * @param draftDataService draftDataService
     * @param draftMetadataService draftMetadataService
     * @param submitDataService submitDataService
     * @param submitMetadataService submitMetadataService
     * @param pendingSignDataService pendingSignDataService
     * @param pendingSignMetadataService pendingSignMetadataService
     */
    public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(
        ConfigNodePropertyArray portalOutboxes, 
        ConfigNodePropertyString draftDataService, 
        ConfigNodePropertyString draftMetadataService, 
        ConfigNodePropertyString submitDataService, 
        ConfigNodePropertyString submitMetadataService, 
        ConfigNodePropertyString pendingSignDataService, 
        ConfigNodePropertyString pendingSignMetadataService
    ) {
        this.portalOutboxes = portalOutboxes;
        this.draftDataService = draftDataService;
        this.draftMetadataService = draftMetadataService;
        this.submitDataService = submitDataService;
        this.submitMetadataService = submitMetadataService;
        this.pendingSignDataService = pendingSignDataService;
        this.pendingSignMetadataService = pendingSignMetadataService;
    }



    /**
     * Get portalOutboxes
     * @return portalOutboxes
     */
    public ConfigNodePropertyArray getPortalOutboxes() {
        return portalOutboxes;
    }

    public void setPortalOutboxes(ConfigNodePropertyArray portalOutboxes) {
        this.portalOutboxes = portalOutboxes;
    }

    /**
     * Get draftDataService
     * @return draftDataService
     */
    public ConfigNodePropertyString getDraftDataService() {
        return draftDataService;
    }

    public void setDraftDataService(ConfigNodePropertyString draftDataService) {
        this.draftDataService = draftDataService;
    }

    /**
     * Get draftMetadataService
     * @return draftMetadataService
     */
    public ConfigNodePropertyString getDraftMetadataService() {
        return draftMetadataService;
    }

    public void setDraftMetadataService(ConfigNodePropertyString draftMetadataService) {
        this.draftMetadataService = draftMetadataService;
    }

    /**
     * Get submitDataService
     * @return submitDataService
     */
    public ConfigNodePropertyString getSubmitDataService() {
        return submitDataService;
    }

    public void setSubmitDataService(ConfigNodePropertyString submitDataService) {
        this.submitDataService = submitDataService;
    }

    /**
     * Get submitMetadataService
     * @return submitMetadataService
     */
    public ConfigNodePropertyString getSubmitMetadataService() {
        return submitMetadataService;
    }

    public void setSubmitMetadataService(ConfigNodePropertyString submitMetadataService) {
        this.submitMetadataService = submitMetadataService;
    }

    /**
     * Get pendingSignDataService
     * @return pendingSignDataService
     */
    public ConfigNodePropertyString getPendingSignDataService() {
        return pendingSignDataService;
    }

    public void setPendingSignDataService(ConfigNodePropertyString pendingSignDataService) {
        this.pendingSignDataService = pendingSignDataService;
    }

    /**
     * Get pendingSignMetadataService
     * @return pendingSignMetadataService
     */
    public ConfigNodePropertyString getPendingSignMetadataService() {
        return pendingSignMetadataService;
    }

    public void setPendingSignMetadataService(ConfigNodePropertyString pendingSignMetadataService) {
        this.pendingSignMetadataService = pendingSignMetadataService;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties {\n");
        
        sb.append("    portalOutboxes: ").append(toIndentedString(portalOutboxes)).append("\n");
        sb.append("    draftDataService: ").append(toIndentedString(draftDataService)).append("\n");
        sb.append("    draftMetadataService: ").append(toIndentedString(draftMetadataService)).append("\n");
        sb.append("    submitDataService: ").append(toIndentedString(submitDataService)).append("\n");
        sb.append("    submitMetadataService: ").append(toIndentedString(submitMetadataService)).append("\n");
        sb.append("    pendingSignDataService: ").append(toIndentedString(pendingSignDataService)).append("\n");
        sb.append("    pendingSignMetadataService: ").append(toIndentedString(pendingSignMetadataService)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

