package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties
 */

@JsonTypeName("comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString eventTopics;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString eventFilter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray verbs;

  public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties eventTopics(@Nullable ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

  /**
   * Get eventTopics
   * @return eventTopics
   */
  @Valid 
  @Schema(name = "event.topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event.topics")
  public @Nullable ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  @JsonProperty("event.topics")
  public void setEventTopics(@Nullable ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties eventFilter(@Nullable ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  /**
   * Get eventFilter
   * @return eventFilter
   */
  @Valid 
  @Schema(name = "event.filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event.filter")
  public @Nullable ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  @JsonProperty("event.filter")
  public void setEventFilter(@Nullable ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties verbs(@Nullable ConfigNodePropertyArray verbs) {
    this.verbs = verbs;
    return this;
  }

  /**
   * Get verbs
   * @return verbs
   */
  @Valid 
  @Schema(name = "verbs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verbs")
  public @Nullable ConfigNodePropertyArray getVerbs() {
    return verbs;
  }

  @JsonProperty("verbs")
  public void setVerbs(@Nullable ConfigNodePropertyArray verbs) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

