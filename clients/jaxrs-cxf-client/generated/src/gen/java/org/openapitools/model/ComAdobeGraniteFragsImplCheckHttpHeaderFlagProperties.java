package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString featureName;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString featureDescription;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString httpHeaderName;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString httpHeaderValuepattern;
 /**
   * Get featureName
   * @return featureName
  **/
  @JsonProperty("feature.name")
  public ConfigNodePropertyString getFeatureName() {
    return featureName;
  }

  public void setFeatureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
  }

  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties featureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
    return this;
  }

 /**
   * Get featureDescription
   * @return featureDescription
  **/
  @JsonProperty("feature.description")
  public ConfigNodePropertyString getFeatureDescription() {
    return featureDescription;
  }

  public void setFeatureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
  }

  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties featureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
    return this;
  }

 /**
   * Get httpHeaderName
   * @return httpHeaderName
  **/
  @JsonProperty("http.header.name")
  public ConfigNodePropertyString getHttpHeaderName() {
    return httpHeaderName;
  }

  public void setHttpHeaderName(ConfigNodePropertyString httpHeaderName) {
    this.httpHeaderName = httpHeaderName;
  }

  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties httpHeaderName(ConfigNodePropertyString httpHeaderName) {
    this.httpHeaderName = httpHeaderName;
    return this;
  }

 /**
   * Get httpHeaderValuepattern
   * @return httpHeaderValuepattern
  **/
  @JsonProperty("http.header.valuepattern")
  public ConfigNodePropertyString getHttpHeaderValuepattern() {
    return httpHeaderValuepattern;
  }

  public void setHttpHeaderValuepattern(ConfigNodePropertyString httpHeaderValuepattern) {
    this.httpHeaderValuepattern = httpHeaderValuepattern;
  }

  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties httpHeaderValuepattern(ConfigNodePropertyString httpHeaderValuepattern) {
    this.httpHeaderValuepattern = httpHeaderValuepattern;
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
    ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties = (ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties) o;
    return Objects.equals(this.featureName, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.featureName) &&
        Objects.equals(this.featureDescription, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.featureDescription) &&
        Objects.equals(this.httpHeaderName, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.httpHeaderName) &&
        Objects.equals(this.httpHeaderValuepattern, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.httpHeaderValuepattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, featureDescription, httpHeaderName, httpHeaderValuepattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {\n");
    
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    featureDescription: ").append(toIndentedString(featureDescription)).append("\n");
    sb.append("    httpHeaderName: ").append(toIndentedString(httpHeaderName)).append("\n");
    sb.append("    httpHeaderValuepattern: ").append(toIndentedString(httpHeaderValuepattern)).append("\n");
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

