package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties   {
  
  private ConfigNodePropertyInteger priorityOrder = null;
  private ConfigNodePropertyArray replyEmailPatterns = null;

  public ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties () {

  }

  public ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties (ConfigNodePropertyInteger priorityOrder, ConfigNodePropertyArray replyEmailPatterns) {
    this.priorityOrder = priorityOrder;
    this.replyEmailPatterns = replyEmailPatterns;
  }

    
  @JsonProperty("priorityOrder")
  public ConfigNodePropertyInteger getPriorityOrder() {
    return priorityOrder;
  }
  public void setPriorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
  }

    
  @JsonProperty("replyEmailPatterns")
  public ConfigNodePropertyArray getReplyEmailPatterns() {
    return replyEmailPatterns;
  }
  public void setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties = (ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties) o;
    return Objects.equals(priorityOrder, comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties.priorityOrder) &&
        Objects.equals(replyEmailPatterns, comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties.replyEmailPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityOrder, replyEmailPatterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties {\n");
    
    sb.append("    priorityOrder: ").append(toIndentedString(priorityOrder)).append("\n");
    sb.append("    replyEmailPatterns: ").append(toIndentedString(replyEmailPatterns)).append("\n");
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
