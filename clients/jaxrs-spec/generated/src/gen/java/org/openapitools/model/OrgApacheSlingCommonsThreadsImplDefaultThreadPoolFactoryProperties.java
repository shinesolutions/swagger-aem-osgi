package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties   {
  
  private @Valid ConfigNodePropertyString name = null;
  private @Valid ConfigNodePropertyInteger minPoolSize = null;
  private @Valid ConfigNodePropertyInteger maxPoolSize = null;
  private @Valid ConfigNodePropertyInteger queueSize = null;
  private @Valid ConfigNodePropertyInteger maxThreadAge = null;
  private @Valid ConfigNodePropertyInteger keepAliveTime = null;
  private @Valid ConfigNodePropertyDropDown blockPolicy = null;
  private @Valid ConfigNodePropertyBoolean shutdownGraceful = null;
  private @Valid ConfigNodePropertyBoolean daemon = null;
  private @Valid ConfigNodePropertyInteger shutdownWaitTime = null;
  private @Valid ConfigNodePropertyDropDown priority = null;

  /**
   **/
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties minPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("minPoolSize")
  public ConfigNodePropertyInteger getMinPoolSize() {
    return minPoolSize;
  }
  public void setMinPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
  }

  /**
   **/
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties maxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxPoolSize")
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }
  public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  /**
   **/
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties queueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }
  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  /**
   **/
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties maxThreadAge(ConfigNodePropertyInteger maxThreadAge) {
    this.maxThreadAge = maxThreadAge;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxThreadAge")
  public ConfigNodePropertyInteger getMaxThreadAge() {
    return maxThreadAge;
  }
  public void setMaxThreadAge(ConfigNodePropertyInteger maxThreadAge) {
    this.maxThreadAge = maxThreadAge;
  }

  /**
   **/
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties keepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keepAliveTime")
  public ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }
  public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }

  /**
   **/
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties blockPolicy(ConfigNodePropertyDropDown blockPolicy) {
    this.blockPolicy = blockPolicy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("blockPolicy")
  public ConfigNodePropertyDropDown getBlockPolicy() {
    return blockPolicy;
  }
  public void setBlockPolicy(ConfigNodePropertyDropDown blockPolicy) {
    this.blockPolicy = blockPolicy;
  }

  /**
   **/
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties shutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful) {
    this.shutdownGraceful = shutdownGraceful;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("shutdownGraceful")
  public ConfigNodePropertyBoolean getShutdownGraceful() {
    return shutdownGraceful;
  }
  public void setShutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful) {
    this.shutdownGraceful = shutdownGraceful;
  }

  /**
   **/
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties daemon(ConfigNodePropertyBoolean daemon) {
    this.daemon = daemon;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("daemon")
  public ConfigNodePropertyBoolean getDaemon() {
    return daemon;
  }
  public void setDaemon(ConfigNodePropertyBoolean daemon) {
    this.daemon = daemon;
  }

  /**
   **/
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties shutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime) {
    this.shutdownWaitTime = shutdownWaitTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("shutdownWaitTime")
  public ConfigNodePropertyInteger getShutdownWaitTime() {
    return shutdownWaitTime;
  }
  public void setShutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime) {
    this.shutdownWaitTime = shutdownWaitTime;
  }

  /**
   **/
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties priority(ConfigNodePropertyDropDown priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("priority")
  public ConfigNodePropertyDropDown getPriority() {
    return priority;
  }
  public void setPriority(ConfigNodePropertyDropDown priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties = (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) o;
    return Objects.equals(name, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.name) &&
        Objects.equals(minPoolSize, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.minPoolSize) &&
        Objects.equals(maxPoolSize, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.maxPoolSize) &&
        Objects.equals(queueSize, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.queueSize) &&
        Objects.equals(maxThreadAge, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.maxThreadAge) &&
        Objects.equals(keepAliveTime, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.keepAliveTime) &&
        Objects.equals(blockPolicy, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.blockPolicy) &&
        Objects.equals(shutdownGraceful, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.shutdownGraceful) &&
        Objects.equals(daemon, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.daemon) &&
        Objects.equals(shutdownWaitTime, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.shutdownWaitTime) &&
        Objects.equals(priority, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, minPoolSize, maxPoolSize, queueSize, maxThreadAge, keepAliveTime, blockPolicy, shutdownGraceful, daemon, shutdownWaitTime, priority);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

