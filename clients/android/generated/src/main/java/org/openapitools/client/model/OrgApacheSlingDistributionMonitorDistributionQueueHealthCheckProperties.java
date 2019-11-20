/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyArray;
import org.openapitools.client.model.ConfigNodePropertyInteger;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties {
  
  @SerializedName("hc.name")
  private ConfigNodePropertyString hcName = null;
  @SerializedName("hc.tags")
  private ConfigNodePropertyArray hcTags = null;
  @SerializedName("hc.mbean.name")
  private ConfigNodePropertyString hcMbeanName = null;
  @SerializedName("numberOfRetriesAllowed")
  private ConfigNodePropertyInteger numberOfRetriesAllowed = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }
  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }
  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  /**
   **/
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
    return (this.hcName == null ? orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcName == null : this.hcName.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcName)) &&
        (this.hcTags == null ? orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcTags == null : this.hcTags.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcTags)) &&
        (this.hcMbeanName == null ? orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcMbeanName == null : this.hcMbeanName.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.hcMbeanName)) &&
        (this.numberOfRetriesAllowed == null ? orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.numberOfRetriesAllowed == null : this.numberOfRetriesAllowed.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.numberOfRetriesAllowed));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.hcName == null ? 0: this.hcName.hashCode());
    result = 31 * result + (this.hcTags == null ? 0: this.hcTags.hashCode());
    result = 31 * result + (this.hcMbeanName == null ? 0: this.hcMbeanName.hashCode());
    result = 31 * result + (this.numberOfRetriesAllowed == null ? 0: this.numberOfRetriesAllowed.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties {\n");
    
    sb.append("  hcName: ").append(hcName).append("\n");
    sb.append("  hcTags: ").append(hcTags).append("\n");
    sb.append("  hcMbeanName: ").append(hcMbeanName).append("\n");
    sb.append("  numberOfRetriesAllowed: ").append(numberOfRetriesAllowed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}