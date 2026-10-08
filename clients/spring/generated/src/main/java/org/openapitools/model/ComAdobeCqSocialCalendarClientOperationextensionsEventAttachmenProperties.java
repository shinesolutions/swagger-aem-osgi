package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties
 */

@JsonTypeName("comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString attachmentTypeBlacklist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger extensionOrder;

  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties attachmentTypeBlacklist(@Nullable ConfigNodePropertyString attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    return this;
  }

  /**
   * Get attachmentTypeBlacklist
   * @return attachmentTypeBlacklist
   */
  @Valid 
  @Schema(name = "attachmentTypeBlacklist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachmentTypeBlacklist")
  public @Nullable ConfigNodePropertyString getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }

  @JsonProperty("attachmentTypeBlacklist")
  public void setAttachmentTypeBlacklist(@Nullable ConfigNodePropertyString attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties extensionOrder(@Nullable ConfigNodePropertyInteger extensionOrder) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties = (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties) o;
    return Objects.equals(this.attachmentTypeBlacklist, comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.attachmentTypeBlacklist) &&
        Objects.equals(this.extensionOrder, comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.extensionOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentTypeBlacklist, extensionOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties {\n");
    sb.append("    attachmentTypeBlacklist: ").append(toIndentedString(attachmentTypeBlacklist)).append("\n");
    sb.append("    extensionOrder: ").append(toIndentedString(extensionOrder)).append("\n");
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

