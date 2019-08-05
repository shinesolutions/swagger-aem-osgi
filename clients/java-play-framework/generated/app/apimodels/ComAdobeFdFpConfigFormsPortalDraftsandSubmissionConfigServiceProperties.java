package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties   {
  @JsonProperty("portal.outboxes")
  private ConfigNodePropertyArray portalOutboxes = null;

  @JsonProperty("draft.data.service")
  private ConfigNodePropertyString draftDataService = null;

  @JsonProperty("draft.metadata.service")
  private ConfigNodePropertyString draftMetadataService = null;

  @JsonProperty("submit.data.service")
  private ConfigNodePropertyString submitDataService = null;

  @JsonProperty("submit.metadata.service")
  private ConfigNodePropertyString submitMetadataService = null;

  @JsonProperty("pendingSign.data.service")
  private ConfigNodePropertyString pendingSignDataService = null;

  @JsonProperty("pendingSign.metadata.service")
  private ConfigNodePropertyString pendingSignMetadataService = null;

  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties portalOutboxes(ConfigNodePropertyArray portalOutboxes) {
    this.portalOutboxes = portalOutboxes;
    return this;
  }

   /**
   * Get portalOutboxes
   * @return portalOutboxes
  **/
  @Valid
  public ConfigNodePropertyArray getPortalOutboxes() {
    return portalOutboxes;
  }

  public void setPortalOutboxes(ConfigNodePropertyArray portalOutboxes) {
    this.portalOutboxes = portalOutboxes;
  }

  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties draftDataService(ConfigNodePropertyString draftDataService) {
    this.draftDataService = draftDataService;
    return this;
  }

   /**
   * Get draftDataService
   * @return draftDataService
  **/
  @Valid
  public ConfigNodePropertyString getDraftDataService() {
    return draftDataService;
  }

  public void setDraftDataService(ConfigNodePropertyString draftDataService) {
    this.draftDataService = draftDataService;
  }

  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties draftMetadataService(ConfigNodePropertyString draftMetadataService) {
    this.draftMetadataService = draftMetadataService;
    return this;
  }

   /**
   * Get draftMetadataService
   * @return draftMetadataService
  **/
  @Valid
  public ConfigNodePropertyString getDraftMetadataService() {
    return draftMetadataService;
  }

  public void setDraftMetadataService(ConfigNodePropertyString draftMetadataService) {
    this.draftMetadataService = draftMetadataService;
  }

  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties submitDataService(ConfigNodePropertyString submitDataService) {
    this.submitDataService = submitDataService;
    return this;
  }

   /**
   * Get submitDataService
   * @return submitDataService
  **/
  @Valid
  public ConfigNodePropertyString getSubmitDataService() {
    return submitDataService;
  }

  public void setSubmitDataService(ConfigNodePropertyString submitDataService) {
    this.submitDataService = submitDataService;
  }

  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties submitMetadataService(ConfigNodePropertyString submitMetadataService) {
    this.submitMetadataService = submitMetadataService;
    return this;
  }

   /**
   * Get submitMetadataService
   * @return submitMetadataService
  **/
  @Valid
  public ConfigNodePropertyString getSubmitMetadataService() {
    return submitMetadataService;
  }

  public void setSubmitMetadataService(ConfigNodePropertyString submitMetadataService) {
    this.submitMetadataService = submitMetadataService;
  }

  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties pendingSignDataService(ConfigNodePropertyString pendingSignDataService) {
    this.pendingSignDataService = pendingSignDataService;
    return this;
  }

   /**
   * Get pendingSignDataService
   * @return pendingSignDataService
  **/
  @Valid
  public ConfigNodePropertyString getPendingSignDataService() {
    return pendingSignDataService;
  }

  public void setPendingSignDataService(ConfigNodePropertyString pendingSignDataService) {
    this.pendingSignDataService = pendingSignDataService;
  }

  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties pendingSignMetadataService(ConfigNodePropertyString pendingSignMetadataService) {
    this.pendingSignMetadataService = pendingSignMetadataService;
    return this;
  }

   /**
   * Get pendingSignMetadataService
   * @return pendingSignMetadataService
  **/
  @Valid
  public ConfigNodePropertyString getPendingSignMetadataService() {
    return pendingSignMetadataService;
  }

  public void setPendingSignMetadataService(ConfigNodePropertyString pendingSignMetadataService) {
    this.pendingSignMetadataService = pendingSignMetadataService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties = (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties) o;
    return Objects.equals(portalOutboxes, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.portalOutboxes) &&
        Objects.equals(draftDataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.draftDataService) &&
        Objects.equals(draftMetadataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.draftMetadataService) &&
        Objects.equals(submitDataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.submitDataService) &&
        Objects.equals(submitMetadataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.submitMetadataService) &&
        Objects.equals(pendingSignDataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.pendingSignDataService) &&
        Objects.equals(pendingSignMetadataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.pendingSignMetadataService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portalOutboxes, draftDataService, draftMetadataService, submitDataService, submitMetadataService, pendingSignDataService, pendingSignMetadataService);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

