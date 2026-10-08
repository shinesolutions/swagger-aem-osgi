package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray fieldWhitelist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray attachmentTypeBlacklist;
 /**
  * Get fieldWhitelist
  * @return fieldWhitelist
  */
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }

  /**
   * Sets the <code>fieldWhitelist</code> property.
   */
 public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

  /**
   * Sets the <code>fieldWhitelist</code> property.
   */
  public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

 /**
  * Get attachmentTypeBlacklist
  * @return attachmentTypeBlacklist
  */
  @JsonProperty("attachmentTypeBlacklist")
  public ConfigNodePropertyArray getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }

  /**
   * Sets the <code>attachmentTypeBlacklist</code> property.
   */
 public void setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  /**
   * Sets the <code>attachmentTypeBlacklist</code> property.
   */
  public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties attachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties = (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties) o;
    return Objects.equals(this.fieldWhitelist, comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.fieldWhitelist) &&
        Objects.equals(this.attachmentTypeBlacklist, comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.attachmentTypeBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldWhitelist, attachmentTypeBlacklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties {\n");
    
    sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
    sb.append("    attachmentTypeBlacklist: ").append(toIndentedString(attachmentTypeBlacklist)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

