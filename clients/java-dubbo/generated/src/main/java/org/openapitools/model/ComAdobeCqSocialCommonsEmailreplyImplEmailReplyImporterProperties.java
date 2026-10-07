package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("connectProtocol")
  private ConfigNodePropertyDropDown connectProtocol;

  /**
   * 
   * @return connectProtocol
   */
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
    return Objects.equals(this.connectProtocol, comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.connectProtocol);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
