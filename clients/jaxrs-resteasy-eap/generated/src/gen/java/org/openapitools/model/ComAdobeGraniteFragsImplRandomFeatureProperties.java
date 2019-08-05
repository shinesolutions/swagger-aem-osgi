package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteFragsImplRandomFeatureProperties   {
  

  private ConfigNodePropertyString featureName = null;

  private ConfigNodePropertyString featureDescription = null;

  private ConfigNodePropertyString activePercentage = null;

  private ConfigNodePropertyString cookieName = null;

  private ConfigNodePropertyInteger cookieMaxAge = null;

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
  @JsonProperty("active.percentage")
  public ConfigNodePropertyString getActivePercentage() {
    return activePercentage;
  }
  public void setActivePercentage(ConfigNodePropertyString activePercentage) {
    this.activePercentage = activePercentage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cookie.name")
  public ConfigNodePropertyString getCookieName() {
    return cookieName;
  }
  public void setCookieName(ConfigNodePropertyString cookieName) {
    this.cookieName = cookieName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cookie.maxAge")
  public ConfigNodePropertyInteger getCookieMaxAge() {
    return cookieMaxAge;
  }
  public void setCookieMaxAge(ConfigNodePropertyInteger cookieMaxAge) {
    this.cookieMaxAge = cookieMaxAge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteFragsImplRandomFeatureProperties comAdobeGraniteFragsImplRandomFeatureProperties = (ComAdobeGraniteFragsImplRandomFeatureProperties) o;
    return Objects.equals(featureName, comAdobeGraniteFragsImplRandomFeatureProperties.featureName) &&
        Objects.equals(featureDescription, comAdobeGraniteFragsImplRandomFeatureProperties.featureDescription) &&
        Objects.equals(activePercentage, comAdobeGraniteFragsImplRandomFeatureProperties.activePercentage) &&
        Objects.equals(cookieName, comAdobeGraniteFragsImplRandomFeatureProperties.cookieName) &&
        Objects.equals(cookieMaxAge, comAdobeGraniteFragsImplRandomFeatureProperties.cookieMaxAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, featureDescription, activePercentage, cookieName, cookieMaxAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteFragsImplRandomFeatureProperties {\n");
    
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    featureDescription: ").append(toIndentedString(featureDescription)).append("\n");
    sb.append("    activePercentage: ").append(toIndentedString(activePercentage)).append("\n");
    sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
    sb.append("    cookieMaxAge: ").append(toIndentedString(cookieMaxAge)).append("\n");
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

