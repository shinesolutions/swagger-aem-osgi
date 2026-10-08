package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minPoolSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxPoolSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger queueSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxThreadAge;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger keepAliveTime;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown blockPolicy;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean shutdownGraceful;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean daemon;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger shutdownWaitTime;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown priority;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
  * Get minPoolSize
  * @return minPoolSize
  */
  @JsonProperty("minPoolSize")
  public ConfigNodePropertyInteger getMinPoolSize() {
    return minPoolSize;
  }

  /**
   * Sets the <code>minPoolSize</code> property.
   */
 public void setMinPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
  }

  /**
   * Sets the <code>minPoolSize</code> property.
   */
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties minPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
    return this;
  }

 /**
  * Get maxPoolSize
  * @return maxPoolSize
  */
  @JsonProperty("maxPoolSize")
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }

  /**
   * Sets the <code>maxPoolSize</code> property.
   */
 public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  /**
   * Sets the <code>maxPoolSize</code> property.
   */
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties maxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
    return this;
  }

 /**
  * Get queueSize
  * @return queueSize
  */
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  /**
   * Sets the <code>queueSize</code> property.
   */
 public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  /**
   * Sets the <code>queueSize</code> property.
   */
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties queueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

 /**
  * Get maxThreadAge
  * @return maxThreadAge
  */
  @JsonProperty("maxThreadAge")
  public ConfigNodePropertyInteger getMaxThreadAge() {
    return maxThreadAge;
  }

  /**
   * Sets the <code>maxThreadAge</code> property.
   */
 public void setMaxThreadAge(ConfigNodePropertyInteger maxThreadAge) {
    this.maxThreadAge = maxThreadAge;
  }

  /**
   * Sets the <code>maxThreadAge</code> property.
   */
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties maxThreadAge(ConfigNodePropertyInteger maxThreadAge) {
    this.maxThreadAge = maxThreadAge;
    return this;
  }

 /**
  * Get keepAliveTime
  * @return keepAliveTime
  */
  @JsonProperty("keepAliveTime")
  public ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }

  /**
   * Sets the <code>keepAliveTime</code> property.
   */
 public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }

  /**
   * Sets the <code>keepAliveTime</code> property.
   */
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties keepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
    return this;
  }

 /**
  * Get blockPolicy
  * @return blockPolicy
  */
  @JsonProperty("blockPolicy")
  public ConfigNodePropertyDropDown getBlockPolicy() {
    return blockPolicy;
  }

  /**
   * Sets the <code>blockPolicy</code> property.
   */
 public void setBlockPolicy(ConfigNodePropertyDropDown blockPolicy) {
    this.blockPolicy = blockPolicy;
  }

  /**
   * Sets the <code>blockPolicy</code> property.
   */
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties blockPolicy(ConfigNodePropertyDropDown blockPolicy) {
    this.blockPolicy = blockPolicy;
    return this;
  }

 /**
  * Get shutdownGraceful
  * @return shutdownGraceful
  */
  @JsonProperty("shutdownGraceful")
  public ConfigNodePropertyBoolean getShutdownGraceful() {
    return shutdownGraceful;
  }

  /**
   * Sets the <code>shutdownGraceful</code> property.
   */
 public void setShutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful) {
    this.shutdownGraceful = shutdownGraceful;
  }

  /**
   * Sets the <code>shutdownGraceful</code> property.
   */
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties shutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful) {
    this.shutdownGraceful = shutdownGraceful;
    return this;
  }

 /**
  * Get daemon
  * @return daemon
  */
  @JsonProperty("daemon")
  public ConfigNodePropertyBoolean getDaemon() {
    return daemon;
  }

  /**
   * Sets the <code>daemon</code> property.
   */
 public void setDaemon(ConfigNodePropertyBoolean daemon) {
    this.daemon = daemon;
  }

  /**
   * Sets the <code>daemon</code> property.
   */
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties daemon(ConfigNodePropertyBoolean daemon) {
    this.daemon = daemon;
    return this;
  }

 /**
  * Get shutdownWaitTime
  * @return shutdownWaitTime
  */
  @JsonProperty("shutdownWaitTime")
  public ConfigNodePropertyInteger getShutdownWaitTime() {
    return shutdownWaitTime;
  }

  /**
   * Sets the <code>shutdownWaitTime</code> property.
   */
 public void setShutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime) {
    this.shutdownWaitTime = shutdownWaitTime;
  }

  /**
   * Sets the <code>shutdownWaitTime</code> property.
   */
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties shutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime) {
    this.shutdownWaitTime = shutdownWaitTime;
    return this;
  }

 /**
  * Get priority
  * @return priority
  */
  @JsonProperty("priority")
  public ConfigNodePropertyDropDown getPriority() {
    return priority;
  }

  /**
   * Sets the <code>priority</code> property.
   */
 public void setPriority(ConfigNodePropertyDropDown priority) {
    this.priority = priority;
  }

  /**
   * Sets the <code>priority</code> property.
   */
  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties priority(ConfigNodePropertyDropDown priority) {
    this.priority = priority;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties = (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) o;
    return Objects.equals(this.name, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.name) &&
        Objects.equals(this.minPoolSize, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.minPoolSize) &&
        Objects.equals(this.maxPoolSize, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.maxPoolSize) &&
        Objects.equals(this.queueSize, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.queueSize) &&
        Objects.equals(this.maxThreadAge, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.maxThreadAge) &&
        Objects.equals(this.keepAliveTime, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.keepAliveTime) &&
        Objects.equals(this.blockPolicy, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.blockPolicy) &&
        Objects.equals(this.shutdownGraceful, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.shutdownGraceful) &&
        Objects.equals(this.daemon, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.daemon) &&
        Objects.equals(this.shutdownWaitTime, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.shutdownWaitTime) &&
        Objects.equals(this.priority, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.priority);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

