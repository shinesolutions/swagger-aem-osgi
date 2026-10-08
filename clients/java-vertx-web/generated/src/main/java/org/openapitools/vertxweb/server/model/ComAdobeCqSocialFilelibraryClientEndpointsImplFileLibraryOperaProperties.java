package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties   {
  
  private ConfigNodePropertyArray fieldWhitelist;
  private ConfigNodePropertyArray attachmentTypeBlacklist;

  public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties () {

  }

  public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties (ConfigNodePropertyArray fieldWhitelist, ConfigNodePropertyArray attachmentTypeBlacklist) {
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
    ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties = (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties) o;
    return Objects.equals(fieldWhitelist, comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties.fieldWhitelist) &&
        Objects.equals(attachmentTypeBlacklist, comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties.attachmentTypeBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldWhitelist, attachmentTypeBlacklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
