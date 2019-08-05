package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties   {
  
  private ConfigNodePropertyArray componentsUsingTags = null;

  public ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties () {

  }

  public ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties (ConfigNodePropertyArray componentsUsingTags) {
    this.componentsUsingTags = componentsUsingTags;
  }

    
  @JsonProperty("componentsUsingTags")
  public ConfigNodePropertyArray getComponentsUsingTags() {
    return componentsUsingTags;
  }
  public void setComponentsUsingTags(ConfigNodePropertyArray componentsUsingTags) {
    this.componentsUsingTags = componentsUsingTags;
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
    return Objects.equals(componentsUsingTags, comAdobeCqSocialSiteImplSiteConfiguratorImplProperties.componentsUsingTags);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
