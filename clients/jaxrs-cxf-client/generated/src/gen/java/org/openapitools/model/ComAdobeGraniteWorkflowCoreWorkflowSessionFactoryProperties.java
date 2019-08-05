package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString graniteWorkflowinboxSortOrder = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cqWorkflowJobRetry = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray cqWorkflowSuperuser = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger graniteWorkflowInboxQuerySize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount = null;
 /**
   * Get graniteWorkflowinboxSortPropertyName
   * @return graniteWorkflowinboxSortPropertyName
  **/
  @JsonProperty("granite.workflowinbox.sort.propertyName")
  public ConfigNodePropertyDropDown getGraniteWorkflowinboxSortPropertyName() {
    return graniteWorkflowinboxSortPropertyName;
  }

  public void setGraniteWorkflowinboxSortPropertyName(ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName) {
    this.graniteWorkflowinboxSortPropertyName = graniteWorkflowinboxSortPropertyName;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowinboxSortPropertyName(ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName) {
    this.graniteWorkflowinboxSortPropertyName = graniteWorkflowinboxSortPropertyName;
    return this;
  }

 /**
   * Get graniteWorkflowinboxSortOrder
   * @return graniteWorkflowinboxSortOrder
  **/
  @JsonProperty("granite.workflowinbox.sort.order")
  public ConfigNodePropertyString getGraniteWorkflowinboxSortOrder() {
    return graniteWorkflowinboxSortOrder;
  }

  public void setGraniteWorkflowinboxSortOrder(ConfigNodePropertyString graniteWorkflowinboxSortOrder) {
    this.graniteWorkflowinboxSortOrder = graniteWorkflowinboxSortOrder;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowinboxSortOrder(ConfigNodePropertyString graniteWorkflowinboxSortOrder) {
    this.graniteWorkflowinboxSortOrder = graniteWorkflowinboxSortOrder;
    return this;
  }

 /**
   * Get cqWorkflowJobRetry
   * @return cqWorkflowJobRetry
  **/
  @JsonProperty("cq.workflow.job.retry")
  public ConfigNodePropertyInteger getCqWorkflowJobRetry() {
    return cqWorkflowJobRetry;
  }

  public void setCqWorkflowJobRetry(ConfigNodePropertyInteger cqWorkflowJobRetry) {
    this.cqWorkflowJobRetry = cqWorkflowJobRetry;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties cqWorkflowJobRetry(ConfigNodePropertyInteger cqWorkflowJobRetry) {
    this.cqWorkflowJobRetry = cqWorkflowJobRetry;
    return this;
  }

 /**
   * Get cqWorkflowSuperuser
   * @return cqWorkflowSuperuser
  **/
  @JsonProperty("cq.workflow.superuser")
  public ConfigNodePropertyArray getCqWorkflowSuperuser() {
    return cqWorkflowSuperuser;
  }

  public void setCqWorkflowSuperuser(ConfigNodePropertyArray cqWorkflowSuperuser) {
    this.cqWorkflowSuperuser = cqWorkflowSuperuser;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties cqWorkflowSuperuser(ConfigNodePropertyArray cqWorkflowSuperuser) {
    this.cqWorkflowSuperuser = cqWorkflowSuperuser;
    return this;
  }

 /**
   * Get graniteWorkflowInboxQuerySize
   * @return graniteWorkflowInboxQuerySize
  **/
  @JsonProperty("granite.workflow.inboxQuerySize")
  public ConfigNodePropertyInteger getGraniteWorkflowInboxQuerySize() {
    return graniteWorkflowInboxQuerySize;
  }

  public void setGraniteWorkflowInboxQuerySize(ConfigNodePropertyInteger graniteWorkflowInboxQuerySize) {
    this.graniteWorkflowInboxQuerySize = graniteWorkflowInboxQuerySize;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowInboxQuerySize(ConfigNodePropertyInteger graniteWorkflowInboxQuerySize) {
    this.graniteWorkflowInboxQuerySize = graniteWorkflowInboxQuerySize;
    return this;
  }

 /**
   * Get graniteWorkflowAdminUserGroupFilter
   * @return graniteWorkflowAdminUserGroupFilter
  **/
  @JsonProperty("granite.workflow.adminUserGroupFilter")
  public ConfigNodePropertyBoolean getGraniteWorkflowAdminUserGroupFilter() {
    return graniteWorkflowAdminUserGroupFilter;
  }

  public void setGraniteWorkflowAdminUserGroupFilter(ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter) {
    this.graniteWorkflowAdminUserGroupFilter = graniteWorkflowAdminUserGroupFilter;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowAdminUserGroupFilter(ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter) {
    this.graniteWorkflowAdminUserGroupFilter = graniteWorkflowAdminUserGroupFilter;
    return this;
  }

 /**
   * Get graniteWorkflowEnforceWorkitemAssigneePermissions
   * @return graniteWorkflowEnforceWorkitemAssigneePermissions
  **/
  @JsonProperty("granite.workflow.enforceWorkitemAssigneePermissions")
  public ConfigNodePropertyBoolean getGraniteWorkflowEnforceWorkitemAssigneePermissions() {
    return graniteWorkflowEnforceWorkitemAssigneePermissions;
  }

  public void setGraniteWorkflowEnforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions) {
    this.graniteWorkflowEnforceWorkitemAssigneePermissions = graniteWorkflowEnforceWorkitemAssigneePermissions;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowEnforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions) {
    this.graniteWorkflowEnforceWorkitemAssigneePermissions = graniteWorkflowEnforceWorkitemAssigneePermissions;
    return this;
  }

 /**
   * Get graniteWorkflowEnforceWorkflowInitiatorPermissions
   * @return graniteWorkflowEnforceWorkflowInitiatorPermissions
  **/
  @JsonProperty("granite.workflow.enforceWorkflowInitiatorPermissions")
  public ConfigNodePropertyBoolean getGraniteWorkflowEnforceWorkflowInitiatorPermissions() {
    return graniteWorkflowEnforceWorkflowInitiatorPermissions;
  }

  public void setGraniteWorkflowEnforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions) {
    this.graniteWorkflowEnforceWorkflowInitiatorPermissions = graniteWorkflowEnforceWorkflowInitiatorPermissions;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowEnforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions) {
    this.graniteWorkflowEnforceWorkflowInitiatorPermissions = graniteWorkflowEnforceWorkflowInitiatorPermissions;
    return this;
  }

 /**
   * Get graniteWorkflowInjectTenantIdInJobTopics
   * @return graniteWorkflowInjectTenantIdInJobTopics
  **/
  @JsonProperty("granite.workflow.injectTenantIdInJobTopics")
  public ConfigNodePropertyBoolean getGraniteWorkflowInjectTenantIdInJobTopics() {
    return graniteWorkflowInjectTenantIdInJobTopics;
  }

  public void setGraniteWorkflowInjectTenantIdInJobTopics(ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics) {
    this.graniteWorkflowInjectTenantIdInJobTopics = graniteWorkflowInjectTenantIdInJobTopics;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowInjectTenantIdInJobTopics(ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics) {
    this.graniteWorkflowInjectTenantIdInJobTopics = graniteWorkflowInjectTenantIdInJobTopics;
    return this;
  }

 /**
   * Get graniteWorkflowMaxPurgeSaveThreshold
   * @return graniteWorkflowMaxPurgeSaveThreshold
  **/
  @JsonProperty("granite.workflow.maxPurgeSaveThreshold")
  public ConfigNodePropertyInteger getGraniteWorkflowMaxPurgeSaveThreshold() {
    return graniteWorkflowMaxPurgeSaveThreshold;
  }

  public void setGraniteWorkflowMaxPurgeSaveThreshold(ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold) {
    this.graniteWorkflowMaxPurgeSaveThreshold = graniteWorkflowMaxPurgeSaveThreshold;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowMaxPurgeSaveThreshold(ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold) {
    this.graniteWorkflowMaxPurgeSaveThreshold = graniteWorkflowMaxPurgeSaveThreshold;
    return this;
  }

 /**
   * Get graniteWorkflowMaxPurgeQueryCount
   * @return graniteWorkflowMaxPurgeQueryCount
  **/
  @JsonProperty("granite.workflow.maxPurgeQueryCount")
  public ConfigNodePropertyInteger getGraniteWorkflowMaxPurgeQueryCount() {
    return graniteWorkflowMaxPurgeQueryCount;
  }

  public void setGraniteWorkflowMaxPurgeQueryCount(ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount) {
    this.graniteWorkflowMaxPurgeQueryCount = graniteWorkflowMaxPurgeQueryCount;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties graniteWorkflowMaxPurgeQueryCount(ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount) {
    this.graniteWorkflowMaxPurgeQueryCount = graniteWorkflowMaxPurgeQueryCount;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

