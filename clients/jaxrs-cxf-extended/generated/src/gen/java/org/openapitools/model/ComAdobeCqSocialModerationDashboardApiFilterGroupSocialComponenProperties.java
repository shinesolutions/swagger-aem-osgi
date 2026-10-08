package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceTypeFilters;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger priority;
 /**
  * Get resourceTypeFilters
  * @return resourceTypeFilters
  */
  @JsonProperty("resourceType.filters")
  public ConfigNodePropertyArray getResourceTypeFilters() {
    return resourceTypeFilters;
  }

  /**
   * Sets the <code>resourceTypeFilters</code> property.
   */
 public void setResourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
  }

  /**
   * Sets the <code>resourceTypeFilters</code> property.
   */
  public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties resourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
    return this;
  }

 /**
  * Get priority
  * @return priority
  */
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  /**
   * Sets the <code>priority</code> property.
   */
 public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }

  /**
   * Sets the <code>priority</code> property.
   */
  public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

