package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString eventTopics;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString eventFilter;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray verbs;
 /**
  * Get eventTopics
  * @return eventTopics
  */
  @JsonProperty("event.topics")
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  /**
   * Sets the <code>eventTopics</code> property.
   */
 public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  /**
   * Sets the <code>eventTopics</code> property.
   */
  public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties eventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

 /**
  * Get eventFilter
  * @return eventFilter
  */
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  /**
   * Sets the <code>eventFilter</code> property.
   */
 public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   * Sets the <code>eventFilter</code> property.
   */
  public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

 /**
  * Get verbs
  * @return verbs
  */
  @JsonProperty("verbs")
  public ConfigNodePropertyArray getVerbs() {
    return verbs;
  }

  /**
   * Sets the <code>verbs</code> property.
   */
 public void setVerbs(ConfigNodePropertyArray verbs) {
    this.verbs = verbs;
  }

  /**
   * Sets the <code>verbs</code> property.
   */
  public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties verbs(ConfigNodePropertyArray verbs) {
    this.verbs = verbs;
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
    ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties = (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties) o;
    return Objects.equals(this.eventTopics, comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.eventTopics) &&
        Objects.equals(this.eventFilter, comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.eventFilter) &&
        Objects.equals(this.verbs, comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.verbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTopics, eventFilter, verbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties {\n");
    
    sb.append("    eventTopics: ").append(toIndentedString(eventTopics)).append("\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
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

