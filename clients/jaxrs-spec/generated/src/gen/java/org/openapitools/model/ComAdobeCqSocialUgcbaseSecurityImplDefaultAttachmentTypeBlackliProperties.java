package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties   {
  
  private @Valid ConfigNodePropertyArray defaultAttachmentTypeBlacklist = null;
  private @Valid ConfigNodePropertyArray baselineAttachmentTypeBlacklist = null;

  /**
   **/
  public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties defaultAttachmentTypeBlacklist(ConfigNodePropertyArray defaultAttachmentTypeBlacklist) {
    this.defaultAttachmentTypeBlacklist = defaultAttachmentTypeBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default.attachment.type.blacklist")
  public ConfigNodePropertyArray getDefaultAttachmentTypeBlacklist() {
    return defaultAttachmentTypeBlacklist;
  }
  public void setDefaultAttachmentTypeBlacklist(ConfigNodePropertyArray defaultAttachmentTypeBlacklist) {
    this.defaultAttachmentTypeBlacklist = defaultAttachmentTypeBlacklist;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties baselineAttachmentTypeBlacklist(ConfigNodePropertyArray baselineAttachmentTypeBlacklist) {
    this.baselineAttachmentTypeBlacklist = baselineAttachmentTypeBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("baseline.attachment.type.blacklist")
  public ConfigNodePropertyArray getBaselineAttachmentTypeBlacklist() {
    return baselineAttachmentTypeBlacklist;
  }
  public void setBaselineAttachmentTypeBlacklist(ConfigNodePropertyArray baselineAttachmentTypeBlacklist) {
    this.baselineAttachmentTypeBlacklist = baselineAttachmentTypeBlacklist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties = (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties) o;
    return Objects.equals(defaultAttachmentTypeBlacklist, comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.defaultAttachmentTypeBlacklist) &&
        Objects.equals(baselineAttachmentTypeBlacklist, comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.baselineAttachmentTypeBlacklist);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

