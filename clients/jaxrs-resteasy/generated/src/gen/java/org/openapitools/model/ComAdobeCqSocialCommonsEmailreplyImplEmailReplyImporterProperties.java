package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties   {
  
  private ConfigNodePropertyDropDown connectProtocol;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectProtocol")
  @Valid
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

