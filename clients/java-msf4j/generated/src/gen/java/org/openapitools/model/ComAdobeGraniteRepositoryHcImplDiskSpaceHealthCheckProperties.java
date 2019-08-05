package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties   {
  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags = null;

  @JsonProperty("disk.space.warn.threshold")
  private ConfigNodePropertyInteger diskSpaceWarnThreshold = null;

  @JsonProperty("disk.space.error.threshold")
  private ConfigNodePropertyInteger diskSpaceErrorThreshold = null;

  public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

   /**
   * Get hcTags
   * @return hcTags
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties diskSpaceWarnThreshold(ConfigNodePropertyInteger diskSpaceWarnThreshold) {
    this.diskSpaceWarnThreshold = diskSpaceWarnThreshold;
    return this;
  }

   /**
   * Get diskSpaceWarnThreshold
   * @return diskSpaceWarnThreshold
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getDiskSpaceWarnThreshold() {
    return diskSpaceWarnThreshold;
  }

  public void setDiskSpaceWarnThreshold(ConfigNodePropertyInteger diskSpaceWarnThreshold) {
    this.diskSpaceWarnThreshold = diskSpaceWarnThreshold;
  }

  public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties diskSpaceErrorThreshold(ConfigNodePropertyInteger diskSpaceErrorThreshold) {
    this.diskSpaceErrorThreshold = diskSpaceErrorThreshold;
    return this;
  }

   /**
   * Get diskSpaceErrorThreshold
   * @return diskSpaceErrorThreshold
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getDiskSpaceErrorThreshold() {
    return diskSpaceErrorThreshold;
  }

  public void setDiskSpaceErrorThreshold(ConfigNodePropertyInteger diskSpaceErrorThreshold) {
    this.diskSpaceErrorThreshold = diskSpaceErrorThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties = (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties) o;
    return Objects.equals(this.hcTags, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.hcTags) &&
        Objects.equals(this.diskSpaceWarnThreshold, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.diskSpaceWarnThreshold) &&
        Objects.equals(this.diskSpaceErrorThreshold, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.diskSpaceErrorThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, diskSpaceWarnThreshold, diskSpaceErrorThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {\n");
    
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    diskSpaceWarnThreshold: ").append(toIndentedString(diskSpaceWarnThreshold)).append("\n");
    sb.append("    diskSpaceErrorThreshold: ").append(toIndentedString(diskSpaceErrorThreshold)).append("\n");
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

