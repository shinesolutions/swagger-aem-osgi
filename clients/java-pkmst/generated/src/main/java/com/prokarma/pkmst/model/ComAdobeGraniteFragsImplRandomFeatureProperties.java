package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteFragsImplRandomFeatureProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteFragsImplRandomFeatureProperties   {
  @JsonProperty("feature.name")
  private ConfigNodePropertyString featureName = null;

  @JsonProperty("feature.description")
  private ConfigNodePropertyString featureDescription = null;

  @JsonProperty("active.percentage")
  private ConfigNodePropertyString activePercentage = null;

  @JsonProperty("cookie.name")
  private ConfigNodePropertyString cookieName = null;

  @JsonProperty("cookie.maxAge")
  private ConfigNodePropertyInteger cookieMaxAge = null;

  public ComAdobeGraniteFragsImplRandomFeatureProperties featureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
    return this;
  }

   /**
   * Get featureName
   * @return featureName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFeatureName() {
    return featureName;
  }

  public void setFeatureName(ConfigNodePropertyString featureName) {
    this.featureName = featureName;
  }

  public ComAdobeGraniteFragsImplRandomFeatureProperties featureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
    return this;
  }

   /**
   * Get featureDescription
   * @return featureDescription
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFeatureDescription() {
    return featureDescription;
  }

  public void setFeatureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
  }

  public ComAdobeGraniteFragsImplRandomFeatureProperties activePercentage(ConfigNodePropertyString activePercentage) {
    this.activePercentage = activePercentage;
    return this;
  }

   /**
   * Get activePercentage
   * @return activePercentage
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getActivePercentage() {
    return activePercentage;
  }

  public void setActivePercentage(ConfigNodePropertyString activePercentage) {
    this.activePercentage = activePercentage;
  }

  public ComAdobeGraniteFragsImplRandomFeatureProperties cookieName(ConfigNodePropertyString cookieName) {
    this.cookieName = cookieName;
    return this;
  }

   /**
   * Get cookieName
   * @return cookieName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCookieName() {
    return cookieName;
  }

  public void setCookieName(ConfigNodePropertyString cookieName) {
    this.cookieName = cookieName;
  }

  public ComAdobeGraniteFragsImplRandomFeatureProperties cookieMaxAge(ConfigNodePropertyInteger cookieMaxAge) {
    this.cookieMaxAge = cookieMaxAge;
    return this;
  }

   /**
   * Get cookieMaxAge
   * @return cookieMaxAge
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCookieMaxAge() {
    return cookieMaxAge;
  }

  public void setCookieMaxAge(ConfigNodePropertyInteger cookieMaxAge) {
    this.cookieMaxAge = cookieMaxAge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

