package apimodels;

import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties   {
  @JsonProperty("attachmentTypeBlacklist")
  private ConfigNodePropertyString attachmentTypeBlacklist = null;

  @JsonProperty("extension.order")
  private ConfigNodePropertyInteger extensionOrder = null;

  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties attachmentTypeBlacklist(ConfigNodePropertyString attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    return this;
  }

   /**
   * Get attachmentTypeBlacklist
   * @return attachmentTypeBlacklist
  **/
  @Valid
  public ConfigNodePropertyString getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }

  public void setAttachmentTypeBlacklist(ConfigNodePropertyString attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties extensionOrder(ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
    return this;
  }

   /**
   * Get extensionOrder
   * @return extensionOrder
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

