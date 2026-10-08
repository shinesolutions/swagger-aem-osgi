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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEventJobsQueueConfigurationProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString queueName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray queueTopics;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown queueType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown queuePriority;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger queueRetries;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger queueRetrydelay;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyFloat queueMaxparallel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean queueKeepJobs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean queuePreferRunOnCreationInstance;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger queueThreadPoolSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger serviceRanking;

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueName(@Nullable ConfigNodePropertyString queueName) {
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
  public @Nullable ConfigNodePropertyString getQueueName() {
    return queueName;
  }

  @JsonProperty("queue.name")
  public void setQueueName(@Nullable ConfigNodePropertyString queueName) {
    this.queueName = queueName;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueTopics(@Nullable ConfigNodePropertyArray queueTopics) {
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
  public @Nullable ConfigNodePropertyArray getQueueTopics() {
    return queueTopics;
  }

  @JsonProperty("queue.topics")
  public void setQueueTopics(@Nullable ConfigNodePropertyArray queueTopics) {
    this.queueTopics = queueTopics;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueType(@Nullable ConfigNodePropertyDropDown queueType) {
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
  public @Nullable ConfigNodePropertyDropDown getQueueType() {
    return queueType;
  }

  @JsonProperty("queue.type")
  public void setQueueType(@Nullable ConfigNodePropertyDropDown queueType) {
    this.queueType = queueType;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queuePriority(@Nullable ConfigNodePropertyDropDown queuePriority) {
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
  public @Nullable ConfigNodePropertyDropDown getQueuePriority() {
    return queuePriority;
  }

  @JsonProperty("queue.priority")
  public void setQueuePriority(@Nullable ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueRetries(@Nullable ConfigNodePropertyInteger queueRetries) {
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
  public @Nullable ConfigNodePropertyInteger getQueueRetries() {
    return queueRetries;
  }

  @JsonProperty("queue.retries")
  public void setQueueRetries(@Nullable ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueRetrydelay(@Nullable ConfigNodePropertyInteger queueRetrydelay) {
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
  public @Nullable ConfigNodePropertyInteger getQueueRetrydelay() {
    return queueRetrydelay;
  }

  @JsonProperty("queue.retrydelay")
  public void setQueueRetrydelay(@Nullable ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueMaxparallel(@Nullable ConfigNodePropertyFloat queueMaxparallel) {
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
  public @Nullable ConfigNodePropertyFloat getQueueMaxparallel() {
    return queueMaxparallel;
  }

  @JsonProperty("queue.maxparallel")
  public void setQueueMaxparallel(@Nullable ConfigNodePropertyFloat queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueKeepJobs(@Nullable ConfigNodePropertyBoolean queueKeepJobs) {
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
  public @Nullable ConfigNodePropertyBoolean getQueueKeepJobs() {
    return queueKeepJobs;
  }

  @JsonProperty("queue.keepJobs")
  public void setQueueKeepJobs(@Nullable ConfigNodePropertyBoolean queueKeepJobs) {
    this.queueKeepJobs = queueKeepJobs;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queuePreferRunOnCreationInstance(@Nullable ConfigNodePropertyBoolean queuePreferRunOnCreationInstance) {
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
  public @Nullable ConfigNodePropertyBoolean getQueuePreferRunOnCreationInstance() {
    return queuePreferRunOnCreationInstance;
  }

  @JsonProperty("queue.preferRunOnCreationInstance")
  public void setQueuePreferRunOnCreationInstance(@Nullable ConfigNodePropertyBoolean queuePreferRunOnCreationInstance) {
    this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueThreadPoolSize(@Nullable ConfigNodePropertyInteger queueThreadPoolSize) {
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
  public @Nullable ConfigNodePropertyInteger getQueueThreadPoolSize() {
    return queueThreadPoolSize;
  }

  @JsonProperty("queue.threadPoolSize")
  public void setQueueThreadPoolSize(@Nullable ConfigNodePropertyInteger queueThreadPoolSize) {
    this.queueThreadPoolSize = queueThreadPoolSize;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties serviceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
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
  public @Nullable ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
  public void setServiceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

