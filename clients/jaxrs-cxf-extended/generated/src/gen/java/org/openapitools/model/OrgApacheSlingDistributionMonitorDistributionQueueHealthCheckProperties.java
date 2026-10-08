package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString hcName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray hcTags;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString hcMbeanName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger numberOfRetriesAllowed;
 /**
  * Get hcName
  * @return hcName
  */
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  /**
   * Sets the <code>hcName</code> property.
   */
 public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  /**
   * Sets the <code>hcName</code> property.
   */
  public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

 /**
  * Get hcTags
  * @return hcTags
  */
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  /**
   * Sets the <code>hcTags</code> property.
   */
 public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   * Sets the <code>hcTags</code> property.
   */
  public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
  * Get hcMbeanName
  * @return hcMbeanName
  */
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  /**
   * Sets the <code>hcMbeanName</code> property.
   */
 public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  /**
   * Sets the <code>hcMbeanName</code> property.
   */
  public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

 /**
  * Get numberOfRetriesAllowed
  * @return numberOfRetriesAllowed
  */
  @JsonProperty("numberOfRetriesAllowed")
  public ConfigNodePropertyInteger getNumberOfRetriesAllowed() {
    return numberOfRetriesAllowed;
  }

  /**
   * Sets the <code>numberOfRetriesAllowed</code> property.
   */
 public void setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
  }

  /**
   * Sets the <code>numberOfRetriesAllowed</code> property.
   */
  public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties numberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
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
    OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties = (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties) o;
    return Objects.equals(this.hcName, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcName) &&
        Objects.equals(this.hcTags, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcTags) &&
        Objects.equals(this.hcMbeanName, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcMbeanName) &&
        Objects.equals(this.numberOfRetriesAllowed, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.numberOfRetriesAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName, numberOfRetriesAllowed);
  }

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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

