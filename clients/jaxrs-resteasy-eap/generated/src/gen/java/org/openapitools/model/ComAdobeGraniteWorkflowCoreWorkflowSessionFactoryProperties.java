package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties   {
  

  private ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName = null;

  private ConfigNodePropertyString graniteWorkflowinboxSortOrder = null;

  private ConfigNodePropertyInteger cqWorkflowJobRetry = null;

  private ConfigNodePropertyArray cqWorkflowSuperuser = null;

  private ConfigNodePropertyInteger graniteWorkflowInboxQuerySize = null;

  private ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter = null;

  private ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions = null;

  private ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions = null;

  private ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics = null;

  private ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold = null;

  private ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.workflowinbox.sort.propertyName")
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
    return Objects.equals(graniteWorkflowinboxSortPropertyName, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowinboxSortPropertyName) &&
        Objects.equals(graniteWorkflowinboxSortOrder, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowinboxSortOrder) &&
        Objects.equals(cqWorkflowJobRetry, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.cqWorkflowJobRetry) &&
        Objects.equals(cqWorkflowSuperuser, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.cqWorkflowSuperuser) &&
        Objects.equals(graniteWorkflowInboxQuerySize, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowInboxQuerySize) &&
        Objects.equals(graniteWorkflowAdminUserGroupFilter, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowAdminUserGroupFilter) &&
        Objects.equals(graniteWorkflowEnforceWorkitemAssigneePermissions, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowEnforceWorkitemAssigneePermissions) &&
        Objects.equals(graniteWorkflowEnforceWorkflowInitiatorPermissions, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowEnforceWorkflowInitiatorPermissions) &&
        Objects.equals(graniteWorkflowInjectTenantIdInJobTopics, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowInjectTenantIdInJobTopics) &&
        Objects.equals(graniteWorkflowMaxPurgeSaveThreshold, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowMaxPurgeSaveThreshold) &&
        Objects.equals(graniteWorkflowMaxPurgeQueryCount, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.graniteWorkflowMaxPurgeQueryCount);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

