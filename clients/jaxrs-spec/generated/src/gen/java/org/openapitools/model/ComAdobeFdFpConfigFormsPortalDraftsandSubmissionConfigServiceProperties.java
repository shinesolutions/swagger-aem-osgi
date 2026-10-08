package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties   {
  private ConfigNodePropertyArray portalOutboxes;
  private ConfigNodePropertyString draftDataService;
  private ConfigNodePropertyString draftMetadataService;
  private ConfigNodePropertyString submitDataService;
  private ConfigNodePropertyString submitMetadataService;
  private ConfigNodePropertyString pendingSignDataService;
  private ConfigNodePropertyString pendingSignMetadataService;

  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties() {
  }

  /**
   **/
  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties portalOutboxes(ConfigNodePropertyArray portalOutboxes) {
    this.portalOutboxes = portalOutboxes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("portal.outboxes")
  @Valid public ConfigNodePropertyArray getPortalOutboxes() {
    return portalOutboxes;
  }

  @JsonProperty("portal.outboxes")
  public void setPortalOutboxes(ConfigNodePropertyArray portalOutboxes) {
    this.portalOutboxes = portalOutboxes;
  }

  /**
   **/
  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties draftDataService(ConfigNodePropertyString draftDataService) {
    this.draftDataService = draftDataService;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("draft.data.service")
  @Valid public ConfigNodePropertyString getDraftDataService() {
    return draftDataService;
  }

  @JsonProperty("draft.data.service")
  public void setDraftDataService(ConfigNodePropertyString draftDataService) {
    this.draftDataService = draftDataService;
  }

  /**
   **/
  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties draftMetadataService(ConfigNodePropertyString draftMetadataService) {
    this.draftMetadataService = draftMetadataService;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("draft.metadata.service")
  @Valid public ConfigNodePropertyString getDraftMetadataService() {
    return draftMetadataService;
  }

  @JsonProperty("draft.metadata.service")
  public void setDraftMetadataService(ConfigNodePropertyString draftMetadataService) {
    this.draftMetadataService = draftMetadataService;
  }

  /**
   **/
  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties submitDataService(ConfigNodePropertyString submitDataService) {
    this.submitDataService = submitDataService;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("submit.data.service")
  @Valid public ConfigNodePropertyString getSubmitDataService() {
    return submitDataService;
  }

  @JsonProperty("submit.data.service")
  public void setSubmitDataService(ConfigNodePropertyString submitDataService) {
    this.submitDataService = submitDataService;
  }

  /**
   **/
  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties submitMetadataService(ConfigNodePropertyString submitMetadataService) {
    this.submitMetadataService = submitMetadataService;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("submit.metadata.service")
  @Valid public ConfigNodePropertyString getSubmitMetadataService() {
    return submitMetadataService;
  }

  @JsonProperty("submit.metadata.service")
  public void setSubmitMetadataService(ConfigNodePropertyString submitMetadataService) {
    this.submitMetadataService = submitMetadataService;
  }

  /**
   **/
  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties pendingSignDataService(ConfigNodePropertyString pendingSignDataService) {
    this.pendingSignDataService = pendingSignDataService;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pendingSign.data.service")
  @Valid public ConfigNodePropertyString getPendingSignDataService() {
    return pendingSignDataService;
  }

  @JsonProperty("pendingSign.data.service")
  public void setPendingSignDataService(ConfigNodePropertyString pendingSignDataService) {
    this.pendingSignDataService = pendingSignDataService;
  }

  /**
   **/
  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties pendingSignMetadataService(ConfigNodePropertyString pendingSignMetadataService) {
    this.pendingSignMetadataService = pendingSignMetadataService;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pendingSign.metadata.service")
  @Valid public ConfigNodePropertyString getPendingSignMetadataService() {
    return pendingSignMetadataService;
  }

  @JsonProperty("pendingSign.metadata.service")
  public void setPendingSignMetadataService(ConfigNodePropertyString pendingSignMetadataService) {
    this.pendingSignMetadataService = pendingSignMetadataService;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
