package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties
 */

@JsonTypeName("comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray fieldWhitelist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray attachmentTypeBlacklist;

  public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties fieldWhitelist(@Nullable ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

  /**
   * Get fieldWhitelist
   * @return fieldWhitelist
   */
  @Valid 
  @Schema(name = "fieldWhitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldWhitelist")
  public @Nullable ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }

  @JsonProperty("fieldWhitelist")
  public void setFieldWhitelist(@Nullable ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

  public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties attachmentTypeBlacklist(@Nullable ConfigNodePropertyArray attachmentTypeBlacklist) {
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
  public @Nullable ConfigNodePropertyArray getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }

  @JsonProperty("attachmentTypeBlacklist")
  public void setAttachmentTypeBlacklist(@Nullable ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties = (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties) o;
    return Objects.equals(this.fieldWhitelist, comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.fieldWhitelist) &&
        Objects.equals(this.attachmentTypeBlacklist, comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.attachmentTypeBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldWhitelist, attachmentTypeBlacklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties {\n");
    sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
    sb.append("    attachmentTypeBlacklist: ").append(toIndentedString(attachmentTypeBlacklist)).append("\n");
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

