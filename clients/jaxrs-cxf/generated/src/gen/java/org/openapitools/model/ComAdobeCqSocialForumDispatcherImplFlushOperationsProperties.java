package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger extensionOrder = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean flushForumontopic = null;
 /**
   * Get extensionOrder
   * @return extensionOrder
  **/
  @JsonProperty("extension.order")
  public ConfigNodePropertyInteger getExtensionOrder() {
    return extensionOrder;
  }

  public void setExtensionOrder(ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
  }

  public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties extensionOrder(ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
    return this;
  }

 /**
   * Get flushForumontopic
   * @return flushForumontopic
  **/
  @JsonProperty("flush.forumontopic")
  public ConfigNodePropertyBoolean getFlushForumontopic() {
    return flushForumontopic;
  }

  public void setFlushForumontopic(ConfigNodePropertyBoolean flushForumontopic) {
    this.flushForumontopic = flushForumontopic;
  }

  public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties flushForumontopic(ConfigNodePropertyBoolean flushForumontopic) {
    this.flushForumontopic = flushForumontopic;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties {\n");
    
    sb.append("    extensionOrder: ").append(toIndentedString(extensionOrder)).append("\n");
    sb.append("    flushForumontopic: ").append(toIndentedString(flushForumontopic)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

