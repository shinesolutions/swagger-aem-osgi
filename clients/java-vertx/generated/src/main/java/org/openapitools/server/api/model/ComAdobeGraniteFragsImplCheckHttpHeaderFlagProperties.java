package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties   {
  
  private ConfigNodePropertyString featureName = null;
  private ConfigNodePropertyString featureDescription = null;
  private ConfigNodePropertyString httpHeaderName = null;
  private ConfigNodePropertyString httpHeaderValuepattern = null;

  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties () {

  }

  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties (ConfigNodePropertyString featureName, ConfigNodePropertyString featureDescription, ConfigNodePropertyString httpHeaderName, ConfigNodePropertyString httpHeaderValuepattern) {
    this.featureName = featureName;
    this.featureDescription = featureDescription;
    this.httpHeaderName = httpHeaderName;
    this.httpHeaderValuepattern = httpHeaderValuepattern;
  }

    
  @JsonProperty("feature.name")
  public ConfigNodePropertyString getFeatureName() {
    return featureName;
  }
  public void setFeatureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
  }

    
  @JsonProperty("feature.description")
  public ConfigNodePropertyString getFeatureDescription() {
    return featureDescription;
  }
  public void setFeatureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
  }

    
  @JsonProperty("http.header.name")
  public ConfigNodePropertyString getHttpHeaderName() {
    return httpHeaderName;
  }
  public void setHttpHeaderName(ConfigNodePropertyString httpHeaderName) {
    this.httpHeaderName = httpHeaderName;
  }

    
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
