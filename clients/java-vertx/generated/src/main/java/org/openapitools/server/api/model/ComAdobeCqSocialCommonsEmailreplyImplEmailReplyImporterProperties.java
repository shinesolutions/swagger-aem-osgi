package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties   {
  
  private ConfigNodePropertyDropDown connectProtocol = null;

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties () {

  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties (ConfigNodePropertyDropDown connectProtocol) {
    this.connectProtocol = connectProtocol;
  }

    
  @JsonProperty("connectProtocol")
  public ConfigNodePropertyDropDown getConnectProtocol() {
    return connectProtocol;
  }
  public void setConnectProtocol(ConfigNodePropertyDropDown connectProtocol) {
    this.connectProtocol = connectProtocol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties = (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties) o;
    return Objects.equals(connectProtocol, comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.connectProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties {\n");
    
    sb.append("    connectProtocol: ").append(toIndentedString(connectProtocol)).append("\n");
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
