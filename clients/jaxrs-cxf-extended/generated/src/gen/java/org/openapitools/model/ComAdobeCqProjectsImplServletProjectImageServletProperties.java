package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqProjectsImplServletProjectImageServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString imageQuality;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString imageSupportedResolutions;
 /**
  * Get imageQuality
  * @return imageQuality
  */
  @JsonProperty("image.quality")
  public ConfigNodePropertyString getImageQuality() {
    return imageQuality;
  }

  /**
   * Sets the <code>imageQuality</code> property.
   */
 public void setImageQuality(ConfigNodePropertyString imageQuality) {
    this.imageQuality = imageQuality;
  }

  /**
   * Sets the <code>imageQuality</code> property.
   */
  public ComAdobeCqProjectsImplServletProjectImageServletProperties imageQuality(ConfigNodePropertyString imageQuality) {
    this.imageQuality = imageQuality;
    return this;
  }

 /**
  * Get imageSupportedResolutions
  * @return imageSupportedResolutions
  */
  @JsonProperty("image.supported.resolutions")
  public ConfigNodePropertyString getImageSupportedResolutions() {
    return imageSupportedResolutions;
  }

  /**
   * Sets the <code>imageSupportedResolutions</code> property.
   */
 public void setImageSupportedResolutions(ConfigNodePropertyString imageSupportedResolutions) {
    this.imageSupportedResolutions = imageSupportedResolutions;
  }

  /**
   * Sets the <code>imageSupportedResolutions</code> property.
   */
  public ComAdobeCqProjectsImplServletProjectImageServletProperties imageSupportedResolutions(ConfigNodePropertyString imageSupportedResolutions) {
    this.imageSupportedResolutions = imageSupportedResolutions;
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
    ComAdobeCqProjectsImplServletProjectImageServletProperties comAdobeCqProjectsImplServletProjectImageServletProperties = (ComAdobeCqProjectsImplServletProjectImageServletProperties) o;
    return Objects.equals(this.imageQuality, comAdobeCqProjectsImplServletProjectImageServletProperties.imageQuality) &&
        Objects.equals(this.imageSupportedResolutions, comAdobeCqProjectsImplServletProjectImageServletProperties.imageSupportedResolutions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageQuality, imageSupportedResolutions);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

