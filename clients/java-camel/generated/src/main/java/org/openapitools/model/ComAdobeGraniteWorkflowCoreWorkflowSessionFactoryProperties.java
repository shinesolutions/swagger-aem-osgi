package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
 */

@JsonTypeName("comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties {

  private ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName;

  private ConfigNodePropertyString graniteWorkflowinboxSortOrder;

  private ConfigNodePropertyInteger cqWorkflowJobRetry;

  private ConfigNodePropertyArray cqWorkflowSuperuser;

  private ConfigNodePropertyInteger graniteWorkflowInboxQuerySize;

  private ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter;

  private ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions;

  private ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions;

  private ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics;

  private ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold;

  private ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount;

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowinboxSortPropertyName(ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName) {
    this.graniteWorkflowinboxSortPropertyName = graniteWorkflowinboxSortPropertyName;
    return this;
  }

  /**
   * Get graniteWorkflowinboxSortPropertyName
   * @return graniteWorkflowinboxSortPropertyName
   */
  @Valid 
  @Schema(name = "granite.workflowinbox.sort.propertyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.workflowinbox.sort.propertyName")
  public ConfigNodePropertyDropDown getGraniteWorkflowinboxSortPropertyName() {
    return graniteWorkflowinboxSortPropertyName;
  }

  public void setGraniteWorkflowinboxSortPropertyName(ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName) {
    this.graniteWorkflowinboxSortPropertyName = graniteWorkflowinboxSortPropertyName;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowinboxSortOrder(ConfigNodePropertyString graniteWorkflowinboxSortOrder) {
    this.graniteWorkflowinboxSortOrder = graniteWorkflowinboxSortOrder;
    return this;
  }

  /**
   * Get graniteWorkflowinboxSortOrder
   * @return graniteWorkflowinboxSortOrder
   */
  @Valid 
  @Schema(name = "granite.workflowinbox.sort.order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.workflowinbox.sort.order")
  public ConfigNodePropertyString getGraniteWorkflowinboxSortOrder() {
    return graniteWorkflowinboxSortOrder;
  }

  public void setGraniteWorkflowinboxSortOrder(ConfigNodePropertyString graniteWorkflowinboxSortOrder) {
    this.graniteWorkflowinboxSortOrder = graniteWorkflowinboxSortOrder;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties cqWorkflowJobRetry(ConfigNodePropertyInteger cqWorkflowJobRetry) {
    this.cqWorkflowJobRetry = cqWorkflowJobRetry;
    return this;
  }

  /**
   * Get cqWorkflowJobRetry
   * @return cqWorkflowJobRetry
   */
  @Valid 
  @Schema(name = "cq.workflow.job.retry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.workflow.job.retry")
  public ConfigNodePropertyInteger getCqWorkflowJobRetry() {
    return cqWorkflowJobRetry;
  }

  public void setCqWorkflowJobRetry(ConfigNodePropertyInteger cqWorkflowJobRetry) {
    this.cqWorkflowJobRetry = cqWorkflowJobRetry;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties cqWorkflowSuperuser(ConfigNodePropertyArray cqWorkflowSuperuser) {
    this.cqWorkflowSuperuser = cqWorkflowSuperuser;
    return this;
  }

  /**
   * Get cqWorkflowSuperuser
   * @return cqWorkflowSuperuser
   */
  @Valid 
  @Schema(name = "cq.workflow.superuser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.workflow.superuser")
  public ConfigNodePropertyArray getCqWorkflowSuperuser() {
    return cqWorkflowSuperuser;
  }

  public void setCqWorkflowSuperuser(ConfigNodePropertyArray cqWorkflowSuperuser) {
    this.cqWorkflowSuperuser = cqWorkflowSuperuser;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowInboxQuerySize(ConfigNodePropertyInteger graniteWorkflowInboxQuerySize) {
    this.graniteWorkflowInboxQuerySize = graniteWorkflowInboxQuerySize;
    return this;
  }

  /**
   * Get graniteWorkflowInboxQuerySize
   * @return graniteWorkflowInboxQuerySize
   */
  @Valid 
  @Schema(name = "granite.workflow.inboxQuerySize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.workflow.inboxQuerySize")
  public ConfigNodePropertyInteger getGraniteWorkflowInboxQuerySize() {
    return graniteWorkflowInboxQuerySize;
  }

  public void setGraniteWorkflowInboxQuerySize(ConfigNodePropertyInteger graniteWorkflowInboxQuerySize) {
    this.graniteWorkflowInboxQuerySize = graniteWorkflowInboxQuerySize;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowAdminUserGroupFilter(ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter) {
    this.graniteWorkflowAdminUserGroupFilter = graniteWorkflowAdminUserGroupFilter;
    return this;
  }

  /**
   * Get graniteWorkflowAdminUserGroupFilter
   * @return graniteWorkflowAdminUserGroupFilter
   */
  @Valid 
  @Schema(name = "granite.workflow.adminUserGroupFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.workflow.adminUserGroupFilter")
  public ConfigNodePropertyBoolean getGraniteWorkflowAdminUserGroupFilter() {
    return graniteWorkflowAdminUserGroupFilter;
  }

  public void setGraniteWorkflowAdminUserGroupFilter(ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter) {
    this.graniteWorkflowAdminUserGroupFilter = graniteWorkflowAdminUserGroupFilter;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowEnforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions) {
    this.graniteWorkflowEnforceWorkitemAssigneePermissions = graniteWorkflowEnforceWorkitemAssigneePermissions;
    return this;
  }

  /**
   * Get graniteWorkflowEnforceWorkitemAssigneePermissions
   * @return graniteWorkflowEnforceWorkitemAssigneePermissions
   */
  @Valid 
  @Schema(name = "granite.workflow.enforceWorkitemAssigneePermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.workflow.enforceWorkitemAssigneePermissions")
  public ConfigNodePropertyBoolean getGraniteWorkflowEnforceWorkitemAssigneePermissions() {
    return graniteWorkflowEnforceWorkitemAssigneePermissions;
  }

  public void setGraniteWorkflowEnforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions) {
    this.graniteWorkflowEnforceWorkitemAssigneePermissions = graniteWorkflowEnforceWorkitemAssigneePermissions;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowEnforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions) {
    this.graniteWorkflowEnforceWorkflowInitiatorPermissions = graniteWorkflowEnforceWorkflowInitiatorPermissions;
    return this;
  }

  /**
   * Get graniteWorkflowEnforceWorkflowInitiatorPermissions
   * @return graniteWorkflowEnforceWorkflowInitiatorPermissions
   */
  @Valid 
  @Schema(name = "granite.workflow.enforceWorkflowInitiatorPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.workflow.enforceWorkflowInitiatorPermissions")
  public ConfigNodePropertyBoolean getGraniteWorkflowEnforceWorkflowInitiatorPermissions() {
    return graniteWorkflowEnforceWorkflowInitiatorPermissions;
  }

  public void setGraniteWorkflowEnforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions) {
    this.graniteWorkflowEnforceWorkflowInitiatorPermissions = graniteWorkflowEnforceWorkflowInitiatorPermissions;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowInjectTenantIdInJobTopics(ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics) {
    this.graniteWorkflowInjectTenantIdInJobTopics = graniteWorkflowInjectTenantIdInJobTopics;
    return this;
  }

  /**
   * Get graniteWorkflowInjectTenantIdInJobTopics
   * @return graniteWorkflowInjectTenantIdInJobTopics
   */
  @Valid 
  @Schema(name = "granite.workflow.injectTenantIdInJobTopics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.workflow.injectTenantIdInJobTopics")
  public ConfigNodePropertyBoolean getGraniteWorkflowInjectTenantIdInJobTopics() {
    return graniteWorkflowInjectTenantIdInJobTopics;
  }

  public void setGraniteWorkflowInjectTenantIdInJobTopics(ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics) {
    this.graniteWorkflowInjectTenantIdInJobTopics = graniteWorkflowInjectTenantIdInJobTopics;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowMaxPurgeSaveThreshold(ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold) {
    this.graniteWorkflowMaxPurgeSaveThreshold = graniteWorkflowMaxPurgeSaveThreshold;
    return this;
  }

  /**
   * Get graniteWorkflowMaxPurgeSaveThreshold
   * @return graniteWorkflowMaxPurgeSaveThreshold
   */
  @Valid 
  @Schema(name = "granite.workflow.maxPurgeSaveThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.workflow.maxPurgeSaveThreshold")
  public ConfigNodePropertyInteger getGraniteWorkflowMaxPurgeSaveThreshold() {
    return graniteWorkflowMaxPurgeSaveThreshold;
  }

  public void setGraniteWorkflowMaxPurgeSaveThreshold(ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold) {
    this.graniteWorkflowMaxPurgeSaveThreshold = graniteWorkflowMaxPurgeSaveThreshold;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowMaxPurgeQueryCount(ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount) {
    this.graniteWorkflowMaxPurgeQueryCount = graniteWorkflowMaxPurgeQueryCount;
    return this;
  }

  /**
   * Get graniteWorkflowMaxPurgeQueryCount
   * @return graniteWorkflowMaxPurgeQueryCount
   */
  @Valid 
  @Schema(name = "granite.workflow.maxPurgeQueryCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.workflow.maxPurgeQueryCount")
  public ConfigNodePropertyInteger getGraniteWorkflowMaxPurgeQueryCount() {
    return graniteWorkflowMaxPurgeQueryCount;
  }

  public void setGraniteWorkflowMaxPurgeQueryCount(ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount) {
    this.graniteWorkflowMaxPurgeQueryCount = graniteWorkflowMaxPurgeQueryCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties = (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties) o;
    return Objects.equals(this.graniteWorkflowinboxSortPropertyName, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowinboxSortPropertyName) &&
        Objects.equals(this.graniteWorkflowinboxSortOrder, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowinboxSortOrder) &&
        Objects.equals(this.cqWorkflowJobRetry, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.cqWorkflowJobRetry) &&
        Objects.equals(this.cqWorkflowSuperuser, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.cqWorkflowSuperuser) &&
        Objects.equals(this.graniteWorkflowInboxQuerySize, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowInboxQuerySize) &&
        Objects.equals(this.graniteWorkflowAdminUserGroupFilter, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowAdminUserGroupFilter) &&
        Objects.equals(this.graniteWorkflowEnforceWorkitemAssigneePermissions, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowEnforceWorkitemAssigneePermissions) &&
        Objects.equals(this.graniteWorkflowEnforceWorkflowInitiatorPermissions, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowEnforceWorkflowInitiatorPermissions) &&
        Objects.equals(this.graniteWorkflowInjectTenantIdInJobTopics, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowInjectTenantIdInJobTopics) &&
        Objects.equals(this.graniteWorkflowMaxPurgeSaveThreshold, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowMaxPurgeSaveThreshold) &&
        Objects.equals(this.graniteWorkflowMaxPurgeQueryCount, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowMaxPurgeQueryCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graniteWorkflowinboxSortPropertyName, graniteWorkflowinboxSortOrder, cqWorkflowJobRetry, cqWorkflowSuperuser, graniteWorkflowInboxQuerySize, graniteWorkflowAdminUserGroupFilter, graniteWorkflowEnforceWorkitemAssigneePermissions, graniteWorkflowEnforceWorkflowInitiatorPermissions, graniteWorkflowInjectTenantIdInJobTopics, graniteWorkflowMaxPurgeSaveThreshold, graniteWorkflowMaxPurgeQueryCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties {\n");
    sb.append("    graniteWorkflowinboxSortPropertyName: ").append(toIndentedString(graniteWorkflowinboxSortPropertyName)).append("\n");
    sb.append("    graniteWorkflowinboxSortOrder: ").append(toIndentedString(graniteWorkflowinboxSortOrder)).append("\n");
    sb.append("    cqWorkflowJobRetry: ").append(toIndentedString(cqWorkflowJobRetry)).append("\n");
    sb.append("    cqWorkflowSuperuser: ").append(toIndentedString(cqWorkflowSuperuser)).append("\n");
    sb.append("    graniteWorkflowInboxQuerySize: ").append(toIndentedString(graniteWorkflowInboxQuerySize)).append("\n");
    sb.append("    graniteWorkflowAdminUserGroupFilter: ").append(toIndentedString(graniteWorkflowAdminUserGroupFilter)).append("\n");
    sb.append("    graniteWorkflowEnforceWorkitemAssigneePermissions: ").append(toIndentedString(graniteWorkflowEnforceWorkitemAssigneePermissions)).append("\n");
    sb.append("    graniteWorkflowEnforceWorkflowInitiatorPermissions: ").append(toIndentedString(graniteWorkflowEnforceWorkflowInitiatorPermissions)).append("\n");
    sb.append("    graniteWorkflowInjectTenantIdInJobTopics: ").append(toIndentedString(graniteWorkflowInjectTenantIdInJobTopics)).append("\n");
    sb.append("    graniteWorkflowMaxPurgeSaveThreshold: ").append(toIndentedString(graniteWorkflowMaxPurgeSaveThreshold)).append("\n");
    sb.append("    graniteWorkflowMaxPurgeQueryCount: ").append(toIndentedString(graniteWorkflowMaxPurgeQueryCount)).append("\n");
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

