package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString attachmentTypeBlacklist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger extensionOrder;
 /**
  * Get attachmentTypeBlacklist
  * @return attachmentTypeBlacklist
  */
  @JsonProperty("attachmentTypeBlacklist")
  public ConfigNodePropertyString getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }

  /**
   * Sets the <code>attachmentTypeBlacklist</code> property.
   */
 public void setAttachmentTypeBlacklist(ConfigNodePropertyString attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  /**
   * Sets the <code>attachmentTypeBlacklist</code> property.
   */
  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties attachmentTypeBlacklist(ConfigNodePropertyString attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    return this;
  }

 /**
  * Get extensionOrder
  * @return extensionOrder
  */
  @JsonProperty("extension.order")
  public ConfigNodePropertyInteger getExtensionOrder() {
    return extensionOrder;
  }

  /**
   * Sets the <code>extensionOrder</code> property.
   */
 public void setExtensionOrder(ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
  }

  /**
   * Sets the <code>extensionOrder</code> property.
   */
  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties extensionOrder(ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

