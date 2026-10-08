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
 * ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties
 */

@JsonTypeName("comAdobeCqSocialForumDispatcherImplFlushOperationsProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger extensionOrder;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean flushForumontopic;

  public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties extensionOrder(@Nullable ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
    return this;
  }

  /**
   * Get extensionOrder
   * @return extensionOrder
   */
  @Valid 
  @Schema(name = "extension.order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extension.order")
  public @Nullable ConfigNodePropertyInteger getExtensionOrder() {
    return extensionOrder;
  }

  @JsonProperty("extension.order")
  public void setExtensionOrder(@Nullable ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
  }

  public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties flushForumontopic(@Nullable ConfigNodePropertyBoolean flushForumontopic) {
    this.flushForumontopic = flushForumontopic;
    return this;
  }

  /**
   * Get flushForumontopic
   * @return flushForumontopic
   */
  @Valid 
  @Schema(name = "flush.forumontopic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flush.forumontopic")
  public @Nullable ConfigNodePropertyBoolean getFlushForumontopic() {
    return flushForumontopic;
  }

  @JsonProperty("flush.forumontopic")
  public void setFlushForumontopic(@Nullable ConfigNodePropertyBoolean flushForumontopic) {
    this.flushForumontopic = flushForumontopic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties comAdobeCqSocialForumDispatcherImplFlushOperationsProperties = (ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties) o;
    return Objects.equals(this.extensionOrder, comAdobeCqSocialForumDispatcherImplFlushOperationsProperties.extensionOrder) &&
        Objects.equals(this.flushForumontopic, comAdobeCqSocialForumDispatcherImplFlushOperationsProperties.flushForumontopic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionOrder, flushForumontopic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties {\n");
    sb.append("    extensionOrder: ").append(toIndentedString(extensionOrder)).append("\n");
    sb.append("    flushForumontopic: ").append(toIndentedString(flushForumontopic)).append("\n");
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

