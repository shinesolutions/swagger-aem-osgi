package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags;

  @JsonProperty("minimum.code.cache.size")
  private ConfigNodePropertyInteger minimumCodeCacheSize;

  /**
   * 
   * @return hcTags
   */
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   * 
   * @return minimumCodeCacheSize
   */
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
    return Objects.equals(this.hcTags, comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.hcTags) &&
        Objects.equals(this.minimumCodeCacheSize, comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.minimumCodeCacheSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, minimumCodeCacheSize);
  }

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
