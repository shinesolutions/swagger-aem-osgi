package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties   {
  
  private ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.social.console.analytics.components")
  public ConfigNodePropertyArray getCqSocialConsoleAnalyticsComponents() {
    return cqSocialConsoleAnalyticsComponents;
  }
  public void setCqSocialConsoleAnalyticsComponents(ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents) {
    this.cqSocialConsoleAnalyticsComponents = cqSocialConsoleAnalyticsComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

