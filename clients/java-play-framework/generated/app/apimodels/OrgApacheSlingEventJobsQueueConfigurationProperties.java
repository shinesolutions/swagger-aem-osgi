package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyFloat;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingEventJobsQueueConfigurationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingEventJobsQueueConfigurationProperties   {
  @JsonProperty("queue.name")
  private ConfigNodePropertyString queueName = null;

  @JsonProperty("queue.topics")
  private ConfigNodePropertyArray queueTopics = null;

  @JsonProperty("queue.type")
  private ConfigNodePropertyDropDown queueType = null;

  @JsonProperty("queue.priority")
  private ConfigNodePropertyDropDown queuePriority = null;

  @JsonProperty("queue.retries")
  private ConfigNodePropertyInteger queueRetries = null;

  @JsonProperty("queue.retrydelay")
  private ConfigNodePropertyInteger queueRetrydelay = null;

  @JsonProperty("queue.maxparallel")
  private ConfigNodePropertyFloat queueMaxparallel = null;

  @JsonProperty("queue.keepJobs")
  private ConfigNodePropertyBoolean queueKeepJobs = null;

  @JsonProperty("queue.preferRunOnCreationInstance")
  private ConfigNodePropertyBoolean queuePreferRunOnCreationInstance = null;

  @JsonProperty("queue.threadPoolSize")
  private ConfigNodePropertyInteger queueThreadPoolSize = null;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  public OrgApacheSlingEventJobsQueueConfigurationProperties queueName(ConfigNodePropertyString queueName) {
    this.queueName = queueName;
    return this;
  }

   /**
   * Get queueName
   * @return queueName
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

