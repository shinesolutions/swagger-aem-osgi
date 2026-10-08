package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingEventJobsQueueConfigurationProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString queueName;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray queueTopics;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyDropDown queueType;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyDropDown queuePriority;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger queueRetries;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger queueRetrydelay;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyFloat queueMaxparallel;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean queueKeepJobs;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean queuePreferRunOnCreationInstance;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger queueThreadPoolSize;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger serviceRanking;
 /**
   * Get queueName
   * @return queueName
  **/
  @JsonProperty("queue.name")
  public ConfigNodePropertyString getQueueName() {
    return queueName;
  }

  public void setQueueName(ConfigNodePropertyString queueName) {
    this.queueName = queueName;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueName(ConfigNodePropertyString queueName) {
    this.queueName = queueName;
    return this;
  }

 /**
   * Get queueTopics
   * @return queueTopics
  **/
  @JsonProperty("queue.topics")
  public ConfigNodePropertyArray getQueueTopics() {
    return queueTopics;
  }

  public void setQueueTopics(ConfigNodePropertyArray queueTopics) {
    this.queueTopics = queueTopics;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueTopics(ConfigNodePropertyArray queueTopics) {
    this.queueTopics = queueTopics;
    return this;
  }

 /**
   * Get queueType
   * @return queueType
  **/
  @JsonProperty("queue.type")
  public ConfigNodePropertyDropDown getQueueType() {
    return queueType;
  }

  public void setQueueType(ConfigNodePropertyDropDown queueType) {
    this.queueType = queueType;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueType(ConfigNodePropertyDropDown queueType) {
    this.queueType = queueType;
    return this;
  }

 /**
   * Get queuePriority
   * @return queuePriority
  **/
  @JsonProperty("queue.priority")
  public ConfigNodePropertyDropDown getQueuePriority() {
    return queuePriority;
  }

  public void setQueuePriority(ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queuePriority(ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
    return this;
  }

 /**
   * Get queueRetries
   * @return queueRetries
  **/
  @JsonProperty("queue.retries")
  public ConfigNodePropertyInteger getQueueRetries() {
    return queueRetries;
  }

  public void setQueueRetries(ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueRetries(ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
    return this;
  }

 /**
   * Get queueRetrydelay
   * @return queueRetrydelay
  **/
  @JsonProperty("queue.retrydelay")
  public ConfigNodePropertyInteger getQueueRetrydelay() {
    return queueRetrydelay;
  }

  public void setQueueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
    return this;
  }

 /**
   * Get queueMaxparallel
   * @return queueMaxparallel
  **/
  @JsonProperty("queue.maxparallel")
  public ConfigNodePropertyFloat getQueueMaxparallel() {
    return queueMaxparallel;
  }

  public void setQueueMaxparallel(ConfigNodePropertyFloat queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueMaxparallel(ConfigNodePropertyFloat queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
    return this;
  }

 /**
   * Get queueKeepJobs
   * @return queueKeepJobs
  **/
  @JsonProperty("queue.keepJobs")
  public ConfigNodePropertyBoolean getQueueKeepJobs() {
    return queueKeepJobs;
  }

  public void setQueueKeepJobs(ConfigNodePropertyBoolean queueKeepJobs) {
    this.queueKeepJobs = queueKeepJobs;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueKeepJobs(ConfigNodePropertyBoolean queueKeepJobs) {
    this.queueKeepJobs = queueKeepJobs;
    return this;
  }

 /**
   * Get queuePreferRunOnCreationInstance
   * @return queuePreferRunOnCreationInstance
  **/
  @JsonProperty("queue.preferRunOnCreationInstance")
  public ConfigNodePropertyBoolean getQueuePreferRunOnCreationInstance() {
    return queuePreferRunOnCreationInstance;
  }

  public void setQueuePreferRunOnCreationInstance(ConfigNodePropertyBoolean queuePreferRunOnCreationInstance) {
    this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queuePreferRunOnCreationInstance(ConfigNodePropertyBoolean queuePreferRunOnCreationInstance) {
    this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
    return this;
  }

 /**
   * Get queueThreadPoolSize
   * @return queueThreadPoolSize
  **/
  @JsonProperty("queue.threadPoolSize")
  public ConfigNodePropertyInteger getQueueThreadPoolSize() {
    return queueThreadPoolSize;
  }

  public void setQueueThreadPoolSize(ConfigNodePropertyInteger queueThreadPoolSize) {
    this.queueThreadPoolSize = queueThreadPoolSize;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueThreadPoolSize(ConfigNodePropertyInteger queueThreadPoolSize) {
    this.queueThreadPoolSize = queueThreadPoolSize;
    return this;
  }

 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

