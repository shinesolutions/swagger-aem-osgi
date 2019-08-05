package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties   {
  
  private @Valid ConfigNodePropertyString featureName = null;
  private @Valid ConfigNodePropertyString featureDescription = null;
  private @Valid ConfigNodePropertyString httpHeaderName = null;
  private @Valid ConfigNodePropertyString httpHeaderValuepattern = null;

  /**
   **/
  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties featureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("feature.name")
  public ConfigNodePropertyString getFeatureName() {
    return featureName;
  }
  public void setFeatureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
  }

  /**
   **/
  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties featureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("feature.description")
  public ConfigNodePropertyString getFeatureDescription() {
    return featureDescription;
  }
  public void setFeatureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
  }

  /**
   **/
  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties httpHeaderName(ConfigNodePropertyString httpHeaderName) {
    this.httpHeaderName = httpHeaderName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http.header.name")
  public ConfigNodePropertyString getHttpHeaderName() {
    return httpHeaderName;
  }
  public void setHttpHeaderName(ConfigNodePropertyString httpHeaderName) {
    this.httpHeaderName = httpHeaderName;
  }

  /**
   **/
  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties httpHeaderValuepattern(ConfigNodePropertyString httpHeaderValuepattern) {
    this.httpHeaderValuepattern = httpHeaderValuepattern;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http.header.valuepattern")
  public ConfigNodePropertyString getHttpHeaderValuepattern() {
    return httpHeaderValuepattern;
  }
  public void setHttpHeaderValuepattern(ConfigNodePropertyString httpHeaderValuepattern) {
    this.httpHeaderValuepattern = httpHeaderValuepattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties = (ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties) o;
    return Objects.equals(featureName, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.featureName) &&
        Objects.equals(featureDescription, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.featureDescription) &&
        Objects.equals(httpHeaderName, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.httpHeaderName) &&
        Objects.equals(httpHeaderValuepattern, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.httpHeaderValuepattern);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

