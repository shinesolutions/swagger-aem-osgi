package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties {

  private ConfigNodePropertyInteger extensionOrder;

  private ConfigNodePropertyBoolean flushForumontopic;

  public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties extensionOrder(ConfigNodePropertyInteger extensionOrder) {
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
  public ConfigNodePropertyInteger getExtensionOrder() {
    return extensionOrder;
  }

  public void setExtensionOrder(ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
  }

  public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties flushForumontopic(ConfigNodePropertyBoolean flushForumontopic) {
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
  public ConfigNodePropertyBoolean getFlushForumontopic() {
    return flushForumontopic;
  }

  public void setFlushForumontopic(ConfigNodePropertyBoolean flushForumontopic) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

