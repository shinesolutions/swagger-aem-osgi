package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties   {
  @JsonProperty("hc.name")
  private ConfigNodePropertyString hcName;

  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags;

  @JsonProperty("hc.mbean.name")
  private ConfigNodePropertyString hcMbeanName;

  @JsonProperty("numberOfRetriesAllowed")
  private ConfigNodePropertyInteger numberOfRetriesAllowed;

  public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

  /**
   * Get hcName
   * @return hcName
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getNumberOfRetriesAllowed() {
    return numberOfRetriesAllowed;
  }

  public void setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

