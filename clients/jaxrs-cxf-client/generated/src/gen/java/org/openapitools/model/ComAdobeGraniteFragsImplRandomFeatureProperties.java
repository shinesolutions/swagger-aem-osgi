package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteFragsImplRandomFeatureProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString featureName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString featureDescription = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString activePercentage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString cookieName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cookieMaxAge = null;
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

  public ComAdobeGraniteFragsImplRandomFeatureProperties featureName(ConfigNodePropertyString featureName) {
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

  public ComAdobeGraniteFragsImplRandomFeatureProperties featureDescription(ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
    return this;
  }

 /**
   * Get activePercentage
   * @return activePercentage
  **/
  @JsonProperty("active.percentage")
  public ConfigNodePropertyString getActivePercentage() {
    return activePercentage;
  }

  public void setActivePercentage(ConfigNodePropertyString activePercentage) {
    this.activePercentage = activePercentage;
  }

  public ComAdobeGraniteFragsImplRandomFeatureProperties activePercentage(ConfigNodePropertyString activePercentage) {
    this.activePercentage = activePercentage;
    return this;
  }

 /**
   * Get cookieName
   * @return cookieName
  **/
  @JsonProperty("cookie.name")
  public ConfigNodePropertyString getCookieName() {
    return cookieName;
  }

  public void setCookieName(ConfigNodePropertyString cookieName) {
    this.cookieName = cookieName;
  }

  public ComAdobeGraniteFragsImplRandomFeatureProperties cookieName(ConfigNodePropertyString cookieName) {
    this.cookieName = cookieName;
    return this;
  }

 /**
   * Get cookieMaxAge
   * @return cookieMaxAge
  **/
  @JsonProperty("cookie.maxAge")
  public ConfigNodePropertyInteger getCookieMaxAge() {
    return cookieMaxAge;
  }

  public void setCookieMaxAge(ConfigNodePropertyInteger cookieMaxAge) {
    this.cookieMaxAge = cookieMaxAge;
  }

  public ComAdobeGraniteFragsImplRandomFeatureProperties cookieMaxAge(ConfigNodePropertyInteger cookieMaxAge) {
    this.cookieMaxAge = cookieMaxAge;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

