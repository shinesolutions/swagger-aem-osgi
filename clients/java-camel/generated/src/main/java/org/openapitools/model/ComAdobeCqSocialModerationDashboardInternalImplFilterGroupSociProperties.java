package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties
 */

@JsonTypeName("comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties {

  private ConfigNodePropertyArray resourceTypeFilters;

  private ConfigNodePropertyInteger priority;

  public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties resourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
    return this;
  }

  /**
   * Get resourceTypeFilters
   * @return resourceTypeFilters
   */
  @Valid 
  @Schema(name = "resourceType.filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceType.filters")
  public ConfigNodePropertyArray getResourceTypeFilters() {
    return resourceTypeFilters;
  }

  public void setResourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
  }

  public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @Valid 
  @Schema(name = "priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.resourceTypeFilters, comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.resourceTypeFilters) &&
        Objects.equals(this.priority, comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.priority);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

