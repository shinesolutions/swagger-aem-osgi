package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties   {
  @JsonProperty("hc.name")
  private ConfigNodePropertyString hcName = null;

  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags = null;

  @JsonProperty("hc.mbean.name")
  private ConfigNodePropertyString hcMbeanName = null;

  @JsonProperty("numberOfRetriesAllowed")
  private ConfigNodePropertyInteger numberOfRetriesAllowed = null;

  public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

   /**
   * Get hcName
   * @return hcName
  **/
  @Valid
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

   /**
   * Get hcTags
   * @return hcTags
  **/
  @Valid
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

   /**
   * Get hcMbeanName
   * @return hcMbeanName
  **/
  @Valid
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties numberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
    return this;
  }

   /**
   * Get numberOfRetriesAllowed
   * @return numberOfRetriesAllowed
  **/
  @Valid
  public ConfigNodePropertyInteger getNumberOfRetriesAllowed() {
    return numberOfRetriesAllowed;
  }

  public void setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties = (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties) o;
    return Objects.equals(hcName, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcName) &&
        Objects.equals(hcTags, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcTags) &&
        Objects.equals(hcMbeanName, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcMbeanName) &&
        Objects.equals(numberOfRetriesAllowed, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.numberOfRetriesAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName, numberOfRetriesAllowed);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties {\n");
    
    sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
    sb.append("    numberOfRetriesAllowed: ").append(toIndentedString(numberOfRetriesAllowed)).append("\n");
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

