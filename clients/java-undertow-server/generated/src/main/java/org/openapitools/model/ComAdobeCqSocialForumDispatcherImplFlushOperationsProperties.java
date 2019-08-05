package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties   {
  
  private ConfigNodePropertyInteger extensionOrder = null;
  private ConfigNodePropertyBoolean flushForumontopic = null;

  /**
   **/
  public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties extensionOrder(ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("extension.order")
  public ConfigNodePropertyInteger getExtensionOrder() {
    return extensionOrder;
  }
  public void setExtensionOrder(ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
  }

  /**
   **/
  public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties flushForumontopic(ConfigNodePropertyBoolean flushForumontopic) {
    this.flushForumontopic = flushForumontopic;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("flush.forumontopic")
  public ConfigNodePropertyBoolean getFlushForumontopic() {
    return flushForumontopic;
  }
  public void setFlushForumontopic(ConfigNodePropertyBoolean flushForumontopic) {
    this.flushForumontopic = flushForumontopic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties comAdobeCqSocialForumDispatcherImplFlushOperationsProperties = (ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties) o;
    return Objects.equals(extensionOrder, comAdobeCqSocialForumDispatcherImplFlushOperationsProperties.extensionOrder) &&
        Objects.equals(flushForumontopic, comAdobeCqSocialForumDispatcherImplFlushOperationsProperties.flushForumontopic);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

