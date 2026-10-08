package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties   {
  @JsonProperty("default.attachment.type.blacklist")
  private ConfigNodePropertyArray defaultAttachmentTypeBlacklist;

  @JsonProperty("baseline.attachment.type.blacklist")
  private ConfigNodePropertyArray baselineAttachmentTypeBlacklist;

  public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties defaultAttachmentTypeBlacklist(ConfigNodePropertyArray defaultAttachmentTypeBlacklist) {
    this.defaultAttachmentTypeBlacklist = defaultAttachmentTypeBlacklist;
    return this;
  }

  /**
   * Get defaultAttachmentTypeBlacklist
   * @return defaultAttachmentTypeBlacklist
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getDefaultAttachmentTypeBlacklist() {
    return defaultAttachmentTypeBlacklist;
  }

  public void setDefaultAttachmentTypeBlacklist(ConfigNodePropertyArray defaultAttachmentTypeBlacklist) {
    this.defaultAttachmentTypeBlacklist = defaultAttachmentTypeBlacklist;
  }

  public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties baselineAttachmentTypeBlacklist(ConfigNodePropertyArray baselineAttachmentTypeBlacklist) {
    this.baselineAttachmentTypeBlacklist = baselineAttachmentTypeBlacklist;
    return this;
  }

  /**
   * Get baselineAttachmentTypeBlacklist
   * @return baselineAttachmentTypeBlacklist
   */
  @ApiModelProperty(value = "")
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
    ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties = (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties) o;
    return Objects.equals(this.defaultAttachmentTypeBlacklist, comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.defaultAttachmentTypeBlacklist) &&
        Objects.equals(this.baselineAttachmentTypeBlacklist, comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.baselineAttachmentTypeBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAttachmentTypeBlacklist, baselineAttachmentTypeBlacklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties {\n");
    
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

