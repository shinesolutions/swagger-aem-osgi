package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties   {
  
  private ConfigNodePropertyArray hcTags = null;
  private ConfigNodePropertyInteger diskSpaceWarnThreshold = null;
  private ConfigNodePropertyInteger diskSpaceErrorThreshold = null;

  public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties () {

  }

  public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties (ConfigNodePropertyArray hcTags, ConfigNodePropertyInteger diskSpaceWarnThreshold, ConfigNodePropertyInteger diskSpaceErrorThreshold) {
    this.hcTags = hcTags;
    this.diskSpaceWarnThreshold = diskSpaceWarnThreshold;
    this.diskSpaceErrorThreshold = diskSpaceErrorThreshold;
  }

    
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

    
  @JsonProperty("disk.space.warn.threshold")
  public ConfigNodePropertyInteger getDiskSpaceWarnThreshold() {
    return diskSpaceWarnThreshold;
  }
  public void setDiskSpaceWarnThreshold(ConfigNodePropertyInteger diskSpaceWarnThreshold) {
    this.diskSpaceWarnThreshold = diskSpaceWarnThreshold;
  }

    
  @JsonProperty("disk.space.error.threshold")
  public ConfigNodePropertyInteger getDiskSpaceErrorThreshold() {
    return diskSpaceErrorThreshold;
  }
  public void setDiskSpaceErrorThreshold(ConfigNodePropertyInteger diskSpaceErrorThreshold) {
    this.diskSpaceErrorThreshold = diskSpaceErrorThreshold;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties = (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties) o;
    return Objects.equals(hcTags, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.hcTags) &&
        Objects.equals(diskSpaceWarnThreshold, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.diskSpaceWarnThreshold) &&
        Objects.equals(diskSpaceErrorThreshold, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.diskSpaceErrorThreshold);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
