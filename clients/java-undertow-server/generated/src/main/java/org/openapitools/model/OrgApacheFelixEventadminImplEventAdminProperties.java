/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixEventadminImplEventAdminProperties   {
  
  private ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize;
  private ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio;
  private ConfigNodePropertyInteger orgApacheFelixEventadminTimeout;
  private ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic;
  private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout;
  private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic;

  /**
   */
  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminThreadPoolSize(ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize) {
    this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.eventadmin.ThreadPoolSize")
  public ConfigNodePropertyInteger getOrgApacheFelixEventadminThreadPoolSize() {
    return orgApacheFelixEventadminThreadPoolSize;
  }
  public void setOrgApacheFelixEventadminThreadPoolSize(ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize) {
    this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
  }

  /**
   */
  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio) {
    this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.eventadmin.AsyncToSyncThreadRatio")
  public ConfigNodePropertyFloat getOrgApacheFelixEventadminAsyncToSyncThreadRatio() {
    return orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }
  public void setOrgApacheFelixEventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio) {
    this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }

  /**
   */
  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminTimeout(ConfigNodePropertyInteger orgApacheFelixEventadminTimeout) {
    this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.eventadmin.Timeout")
  public ConfigNodePropertyInteger getOrgApacheFelixEventadminTimeout() {
    return orgApacheFelixEventadminTimeout;
  }
  public void setOrgApacheFelixEventadminTimeout(ConfigNodePropertyInteger orgApacheFelixEventadminTimeout) {
    this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
  }

  /**
   */
  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminRequireTopic(ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic) {
    this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.eventadmin.RequireTopic")
  public ConfigNodePropertyBoolean getOrgApacheFelixEventadminRequireTopic() {
    return orgApacheFelixEventadminRequireTopic;
  }
  public void setOrgApacheFelixEventadminRequireTopic(ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic) {
    this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
  }

  /**
   */
  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminIgnoreTimeout(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout) {
    this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.eventadmin.IgnoreTimeout")
  public ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTimeout() {
    return orgApacheFelixEventadminIgnoreTimeout;
  }
  public void setOrgApacheFelixEventadminIgnoreTimeout(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout) {
    this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
  }

  /**
   */
  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminIgnoreTopic(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic) {
    this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.eventadmin.IgnoreTopic")
  public ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTopic() {
    return orgApacheFelixEventadminIgnoreTopic;
  }
  public void setOrgApacheFelixEventadminIgnoreTopic(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic) {
    this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminImplEventAdminProperties = (OrgApacheFelixEventadminImplEventAdminProperties) o;
    return Objects.equals(orgApacheFelixEventadminThreadPoolSize, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminThreadPoolSize) &&
        Objects.equals(orgApacheFelixEventadminAsyncToSyncThreadRatio, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminAsyncToSyncThreadRatio) &&
        Objects.equals(orgApacheFelixEventadminTimeout, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminTimeout) &&
        Objects.equals(orgApacheFelixEventadminRequireTopic, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminRequireTopic) &&
        Objects.equals(orgApacheFelixEventadminIgnoreTimeout, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminIgnoreTimeout) &&
        Objects.equals(orgApacheFelixEventadminIgnoreTopic, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminIgnoreTopic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheFelixEventadminThreadPoolSize, orgApacheFelixEventadminAsyncToSyncThreadRatio, orgApacheFelixEventadminTimeout, orgApacheFelixEventadminRequireTopic, orgApacheFelixEventadminIgnoreTimeout, orgApacheFelixEventadminIgnoreTopic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixEventadminImplEventAdminProperties {\n");
    
    sb.append("    orgApacheFelixEventadminThreadPoolSize: ").append(toIndentedString(orgApacheFelixEventadminThreadPoolSize)).append("\n");
    sb.append("    orgApacheFelixEventadminAsyncToSyncThreadRatio: ").append(toIndentedString(orgApacheFelixEventadminAsyncToSyncThreadRatio)).append("\n");
    sb.append("    orgApacheFelixEventadminTimeout: ").append(toIndentedString(orgApacheFelixEventadminTimeout)).append("\n");
    sb.append("    orgApacheFelixEventadminRequireTopic: ").append(toIndentedString(orgApacheFelixEventadminRequireTopic)).append("\n");
    sb.append("    orgApacheFelixEventadminIgnoreTimeout: ").append(toIndentedString(orgApacheFelixEventadminIgnoreTimeout)).append("\n");
    sb.append("    orgApacheFelixEventadminIgnoreTopic: ").append(toIndentedString(orgApacheFelixEventadminIgnoreTopic)).append("\n");
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

