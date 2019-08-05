package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheFelixEventadminImplEventAdminProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixEventadminTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic = null;
 /**
   * Get orgApacheFelixEventadminThreadPoolSize
   * @return orgApacheFelixEventadminThreadPoolSize
  **/
  @JsonProperty("org.apache.felix.eventadmin.ThreadPoolSize")
  public ConfigNodePropertyInteger getOrgApacheFelixEventadminThreadPoolSize() {
    return orgApacheFelixEventadminThreadPoolSize;
  }

  public void setOrgApacheFelixEventadminThreadPoolSize(ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize) {
    this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminThreadPoolSize(ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize) {
    this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
    return this;
  }

 /**
   * Get orgApacheFelixEventadminAsyncToSyncThreadRatio
   * @return orgApacheFelixEventadminAsyncToSyncThreadRatio
  **/
  @JsonProperty("org.apache.felix.eventadmin.AsyncToSyncThreadRatio")
  public ConfigNodePropertyFloat getOrgApacheFelixEventadminAsyncToSyncThreadRatio() {
    return orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }

  public void setOrgApacheFelixEventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio) {
    this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio) {
    this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
    return this;
  }

 /**
   * Get orgApacheFelixEventadminTimeout
   * @return orgApacheFelixEventadminTimeout
  **/
  @JsonProperty("org.apache.felix.eventadmin.Timeout")
  public ConfigNodePropertyInteger getOrgApacheFelixEventadminTimeout() {
    return orgApacheFelixEventadminTimeout;
  }

  public void setOrgApacheFelixEventadminTimeout(ConfigNodePropertyInteger orgApacheFelixEventadminTimeout) {
    this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminTimeout(ConfigNodePropertyInteger orgApacheFelixEventadminTimeout) {
    this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
    return this;
  }

 /**
   * Get orgApacheFelixEventadminRequireTopic
   * @return orgApacheFelixEventadminRequireTopic
  **/
  @JsonProperty("org.apache.felix.eventadmin.RequireTopic")
  public ConfigNodePropertyBoolean getOrgApacheFelixEventadminRequireTopic() {
    return orgApacheFelixEventadminRequireTopic;
  }

  public void setOrgApacheFelixEventadminRequireTopic(ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic) {
    this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminRequireTopic(ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic) {
    this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
    return this;
  }

 /**
   * Get orgApacheFelixEventadminIgnoreTimeout
   * @return orgApacheFelixEventadminIgnoreTimeout
  **/
  @JsonProperty("org.apache.felix.eventadmin.IgnoreTimeout")
  public ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTimeout() {
    return orgApacheFelixEventadminIgnoreTimeout;
  }

  public void setOrgApacheFelixEventadminIgnoreTimeout(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout) {
    this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminIgnoreTimeout(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout) {
    this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
    return this;
  }

 /**
   * Get orgApacheFelixEventadminIgnoreTopic
   * @return orgApacheFelixEventadminIgnoreTopic
  **/
  @JsonProperty("org.apache.felix.eventadmin.IgnoreTopic")
  public ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTopic() {
    return orgApacheFelixEventadminIgnoreTopic;
  }

  public void setOrgApacheFelixEventadminIgnoreTopic(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic) {
    this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminIgnoreTopic(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic) {
    this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

