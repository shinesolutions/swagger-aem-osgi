package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties   {
  @JsonProperty("resourceType.filters")
  @Valid

  private ConfigNodePropertyArray resourceTypeFilters;

  @JsonProperty("priority")
  @Valid

  private ConfigNodePropertyInteger priority;

  public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties resourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
    return this;
  }

   /**
   * Get resourceTypeFilters
   * @return resourceTypeFilters
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

