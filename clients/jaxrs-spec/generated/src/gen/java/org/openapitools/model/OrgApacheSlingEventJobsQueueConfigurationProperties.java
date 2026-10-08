package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingEventJobsQueueConfigurationProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEventJobsQueueConfigurationProperties   {
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

  public OrgApacheSlingEventJobsQueueConfigurationProperties() {
  }

  /**
   **/
  public OrgApacheSlingEventJobsQueueConfigurationProperties queueName(ConfigNodePropertyString queueName) {
    this.queueName = queueName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.name")
  @Valid public ConfigNodePropertyString getQueueName() {
    return queueName;
  }

  @JsonProperty("queue.name")
  public void setQueueName(ConfigNodePropertyString queueName) {
    this.queueName = queueName;
  }

  /**
   **/
  public OrgApacheSlingEventJobsQueueConfigurationProperties queueTopics(ConfigNodePropertyArray queueTopics) {
    this.queueTopics = queueTopics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.topics")
  @Valid public ConfigNodePropertyArray getQueueTopics() {
    return queueTopics;
  }

  @JsonProperty("queue.topics")
  public void setQueueTopics(ConfigNodePropertyArray queueTopics) {
    this.queueTopics = queueTopics;
  }

  /**
   **/
  public OrgApacheSlingEventJobsQueueConfigurationProperties queueType(ConfigNodePropertyDropDown queueType) {
    this.queueType = queueType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.type")
  @Valid public ConfigNodePropertyDropDown getQueueType() {
    return queueType;
  }

  @JsonProperty("queue.type")
  public void setQueueType(ConfigNodePropertyDropDown queueType) {
    this.queueType = queueType;
  }

  /**
   **/
  public OrgApacheSlingEventJobsQueueConfigurationProperties queuePriority(ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.priority")
  @Valid public ConfigNodePropertyDropDown getQueuePriority() {
    return queuePriority;
  }

  @JsonProperty("queue.priority")
  public void setQueuePriority(ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
  }

  /**
   **/
  public OrgApacheSlingEventJobsQueueConfigurationProperties queueRetries(ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.retries")
  @Valid public ConfigNodePropertyInteger getQueueRetries() {
    return queueRetries;
  }

  @JsonProperty("queue.retries")
  public void setQueueRetries(ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
  }

  /**
   **/
  public OrgApacheSlingEventJobsQueueConfigurationProperties queueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.retrydelay")
  @Valid public ConfigNodePropertyInteger getQueueRetrydelay() {
    return queueRetrydelay;
  }

  @JsonProperty("queue.retrydelay")
  public void setQueueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
  }

  /**
   **/
  public OrgApacheSlingEventJobsQueueConfigurationProperties queueMaxparallel(ConfigNodePropertyFloat queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.maxparallel")
  @Valid public ConfigNodePropertyFloat getQueueMaxparallel() {
    return queueMaxparallel;
  }

  @JsonProperty("queue.maxparallel")
  public void setQueueMaxparallel(ConfigNodePropertyFloat queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
  }

  /**
   **/
  public OrgApacheSlingEventJobsQueueConfigurationProperties queueKeepJobs(ConfigNodePropertyBoolean queueKeepJobs) {
    this.queueKeepJobs = queueKeepJobs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.keepJobs")
  @Valid public ConfigNodePropertyBoolean getQueueKeepJobs() {
    return queueKeepJobs;
  }

  @JsonProperty("queue.keepJobs")
  public void setQueueKeepJobs(ConfigNodePropertyBoolean queueKeepJobs) {
    this.queueKeepJobs = queueKeepJobs;
  }

  /**
   **/
  public OrgApacheSlingEventJobsQueueConfigurationProperties queuePreferRunOnCreationInstance(ConfigNodePropertyBoolean queuePreferRunOnCreationInstance) {
    this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.preferRunOnCreationInstance")
  @Valid public ConfigNodePropertyBoolean getQueuePreferRunOnCreationInstance() {
    return queuePreferRunOnCreationInstance;
  }

  @JsonProperty("queue.preferRunOnCreationInstance")
  public void setQueuePreferRunOnCreationInstance(ConfigNodePropertyBoolean queuePreferRunOnCreationInstance) {
    this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
  }

  /**
   **/
  public OrgApacheSlingEventJobsQueueConfigurationProperties queueThreadPoolSize(ConfigNodePropertyInteger queueThreadPoolSize) {
    this.queueThreadPoolSize = queueThreadPoolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.threadPoolSize")
  @Valid public ConfigNodePropertyInteger getQueueThreadPoolSize() {
    return queueThreadPoolSize;
  }

  @JsonProperty("queue.threadPoolSize")
  public void setQueueThreadPoolSize(ConfigNodePropertyInteger queueThreadPoolSize) {
    this.queueThreadPoolSize = queueThreadPoolSize;
  }

  /**
   **/
  public OrgApacheSlingEventJobsQueueConfigurationProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  @Valid public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
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
