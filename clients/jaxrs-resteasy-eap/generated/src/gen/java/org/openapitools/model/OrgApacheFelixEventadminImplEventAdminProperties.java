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
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixEventadminImplEventAdminProperties   {
  
  private ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize;
  private ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio;
  private ConfigNodePropertyInteger orgApacheFelixEventadminTimeout;
  private ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic;
  private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout;
  private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.eventadmin.ThreadPoolSize")
  public ConfigNodePropertyInteger getOrgApacheFelixEventadminThreadPoolSize() {
    return orgApacheFelixEventadminThreadPoolSize;
  }
  public void setOrgApacheFelixEventadminThreadPoolSize(ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize) {
    this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.eventadmin.AsyncToSyncThreadRatio")
  public ConfigNodePropertyFloat getOrgApacheFelixEventadminAsyncToSyncThreadRatio() {
    return orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }
  public void setOrgApacheFelixEventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio) {
    this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.eventadmin.Timeout")
  public ConfigNodePropertyInteger getOrgApacheFelixEventadminTimeout() {
    return orgApacheFelixEventadminTimeout;
  }
  public void setOrgApacheFelixEventadminTimeout(ConfigNodePropertyInteger orgApacheFelixEventadminTimeout) {
    this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.eventadmin.RequireTopic")
  public ConfigNodePropertyBoolean getOrgApacheFelixEventadminRequireTopic() {
    return orgApacheFelixEventadminRequireTopic;
  }
  public void setOrgApacheFelixEventadminRequireTopic(ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic) {
    this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.eventadmin.IgnoreTimeout")
  public ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTimeout() {
    return orgApacheFelixEventadminIgnoreTimeout;
  }
  public void setOrgApacheFelixEventadminIgnoreTimeout(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout) {
    this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
  }

  /**
   **/
  
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

