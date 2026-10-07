package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString hcName;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray hcTags;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString hcMbeanName;
 /**
   * Get hcName
   * @return hcName
  **/
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

 /**
   * Get hcTags
   * @return hcTags
  **/
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
   * Get hcMbeanName
   * @return hcMbeanName
  **/
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
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
    OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties = (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties) o;
    return Objects.equals(this.hcName, orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.hcName) &&
        Objects.equals(this.hcTags, orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.hcTags) &&
        Objects.equals(this.hcMbeanName, orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.hcMbeanName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties {\n");
    
    sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
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

