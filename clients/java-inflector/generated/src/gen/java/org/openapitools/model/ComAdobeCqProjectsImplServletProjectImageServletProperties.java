package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeCqProjectsImplServletProjectImageServletProperties   {
  @JsonProperty("image.quality")
  private ConfigNodePropertyString imageQuality = null;

  @JsonProperty("image.supported.resolutions")
  private ConfigNodePropertyString imageSupportedResolutions = null;

  /**
   **/
  public ComAdobeCqProjectsImplServletProjectImageServletProperties imageQuality(ConfigNodePropertyString imageQuality) {
    this.imageQuality = imageQuality;
    return this;
  }

  
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
  public ComAdobeCqProjectsImplServletProjectImageServletProperties imageSupportedResolutions(ConfigNodePropertyString imageSupportedResolutions) {
    this.imageSupportedResolutions = imageSupportedResolutions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("image.supported.resolutions")
  public ConfigNodePropertyString getImageSupportedResolutions() {
    return imageSupportedResolutions;
  }
  public void setImageSupportedResolutions(ConfigNodePropertyString imageSupportedResolutions) {
    this.imageSupportedResolutions = imageSupportedResolutions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

