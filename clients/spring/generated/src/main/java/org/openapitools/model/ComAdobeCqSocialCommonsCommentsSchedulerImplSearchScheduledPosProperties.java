package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties
 */

@JsonTypeName("comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableScheduledPostsSearch;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger numberOfMinutes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxSearchLimit;

  public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties enableScheduledPostsSearch(@Nullable ConfigNodePropertyBoolean enableScheduledPostsSearch) {
    this.enableScheduledPostsSearch = enableScheduledPostsSearch;
    return this;
  }

  /**
   * Get enableScheduledPostsSearch
   * @return enableScheduledPostsSearch
   */
  @Valid 
  @Schema(name = "enableScheduledPostsSearch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableScheduledPostsSearch")
  public @Nullable ConfigNodePropertyBoolean getEnableScheduledPostsSearch() {
    return enableScheduledPostsSearch;
  }

  @JsonProperty("enableScheduledPostsSearch")
  public void setEnableScheduledPostsSearch(@Nullable ConfigNodePropertyBoolean enableScheduledPostsSearch) {
    this.enableScheduledPostsSearch = enableScheduledPostsSearch;
  }

  public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties numberOfMinutes(@Nullable ConfigNodePropertyInteger numberOfMinutes) {
    this.numberOfMinutes = numberOfMinutes;
    return this;
  }

  /**
   * Get numberOfMinutes
   * @return numberOfMinutes
   */
  @Valid 
  @Schema(name = "numberOfMinutes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfMinutes")
  public @Nullable ConfigNodePropertyInteger getNumberOfMinutes() {
    return numberOfMinutes;
  }

  @JsonProperty("numberOfMinutes")
  public void setNumberOfMinutes(@Nullable ConfigNodePropertyInteger numberOfMinutes) {
    this.numberOfMinutes = numberOfMinutes;
  }

  public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties maxSearchLimit(@Nullable ConfigNodePropertyInteger maxSearchLimit) {
    this.maxSearchLimit = maxSearchLimit;
    return this;
  }

  /**
   * Get maxSearchLimit
   * @return maxSearchLimit
   */
  @Valid 
  @Schema(name = "maxSearchLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxSearchLimit")
  public @Nullable ConfigNodePropertyInteger getMaxSearchLimit() {
    return maxSearchLimit;
  }

  @JsonProperty("maxSearchLimit")
  public void setMaxSearchLimit(@Nullable ConfigNodePropertyInteger maxSearchLimit) {
    this.maxSearchLimit = maxSearchLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties = (ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties) o;
    return Objects.equals(this.enableScheduledPostsSearch, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.enableScheduledPostsSearch) &&
        Objects.equals(this.numberOfMinutes, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.numberOfMinutes) &&
        Objects.equals(this.maxSearchLimit, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.maxSearchLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableScheduledPostsSearch, numberOfMinutes, maxSearchLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties {\n");
    sb.append("    enableScheduledPostsSearch: ").append(toIndentedString(enableScheduledPostsSearch)).append("\n");
    sb.append("    numberOfMinutes: ").append(toIndentedString(numberOfMinutes)).append("\n");
    sb.append("    maxSearchLimit: ").append(toIndentedString(maxSearchLimit)).append("\n");
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

