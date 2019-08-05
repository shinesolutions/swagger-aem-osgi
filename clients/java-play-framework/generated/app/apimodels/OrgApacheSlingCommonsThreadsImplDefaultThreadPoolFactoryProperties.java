package apimodels;

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
 * OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("minPoolSize")
  private ConfigNodePropertyInteger minPoolSize = null;

  @JsonProperty("maxPoolSize")
  private ConfigNodePropertyInteger maxPoolSize = null;

  @JsonProperty("queueSize")
  private ConfigNodePropertyInteger queueSize = null;

  @JsonProperty("maxThreadAge")
  private ConfigNodePropertyInteger maxThreadAge = null;

  @JsonProperty("keepAliveTime")
  private ConfigNodePropertyInteger keepAliveTime = null;

  @JsonProperty("blockPolicy")
  private ConfigNodePropertyDropDown blockPolicy = null;

  @JsonProperty("shutdownGraceful")
  private ConfigNodePropertyBoolean shutdownGraceful = null;

  @JsonProperty("daemon")
  private ConfigNodePropertyBoolean daemon = null;

  @JsonProperty("shutdownWaitTime")
  private ConfigNodePropertyInteger shutdownWaitTime = null;

  @JsonProperty("priority")
  private ConfigNodePropertyDropDown priority = null;

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Valid
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties minPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
    return this;
  }

   /**
   * Get minPoolSize
   * @return minPoolSize
  **/
  @Valid
  public ConfigNodePropertyInteger getMinPoolSize() {
    return minPoolSize;
  }

  public void setMinPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties maxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
    return this;
  }

   /**
   * Get maxPoolSize
   * @return maxPoolSize
  **/
  @Valid
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }

  public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties queueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

   /**
   * Get queueSize
   * @return queueSize
  **/
  @Valid
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties maxThreadAge(ConfigNodePropertyInteger maxThreadAge) {
    this.maxThreadAge = maxThreadAge;
    return this;
  }

   /**
   * Get maxThreadAge
   * @return maxThreadAge
  **/
  @Valid
  public ConfigNodePropertyInteger getMaxThreadAge() {
    return maxThreadAge;
  }

  public void setMaxThreadAge(ConfigNodePropertyInteger maxThreadAge) {
    this.maxThreadAge = maxThreadAge;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties keepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
    return this;
  }

   /**
   * Get keepAliveTime
   * @return keepAliveTime
  **/
  @Valid
  public ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }

  public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties blockPolicy(ConfigNodePropertyDropDown blockPolicy) {
    this.blockPolicy = blockPolicy;
    return this;
  }

   /**
   * Get blockPolicy
   * @return blockPolicy
  **/
  @Valid
  public ConfigNodePropertyDropDown getBlockPolicy() {
    return blockPolicy;
  }

  public void setBlockPolicy(ConfigNodePropertyDropDown blockPolicy) {
    this.blockPolicy = blockPolicy;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties shutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful) {
    this.shutdownGraceful = shutdownGraceful;
    return this;
  }

   /**
   * Get shutdownGraceful
   * @return shutdownGraceful
  **/
  @Valid
  public ConfigNodePropertyBoolean getShutdownGraceful() {
    return shutdownGraceful;
  }

  public void setShutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful) {
    this.shutdownGraceful = shutdownGraceful;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties daemon(ConfigNodePropertyBoolean daemon) {
    this.daemon = daemon;
    return this;
  }

   /**
   * Get daemon
   * @return daemon
  **/
  @Valid
  public ConfigNodePropertyBoolean getDaemon() {
    return daemon;
  }

  public void setDaemon(ConfigNodePropertyBoolean daemon) {
    this.daemon = daemon;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties shutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime) {
    this.shutdownWaitTime = shutdownWaitTime;
    return this;
  }

   /**
   * Get shutdownWaitTime
   * @return shutdownWaitTime
  **/
  @Valid
  public ConfigNodePropertyInteger getShutdownWaitTime() {
    return shutdownWaitTime;
  }

  public void setShutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime) {
    this.shutdownWaitTime = shutdownWaitTime;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties priority(ConfigNodePropertyDropDown priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

