package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties   {
  @JsonProperty("cq.social.console.analytics.components")
  private ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents = null;

  public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties cqSocialConsoleAnalyticsComponents(ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents) {
    this.cqSocialConsoleAnalyticsComponents = cqSocialConsoleAnalyticsComponents;
    return this;
  }

   /**
   * Get cqSocialConsoleAnalyticsComponents
   * @return cqSocialConsoleAnalyticsComponents
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

