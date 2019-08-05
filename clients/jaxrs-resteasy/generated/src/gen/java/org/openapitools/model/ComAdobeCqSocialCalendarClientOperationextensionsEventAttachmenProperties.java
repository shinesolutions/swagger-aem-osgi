package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties   {
  
  private ConfigNodePropertyString attachmentTypeBlacklist = null;
  private ConfigNodePropertyInteger extensionOrder = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attachmentTypeBlacklist")
  public ConfigNodePropertyString getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }
  public void setAttachmentTypeBlacklist(ConfigNodePropertyString attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extension.order")
  public ConfigNodePropertyInteger getExtensionOrder() {
    return extensionOrder;
  }
  public void setExtensionOrder(ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

