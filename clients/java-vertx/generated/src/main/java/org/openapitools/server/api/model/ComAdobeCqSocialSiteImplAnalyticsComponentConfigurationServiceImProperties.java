package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties   {
  
  private ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents = null;

  public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties () {

  }

  public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties (ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents) {
    this.cqSocialConsoleAnalyticsComponents = cqSocialConsoleAnalyticsComponents;
  }

    
  @JsonProperty("cq.social.console.analytics.components")
  public ConfigNodePropertyArray getCqSocialConsoleAnalyticsComponents() {
    return cqSocialConsoleAnalyticsComponents;
  }
  public void setCqSocialConsoleAnalyticsComponents(ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents) {
    this.cqSocialConsoleAnalyticsComponents = cqSocialConsoleAnalyticsComponents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties = (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties) o;
    return Objects.equals(cqSocialConsoleAnalyticsComponents, comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.cqSocialConsoleAnalyticsComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqSocialConsoleAnalyticsComponents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties {\n");
    
    sb.append("    cqSocialConsoleAnalyticsComponents: ").append(toIndentedString(cqSocialConsoleAnalyticsComponents)).append("\n");
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
