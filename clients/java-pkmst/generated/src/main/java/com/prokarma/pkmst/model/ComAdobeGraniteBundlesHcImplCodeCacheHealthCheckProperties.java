package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties   {
  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags = null;

  @JsonProperty("minimum.code.cache.size")
  private ConfigNodePropertyInteger minimumCodeCacheSize = null;

  public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
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

  public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties minimumCodeCacheSize(ConfigNodePropertyInteger minimumCodeCacheSize) {
    this.minimumCodeCacheSize = minimumCodeCacheSize;
    return this;
  }

   /**
   * Get minimumCodeCacheSize
   * @return minimumCodeCacheSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMinimumCodeCacheSize() {
    return minimumCodeCacheSize;
  }

  public void setMinimumCodeCacheSize(ConfigNodePropertyInteger minimumCodeCacheSize) {
    this.minimumCodeCacheSize = minimumCodeCacheSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

