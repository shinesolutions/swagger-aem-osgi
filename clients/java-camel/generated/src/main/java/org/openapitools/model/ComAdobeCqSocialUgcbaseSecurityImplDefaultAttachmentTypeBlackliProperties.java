package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties {

  private ConfigNodePropertyArray defaultAttachmentTypeBlacklist;

  private ConfigNodePropertyArray baselineAttachmentTypeBlacklist;

  public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties defaultAttachmentTypeBlacklist(ConfigNodePropertyArray defaultAttachmentTypeBlacklist) {
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
  public ConfigNodePropertyArray getDefaultAttachmentTypeBlacklist() {
    return defaultAttachmentTypeBlacklist;
  }

  public void setDefaultAttachmentTypeBlacklist(ConfigNodePropertyArray defaultAttachmentTypeBlacklist) {
    this.defaultAttachmentTypeBlacklist = defaultAttachmentTypeBlacklist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties baselineAttachmentTypeBlacklist(ConfigNodePropertyArray baselineAttachmentTypeBlacklist) {
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
  public ConfigNodePropertyArray getBaselineAttachmentTypeBlacklist() {
    return baselineAttachmentTypeBlacklist;
  }

  public void setBaselineAttachmentTypeBlacklist(ConfigNodePropertyArray baselineAttachmentTypeBlacklist) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

