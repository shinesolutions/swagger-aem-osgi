package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingEventImplJobsDefaultJobManagerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingEventImplJobsDefaultJobManagerProperties   {
  @JsonProperty("queue.priority")
  private ConfigNodePropertyDropDown queuePriority = null;

  @JsonProperty("queue.retries")
  private ConfigNodePropertyInteger queueRetries = null;

  @JsonProperty("queue.retrydelay")
  private ConfigNodePropertyInteger queueRetrydelay = null;

  @JsonProperty("queue.maxparallel")
  private ConfigNodePropertyInteger queueMaxparallel = null;

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queuePriority(ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
    return this;
  }

   /**
   * Get queuePriority
   * @return queuePriority
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getQueuePriority() {
    return queuePriority;
  }

  public void setQueuePriority(ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
  }

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queueRetries(ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
    return this;
  }

   /**
   * Get queueRetries
   * @return queueRetries
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getQueueRetries() {
    return queueRetries;
  }

  public void setQueueRetries(ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
  }

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
    return this;
  }

   /**
   * Get queueRetrydelay
   * @return queueRetrydelay
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getQueueRetrydelay() {
    return queueRetrydelay;
  }

  public void setQueueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
  }

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queueMaxparallel(ConfigNodePropertyInteger queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
    return this;
  }

   /**
   * Get queueMaxparallel
   * @return queueMaxparallel
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getQueueMaxparallel() {
    return queueMaxparallel;
  }

  public void setQueueMaxparallel(ConfigNodePropertyInteger queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

