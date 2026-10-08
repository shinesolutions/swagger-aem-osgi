package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties   {
  
  private ConfigNodePropertyInteger priority;

  public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties () {

  }

  public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties (ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }

    
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }
  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties comAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties = (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties) o;
    return Objects.equals(priority, comAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
