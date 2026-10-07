package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties   {
  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags;

  @JsonProperty("ignored.bundles")
  private ConfigNodePropertyArray ignoredBundles;

  public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
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

  public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties ignoredBundles(ConfigNodePropertyArray ignoredBundles) {
    this.ignoredBundles = ignoredBundles;
    return this;
  }

  /**
   * Get ignoredBundles
   * @return ignoredBundles
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getIgnoredBundles() {
    return ignoredBundles;
  }

  public void setIgnoredBundles(ConfigNodePropertyArray ignoredBundles) {
    this.ignoredBundles = ignoredBundles;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

