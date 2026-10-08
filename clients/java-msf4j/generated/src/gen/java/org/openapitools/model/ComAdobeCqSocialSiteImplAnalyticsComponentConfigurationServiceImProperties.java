package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties   {
  @JsonProperty("cq.social.console.analytics.components")
  private ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents;

  public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties cqSocialConsoleAnalyticsComponents(ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents) {
    this.cqSocialConsoleAnalyticsComponents = cqSocialConsoleAnalyticsComponents;
    return this;
  }

   /**
   * Get cqSocialConsoleAnalyticsComponents
   * @return cqSocialConsoleAnalyticsComponents
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.cqSocialConsoleAnalyticsComponents, comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.cqSocialConsoleAnalyticsComponents);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

