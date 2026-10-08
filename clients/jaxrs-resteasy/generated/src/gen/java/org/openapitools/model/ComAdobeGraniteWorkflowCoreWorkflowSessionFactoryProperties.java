package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties   {
  
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.workflowinbox.sort.propertyName")
  @Valid
  public ConfigNodePropertyDropDown getGraniteWorkflowinboxSortPropertyName() {
    return graniteWorkflowinboxSortPropertyName;
  }
  public void setGraniteWorkflowinboxSortPropertyName(ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName) {
    this.graniteWorkflowinboxSortPropertyName = graniteWorkflowinboxSortPropertyName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.workflowinbox.sort.order")
  @Valid
  public ConfigNodePropertyString getGraniteWorkflowinboxSortOrder() {
    return graniteWorkflowinboxSortOrder;
  }
  public void setGraniteWorkflowinboxSortOrder(ConfigNodePropertyString graniteWorkflowinboxSortOrder) {
    this.graniteWorkflowinboxSortOrder = graniteWorkflowinboxSortOrder;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.workflow.job.retry")
  @Valid
  public ConfigNodePropertyInteger getCqWorkflowJobRetry() {
    return cqWorkflowJobRetry;
  }
  public void setCqWorkflowJobRetry(ConfigNodePropertyInteger cqWorkflowJobRetry) {
    this.cqWorkflowJobRetry = cqWorkflowJobRetry;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.workflow.superuser")
  @Valid
  public ConfigNodePropertyArray getCqWorkflowSuperuser() {
    return cqWorkflowSuperuser;
  }
  public void setCqWorkflowSuperuser(ConfigNodePropertyArray cqWorkflowSuperuser) {
    this.cqWorkflowSuperuser = cqWorkflowSuperuser;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.workflow.inboxQuerySize")
  @Valid
  public ConfigNodePropertyInteger getGraniteWorkflowInboxQuerySize() {
    return graniteWorkflowInboxQuerySize;
  }
  public void setGraniteWorkflowInboxQuerySize(ConfigNodePropertyInteger graniteWorkflowInboxQuerySize) {
    this.graniteWorkflowInboxQuerySize = graniteWorkflowInboxQuerySize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.workflow.adminUserGroupFilter")
  @Valid
  public ConfigNodePropertyBoolean getGraniteWorkflowAdminUserGroupFilter() {
    return graniteWorkflowAdminUserGroupFilter;
  }
  public void setGraniteWorkflowAdminUserGroupFilter(ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter) {
    this.graniteWorkflowAdminUserGroupFilter = graniteWorkflowAdminUserGroupFilter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.workflow.enforceWorkitemAssigneePermissions")
  @Valid
  public ConfigNodePropertyBoolean getGraniteWorkflowEnforceWorkitemAssigneePermissions() {
    return graniteWorkflowEnforceWorkitemAssigneePermissions;
  }
  public void setGraniteWorkflowEnforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions) {
    this.graniteWorkflowEnforceWorkitemAssigneePermissions = graniteWorkflowEnforceWorkitemAssigneePermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.workflow.enforceWorkflowInitiatorPermissions")
  @Valid
  public ConfigNodePropertyBoolean getGraniteWorkflowEnforceWorkflowInitiatorPermissions() {
    return graniteWorkflowEnforceWorkflowInitiatorPermissions;
  }
  public void setGraniteWorkflowEnforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions) {
    this.graniteWorkflowEnforceWorkflowInitiatorPermissions = graniteWorkflowEnforceWorkflowInitiatorPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.workflow.injectTenantIdInJobTopics")
  @Valid
  public ConfigNodePropertyBoolean getGraniteWorkflowInjectTenantIdInJobTopics() {
    return graniteWorkflowInjectTenantIdInJobTopics;
  }
  public void setGraniteWorkflowInjectTenantIdInJobTopics(ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics) {
    this.graniteWorkflowInjectTenantIdInJobTopics = graniteWorkflowInjectTenantIdInJobTopics;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.workflow.maxPurgeSaveThreshold")
  @Valid
  public ConfigNodePropertyInteger getGraniteWorkflowMaxPurgeSaveThreshold() {
    return graniteWorkflowMaxPurgeSaveThreshold;
  }
  public void setGraniteWorkflowMaxPurgeSaveThreshold(ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold) {
    this.graniteWorkflowMaxPurgeSaveThreshold = graniteWorkflowMaxPurgeSaveThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.workflow.maxPurgeQueryCount")
  @Valid
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

