package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties   {
  
  private ConfigNodePropertyArray resourceTypeFilters = null;
  private ConfigNodePropertyInteger priority = null;

  public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties () {

  }

  public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties (ConfigNodePropertyArray resourceTypeFilters, ConfigNodePropertyInteger priority) {
    this.resourceTypeFilters = resourceTypeFilters;
    this.priority = priority;
  }

    
  @JsonProperty("resourceType.filters")
  public ConfigNodePropertyArray getResourceTypeFilters() {
    return resourceTypeFilters;
  }
  public void setResourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
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
    ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties = (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties) o;
    return Objects.equals(resourceTypeFilters, comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.resourceTypeFilters) &&
        Objects.equals(priority, comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceTypeFilters, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties {\n");
    
    sb.append("    resourceTypeFilters: ").append(toIndentedString(resourceTypeFilters)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
