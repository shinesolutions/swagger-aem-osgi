package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class MessagingUserComponentFactoryProperties   {
  
  private ConfigNodePropertyInteger priority = null;

  public MessagingUserComponentFactoryProperties () {

  }

  public MessagingUserComponentFactoryProperties (ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }

    
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }
  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingUserComponentFactoryProperties messagingUserComponentFactoryProperties = (MessagingUserComponentFactoryProperties) o;
    return Objects.equals(priority, messagingUserComponentFactoryProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingUserComponentFactoryProperties {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
