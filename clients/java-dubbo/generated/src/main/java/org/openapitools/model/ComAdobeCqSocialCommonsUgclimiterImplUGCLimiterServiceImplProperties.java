package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("event.topics")
  private ConfigNodePropertyString eventTopics;

  @JsonProperty("event.filter")
  private ConfigNodePropertyString eventFilter;

  @JsonProperty("verbs")
  private ConfigNodePropertyArray verbs;

  /**
   * 
   * @return eventTopics
   */
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  /**
   * 
   * @return eventFilter
   */
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   * 
   * @return verbs
   */
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
