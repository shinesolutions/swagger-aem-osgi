package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties   {
  

  private ConfigNodePropertyString eventTopics = null;

  private ConfigNodePropertyString eventFilter = null;

  private ConfigNodePropertyArray verbs = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("event.topics")
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }
  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }
  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("verbs")
  public ConfigNodePropertyArray getVerbs() {
    return verbs;
  }
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
    return Objects.equals(eventTopics, comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.eventTopics) &&
        Objects.equals(eventFilter, comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.eventFilter) &&
        Objects.equals(verbs, comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.verbs);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

