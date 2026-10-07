package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties
 */

@JsonTypeName("comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger priorityOrder;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray replyEmailPatterns;

  public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties priorityOrder(@Nullable ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
    return this;
  }

  /**
   * Get priorityOrder
   * @return priorityOrder
   */
  @Valid 
  @Schema(name = "priorityOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priorityOrder")
  public @Nullable ConfigNodePropertyInteger getPriorityOrder() {
    return priorityOrder;
  }

  @JsonProperty("priorityOrder")
  public void setPriorityOrder(@Nullable ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties replyEmailPatterns(@Nullable ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
    return this;
  }

  /**
   * Get replyEmailPatterns
   * @return replyEmailPatterns
   */
  @Valid 
  @Schema(name = "replyEmailPatterns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replyEmailPatterns")
  public @Nullable ConfigNodePropertyArray getReplyEmailPatterns() {
    return replyEmailPatterns;
  }

  @JsonProperty("replyEmailPatterns")
  public void setReplyEmailPatterns(@Nullable ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties = (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties) o;
    return Objects.equals(this.priorityOrder, comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.priorityOrder) &&
        Objects.equals(this.replyEmailPatterns, comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.replyEmailPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityOrder, replyEmailPatterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties {\n");
    sb.append("    priorityOrder: ").append(toIndentedString(priorityOrder)).append("\n");
    sb.append("    replyEmailPatterns: ").append(toIndentedString(replyEmailPatterns)).append("\n");
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

