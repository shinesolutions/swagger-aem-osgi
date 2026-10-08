package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties   {
  private ConfigNodePropertyString eventTopics;
  private ConfigNodePropertyString eventFilter;
  private ConfigNodePropertyArray verbs;

  public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties eventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event.topics")
  @Valid public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  @JsonProperty("event.topics")
  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event.filter")
  @Valid public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  @JsonProperty("event.filter")
  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties verbs(ConfigNodePropertyArray verbs) {
    this.verbs = verbs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("verbs")
  @Valid public ConfigNodePropertyArray getVerbs() {
    return verbs;
  }

  @JsonProperty("verbs")
  public void setVerbs(ConfigNodePropertyArray verbs) {
    this.verbs = verbs;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
