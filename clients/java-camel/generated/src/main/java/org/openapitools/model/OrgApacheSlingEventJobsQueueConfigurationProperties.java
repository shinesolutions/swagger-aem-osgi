package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingEventJobsQueueConfigurationProperties
 */

@JsonTypeName("orgApacheSlingEventJobsQueueConfigurationProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEventJobsQueueConfigurationProperties {

  private ConfigNodePropertyString queueName;

  private ConfigNodePropertyArray queueTopics;

  private ConfigNodePropertyDropDown queueType;

  private ConfigNodePropertyDropDown queuePriority;

  private ConfigNodePropertyInteger queueRetries;

  private ConfigNodePropertyInteger queueRetrydelay;

  private ConfigNodePropertyFloat queueMaxparallel;

  private ConfigNodePropertyBoolean queueKeepJobs;

  private ConfigNodePropertyBoolean queuePreferRunOnCreationInstance;

  private ConfigNodePropertyInteger queueThreadPoolSize;

  private ConfigNodePropertyInteger serviceRanking;

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueName(ConfigNodePropertyString queueName) {
    this.queueName = queueName;
    return this;
  }

  /**
   * Get queueName
   * @return queueName
   */
  @Valid 
  @Schema(name = "queue.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.name")
  public ConfigNodePropertyString getQueueName() {
    return queueName;
  }

  public void setQueueName(ConfigNodePropertyString queueName) {
    this.queueName = queueName;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueTopics(ConfigNodePropertyArray queueTopics) {
    this.queueTopics = queueTopics;
    return this;
  }

  /**
   * Get queueTopics
   * @return queueTopics
   */
  @Valid 
  @Schema(name = "queue.topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.topics")
  public ConfigNodePropertyArray getQueueTopics() {
    return queueTopics;
  }

  public void setQueueTopics(ConfigNodePropertyArray queueTopics) {
    this.queueTopics = queueTopics;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueType(ConfigNodePropertyDropDown queueType) {
    this.queueType = queueType;
    return this;
  }

  /**
   * Get queueType
   * @return queueType
   */
  @Valid 
  @Schema(name = "queue.type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.type")
  public ConfigNodePropertyDropDown getQueueType() {
    return queueType;
  }

  public void setQueueType(ConfigNodePropertyDropDown queueType) {
    this.queueType = queueType;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queuePriority(ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
    return this;
  }

  /**
   * Get queuePriority
   * @return queuePriority
   */
  @Valid 
  @Schema(name = "queue.priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.priority")
  public ConfigNodePropertyDropDown getQueuePriority() {
    return queuePriority;
  }

  public void setQueuePriority(ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueRetries(ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
    return this;
  }

  /**
   * Get queueRetries
   * @return queueRetries
   */
  @Valid 
  @Schema(name = "queue.retries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.retries")
  public ConfigNodePropertyInteger getQueueRetries() {
    return queueRetries;
  }

  public void setQueueRetries(ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
    return this;
  }

  /**
   * Get queueRetrydelay
   * @return queueRetrydelay
   */
  @Valid 
  @Schema(name = "queue.retrydelay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.retrydelay")
  public ConfigNodePropertyInteger getQueueRetrydelay() {
    return queueRetrydelay;
  }

  public void setQueueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueMaxparallel(ConfigNodePropertyFloat queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
    return this;
  }

  /**
   * Get queueMaxparallel
   * @return queueMaxparallel
   */
  @Valid 
  @Schema(name = "queue.maxparallel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.maxparallel")
  public ConfigNodePropertyFloat getQueueMaxparallel() {
    return queueMaxparallel;
  }

  public void setQueueMaxparallel(ConfigNodePropertyFloat queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueKeepJobs(ConfigNodePropertyBoolean queueKeepJobs) {
    this.queueKeepJobs = queueKeepJobs;
    return this;
  }

  /**
   * Get queueKeepJobs
   * @return queueKeepJobs
   */
  @Valid 
  @Schema(name = "queue.keepJobs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.keepJobs")
  public ConfigNodePropertyBoolean getQueueKeepJobs() {
    return queueKeepJobs;
  }

  public void setQueueKeepJobs(ConfigNodePropertyBoolean queueKeepJobs) {
    this.queueKeepJobs = queueKeepJobs;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queuePreferRunOnCreationInstance(ConfigNodePropertyBoolean queuePreferRunOnCreationInstance) {
    this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
    return this;
  }

  /**
   * Get queuePreferRunOnCreationInstance
   * @return queuePreferRunOnCreationInstance
   */
  @Valid 
  @Schema(name = "queue.preferRunOnCreationInstance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.preferRunOnCreationInstance")
  public ConfigNodePropertyBoolean getQueuePreferRunOnCreationInstance() {
    return queuePreferRunOnCreationInstance;
  }

  public void setQueuePreferRunOnCreationInstance(ConfigNodePropertyBoolean queuePreferRunOnCreationInstance) {
    this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueThreadPoolSize(ConfigNodePropertyInteger queueThreadPoolSize) {
    this.queueThreadPoolSize = queueThreadPoolSize;
    return this;
  }

  /**
   * Get queueThreadPoolSize
   * @return queueThreadPoolSize
   */
  @Valid 
  @Schema(name = "queue.threadPoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.threadPoolSize")
  public ConfigNodePropertyInteger getQueueThreadPoolSize() {
    return queueThreadPoolSize;
  }

  public void setQueueThreadPoolSize(ConfigNodePropertyInteger queueThreadPoolSize) {
    this.queueThreadPoolSize = queueThreadPoolSize;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  /**
   * Get serviceRanking
   * @return serviceRanking
   */
  @Valid 
  @Schema(name = "service.ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEventJobsQueueConfigurationProperties orgApacheSlingEventJobsQueueConfigurationProperties = (OrgApacheSlingEventJobsQueueConfigurationProperties) o;
    return Objects.equals(this.queueName, orgApacheSlingEventJobsQueueConfigurationProperties.queueName) &&
        Objects.equals(this.queueTopics, orgApacheSlingEventJobsQueueConfigurationProperties.queueTopics) &&
        Objects.equals(this.queueType, orgApacheSlingEventJobsQueueConfigurationProperties.queueType) &&
        Objects.equals(this.queuePriority, orgApacheSlingEventJobsQueueConfigurationProperties.queuePriority) &&
        Objects.equals(this.queueRetries, orgApacheSlingEventJobsQueueConfigurationProperties.queueRetries) &&
        Objects.equals(this.queueRetrydelay, orgApacheSlingEventJobsQueueConfigurationProperties.queueRetrydelay) &&
        Objects.equals(this.queueMaxparallel, orgApacheSlingEventJobsQueueConfigurationProperties.queueMaxparallel) &&
        Objects.equals(this.queueKeepJobs, orgApacheSlingEventJobsQueueConfigurationProperties.queueKeepJobs) &&
        Objects.equals(this.queuePreferRunOnCreationInstance, orgApacheSlingEventJobsQueueConfigurationProperties.queuePreferRunOnCreationInstance) &&
        Objects.equals(this.queueThreadPoolSize, orgApacheSlingEventJobsQueueConfigurationProperties.queueThreadPoolSize) &&
        Objects.equals(this.serviceRanking, orgApacheSlingEventJobsQueueConfigurationProperties.serviceRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueName, queueTopics, queueType, queuePriority, queueRetries, queueRetrydelay, queueMaxparallel, queueKeepJobs, queuePreferRunOnCreationInstance, queueThreadPoolSize, serviceRanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEventJobsQueueConfigurationProperties {\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    queueTopics: ").append(toIndentedString(queueTopics)).append("\n");
    sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
    sb.append("    queuePriority: ").append(toIndentedString(queuePriority)).append("\n");
    sb.append("    queueRetries: ").append(toIndentedString(queueRetries)).append("\n");
    sb.append("    queueRetrydelay: ").append(toIndentedString(queueRetrydelay)).append("\n");
    sb.append("    queueMaxparallel: ").append(toIndentedString(queueMaxparallel)).append("\n");
    sb.append("    queueKeepJobs: ").append(toIndentedString(queueKeepJobs)).append("\n");
    sb.append("    queuePreferRunOnCreationInstance: ").append(toIndentedString(queuePreferRunOnCreationInstance)).append("\n");
    sb.append("    queueThreadPoolSize: ").append(toIndentedString(queueThreadPoolSize)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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

