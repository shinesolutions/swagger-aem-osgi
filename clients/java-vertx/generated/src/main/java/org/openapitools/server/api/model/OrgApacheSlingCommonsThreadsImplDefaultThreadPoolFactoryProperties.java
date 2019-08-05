package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyInteger minPoolSize = null;
  private ConfigNodePropertyInteger maxPoolSize = null;
  private ConfigNodePropertyInteger queueSize = null;
  private ConfigNodePropertyInteger maxThreadAge = null;
  private ConfigNodePropertyInteger keepAliveTime = null;
  private ConfigNodePropertyDropDown blockPolicy = null;
  private ConfigNodePropertyBoolean shutdownGraceful = null;
  private ConfigNodePropertyBoolean daemon = null;
  private ConfigNodePropertyInteger shutdownWaitTime = null;
  private ConfigNodePropertyDropDown priority = null;

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties () {

  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties (ConfigNodePropertyString name, ConfigNodePropertyInteger minPoolSize, ConfigNodePropertyInteger maxPoolSize, ConfigNodePropertyInteger queueSize, ConfigNodePropertyInteger maxThreadAge, ConfigNodePropertyInteger keepAliveTime, ConfigNodePropertyDropDown blockPolicy, ConfigNodePropertyBoolean shutdownGraceful, ConfigNodePropertyBoolean daemon, ConfigNodePropertyInteger shutdownWaitTime, ConfigNodePropertyDropDown priority) {
    this.name = name;
    this.minPoolSize = minPoolSize;
    this.maxPoolSize = maxPoolSize;
    this.queueSize = queueSize;
    this.maxThreadAge = maxThreadAge;
    this.keepAliveTime = keepAliveTime;
    this.blockPolicy = blockPolicy;
    this.shutdownGraceful = shutdownGraceful;
    this.daemon = daemon;
    this.shutdownWaitTime = shutdownWaitTime;
    this.priority = priority;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("minPoolSize")
  public ConfigNodePropertyInteger getMinPoolSize() {
    return minPoolSize;
  }
  public void setMinPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
  }

    
  @JsonProperty("maxPoolSize")
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }
  public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

    
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }
  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

    
  @JsonProperty("maxThreadAge")
  public ConfigNodePropertyInteger getMaxThreadAge() {
    return maxThreadAge;
  }
  public void setMaxThreadAge(ConfigNodePropertyInteger maxThreadAge) {
    this.maxThreadAge = maxThreadAge;
  }

    
  @JsonProperty("keepAliveTime")
  public ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }
  public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }

    
  @JsonProperty("blockPolicy")
  public ConfigNodePropertyDropDown getBlockPolicy() {
    return blockPolicy;
  }
  public void setBlockPolicy(ConfigNodePropertyDropDown blockPolicy) {
    this.blockPolicy = blockPolicy;
  }

    
  @JsonProperty("shutdownGraceful")
  public ConfigNodePropertyBoolean getShutdownGraceful() {
    return shutdownGraceful;
  }
  public void setShutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful) {
    this.shutdownGraceful = shutdownGraceful;
  }

    
  @JsonProperty("daemon")
  public ConfigNodePropertyBoolean getDaemon() {
    return daemon;
  }
  public void setDaemon(ConfigNodePropertyBoolean daemon) {
    this.daemon = daemon;
  }

    
  @JsonProperty("shutdownWaitTime")
  public ConfigNodePropertyInteger getShutdownWaitTime() {
    return shutdownWaitTime;
  }
  public void setShutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime) {
    this.shutdownWaitTime = shutdownWaitTime;
  }

    
  @JsonProperty("priority")
  public ConfigNodePropertyDropDown getPriority() {
    return priority;
  }
  public void setPriority(ConfigNodePropertyDropDown priority) {
    this.priority = priority;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
