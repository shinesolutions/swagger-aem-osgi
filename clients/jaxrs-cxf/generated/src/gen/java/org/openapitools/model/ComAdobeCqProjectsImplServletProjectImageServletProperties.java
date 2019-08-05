package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqProjectsImplServletProjectImageServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString imageQuality = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString imageSupportedResolutions = null;
 /**
   * Get imageQuality
   * @return imageQuality
  **/
  @JsonProperty("image.quality")
  public ConfigNodePropertyString getImageQuality() {
    return imageQuality;
  }

  public void setImageQuality(ConfigNodePropertyString imageQuality) {
    this.imageQuality = imageQuality;
  }

  public ComAdobeCqProjectsImplServletProjectImageServletProperties imageQuality(ConfigNodePropertyString imageQuality) {
    this.imageQuality = imageQuality;
    return this;
  }

 /**
   * Get imageSupportedResolutions
   * @return imageSupportedResolutions
  **/
  @JsonProperty("image.supported.resolutions")
  public ConfigNodePropertyString getImageSupportedResolutions() {
    return imageSupportedResolutions;
  }

  public void setImageSupportedResolutions(ConfigNodePropertyString imageSupportedResolutions) {
    this.imageSupportedResolutions = imageSupportedResolutions;
  }

  public ComAdobeCqProjectsImplServletProjectImageServletProperties imageSupportedResolutions(ConfigNodePropertyString imageSupportedResolutions) {
    this.imageSupportedResolutions = imageSupportedResolutions;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqProjectsImplServletProjectImageServletProperties {\n");
    
    sb.append("    imageQuality: ").append(toIndentedString(imageQuality)).append("\n");
    sb.append("    imageSupportedResolutions: ").append(toIndentedString(imageSupportedResolutions)).append("\n");
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

