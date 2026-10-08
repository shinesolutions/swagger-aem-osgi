package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingEventImplJobsDefaultJobManagerProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyDropDown queuePriority;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger queueRetries;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger queueRetrydelay;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger queueMaxparallel;
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

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queuePriority(ConfigNodePropertyDropDown queuePriority) {
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

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queueRetries(ConfigNodePropertyInteger queueRetries) {
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

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
    return this;
  }

 /**
   * Get queueMaxparallel
   * @return queueMaxparallel
  **/
  @JsonProperty("queue.maxparallel")
  public ConfigNodePropertyInteger getQueueMaxparallel() {
    return queueMaxparallel;
  }

  public void setQueueMaxparallel(ConfigNodePropertyInteger queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
  }

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queueMaxparallel(ConfigNodePropertyInteger queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
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
    OrgApacheSlingEventImplJobsDefaultJobManagerProperties orgApacheSlingEventImplJobsDefaultJobManagerProperties = (OrgApacheSlingEventImplJobsDefaultJobManagerProperties) o;
    return Objects.equals(this.queuePriority, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queuePriority) &&
        Objects.equals(this.queueRetries, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queueRetries) &&
        Objects.equals(this.queueRetrydelay, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queueRetrydelay) &&
        Objects.equals(this.queueMaxparallel, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queueMaxparallel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queuePriority, queueRetries, queueRetrydelay, queueMaxparallel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEventImplJobsDefaultJobManagerProperties {\n");
    
    sb.append("    queuePriority: ").append(toIndentedString(queuePriority)).append("\n");
    sb.append("    queueRetries: ").append(toIndentedString(queueRetries)).append("\n");
    sb.append("    queueRetrydelay: ").append(toIndentedString(queueRetrydelay)).append("\n");
    sb.append("    queueMaxparallel: ").append(toIndentedString(queueMaxparallel)).append("\n");
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

