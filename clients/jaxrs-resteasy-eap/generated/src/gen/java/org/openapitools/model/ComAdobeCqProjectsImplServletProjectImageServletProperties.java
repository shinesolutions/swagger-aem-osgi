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
public class ComAdobeCqProjectsImplServletProjectImageServletProperties   {
  

  private ConfigNodePropertyString imageQuality = null;

  private ConfigNodePropertyString imageSupportedResolutions = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image.quality")
  public ConfigNodePropertyString getImageQuality() {
    return imageQuality;
  }
  public void setImageQuality(ConfigNodePropertyString imageQuality) {
    this.imageQuality = imageQuality;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image.supported.resolutions")
  public ConfigNodePropertyString getImageSupportedResolutions() {
    return imageSupportedResolutions;
  }
  public void setImageSupportedResolutions(ConfigNodePropertyString imageSupportedResolutions) {
    this.imageSupportedResolutions = imageSupportedResolutions;
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
    return Objects.equals(imageQuality, comAdobeCqProjectsImplServletProjectImageServletProperties.imageQuality) &&
        Objects.equals(imageSupportedResolutions, comAdobeCqProjectsImplServletProjectImageServletProperties.imageSupportedResolutions);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

