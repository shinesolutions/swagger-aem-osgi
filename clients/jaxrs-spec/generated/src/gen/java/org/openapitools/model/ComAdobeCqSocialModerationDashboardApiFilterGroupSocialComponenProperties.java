package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties   {
  private ConfigNodePropertyArray resourceTypeFilters;
  private ConfigNodePropertyInteger priority;

  public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties resourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resourceType.filters")
  @Valid public ConfigNodePropertyArray getResourceTypeFilters() {
    return resourceTypeFilters;
  }

  @JsonProperty("resourceType.filters")
  public void setResourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
  }

  /**
   **/
  public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("priority")
  @Valid public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  @JsonProperty("priority")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
