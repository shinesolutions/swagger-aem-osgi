package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqProjectsImplServletProjectImageServletProperties   {
  
  private ConfigNodePropertyString imageQuality = null;
  private ConfigNodePropertyString imageSupportedResolutions = null;

  public ComAdobeCqProjectsImplServletProjectImageServletProperties () {

  }

  public ComAdobeCqProjectsImplServletProjectImageServletProperties (ConfigNodePropertyString imageQuality, ConfigNodePropertyString imageSupportedResolutions) {
    this.imageQuality = imageQuality;
    this.imageSupportedResolutions = imageSupportedResolutions;
  }

    
  @JsonProperty("image.quality")
  public ConfigNodePropertyString getImageQuality() {
    return imageQuality;
  }
  public void setImageQuality(ConfigNodePropertyString imageQuality) {
    this.imageQuality = imageQuality;
  }

    
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
