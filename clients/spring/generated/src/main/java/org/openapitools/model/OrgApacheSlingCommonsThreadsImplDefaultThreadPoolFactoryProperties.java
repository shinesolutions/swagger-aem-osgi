package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
 */

@JsonTypeName("orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger minPoolSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxPoolSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger queueSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxThreadAge;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger keepAliveTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown blockPolicy;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean shutdownGraceful;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean daemon;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger shutdownWaitTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown priority;

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties name(@Nullable ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties minPoolSize(@Nullable ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
    return this;
  }

  /**
   * Get minPoolSize
   * @return minPoolSize
   */
  @Valid 
  @Schema(name = "minPoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minPoolSize")
  public @Nullable ConfigNodePropertyInteger getMinPoolSize() {
    return minPoolSize;
  }

  @JsonProperty("minPoolSize")
  public void setMinPoolSize(@Nullable ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties maxPoolSize(@Nullable ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
    return this;
  }

  /**
   * Get maxPoolSize
   * @return maxPoolSize
   */
  @Valid 
  @Schema(name = "maxPoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxPoolSize")
  public @Nullable ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }

  @JsonProperty("maxPoolSize")
  public void setMaxPoolSize(@Nullable ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties queueSize(@Nullable ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

  /**
   * Get queueSize
   * @return queueSize
   */
  @Valid 
  @Schema(name = "queueSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueSize")
  public @Nullable ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  @JsonProperty("queueSize")
  public void setQueueSize(@Nullable ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties maxThreadAge(@Nullable ConfigNodePropertyInteger maxThreadAge) {
    this.maxThreadAge = maxThreadAge;
    return this;
  }

  /**
   * Get maxThreadAge
   * @return maxThreadAge
   */
  @Valid 
  @Schema(name = "maxThreadAge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxThreadAge")
  public @Nullable ConfigNodePropertyInteger getMaxThreadAge() {
    return maxThreadAge;
  }

  @JsonProperty("maxThreadAge")
  public void setMaxThreadAge(@Nullable ConfigNodePropertyInteger maxThreadAge) {
    this.maxThreadAge = maxThreadAge;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties keepAliveTime(@Nullable ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
    return this;
  }

  /**
   * Get keepAliveTime
   * @return keepAliveTime
   */
  @Valid 
  @Schema(name = "keepAliveTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keepAliveTime")
  public @Nullable ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }

  @JsonProperty("keepAliveTime")
  public void setKeepAliveTime(@Nullable ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties blockPolicy(@Nullable ConfigNodePropertyDropDown blockPolicy) {
    this.blockPolicy = blockPolicy;
    return this;
  }

  /**
   * Get blockPolicy
   * @return blockPolicy
   */
  @Valid 
  @Schema(name = "blockPolicy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockPolicy")
  public @Nullable ConfigNodePropertyDropDown getBlockPolicy() {
    return blockPolicy;
  }

  @JsonProperty("blockPolicy")
  public void setBlockPolicy(@Nullable ConfigNodePropertyDropDown blockPolicy) {
    this.blockPolicy = blockPolicy;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties shutdownGraceful(@Nullable ConfigNodePropertyBoolean shutdownGraceful) {
    this.shutdownGraceful = shutdownGraceful;
    return this;
  }

  /**
   * Get shutdownGraceful
   * @return shutdownGraceful
   */
  @Valid 
  @Schema(name = "shutdownGraceful", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shutdownGraceful")
  public @Nullable ConfigNodePropertyBoolean getShutdownGraceful() {
    return shutdownGraceful;
  }

  @JsonProperty("shutdownGraceful")
  public void setShutdownGraceful(@Nullable ConfigNodePropertyBoolean shutdownGraceful) {
    this.shutdownGraceful = shutdownGraceful;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties daemon(@Nullable ConfigNodePropertyBoolean daemon) {
    this.daemon = daemon;
    return this;
  }

  /**
   * Get daemon
   * @return daemon
   */
  @Valid 
  @Schema(name = "daemon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("daemon")
  public @Nullable ConfigNodePropertyBoolean getDaemon() {
    return daemon;
  }

  @JsonProperty("daemon")
  public void setDaemon(@Nullable ConfigNodePropertyBoolean daemon) {
    this.daemon = daemon;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties shutdownWaitTime(@Nullable ConfigNodePropertyInteger shutdownWaitTime) {
    this.shutdownWaitTime = shutdownWaitTime;
    return this;
  }

  /**
   * Get shutdownWaitTime
   * @return shutdownWaitTime
   */
  @Valid 
  @Schema(name = "shutdownWaitTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shutdownWaitTime")
  public @Nullable ConfigNodePropertyInteger getShutdownWaitTime() {
    return shutdownWaitTime;
  }

  @JsonProperty("shutdownWaitTime")
  public void setShutdownWaitTime(@Nullable ConfigNodePropertyInteger shutdownWaitTime) {
    this.shutdownWaitTime = shutdownWaitTime;
  }

  public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties priority(@Nullable ConfigNodePropertyDropDown priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @Valid 
  @Schema(name = "priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public @Nullable ConfigNodePropertyDropDown getPriority() {
    return priority;
  }

  @JsonProperty("priority")
  public void setPriority(@Nullable ConfigNodePropertyDropDown priority) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

