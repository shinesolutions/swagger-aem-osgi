package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties   {
  
  private ConfigNodePropertyArray fieldWhitelist = null;
  private ConfigNodePropertyArray attachmentTypeBlacklist = null;

  public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties () {

  }

  public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties (ConfigNodePropertyArray fieldWhitelist, ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.fieldWhitelist = fieldWhitelist;
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

    
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }
  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

    
  @JsonProperty("attachmentTypeBlacklist")
  public ConfigNodePropertyArray getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }
  public void setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties = (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties) o;
    return Objects.equals(fieldWhitelist, comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.fieldWhitelist) &&
        Objects.equals(attachmentTypeBlacklist, comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.attachmentTypeBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldWhitelist, attachmentTypeBlacklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties {\n");
    
    sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
    sb.append("    attachmentTypeBlacklist: ").append(toIndentedString(attachmentTypeBlacklist)).append("\n");
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
