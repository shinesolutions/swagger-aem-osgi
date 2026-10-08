package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties
 */

@JsonTypeName("comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties {

  private ConfigNodePropertyInteger priorityOrder;

  private ConfigNodePropertyArray replyEmailPatterns;

  public ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties priorityOrder(ConfigNodePropertyInteger priorityOrder) {
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
  public ConfigNodePropertyInteger getPriorityOrder() {
    return priorityOrder;
  }

  public void setPriorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties replyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
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
  public ConfigNodePropertyArray getReplyEmailPatterns() {
    return replyEmailPatterns;
  }

  public void setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
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
    ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties = (ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties) o;
    return Objects.equals(this.priorityOrder, comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties.priorityOrder) &&
        Objects.equals(this.replyEmailPatterns, comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties.replyEmailPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityOrder, replyEmailPatterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties {\n");
    sb.append("    priorityOrder: ").append(toIndentedString(priorityOrder)).append("\n");
    sb.append("    replyEmailPatterns: ").append(toIndentedString(replyEmailPatterns)).append("\n");
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

