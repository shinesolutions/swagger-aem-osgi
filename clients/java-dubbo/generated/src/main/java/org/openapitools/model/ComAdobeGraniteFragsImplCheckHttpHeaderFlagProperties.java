package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("feature.name")
  private ConfigNodePropertyString featureName;

  @JsonProperty("feature.description")
  private ConfigNodePropertyString featureDescription;

  @JsonProperty("http.header.name")
  private ConfigNodePropertyString httpHeaderName;

  @JsonProperty("http.header.valuepattern")
  private ConfigNodePropertyString httpHeaderValuepattern;

  /**
   * 
   * @return featureName
   */
  public ConfigNodePropertyString getFeatureName() {
    return featureName;
  }

  public void setFeatureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
  }

  /**
   * 
   * @return featureDescription
   */
  public ConfigNodePropertyString getFeatureDescription() {
    return featureDescription;
  }

  public void setFeatureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
  }

  /**
   * 
   * @return httpHeaderName
   */
  public ConfigNodePropertyString getHttpHeaderName() {
    return httpHeaderName;
  }

  public void setHttpHeaderName(ConfigNodePropertyString httpHeaderName) {
    this.httpHeaderName = httpHeaderName;
  }

  /**
   * 
   * @return httpHeaderValuepattern
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
