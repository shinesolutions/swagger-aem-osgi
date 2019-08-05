package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
    return Objects.equals(hcTags, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.hcTags) &&
        Objects.equals(diskSpaceWarnThreshold, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.diskSpaceWarnThreshold) &&
        Objects.equals(diskSpaceErrorThreshold, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.diskSpaceErrorThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, diskSpaceWarnThreshold, diskSpaceErrorThreshold);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

