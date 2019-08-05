package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingEventImplJobsDefaultJobManagerProperties   {
  
  private ConfigNodePropertyDropDown queuePriority = null;
  private ConfigNodePropertyInteger queueRetries = null;
  private ConfigNodePropertyInteger queueRetrydelay = null;
  private ConfigNodePropertyInteger queueMaxparallel = null;

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties () {

  }

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties (ConfigNodePropertyDropDown queuePriority, ConfigNodePropertyInteger queueRetries, ConfigNodePropertyInteger queueRetrydelay, ConfigNodePropertyInteger queueMaxparallel) {
    this.queuePriority = queuePriority;
    this.queueRetries = queueRetries;
    this.queueRetrydelay = queueRetrydelay;
    this.queueMaxparallel = queueMaxparallel;
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
  public ConfigNodePropertyInteger getQueueMaxparallel() {
    return queueMaxparallel;
  }
  public void setQueueMaxparallel(ConfigNodePropertyInteger queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
