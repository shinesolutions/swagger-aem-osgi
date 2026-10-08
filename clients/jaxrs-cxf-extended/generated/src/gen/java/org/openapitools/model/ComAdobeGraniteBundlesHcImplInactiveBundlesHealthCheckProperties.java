package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray hcTags;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray ignoredBundles;
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
  public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
  * Get ignoredBundles
  * @return ignoredBundles
  */
  @JsonProperty("ignored.bundles")
  public ConfigNodePropertyArray getIgnoredBundles() {
    return ignoredBundles;
  }

  /**
   * Sets the <code>ignoredBundles</code> property.
   */
 public void setIgnoredBundles(ConfigNodePropertyArray ignoredBundles) {
    this.ignoredBundles = ignoredBundles;
  }

  /**
   * Sets the <code>ignoredBundles</code> property.
   */
  public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties ignoredBundles(ConfigNodePropertyArray ignoredBundles) {
    this.ignoredBundles = ignoredBundles;
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
    ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties = (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties) o;
    return Objects.equals(this.hcTags, comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.hcTags) &&
        Objects.equals(this.ignoredBundles, comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.ignoredBundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, ignoredBundles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties {\n");
    
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    ignoredBundles: ").append(toIndentedString(ignoredBundles)).append("\n");
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

