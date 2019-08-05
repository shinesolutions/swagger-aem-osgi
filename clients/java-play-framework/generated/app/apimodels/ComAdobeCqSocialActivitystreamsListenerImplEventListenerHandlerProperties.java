package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties   {
  @JsonProperty("event.topics")
  private ConfigNodePropertyString eventTopics = null;

  @JsonProperty("event.filter")
  private ConfigNodePropertyString eventFilter = null;

  public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties eventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

   /**
   * Get eventTopics
   * @return eventTopics
  **/
  @Valid
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

   /**
   * Get eventFilter
   * @return eventFilter
  **/
  @Valid
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties = (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties) o;
    return Objects.equals(eventTopics, comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.eventTopics) &&
        Objects.equals(eventFilter, comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.eventFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTopics, eventFilter);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties {\n");
    
    sb.append("    eventTopics: ").append(toIndentedString(eventTopics)).append("\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
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

