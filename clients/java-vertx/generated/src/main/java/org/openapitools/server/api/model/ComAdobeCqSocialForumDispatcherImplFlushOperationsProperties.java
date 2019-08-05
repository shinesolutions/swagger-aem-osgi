package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties   {
  
  private ConfigNodePropertyInteger extensionOrder = null;
  private ConfigNodePropertyBoolean flushForumontopic = null;

  public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties () {

  }

  public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties (ConfigNodePropertyInteger extensionOrder, ConfigNodePropertyBoolean flushForumontopic) {
    this.extensionOrder = extensionOrder;
    this.flushForumontopic = flushForumontopic;
  }

    
  @JsonProperty("extension.order")
  public ConfigNodePropertyInteger getExtensionOrder() {
    return extensionOrder;
  }
  public void setExtensionOrder(ConfigNodePropertyInteger extensionOrder) {
    this.extensionOrder = extensionOrder;
  }

    
  @JsonProperty("flush.forumontopic")
  public ConfigNodePropertyBoolean getFlushForumontopic() {
    return flushForumontopic;
  }
  public void setFlushForumontopic(ConfigNodePropertyBoolean flushForumontopic) {
    this.flushForumontopic = flushForumontopic;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
