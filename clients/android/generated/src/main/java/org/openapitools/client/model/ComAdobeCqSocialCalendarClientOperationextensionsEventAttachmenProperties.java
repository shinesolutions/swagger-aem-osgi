/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyInteger;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties {
  
  @SerializedName("attachmentTypeBlacklist")
  private ConfigNodePropertyString attachmentTypeBlacklist = null;
  @SerializedName("extension.order")
  private ConfigNodePropertyInteger extensionOrder = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }
  public void setAttachmentTypeBlacklist(ConfigNodePropertyString attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getExtensionOrder() {
    return extensionOrder;
  }
  public void setExtensionOrder(ConfigNodePropertyInteger extensionOrder) {
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
    return (this.attachmentTypeBlacklist == null ? comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.attachmentTypeBlacklist == null : this.attachmentTypeBlacklist.equals(comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.attachmentTypeBlacklist)) &&
        (this.extensionOrder == null ? comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.extensionOrder == null : this.extensionOrder.equals(comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.extensionOrder));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.attachmentTypeBlacklist == null ? 0: this.attachmentTypeBlacklist.hashCode());
    result = 31 * result + (this.extensionOrder == null ? 0: this.extensionOrder.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties {\n");
    
    sb.append("  attachmentTypeBlacklist: ").append(attachmentTypeBlacklist).append("\n");
    sb.append("  extensionOrder: ").append(extensionOrder).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}