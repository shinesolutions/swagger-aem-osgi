package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties
 */

@JsonTypeName("comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties {

  private ConfigNodePropertyArray portalOutboxes;

  private ConfigNodePropertyString draftDataService;

  private ConfigNodePropertyString draftMetadataService;

  private ConfigNodePropertyString submitDataService;

  private ConfigNodePropertyString submitMetadataService;

  private ConfigNodePropertyString pendingSignDataService;

  private ConfigNodePropertyString pendingSignMetadataService;

  public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties portalOutboxes(ConfigNodePropertyArray portalOutboxes) {
    this.portalOutboxes = portalOutboxes;
    return this;
  }

  /**
   * Get portalOutboxes
   * @return portalOutboxes
   */
  @Valid 
  @Schema(name = "portal.outboxes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("portal.outboxes")
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
   */
  @Valid 
  @Schema(name = "draft.data.service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("draft.data.service")
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
   */
  @Valid 
  @Schema(name = "draft.metadata.service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("draft.metadata.service")
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
   */
  @Valid 
  @Schema(name = "submit.data.service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("submit.data.service")
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
   */
  @Valid 
  @Schema(name = "submit.metadata.service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("submit.metadata.service")
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
   */
  @Valid 
  @Schema(name = "pendingSign.data.service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pendingSign.data.service")
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
   */
  @Valid 
  @Schema(name = "pendingSign.metadata.service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pendingSign.metadata.service")
  public ConfigNodePropertyString getPendingSignMetadataService() {
    return pendingSignMetadataService;
  }

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

