package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingEventImplJobsDefaultJobManagerProperties   {
  
  private ConfigNodePropertyDropDown queuePriority = null;
  private ConfigNodePropertyInteger queueRetries = null;
  private ConfigNodePropertyInteger queueRetrydelay = null;
  private ConfigNodePropertyInteger queueMaxparallel = null;

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
    return Objects.equals(queuePriority, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queuePriority) &&
        Objects.equals(queueRetries, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queueRetries) &&
        Objects.equals(queueRetrydelay, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queueRetrydelay) &&
        Objects.equals(queueMaxparallel, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queueMaxparallel);
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

