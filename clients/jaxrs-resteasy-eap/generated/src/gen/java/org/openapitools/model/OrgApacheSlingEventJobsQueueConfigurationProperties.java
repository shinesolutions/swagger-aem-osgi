package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingEventJobsQueueConfigurationProperties   {
  

  private ConfigNodePropertyString queueName = null;

  private ConfigNodePropertyArray queueTopics = null;

  private ConfigNodePropertyDropDown queueType = null;

  private ConfigNodePropertyDropDown queuePriority = null;

  private ConfigNodePropertyInteger queueRetries = null;

  private ConfigNodePropertyInteger queueRetrydelay = null;

  private ConfigNodePropertyFloat queueMaxparallel = null;

  private ConfigNodePropertyBoolean queueKeepJobs = null;

  private ConfigNodePropertyBoolean queuePreferRunOnCreationInstance = null;

  private ConfigNodePropertyInteger queueThreadPoolSize = null;

  private ConfigNodePropertyInteger serviceRanking = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.name")
  public ConfigNodePropertyString getQueueName() {
    return queueName;
  }
  public void setQueueName(ConfigNodePropertyString queueName) {
    this.queueName = queueName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.topics")
  public ConfigNodePropertyArray getQueueTopics() {
    return queueTopics;
  }
  public void setQueueTopics(ConfigNodePropertyArray queueTopics) {
    this.queueTopics = queueTopics;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.type")
  public ConfigNodePropertyDropDown getQueueType() {
    return queueType;
  }
  public void setQueueType(ConfigNodePropertyDropDown queueType) {
    this.queueType = queueType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.priority")
  public ConfigNodePropertyDropDown getQueuePriority() {
    return queuePriority;
  }
  public void setQueuePriority(ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.retries")
  public ConfigNodePropertyInteger getQueueRetries() {
    return queueRetries;
  }
  public void setQueueRetries(ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.retrydelay")
  public ConfigNodePropertyInteger getQueueRetrydelay() {
    return queueRetrydelay;
  }
  public void setQueueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.maxparallel")
  public ConfigNodePropertyFloat getQueueMaxparallel() {
    return queueMaxparallel;
  }
  public void setQueueMaxparallel(ConfigNodePropertyFloat queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.keepJobs")
  public ConfigNodePropertyBoolean getQueueKeepJobs() {
    return queueKeepJobs;
  }
  public void setQueueKeepJobs(ConfigNodePropertyBoolean queueKeepJobs) {
    this.queueKeepJobs = queueKeepJobs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.preferRunOnCreationInstance")
  public ConfigNodePropertyBoolean getQueuePreferRunOnCreationInstance() {
    return queuePreferRunOnCreationInstance;
  }
  public void setQueuePreferRunOnCreationInstance(ConfigNodePropertyBoolean queuePreferRunOnCreationInstance) {
    this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.threadPoolSize")
  public ConfigNodePropertyInteger getQueueThreadPoolSize() {
    return queueThreadPoolSize;
  }
  public void setQueueThreadPoolSize(ConfigNodePropertyInteger queueThreadPoolSize) {
    this.queueThreadPoolSize = queueThreadPoolSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
    return Objects.equals(queueName, orgApacheSlingEventJobsQueueConfigurationProperties.queueName) &&
        Objects.equals(queueTopics, orgApacheSlingEventJobsQueueConfigurationProperties.queueTopics) &&
        Objects.equals(queueType, orgApacheSlingEventJobsQueueConfigurationProperties.queueType) &&
        Objects.equals(queuePriority, orgApacheSlingEventJobsQueueConfigurationProperties.queuePriority) &&
        Objects.equals(queueRetries, orgApacheSlingEventJobsQueueConfigurationProperties.queueRetries) &&
        Objects.equals(queueRetrydelay, orgApacheSlingEventJobsQueueConfigurationProperties.queueRetrydelay) &&
        Objects.equals(queueMaxparallel, orgApacheSlingEventJobsQueueConfigurationProperties.queueMaxparallel) &&
        Objects.equals(queueKeepJobs, orgApacheSlingEventJobsQueueConfigurationProperties.queueKeepJobs) &&
        Objects.equals(queuePreferRunOnCreationInstance, orgApacheSlingEventJobsQueueConfigurationProperties.queuePreferRunOnCreationInstance) &&
        Objects.equals(queueThreadPoolSize, orgApacheSlingEventJobsQueueConfigurationProperties.queueThreadPoolSize) &&
        Objects.equals(serviceRanking, orgApacheSlingEventJobsQueueConfigurationProperties.serviceRanking);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

