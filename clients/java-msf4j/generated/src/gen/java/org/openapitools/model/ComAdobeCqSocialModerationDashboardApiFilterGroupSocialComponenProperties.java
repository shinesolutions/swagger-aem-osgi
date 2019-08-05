package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties   {
  @JsonProperty("resourceType.filters")
  private ConfigNodePropertyArray resourceTypeFilters = null;

  @JsonProperty("priority")
  private ConfigNodePropertyInteger priority = null;

  public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties resourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
    return this;
  }

   /**
   * Get resourceTypeFilters
   * @return resourceTypeFilters
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getResourceTypeFilters() {
    return resourceTypeFilters;
  }

  public void setResourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
  }

  public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties = (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties) o;
    return Objects.equals(this.resourceTypeFilters, comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.resourceTypeFilters) &&
        Objects.equals(this.priority, comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceTypeFilters, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties {\n");
    
    sb.append("    resourceTypeFilters: ").append(toIndentedString(resourceTypeFilters)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

