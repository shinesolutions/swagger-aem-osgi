package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteFragsImplRandomFeatureProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString featureName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString featureDescription;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString activePercentage;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cookieName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cookieMaxAge;
 /**
  * Get featureName
  * @return featureName
  */
  @JsonProperty("feature.name")
  public ConfigNodePropertyString getFeatureName() {
    return featureName;
  }

  /**
   * Sets the <code>featureName</code> property.
   */
 public void setFeatureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
  }

  /**
   * Sets the <code>featureName</code> property.
   */
  public ComAdobeGraniteFragsImplRandomFeatureProperties featureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
    return this;
  }

 /**
  * Get featureDescription
  * @return featureDescription
  */
  @JsonProperty("feature.description")
  public ConfigNodePropertyString getFeatureDescription() {
    return featureDescription;
  }

  /**
   * Sets the <code>featureDescription</code> property.
   */
 public void setFeatureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
  }

  /**
   * Sets the <code>featureDescription</code> property.
   */
  public ComAdobeGraniteFragsImplRandomFeatureProperties featureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
    return this;
  }

 /**
  * Get activePercentage
  * @return activePercentage
  */
  @JsonProperty("active.percentage")
  public ConfigNodePropertyString getActivePercentage() {
    return activePercentage;
  }

  /**
   * Sets the <code>activePercentage</code> property.
   */
 public void setActivePercentage(ConfigNodePropertyString activePercentage) {
    this.activePercentage = activePercentage;
  }

  /**
   * Sets the <code>activePercentage</code> property.
   */
  public ComAdobeGraniteFragsImplRandomFeatureProperties activePercentage(ConfigNodePropertyString activePercentage) {
    this.activePercentage = activePercentage;
    return this;
  }

 /**
  * Get cookieName
  * @return cookieName
  */
  @JsonProperty("cookie.name")
  public ConfigNodePropertyString getCookieName() {
    return cookieName;
  }

  /**
   * Sets the <code>cookieName</code> property.
   */
 public void setCookieName(ConfigNodePropertyString cookieName) {
    this.cookieName = cookieName;
  }

  /**
   * Sets the <code>cookieName</code> property.
   */
  public ComAdobeGraniteFragsImplRandomFeatureProperties cookieName(ConfigNodePropertyString cookieName) {
    this.cookieName = cookieName;
    return this;
  }

 /**
  * Get cookieMaxAge
  * @return cookieMaxAge
  */
  @JsonProperty("cookie.maxAge")
  public ConfigNodePropertyInteger getCookieMaxAge() {
    return cookieMaxAge;
  }

  /**
   * Sets the <code>cookieMaxAge</code> property.
   */
 public void setCookieMaxAge(ConfigNodePropertyInteger cookieMaxAge) {
    this.cookieMaxAge = cookieMaxAge;
  }

  /**
   * Sets the <code>cookieMaxAge</code> property.
   */
  public ComAdobeGraniteFragsImplRandomFeatureProperties cookieMaxAge(ConfigNodePropertyInteger cookieMaxAge) {
    this.cookieMaxAge = cookieMaxAge;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

