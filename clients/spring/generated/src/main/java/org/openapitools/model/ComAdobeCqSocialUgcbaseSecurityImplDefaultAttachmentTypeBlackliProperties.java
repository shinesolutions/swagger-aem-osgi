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
 * ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties
 */

@JsonTypeName("comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray defaultAttachmentTypeBlacklist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray baselineAttachmentTypeBlacklist;

  public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties defaultAttachmentTypeBlacklist(@Nullable ConfigNodePropertyArray defaultAttachmentTypeBlacklist) {
    this.defaultAttachmentTypeBlacklist = defaultAttachmentTypeBlacklist;
    return this;
  }

  /**
   * Get defaultAttachmentTypeBlacklist
   * @return defaultAttachmentTypeBlacklist
   */
  @Valid 
  @Schema(name = "default.attachment.type.blacklist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.attachment.type.blacklist")
  public @Nullable ConfigNodePropertyArray getDefaultAttachmentTypeBlacklist() {
    return defaultAttachmentTypeBlacklist;
  }

  @JsonProperty("default.attachment.type.blacklist")
  public void setDefaultAttachmentTypeBlacklist(@Nullable ConfigNodePropertyArray defaultAttachmentTypeBlacklist) {
    this.defaultAttachmentTypeBlacklist = defaultAttachmentTypeBlacklist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties baselineAttachmentTypeBlacklist(@Nullable ConfigNodePropertyArray baselineAttachmentTypeBlacklist) {
    this.baselineAttachmentTypeBlacklist = baselineAttachmentTypeBlacklist;
    return this;
  }

  /**
   * Get baselineAttachmentTypeBlacklist
   * @return baselineAttachmentTypeBlacklist
   */
  @Valid 
  @Schema(name = "baseline.attachment.type.blacklist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseline.attachment.type.blacklist")
  public @Nullable ConfigNodePropertyArray getBaselineAttachmentTypeBlacklist() {
    return baselineAttachmentTypeBlacklist;
  }

  @JsonProperty("baseline.attachment.type.blacklist")
  public void setBaselineAttachmentTypeBlacklist(@Nullable ConfigNodePropertyArray baselineAttachmentTypeBlacklist) {
    this.baselineAttachmentTypeBlacklist = baselineAttachmentTypeBlacklist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties = (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties) o;
    return Objects.equals(this.defaultAttachmentTypeBlacklist, comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.defaultAttachmentTypeBlacklist) &&
        Objects.equals(this.baselineAttachmentTypeBlacklist, comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.baselineAttachmentTypeBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAttachmentTypeBlacklist, baselineAttachmentTypeBlacklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties {\n");
    sb.append("    defaultAttachmentTypeBlacklist: ").append(toIndentedString(defaultAttachmentTypeBlacklist)).append("\n");
    sb.append("    baselineAttachmentTypeBlacklist: ").append(toIndentedString(baselineAttachmentTypeBlacklist)).append("\n");
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

