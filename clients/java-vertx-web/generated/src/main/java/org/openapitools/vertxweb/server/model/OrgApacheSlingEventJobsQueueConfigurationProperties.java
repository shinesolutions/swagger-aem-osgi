package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyDropDown;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyFloat;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public OrgApacheSlingEventJobsQueueConfigurationProperties () {

  }

  public OrgApacheSlingEventJobsQueueConfigurationProperties (ConfigNodePropertyString queueName, ConfigNodePropertyArray queueTopics, ConfigNodePropertyDropDown queueType, ConfigNodePropertyDropDown queuePriority, ConfigNodePropertyInteger queueRetries, ConfigNodePropertyInteger queueRetrydelay, ConfigNodePropertyFloat queueMaxparallel, ConfigNodePropertyBoolean queueKeepJobs, ConfigNodePropertyBoolean queuePreferRunOnCreationInstance, ConfigNodePropertyInteger queueThreadPoolSize, ConfigNodePropertyInteger serviceRanking) {
    this.queueName = queueName;
    this.queueTopics = queueTopics;
    this.queueType = queueType;
    this.queuePriority = queuePriority;
    this.queueRetries = queueRetries;
    this.queueRetrydelay = queueRetrydelay;
    this.queueMaxparallel = queueMaxparallel;
    this.queueKeepJobs = queueKeepJobs;
    this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
    this.queueThreadPoolSize = queueThreadPoolSize;
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("queue.name")
  public ConfigNodePropertyString getQueueName() {
    return queueName;
  }
  public void setQueueName(ConfigNodePropertyString queueName) {
    this.queueName = queueName;
  }

    
  @JsonProperty("queue.topics")
  public ConfigNodePropertyArray getQueueTopics() {
    return queueTopics;
  }
  public void setQueueTopics(ConfigNodePropertyArray queueTopics) {
    this.queueTopics = queueTopics;
  }

    
  @JsonProperty("queue.type")
  public ConfigNodePropertyDropDown getQueueType() {
    return queueType;
  }
  public void setQueueType(ConfigNodePropertyDropDown queueType) {
    this.queueType = queueType;
  }

    
  @JsonProperty("queue.priority")
  public ConfigNodePropertyDropDown getQueuePriority() {
    return queuePriority;
  }
  public void setQueuePriority(ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
  }

    
  @JsonProperty("queue.retries")
  public ConfigNodePropertyInteger getQueueRetries() {
    return queueRetries;
  }
  public void setQueueRetries(ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
  }

    
  @JsonProperty("queue.retrydelay")
  public ConfigNodePropertyInteger getQueueRetrydelay() {
    return queueRetrydelay;
  }
  public void setQueueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
  }

    
  @JsonProperty("queue.maxparallel")
  public ConfigNodePropertyFloat getQueueMaxparallel() {
    return queueMaxparallel;
  }
  public void setQueueMaxparallel(ConfigNodePropertyFloat queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
  }

    
  @JsonProperty("queue.keepJobs")
  public ConfigNodePropertyBoolean getQueueKeepJobs() {
    return queueKeepJobs;
  }
  public void setQueueKeepJobs(ConfigNodePropertyBoolean queueKeepJobs) {
    this.queueKeepJobs = queueKeepJobs;
  }

    
  @JsonProperty("queue.preferRunOnCreationInstance")
  public ConfigNodePropertyBoolean getQueuePreferRunOnCreationInstance() {
    return queuePreferRunOnCreationInstance;
  }
  public void setQueuePreferRunOnCreationInstance(ConfigNodePropertyBoolean queuePreferRunOnCreationInstance) {
    this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
  }

    
  @JsonProperty("queue.threadPoolSize")
  public ConfigNodePropertyInteger getQueueThreadPoolSize() {
    return queueThreadPoolSize;
  }
  public void setQueueThreadPoolSize(ConfigNodePropertyInteger queueThreadPoolSize) {
    this.queueThreadPoolSize = queueThreadPoolSize;
  }

    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
