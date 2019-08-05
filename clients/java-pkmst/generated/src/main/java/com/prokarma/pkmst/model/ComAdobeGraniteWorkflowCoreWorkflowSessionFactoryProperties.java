package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties   {
  @JsonProperty("granite.workflowinbox.sort.propertyName")
  private ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName = null;

  @JsonProperty("granite.workflowinbox.sort.order")
  private ConfigNodePropertyString graniteWorkflowinboxSortOrder = null;

  @JsonProperty("cq.workflow.job.retry")
  private ConfigNodePropertyInteger cqWorkflowJobRetry = null;

  @JsonProperty("cq.workflow.superuser")
  private ConfigNodePropertyArray cqWorkflowSuperuser = null;

  @JsonProperty("granite.workflow.inboxQuerySize")
  private ConfigNodePropertyInteger graniteWorkflowInboxQuerySize = null;

  @JsonProperty("granite.workflow.adminUserGroupFilter")
  private ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter = null;

  @JsonProperty("granite.workflow.enforceWorkitemAssigneePermissions")
  private ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions = null;

  @JsonProperty("granite.workflow.enforceWorkflowInitiatorPermissions")
  private ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions = null;

  @JsonProperty("granite.workflow.injectTenantIdInJobTopics")
  private ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics = null;

  @JsonProperty("granite.workflow.maxPurgeSaveThreshold")
  private ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold = null;

  @JsonProperty("granite.workflow.maxPurgeQueryCount")
  private ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount = null;

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowinboxSortPropertyName(ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName) {
    this.graniteWorkflowinboxSortPropertyName = graniteWorkflowinboxSortPropertyName;
    return this;
  }

   /**
   * Get graniteWorkflowinboxSortPropertyName
   * @return graniteWorkflowinboxSortPropertyName
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getGraniteWorkflowMaxPurgeQueryCount() {
    return graniteWorkflowMaxPurgeQueryCount;
  }

  public void setGraniteWorkflowMaxPurgeQueryCount(ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount) {
    this.graniteWorkflowMaxPurgeQueryCount = graniteWorkflowMaxPurgeQueryCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

