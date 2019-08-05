package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties   {
  

  private ConfigNodePropertyString featureName = null;

  private ConfigNodePropertyString featureDescription = null;

  private ConfigNodePropertyString httpHeaderName = null;

  private ConfigNodePropertyString httpHeaderValuepattern = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("http.header.valuepattern")
  public ConfigNodePropertyString getHttpHeaderValuepattern() {
    return httpHeaderValuepattern;
  }
  public void setHttpHeaderValuepattern(ConfigNodePropertyString httpHeaderValuepattern) {
    this.httpHeaderValuepattern = httpHeaderValuepattern;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

