package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties   {
  @JsonProperty("hc.tags")
  @Valid

  private ConfigNodePropertyArray hcTags;

  @JsonProperty("minimum.code.cache.size")
  @Valid

  private ConfigNodePropertyInteger minimumCodeCacheSize;

  public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

   /**
   * Get hcTags
   * @return hcTags
  **/
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties minimumCodeCacheSize(ConfigNodePropertyInteger minimumCodeCacheSize) {
    this.minimumCodeCacheSize = minimumCodeCacheSize;
    return this;
  }

   /**
   * Get minimumCodeCacheSize
   * @return minimumCodeCacheSize
  **/
  public ConfigNodePropertyInteger getMinimumCodeCacheSize() {
    return minimumCodeCacheSize;
  }

  public void setMinimumCodeCacheSize(ConfigNodePropertyInteger minimumCodeCacheSize) {
    this.minimumCodeCacheSize = minimumCodeCacheSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties = (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties) o;
    return Objects.equals(hcTags, comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.hcTags) &&
        Objects.equals(minimumCodeCacheSize, comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.minimumCodeCacheSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, minimumCodeCacheSize);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties {\n");
    
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    minimumCodeCacheSize: ").append(toIndentedString(minimumCodeCacheSize)).append("\n");
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

