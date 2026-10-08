package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray componentsUsingTags;
 /**
   * Get componentsUsingTags
   * @return componentsUsingTags
  **/
  @JsonProperty("componentsUsingTags")
  public ConfigNodePropertyArray getComponentsUsingTags() {
    return componentsUsingTags;
  }

  public void setComponentsUsingTags(ConfigNodePropertyArray componentsUsingTags) {
    this.componentsUsingTags = componentsUsingTags;
  }

  public ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties componentsUsingTags(ConfigNodePropertyArray componentsUsingTags) {
    this.componentsUsingTags = componentsUsingTags;
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
    ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties comAdobeCqSocialSiteImplSiteConfiguratorImplProperties = (ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties) o;
    return Objects.equals(this.componentsUsingTags, comAdobeCqSocialSiteImplSiteConfiguratorImplProperties.componentsUsingTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentsUsingTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {\n");
    
    sb.append("    componentsUsingTags: ").append(toIndentedString(componentsUsingTags)).append("\n");
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

