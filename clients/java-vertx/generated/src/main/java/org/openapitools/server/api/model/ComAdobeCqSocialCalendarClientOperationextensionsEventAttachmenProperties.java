package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties   {
  
  private ConfigNodePropertyString attachmentTypeBlacklist = null;
  private ConfigNodePropertyInteger extensionOrder = null;

  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties () {

  }

  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties (ConfigNodePropertyString attachmentTypeBlacklist, ConfigNodePropertyInteger extensionOrder) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    this.extensionOrder = extensionOrder;
  }

    
  @JsonProperty("attachmentTypeBlacklist")
  public ConfigNodePropertyString getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }
  public void setAttachmentTypeBlacklist(ConfigNodePropertyString attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

    
  @JsonProperty("extension.order")
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
    return Objects.equals(attachmentTypeBlacklist, comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.attachmentTypeBlacklist) &&
        Objects.equals(extensionOrder, comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.extensionOrder);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
