package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties   {
  @JsonProperty("default.attachment.type.blacklist")
  private ConfigNodePropertyArray defaultAttachmentTypeBlacklist = null;

  @JsonProperty("baseline.attachment.type.blacklist")
  private ConfigNodePropertyArray baselineAttachmentTypeBlacklist = null;

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
