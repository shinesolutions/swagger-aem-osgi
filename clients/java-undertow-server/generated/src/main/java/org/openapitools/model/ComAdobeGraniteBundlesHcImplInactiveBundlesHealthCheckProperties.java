package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties   {
  
  private ConfigNodePropertyArray hcTags = null;
  private ConfigNodePropertyArray ignoredBundles = null;

  /**
   **/
  public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   **/
  public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties ignoredBundles(ConfigNodePropertyArray ignoredBundles) {
    this.ignoredBundles = ignoredBundles;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ignored.bundles")
  public ConfigNodePropertyArray getIgnoredBundles() {
    return ignoredBundles;
  }
  public void setIgnoredBundles(ConfigNodePropertyArray ignoredBundles) {
    this.ignoredBundles = ignoredBundles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties = (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties) o;
    return Objects.equals(hcTags, comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.hcTags) &&
        Objects.equals(ignoredBundles, comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.ignoredBundles);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

