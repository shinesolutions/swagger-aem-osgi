package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeGraniteFragsImplRandomFeatureProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteFragsImplRandomFeatureProperties   {
  private ConfigNodePropertyString featureName;
  private ConfigNodePropertyString featureDescription;
  private ConfigNodePropertyString activePercentage;
  private ConfigNodePropertyString cookieName;
  private ConfigNodePropertyInteger cookieMaxAge;

  public ComAdobeGraniteFragsImplRandomFeatureProperties() {
  }

  /**
   **/
  public ComAdobeGraniteFragsImplRandomFeatureProperties featureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("feature.name")
  @Valid public ConfigNodePropertyString getFeatureName() {
    return featureName;
  }

  @JsonProperty("feature.name")
  public void setFeatureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
  }

  /**
   **/
  public ComAdobeGraniteFragsImplRandomFeatureProperties featureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("feature.description")
  @Valid public ConfigNodePropertyString getFeatureDescription() {
    return featureDescription;
  }

  @JsonProperty("feature.description")
  public void setFeatureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
  }

  /**
   **/
  public ComAdobeGraniteFragsImplRandomFeatureProperties activePercentage(ConfigNodePropertyString activePercentage) {
    this.activePercentage = activePercentage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("active.percentage")
  @Valid public ConfigNodePropertyString getActivePercentage() {
    return activePercentage;
  }

  @JsonProperty("active.percentage")
  public void setActivePercentage(ConfigNodePropertyString activePercentage) {
    this.activePercentage = activePercentage;
  }

  /**
   **/
  public ComAdobeGraniteFragsImplRandomFeatureProperties cookieName(ConfigNodePropertyString cookieName) {
    this.cookieName = cookieName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cookie.name")
  @Valid public ConfigNodePropertyString getCookieName() {
    return cookieName;
  }

  @JsonProperty("cookie.name")
  public void setCookieName(ConfigNodePropertyString cookieName) {
    this.cookieName = cookieName;
  }

  /**
   **/
  public ComAdobeGraniteFragsImplRandomFeatureProperties cookieMaxAge(ConfigNodePropertyInteger cookieMaxAge) {
    this.cookieMaxAge = cookieMaxAge;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cookie.maxAge")
  @Valid public ConfigNodePropertyInteger getCookieMaxAge() {
    return cookieMaxAge;
  }

  @JsonProperty("cookie.maxAge")
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
    return Objects.equals(this.featureName, comAdobeGraniteFragsImplRandomFeatureProperties.featureName) &&
        Objects.equals(this.featureDescription, comAdobeGraniteFragsImplRandomFeatureProperties.featureDescription) &&
        Objects.equals(this.activePercentage, comAdobeGraniteFragsImplRandomFeatureProperties.activePercentage) &&
        Objects.equals(this.cookieName, comAdobeGraniteFragsImplRandomFeatureProperties.cookieName) &&
        Objects.equals(this.cookieMaxAge, comAdobeGraniteFragsImplRandomFeatureProperties.cookieMaxAge);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
