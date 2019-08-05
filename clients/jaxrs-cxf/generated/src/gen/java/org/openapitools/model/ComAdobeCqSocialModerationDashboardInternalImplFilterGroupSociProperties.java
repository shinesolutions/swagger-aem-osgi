package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceTypeFilters = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger priority = null;
 /**
   * Get resourceTypeFilters
   * @return resourceTypeFilters
  **/
  @JsonProperty("resourceType.filters")
  public ConfigNodePropertyArray getResourceTypeFilters() {
    return resourceTypeFilters;
  }

  public void setResourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
  }

  public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties resourceTypeFilters(ConfigNodePropertyArray resourceTypeFilters) {
    this.resourceTypeFilters = resourceTypeFilters;
    return this;
  }

 /**
   * Get priority
   * @return priority
  **/
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }

  public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

