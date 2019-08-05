package apimodels;

import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingEventImplJobsDefaultJobManagerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

