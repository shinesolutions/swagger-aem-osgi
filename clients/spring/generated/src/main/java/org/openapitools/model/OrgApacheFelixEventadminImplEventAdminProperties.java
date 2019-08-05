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
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheFelixEventadminImplEventAdminProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheFelixEventadminImplEventAdminProperties   {
  @JsonProperty("org.apache.felix.eventadmin.ThreadPoolSize")
  private ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize = null;

  @JsonProperty("org.apache.felix.eventadmin.AsyncToSyncThreadRatio")
  private ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio = null;

  @JsonProperty("org.apache.felix.eventadmin.Timeout")
  private ConfigNodePropertyInteger orgApacheFelixEventadminTimeout = null;

  @JsonProperty("org.apache.felix.eventadmin.RequireTopic")
  private ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic = null;

  @JsonProperty("org.apache.felix.eventadmin.IgnoreTimeout")
  private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout = null;

  @JsonProperty("org.apache.felix.eventadmin.IgnoreTopic")
  private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic = null;

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminThreadPoolSize(ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize) {
    this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminThreadPoolSize
   * @return orgApacheFelixEventadminThreadPoolSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixEventadminThreadPoolSize() {
    return orgApacheFelixEventadminThreadPoolSize;
  }

  public void setOrgApacheFelixEventadminThreadPoolSize(ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize) {
    this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio) {
    this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminAsyncToSyncThreadRatio
   * @return orgApacheFelixEventadminAsyncToSyncThreadRatio
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyFloat getOrgApacheFelixEventadminAsyncToSyncThreadRatio() {
    return orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }

  public void setOrgApacheFelixEventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio) {
    this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminTimeout(ConfigNodePropertyInteger orgApacheFelixEventadminTimeout) {
    this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminTimeout
   * @return orgApacheFelixEventadminTimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixEventadminTimeout() {
    return orgApacheFelixEventadminTimeout;
  }

  public void setOrgApacheFelixEventadminTimeout(ConfigNodePropertyInteger orgApacheFelixEventadminTimeout) {
    this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminRequireTopic(ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic) {
    this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminRequireTopic
   * @return orgApacheFelixEventadminRequireTopic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixEventadminRequireTopic() {
    return orgApacheFelixEventadminRequireTopic;
  }

  public void setOrgApacheFelixEventadminRequireTopic(ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic) {
    this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminIgnoreTimeout(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout) {
    this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminIgnoreTimeout
   * @return orgApacheFelixEventadminIgnoreTimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTimeout() {
    return orgApacheFelixEventadminIgnoreTimeout;
  }

  public void setOrgApacheFelixEventadminIgnoreTimeout(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout) {
    this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminIgnoreTopic(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic) {
    this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminIgnoreTopic
   * @return orgApacheFelixEventadminIgnoreTopic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTopic() {
    return orgApacheFelixEventadminIgnoreTopic;
  }

  public void setOrgApacheFelixEventadminIgnoreTopic(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic) {
    this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminImplEventAdminProperties = (OrgApacheFelixEventadminImplEventAdminProperties) o;
    return Objects.equals(this.orgApacheFelixEventadminThreadPoolSize, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminThreadPoolSize) &&
        Objects.equals(this.orgApacheFelixEventadminAsyncToSyncThreadRatio, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminAsyncToSyncThreadRatio) &&
        Objects.equals(this.orgApacheFelixEventadminTimeout, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminTimeout) &&
        Objects.equals(this.orgApacheFelixEventadminRequireTopic, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminRequireTopic) &&
        Objects.equals(this.orgApacheFelixEventadminIgnoreTimeout, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminIgnoreTimeout) &&
        Objects.equals(this.orgApacheFelixEventadminIgnoreTopic, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminIgnoreTopic);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

