package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

