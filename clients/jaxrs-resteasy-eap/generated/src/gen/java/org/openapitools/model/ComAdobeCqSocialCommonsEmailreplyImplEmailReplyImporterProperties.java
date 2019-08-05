package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties   {
  

  private ConfigNodePropertyDropDown connectProtocol = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
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

