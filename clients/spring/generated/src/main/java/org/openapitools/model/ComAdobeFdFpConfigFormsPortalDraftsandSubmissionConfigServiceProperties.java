package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
    return Objects.equals(this.portalOutboxes, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.portalOutboxes) &&
        Objects.equals(this.draftDataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.draftDataService) &&
        Objects.equals(this.draftMetadataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.draftMetadataService) &&
        Objects.equals(this.submitDataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.submitDataService) &&
        Objects.equals(this.submitMetadataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.submitMetadataService) &&
        Objects.equals(this.pendingSignDataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.pendingSignDataService) &&
        Objects.equals(this.pendingSignMetadataService, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.pendingSignMetadataService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portalOutboxes, draftDataService, draftMetadataService, submitDataService, submitMetadataService, pendingSignDataService, pendingSignMetadataService);
  }

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

