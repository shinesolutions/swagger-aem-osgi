package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties   {
  
  private ConfigNodePropertyArray defaultAttachmentTypeBlacklist = null;
  private ConfigNodePropertyArray baselineAttachmentTypeBlacklist = null;

  public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties () {

  }

  public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties (ConfigNodePropertyArray defaultAttachmentTypeBlacklist, ConfigNodePropertyArray baselineAttachmentTypeBlacklist) {
    this.defaultAttachmentTypeBlacklist = defaultAttachmentTypeBlacklist;
    this.baselineAttachmentTypeBlacklist = baselineAttachmentTypeBlacklist;
  }

    
  @JsonProperty("default.attachment.type.blacklist")
  public ConfigNodePropertyArray getDefaultAttachmentTypeBlacklist() {
    return defaultAttachmentTypeBlacklist;
  }
  public void setDefaultAttachmentTypeBlacklist(ConfigNodePropertyArray defaultAttachmentTypeBlacklist) {
    this.defaultAttachmentTypeBlacklist = defaultAttachmentTypeBlacklist;
  }

    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
