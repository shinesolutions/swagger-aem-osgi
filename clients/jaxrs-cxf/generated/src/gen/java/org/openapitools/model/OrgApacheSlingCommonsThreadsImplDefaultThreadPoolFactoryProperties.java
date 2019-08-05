package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
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

public class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minPoolSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxPoolSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger queueSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxThreadAge = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger keepAliveTime = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown blockPolicy = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean shutdownGraceful = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean daemon = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger shutdownWaitTime = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown priority = null;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
   * Get minPoolSize
   * @return minPoolSize
  **/
  @JsonProperty("minPoolSize")
  public ConfigNodePropertyInteger getMinPoolSize() {
    return minPoolSize;
  }

  public void setMinPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties minPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
    return this;
  }

 /**
   * Get maxPoolSize
   * @return maxPoolSize
  **/
  @JsonProperty("maxPoolSize")
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }

  public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties maxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
    return this;
  }

 /**
   * Get queueSize
   * @return queueSize
  **/
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties queueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

 /**
   * Get maxThreadAge
   * @return maxThreadAge
  **/
  @JsonProperty("maxThreadAge")
  public ConfigNodePropertyInteger getMaxThreadAge() {
    return maxThreadAge;
  }

  public void setMaxThreadAge(ConfigNodePropertyInteger maxThreadAge) {
    this.maxThreadAge = maxThreadAge;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties maxThreadAge(ConfigNodePropertyInteger maxThreadAge) {
    this.maxThreadAge = maxThreadAge;
    return this;
  }

 /**
   * Get keepAliveTime
   * @return keepAliveTime
  **/
  @JsonProperty("keepAliveTime")
  public ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }

  public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties keepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
    return this;
  }

 /**
   * Get blockPolicy
   * @return blockPolicy
  **/
  @JsonProperty("blockPolicy")
  public ConfigNodePropertyDropDown getBlockPolicy() {
    return blockPolicy;
  }

  public void setBlockPolicy(ConfigNodePropertyDropDown blockPolicy) {
    this.blockPolicy = blockPolicy;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties blockPolicy(ConfigNodePropertyDropDown blockPolicy) {
    this.blockPolicy = blockPolicy;
    return this;
  }

 /**
   * Get shutdownGraceful
   * @return shutdownGraceful
  **/
  @JsonProperty("shutdownGraceful")
  public ConfigNodePropertyBoolean getShutdownGraceful() {
    return shutdownGraceful;
  }

  public void setShutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful) {
    this.shutdownGraceful = shutdownGraceful;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties shutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful) {
    this.shutdownGraceful = shutdownGraceful;
    return this;
  }

 /**
   * Get daemon
   * @return daemon
  **/
  @JsonProperty("daemon")
  public ConfigNodePropertyBoolean getDaemon() {
    return daemon;
  }

  public void setDaemon(ConfigNodePropertyBoolean daemon) {
    this.daemon = daemon;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties daemon(ConfigNodePropertyBoolean daemon) {
    this.daemon = daemon;
    return this;
  }

 /**
   * Get shutdownWaitTime
   * @return shutdownWaitTime
  **/
  @JsonProperty("shutdownWaitTime")
  public ConfigNodePropertyInteger getShutdownWaitTime() {
    return shutdownWaitTime;
  }

  public void setShutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime) {
    this.shutdownWaitTime = shutdownWaitTime;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties shutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime) {
    this.shutdownWaitTime = shutdownWaitTime;
    return this;
  }

 /**
   * Get priority
   * @return priority
  **/
  @JsonProperty("priority")
  public ConfigNodePropertyDropDown getPriority() {
    return priority;
  }

  public void setPriority(ConfigNodePropertyDropDown priority) {
    this.priority = priority;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties priority(ConfigNodePropertyDropDown priority) {
    this.priority = priority;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    minPoolSize: ").append(toIndentedString(minPoolSize)).append("\n");
    sb.append("    maxPoolSize: ").append(toIndentedString(maxPoolSize)).append("\n");
    sb.append("    queueSize: ").append(toIndentedString(queueSize)).append("\n");
    sb.append("    maxThreadAge: ").append(toIndentedString(maxThreadAge)).append("\n");
    sb.append("    keepAliveTime: ").append(toIndentedString(keepAliveTime)).append("\n");
    sb.append("    blockPolicy: ").append(toIndentedString(blockPolicy)).append("\n");
    sb.append("    shutdownGraceful: ").append(toIndentedString(shutdownGraceful)).append("\n");
    sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
    sb.append("    shutdownWaitTime: ").append(toIndentedString(shutdownWaitTime)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

