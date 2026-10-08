package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger extensionOrder;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean flushForumontopic;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties comAdobeCqSocialForumDispatcherImplFlushOperationsProperties = (ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties) o;
    return Objects.equals(this.extensionOrder, comAdobeCqSocialForumDispatcherImplFlushOperationsProperties.extensionOrder) &&
        Objects.equals(this.flushForumontopic, comAdobeCqSocialForumDispatcherImplFlushOperationsProperties.flushForumontopic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionOrder, flushForumontopic);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

